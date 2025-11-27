package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "clothes_color")
public class ClothesColor {

    @Id
    @Enumerated(EnumType.STRING) // ENUM을 문자열로 저장
    @Column(name = "personal_color_type")
    private Personal_Color_Type personalColorType;

    @Column(name = "color", nullable = false)
    private String color;

    public ClothesColor() {
        new ClothesColor(Personal_Color_Type.SPRING_WARM, "연핑크");
        new ClothesColor(Personal_Color_Type.SPRING_WARM, "코랄");
        new ClothesColor(Personal_Color_Type.SPRING_WARM, "라이트옐로우");
        new ClothesColor(Personal_Color_Type.SPRING_WARM, "민트");
        new ClothesColor(Personal_Color_Type.SUMMER_COOL, "라벤더");
        new ClothesColor(Personal_Color_Type.SUMMER_COOL, "베이비블루");
        new ClothesColor(Personal_Color_Type.SUMMER_COOL, "로즈핑크");
        new ClothesColor(Personal_Color_Type.SUMMER_COOL, "쿨그레이");
        new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "카라멜");
        new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "올리브");
        new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "브라운");
        new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "머스타드");
        new ClothesColor(Personal_Color_Type.WINTER_COOL, "블랙");
        new ClothesColor(Personal_Color_Type.WINTER_COOL, "화이트");
        new ClothesColor(Personal_Color_Type.WINTER_COOL, "버건디");
        new ClothesColor(Personal_Color_Type.WINTER_COOL, "에메랄드");
    }

    public ClothesColor(Personal_Color_Type personalColorType, String color) {
        this.personalColorType = personalColorType;
        this.color = color;
    }
}