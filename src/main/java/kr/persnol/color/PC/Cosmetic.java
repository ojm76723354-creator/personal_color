package kr.persnol.color.PC;

import jakarta.persistence.*; // @Entity, @Table, @Id, @GeneratedValue, @Column, @Enumerated, EnumType

@Entity
@Table(name = "cosmetic")
public class Cosmetic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // PK: 자동 증가 Long
    private Long id;

    @Enumerated(EnumType.STRING)                         // enum → 문자열로 저장
    @Column(name = "personal_color_type", nullable = false)
    private Personal_Color_Type personalColorType;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private CosmeticCategory category;                   // LIP / BLUSH / HIGHLIGHTER

    @Column(name = "name", nullable = false)
    private String name;                                 // 코랄립, 복숭아 블러셔 등

    // JPA용 기본 생성자 → 비워두는 게 정석
    protected Cosmetic(

    ) {
    }

    // 우리가 직접 사용할 생성자
    public Cosmetic(Personal_Color_Type personalColorType,
                    CosmeticCategory category,
                    String name) {
        this.personalColorType = personalColorType;
        this.category = category;
        this.name = name;
    }

    // 필요하면 getter 추가
    public Long getId() {
        return id;
    }

    public Personal_Color_Type getPersonalColorType() {
        return personalColorType;
    }

    public CosmeticCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
