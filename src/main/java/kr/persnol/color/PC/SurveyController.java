package kr.persnol.color.PC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    private final QuestionService questionService;
    private final ClothesColorRepository clothesColorRepository;
    private final HairColorRepository hairColorRepository;
    private final CosmeticRepository cosmeticRepository;

    @Autowired
    public SurveyController(QuestionService questionService,
                            ClothesColorRepository clothesColorRepository,
                            HairColorRepository hairColorRepository,
                            CosmeticRepository cosmeticRepository) {
        this.questionService = questionService;
        this.clothesColorRepository = clothesColorRepository;
        this.hairColorRepository = hairColorRepository;
        this.cosmeticRepository = cosmeticRepository;
    }

    // 설문 질문 페이지를 표시
    @GetMapping
    public String showSurvey(Model model) {
        model.addAttribute("questions", questionService.getQuestions());
        return "survey";  // survey.html로 이동
    }

    @PostMapping("/result")
    public String getSurveyResult(@RequestParam Map<String, String> answers, Model model) {
        // 퍼스널컬러 계산을 위한 점수 초기화
        int springWarmScore = 0;
        int summerCoolScore = 0;
        int autumnWarmScore = 0;
        int winterCoolScore = 0;

        // 각 설문 응답에 따른 점수 계산
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            String questionId = entry.getKey();
            String answer = entry.getValue();

            // 응답에 따라 점수를 부여 (매우 그렇다, 그렇다, 보통이다, 아니다, 매우 아니다)
            int score = 0;
            switch (answer) {
                case "5": // 매우 그렇다
                    score = 5;
                    break;
                case "4": // 그렇다
                    score = 4;
                    break;
                case "3": // 보통이다
                    score = 3;
                    break;
                case "2": // 아니다
                    score = 2;
                    break;
                case "1": // 매우 아니다
                    score = 1;
                    break;
            }

            // 각 설문 항목에 점수를 추가
            if ("1".equals(questionId)) {
                springWarmScore += score;
            } else if ("2".equals(questionId)) {
                summerCoolScore += score;
            } else if ("3".equals(questionId)) {
                autumnWarmScore += score;
            } else if ("4".equals(questionId)) {
                winterCoolScore += score;
            }
        }

        // 점수 비교 후 가장 높은 점수에 해당하는 퍼스널컬러 결정
        PersonalColor personalColor;
        if (springWarmScore >= summerCoolScore && springWarmScore >= autumnWarmScore && springWarmScore >= winterCoolScore) {
            personalColor = new PersonalColor(Personal_Color_Type.SPRING_WARM);
        } else if (summerCoolScore >= autumnWarmScore && summerCoolScore >= winterCoolScore) {
            personalColor = new PersonalColor(Personal_Color_Type.SUMMER_COOL);
        } else if (autumnWarmScore >= winterCoolScore) {
            personalColor = new PersonalColor(Personal_Color_Type.AUTUMN_WARM);
        } else {
            personalColor = new PersonalColor(Personal_Color_Type.WINTER_COOL);
        }

        // 퍼스널컬러에 맞는 추천 데이터 조회
        List<ClothesColor> clothes = clothesColorRepository.findByPersonalColorType(personalColor.getPersonalColorType());
        List<HairColor> hair = hairColorRepository.findByPersonalColorType(personalColor.getPersonalColorType());
        List<Cosmetic> cosmetics = cosmeticRepository.findByPersonalColorType(personalColor.getPersonalColorType());

        // 결과를 모델에 담아서 결과 페이지로 전달
        model.addAttribute("personalColor", personalColor);  // 퍼스널컬러 객체
        model.addAttribute("clothes", clothes);
        model.addAttribute("hair", hair);
        model.addAttribute("cosmetics", cosmetics);
        model.addAttribute("springWarmScore", springWarmScore);
        model.addAttribute("summerCoolScore", summerCoolScore);
        model.addAttribute("autumnWarmScore", autumnWarmScore);
        model.addAttribute("winterCoolScore", winterCoolScore);

        return "result";  // 결과 페이지로 이동 (result.html)
    }


    // 설문 결과에 따른 퍼스널컬러 계산 (간단한 점수 기반 예시)
    private PersonalColor calculatePersonalColor(Map<String, String> answers) {
        int springWarmScore = 0;
        int summerCoolScore = 0;
        int autumnWarmScore = 0;
        int winterCoolScore = 0;

        // 각 설문 응답에 따른 점수 계산
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            String questionId = entry.getKey();
            String answer = entry.getValue();

            if ("1".equals(questionId) && "Y".equals(answer)) {
                springWarmScore++;
            } else if ("1".equals(questionId) && "N".equals(answer)) {
                winterCoolScore++;
            }

            if ("2".equals(questionId) && "Y".equals(answer)) {
                summerCoolScore++;
            } else if ("2".equals(questionId) && "N".equals(answer)) {
                autumnWarmScore++;
            }
        }

        // 점수 비교 후 가장 높은 점수에 해당하는 퍼스널컬러 반환
        if (springWarmScore >= summerCoolScore && springWarmScore >= autumnWarmScore && springWarmScore >= winterCoolScore) {
            return new PersonalColor(Personal_Color_Type.SPRING_WARM);
        } else if (summerCoolScore >= autumnWarmScore && summerCoolScore >= winterCoolScore) {
            return new PersonalColor(Personal_Color_Type.SUMMER_COOL);
        } else if (autumnWarmScore >= winterCoolScore) {
            return new PersonalColor(Personal_Color_Type.AUTUMN_WARM);
        } else {
            return new PersonalColor(Personal_Color_Type.WINTER_COOL);
        }
    }
}
