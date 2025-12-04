package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "clothes_color")
public class ClothesColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // PK: 자동 증가 ID
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "personal_color_type", nullable = false)
    private Personal_Color_Type personalColorType;

    @Column(name = "color", nullable = false)
    private String color;

    protected ClothesColor() {
        // JPA용 기본 생성자 – 비워둡니다.
    }

    public ClothesColor(Personal_Color_Type personalColorType, String color) {
        this.personalColorType = personalColorType;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public Personal_Color_Type getPersonalColorType() {
        return personalColorType;
    }

    public String getColor() {
        return color;
    }
}
