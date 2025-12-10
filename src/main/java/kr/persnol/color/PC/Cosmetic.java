package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "cosmetic")
public class Cosmetic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "personal_color_type", nullable = false)
    private Personal_Color_Type personalColorType;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private CosmeticCategory category;

    @Column(name = "name", nullable = false)
    private String name;

    // 기본 생성자 (JPA 리플렉션용)
    public Cosmetic() {}

    // 사용자 정의 생성자
    public Cosmetic(Personal_Color_Type personalColorType, CosmeticCategory category, String name) {
        this.personalColorType = personalColorType;
        this.category = category;
        this.name = name;
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

    public CosmeticCategory getCategory() {
        return category;
    }

    public void setCategory(CosmeticCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
