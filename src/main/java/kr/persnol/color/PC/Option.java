package kr.persnol.color.PC;

import java.util.EnumMap;
import java.util.Map;

public class Option {

    private String code;
    private String text;
    private Map<Personal_Color_Type, Integer> scoreMap;

    public Option(String code, String text) {
        this.code = code;
        this.text = text;
        this.scoreMap = new EnumMap<>(Personal_Color_Type.class);
    }

    // 각 퍼스널컬러에 맞는 점수 추가
    public void addScore(Personal_Color_Type type, int score) {
        int current = scoreMap.getOrDefault(type, 0);
        scoreMap.put(type, current + score);
    }

    public String getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public Map<Personal_Color_Type, Integer> getScoreMap() {
        return scoreMap;
    }
}
