package kr.persnol.color.PC;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CosmeticRepository extends JpaRepository<Cosmetic, Long> {

    List<Cosmetic> findByPersonalColorTypeAndCategory(
            Personal_Color_Type type,
            CosmeticCategory category
    );
}
