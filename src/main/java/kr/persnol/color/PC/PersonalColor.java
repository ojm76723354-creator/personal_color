package kr.persnol.color.PC;

public class PersonalColor {

    private Personal_Color_Type personalColorType;

    // 생성자
    public PersonalColor(Personal_Color_Type personalColorType) {
        this.personalColorType = personalColorType;
    }

    // Getter
    public Personal_Color_Type getPersonalColorType() {
        return personalColorType;
    }

    // Setter
    public void setPersonalColorType(Personal_Color_Type personalColorType) {
        this.personalColorType = personalColorType;
    }
}
