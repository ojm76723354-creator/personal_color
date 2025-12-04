package kr.persnol.color.PC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static kr.persnol.color.PC.Personal_Color_Type.*;
import static kr.persnol.color.PC.CosmeticCategory.*;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ClothesColorRepository clothesRepo,
                                      HairColorRepository hairRepo,
                                      CosmeticRepository cosmeticRepo) {
        return args -> {

            // ------- 옷 색상 (예시) -------
            clothesRepo.save(new ClothesColor(SPRING_WARM, "연핑크"));
            clothesRepo.save(new ClothesColor(SPRING_WARM, "코랄"));
            clothesRepo.save(new ClothesColor(SPRING_WARM, "라이트옐로우"));
            clothesRepo.save(new ClothesColor(SPRING_WARM, "민트"));

            clothesRepo.save(new ClothesColor(SUMMER_COOL, "라일락"));
            clothesRepo.save(new ClothesColor(SUMMER_COOL, "베이비블루"));

            clothesRepo.save(new ClothesColor(AUTUMN_WARM, "올리브"));
            clothesRepo.save(new ClothesColor(AUTUMN_WARM, "머스타드"));

            clothesRepo.save(new ClothesColor(WINTER_COOL, "블랙"));
            clothesRepo.save(new ClothesColor(WINTER_COOL, "핑크퍼플"));

            // ------- 헤어 색상 (예시) -------
            hairRepo.save(new HairColor(SPRING_WARM, "라이트브라운"));
            hairRepo.save(new HairColor(SPRING_WARM, "골드브라운"));

            hairRepo.save(new HairColor(SUMMER_COOL, "애쉬브라운"));
            hairRepo.save(new HairColor(SUMMER_COOL, "카키브라운"));

            hairRepo.save(new HairColor(AUTUMN_WARM, "다크브라운"));
            hairRepo.save(new HairColor(AUTUMN_WARM, "초콜릿브라운"));

            hairRepo.save(new HairColor(WINTER_COOL, "블루블랙"));
            hairRepo.save(new HairColor(WINTER_COOL, "다크블랙"));

            // ------- 화장품 (립/블러셔/하이라이터) 예시 -------
            // 립
            cosmeticRepo.save(new Cosmetic(SPRING_WARM, LIP, "코랄 립"));
            cosmeticRepo.save(new Cosmetic(SUMMER_COOL, LIP, "로즈톤 립"));
            cosmeticRepo.save(new Cosmetic(AUTUMN_WARM, LIP, "브릭 립"));
            cosmeticRepo.save(new Cosmetic(WINTER_COOL, LIP, "푸시아 핑크 립"));

            // 블러셔
            cosmeticRepo.save(new Cosmetic(SPRING_WARM, BLUSH, "복숭아 블러셔"));
            cosmeticRepo.save(new Cosmetic(SUMMER_COOL, BLUSH, "라벤더/쿨핑크 블러셔"));
            cosmeticRepo.save(new Cosmetic(AUTUMN_WARM, BLUSH, "오렌지/테라코타 블러셔"));
            cosmeticRepo.save(new Cosmetic(WINTER_COOL, BLUSH, "버건디 블러셔"));

            // 하이라이터
            cosmeticRepo.save(new Cosmetic(SPRING_WARM, HIGHLIGHTER, "골드 톤 하이라이터"));
            cosmeticRepo.save(new Cosmetic(SUMMER_COOL, HIGHLIGHTER, "쿨톤 하이라이터"));
            cosmeticRepo.save(new Cosmetic(AUTUMN_WARM, HIGHLIGHTER, "골드 계열 하이라이터"));
            cosmeticRepo.save(new Cosmetic(WINTER_COOL, HIGHLIGHTER, "쿨톤 하이라이터"));
        };
    }
}
