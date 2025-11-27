package kr.persnol.color.PC;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // ============================
        // 1. 밝은 조명을 받으면 얼굴이 더 생기 있어 보이나요?
        // ============================
        Question q1 = new Question(1, "밝은 조명을 받으면 얼굴이 더 생기 있어 보이나요?");
        Option q1Y = new Option("Y", "예");
        q1Y.addScore(Personal_Color_Type.SPRING_WARM, 2);
        q1Y.addScore(Personal_Color_Type.SUMMER_COOL, 1);

        Option q1N = new Option("N", "아니요");
        q1N.addScore(Personal_Color_Type.AUTUMN_WARM, 2);
        q1N.addScore(Personal_Color_Type.WINTER_COOL, 1);

        q1.addOption(q1Y);
        q1.addOption(q1N);
        questions.add(q1);

        // ============================
        // 2. 금색 악세서리가 은색보다 더 잘 어울리나요?
        // ============================
        Question q2 = new Question(2, "금색 악세서리가 은색보다 더 잘 어울리나요?");
        Option q2Y = new Option("Y", "예");
        q2Y.addScore(Personal_Color_Type.SPRING_WARM, 2);
        q2Y.addScore(Personal_Color_Type.AUTUMN_WARM, 1);

        Option q2N = new Option("N", "아니요");
        q2N.addScore(Personal_Color_Type.SUMMER_COOL, 1);
        q2N.addScore(Personal_Color_Type.WINTER_COOL, 2);

        q2.addOption(q2Y);
        q2.addOption(q2N);
        questions.add(q2);

        // ============================
        // 3. 파스텔톤 옷을 입으면 얼굴이 화사해 보이나요?
        // ============================
        Question q3 = new Question(3, "파스텔톤 옷을 입으면 얼굴이 화사해 보이나요?");
        Option q3Y = new Option("Y", "예");
        q3Y.addScore(Personal_Color_Type.SUMMER_COOL, 2);
        q3Y.addScore(Personal_Color_Type.SPRING_WARM, 1);

        Option q3N = new Option("N", "아니요");
        q3N.addScore(Personal_Color_Type.AUTUMN_WARM, 1);
        q3N.addScore(Personal_Color_Type.WINTER_COOL, 1);

        q3.addOption(q3Y);
        q3.addOption(q3N);
        questions.add(q3);

        // ============================
        // 4. 선명하고 쨍한 색이 흐린 색보다 더 잘 어울리나요?
        // ============================
        Question q4 = new Question(4, "선명하고 쨍한 색이 흐린 색보다 더 잘 어울리나요?");
        Option q4Y = new Option("Y", "예");
        q4Y.addScore(Personal_Color_Type.WINTER_COOL, 2);

        Option q4N = new Option("N", "아니요");
        q4N.addScore(Personal_Color_Type.SUMMER_COOL, 1);
        q4N.addScore(Personal_Color_Type.SPRING_WARM, 1);

        q4.addOption(q4Y);
        q4.addOption(q4N);
        questions.add(q4);

        // ============================
        // 5. 얼굴에 붉은기보다 노란기가 더 느껴지나요?
        // ============================
        Question q5 = new Question(5, "얼굴에 붉은기보다 노란기가 더 느껴지나요?");
        Option q5Y = new Option("Y", "예");
        q5Y.addScore(Personal_Color_Type.SPRING_WARM, 2);
        q5Y.addScore(Personal_Color_Type.AUTUMN_WARM, 2);

        Option q5N = new Option("N", "아니요");
        q5N.addScore(Personal_Color_Type.SUMMER_COOL, 2);
        q5N.addScore(Personal_Color_Type.WINTER_COOL, 1);

        q5.addOption(q5Y);
        q5.addOption(q5N);
        questions.add(q5);

        // ============================
        // 6. 완전한 흰색 옷을 입으면 얼굴이 환해 보이나요?
        // ============================
        Question q6 = new Question(6, "완전한 흰색 옷을 입으면 얼굴이 환해 보이나요?");
        Option q6Y = new Option("Y", "예");
        q6Y.addScore(Personal_Color_Type.WINTER_COOL, 2);

        Option q6N = new Option("N", "아니요");
        q6N.addScore(Personal_Color_Type.AUTUMN_WARM, 1);
        q6N.addScore(Personal_Color_Type.SPRING_WARM, 1);

        q6.addOption(q6Y);
        q6.addOption(q6N);
        questions.add(q6);

        // ============================
        // 7. 짙은 갈색/어두운 색 옷이 더 안정감 있게 어울리나요?
        // ============================
        Question q7 = new Question(7, "짙은 갈색/어두운 색 옷이 더 안정감 있게 어울리나요?");
        Option q7Y = new Option("Y", "예");
        q7Y.addScore(Personal_Color_Type.AUTUMN_WARM, 2);

        Option q7N = new Option("N", "아니요");
        q7N.addScore(Personal_Color_Type.SPRING_WARM, 1);
        q7N.addScore(Personal_Color_Type.SUMMER_COOL, 1);

        q7.addOption(q7Y);
        q7.addOption(q7N);
        questions.add(q7);

        // ============================
        // 8. 파랑/보라 같은 차가운 느낌의 색이 따뜻한 색보다 잘 어울리나요?
        // ============================
        Question q8 = new Question(8, "파랑/보라 같은 차가운 느낌의 색이 따뜻한 색보다 잘 어울리나요?");
        Option q8Y = new Option("Y", "예");
        q8Y.addScore(Personal_Color_Type.WINTER_COOL, 2);
        q8Y.addScore(Personal_Color_Type.SUMMER_COOL, 1);

        Option q8N = new Option("N", "아니요");
        q8N.addScore(Personal_Color_Type.SPRING_WARM, 2);
        q8N.addScore(Personal_Color_Type.AUTUMN_WARM, 1);

        q8.addOption(q8Y);
        q8.addOption(q8N);
        questions.add(q8);

        // ============================
        // 9. 햇빛 아래에서 얼굴이 약간 붉어 보이나요?
        // ============================
        Question q9 = new Question(9, "햇빛 아래에서 얼굴이 약간 붉어 보이나요?");
        Option q9Y = new Option("Y", "예");
        q9Y.addScore(Personal_Color_Type.SUMMER_COOL, 2);

        Option q9N = new Option("N", "아니요");
        q9N.addScore(Personal_Color_Type.SPRING_WARM, 1);
        q9N.addScore(Personal_Color_Type.AUTUMN_WARM, 1);

        q9.addOption(q9Y);
        q9.addOption(q9N);
        questions.add(q9);

        // ============================
        // 10. 어두운 조명에서도 얼굴이 흐리지 않고 또렷하게 보이나요?
        // ============================
        Question q10 = new Question(10, "어두운 조명에서도 얼굴이 흐리지 않고 또렷하게 보이나요?");
        Option q10Y = new Option("Y", "예");
        q10Y.addScore(Personal_Color_Type.WINTER_COOL, 2);

        Option q10N = new Option("N", "아니요");
        q10N.addScore(Personal_Color_Type.SPRING_WARM, 1);
        q10N.addScore(Personal_Color_Type.AUTUMN_WARM, 1);

        q10.addOption(q10Y);
        q10.addOption(q10N);
        questions.add(q10);

        return questions;
    }
}