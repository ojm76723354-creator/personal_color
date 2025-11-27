package kr.persnol.color.PC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {

    private final QuestionService questionService;

    public SurveyController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // 기본 주소(/)로 들어오면 /survey 로 보내기 (선택사항)
    @GetMapping("/")
    public String home() {
        return "redirect:/survey";
    }

    // http://localhost:8080/survey 로 들어오면 설문 페이지 보여주기
    @GetMapping("/survey")
    public String showSurvey(Model model) {
        model.addAttribute("questions", questionService.getQuestions());
        return "survey";   // → resources/templates/survey.html 을 찾습니다.
    }
}