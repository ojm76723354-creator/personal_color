package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
@Table(name = "cosmetic")
public class Cosmetic {

    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "personal_color_type")
    private Personal_Color_Type personalColorType;

    @Column(name = "type", nullable = false)  // 립 / 블러셔 / 파데 등
    private String type;

    @Column(name = "product_name", nullable = false)
    private String productName;

    protected Cosmetic() {
        new Cosmetic(Personal_Color_Type.SPRING_WARM, "LIP", "코랄립");
        new Cosmetic(Personal_Color_Type.SUMMER_COOL, "LIP", "로즈톤립");
        new Cosmetic(Personal_Color_Type.AUTUMN_WARM, "LIP", "브릭립");
        new Cosmetic(Personal_Color_Type.WINTER_COOL, "LIP", "푸사이핑크립");
        new Cosmetic(Personal_Color_Type.SUMMER_COOL, "BLUSH", "브릭 코랄 블러셔");
        new Cosmetic(Personal_Color_Type.AUTUMN_WARM, "FOUNDATION", "웜톤 파운데이션 21호");

    }

    public Cosmetic(Personal_Color_Type personalColorType, String type, String productName) {
        this.personalColorType = personalColorType;
        this.type = type;
        this.productName = productName;
    }
}
