package kr.persnol.color.PC;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClothesColorRepository extends JpaRepository<ClothesColor, Long> {

    List<ClothesColor> findByPersonalColorType(Personal_Color_Type type);
}
