package kr.persnol.color.PC;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CosmeticRepository extends JpaRepository<Cosmetic, Long> {

    // Personal_Color_Type에 맞는 화장품 조회
    List<Cosmetic> findByPersonalColorType(Personal_Color_Type type);

    // Personal_Color_Type과 Category에 맞는 화장품 조회
    List<Cosmetic> findByPersonalColorTypeAndCategory(Personal_Color_Type type, CosmeticCategory category);
}
