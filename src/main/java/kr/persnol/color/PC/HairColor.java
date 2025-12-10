package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "hair_color")
public class HairColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "personal_color_type", nullable = false)
    private Personal_Color_Type personalColorType;

    @Column(name = "color", nullable = false)
    private String color;

    // 기본 생성자 (JPA 리플렉션용)
    public HairColor() {}

    // 사용자 정의 생성자
    public HairColor(Personal_Color_Type personalColorType, String color) {
        this.personalColorType = personalColorType;
        this.color = color;
    }

    // Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personal_Color_Type getPersonalColorType() {
        return personalColorType;
    }

    public void setPersonalColorType(Personal_Color_Type personalColorType) {
        this.personalColorType = personalColorType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
