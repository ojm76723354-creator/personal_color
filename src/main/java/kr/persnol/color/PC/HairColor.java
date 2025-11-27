package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "hair_color")
public class HairColor {

    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "personal_color_type")
    private Personal_Color_Type personalColorType;

    @Column(name = "color", nullable = false)
    private String color;

    protected HairColor() {
        new HairColor(Personal_Color_Type.SPRING_WARM, "라이트브라운");
        new HairColor(Personal_Color_Type.SPRING_WARM, "골든브라운");
        new HairColor(Personal_Color_Type.SPRING_WARM, "꿀브라운");
        new HairColor(Personal_Color_Type.SUMMER_COOL, "애쉬브라운");
        new HairColor(Personal_Color_Type.SUMMER_COOL, "라이트애쉬");
        new HairColor(Personal_Color_Type.SUMMER_COOL, "블루블랙");
        new HairColor(Personal_Color_Type.AUTUMN_WARM, "다크브라운");
        new HairColor(Personal_Color_Type.AUTUMN_WARM, "초코브라운");
        new HairColor(Personal_Color_Type.AUTUMN_WARM, "구리빛");
        new HairColor(Personal_Color_Type.WINTER_COOL, "블루블랙");
        new HairColor(Personal_Color_Type.WINTER_COOL, "진한애쉬");
        new HairColor(Personal_Color_Type.WINTER_COOL, "와인컬러");
    }

    public HairColor(Personal_Color_Type personalColorType, String color) {
        this.personalColorType = personalColorType;
        this.color = color;
    }
}
