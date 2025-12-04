package kr.persnol.color.PC;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HairColorRepository extends JpaRepository<HairColor, Long> {

    List<HairColor> findByPersonalColorType(Personal_Color_Type type);
}
