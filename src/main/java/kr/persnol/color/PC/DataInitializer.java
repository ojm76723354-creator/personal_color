package kr.persnol.color.PC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ClothesColorRepository clothesRepo,
                                      HairColorRepository hairRepo,
                                      CosmeticRepository cosmeticRepo,
                                      JdbcTemplate jdbcTemplate) {
        return args -> {

            // MySQL에서 AUTO_INCREMENT 초기화: 각 테이블을 초기화하고 AUTO_INCREMENT 값을 0으로 설정
            jdbcTemplate.execute("TRUNCATE TABLE clothes_color");
            jdbcTemplate.execute("TRUNCATE TABLE hair_color");
            jdbcTemplate.execute("TRUNCATE TABLE cosmetic");

            // ------- 초기 데이터 삽입 -------
            // 옷 색상 데이터
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SPRING_WARM, "연핑크"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SPRING_WARM, "코랄"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SPRING_WARM, "라이트옐로우"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SPRING_WARM, "민트"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SUMMER_COOL, "라일락"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.SUMMER_COOL, "베이비블루"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "올리브"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.AUTUMN_WARM, "머스타드"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.WINTER_COOL, "블랙"));
            clothesRepo.save(new ClothesColor(Personal_Color_Type.WINTER_COOL, "핑크퍼플"));

            // 헤어 색상 데이터
            hairRepo.save(new HairColor(Personal_Color_Type.SPRING_WARM, "라이트브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.SPRING_WARM, "골드브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.SUMMER_COOL, "애쉬브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.SUMMER_COOL, "카키브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.AUTUMN_WARM, "다크브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.AUTUMN_WARM, "초콜릿브라운"));
            hairRepo.save(new HairColor(Personal_Color_Type.WINTER_COOL, "블루블랙"));
            hairRepo.save(new HairColor(Personal_Color_Type.WINTER_COOL, "다크블랙"));

            // 화장품 데이터
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SPRING_WARM, CosmeticCategory.LIP, "코랄 립"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SUMMER_COOL, CosmeticCategory.LIP, "로즈톤 립"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.AUTUMN_WARM, CosmeticCategory.LIP, "브릭 립"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.WINTER_COOL, CosmeticCategory.LIP, "푸시아 핑크 립"));

            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SPRING_WARM, CosmeticCategory.BLUSH, "복숭아 블러셔"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SUMMER_COOL, CosmeticCategory.BLUSH, "라벤더/쿨핑크 블러셔"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.AUTUMN_WARM, CosmeticCategory.BLUSH, "오렌지/테라코타 블러셔"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.WINTER_COOL, CosmeticCategory.BLUSH, "버건디 블러셔"));

            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SPRING_WARM, CosmeticCategory.HIGHLIGHTER, "골드 톤 하이라이터"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.SUMMER_COOL, CosmeticCategory.HIGHLIGHTER, "쿨톤 하이라이터"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.AUTUMN_WARM, CosmeticCategory.HIGHLIGHTER, "골드 계열 하이라이터"));
            cosmeticRepo.save(new Cosmetic(Personal_Color_Type.WINTER_COOL, CosmeticCategory.HIGHLIGHTER, "쿨톤 하이라이터"));
        };
    }
}
