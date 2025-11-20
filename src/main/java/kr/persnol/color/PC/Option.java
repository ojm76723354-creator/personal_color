package kr.persnol.color.PC;
    import java.util.EnumMap;
    import java.util.EnumMap;
    import java.util.Map;
public class Option {

    private String code;
    private String text;


    private Map<PersonalColorType, Integer> scoreMap;

    public Option(String code, String text) {
        this.code = code;
        this.text = text;
        this.scoreMap = new EnumMap<>(PersonalColorType.class);
    }

public void addScore(PersonalColorType type, int score) {
        int current = scoreMap.getOrDefault(type, 0);
        scoreMap.put(type, current + score);
}


    public String getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public Map<PersonalColorType, Integer> getScoreMap() {
        return scoreMap;
    }
}
