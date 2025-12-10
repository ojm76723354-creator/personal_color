package kr.persnol.color.PC;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClothesColorRepository extends JpaRepository<ClothesColor, Long> {

    // 퍼스널컬러에 맞는 옷 색상 목록을 조회하는 메서드
    List<ClothesColor> findByPersonalColorType(Personal_Color_Type personalColorType);
}
