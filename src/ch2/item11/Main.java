package ch2.item11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Address, String> buildingName = new HashMap<>();

        // 경기 성남시 분당구 정자일로 95
        Address naver = new Address("경기 성남시 분당구", "정자일로", 95);
        Address dupNaver = new Address("경기 성남시 분당구", "정자일로", 95);
        Address anagramNaver = new Address("기경 시남성 당분구", "자정일로", 95);

        Address kakao = new Address("경기 성남시 분당구", "판교역로", 166);

        // 해시 값 중복 테스트
        System.out.printf("naver hashCode: %d\n", naver.hashCode());
        System.out.printf("duplicated naver hashCode: %d\n", dupNaver.hashCode());
        System.out.printf("anagram naver hashCode: %d\n", anagramNaver.hashCode());
        System.out.printf("kakao hashCode: %d\n", kakao.hashCode());

        // 해시 맵 테스트
        buildingName.put(naver, "naver");
        System.out.printf("get naver: %s\n", buildingName.get(naver));
        System.out.printf("get dupNaver: %s\n", buildingName.get(dupNaver));

        buildingName.put(dupNaver, "네이버");
        System.out.printf("get naver: %s\n", buildingName.get(naver));
        System.out.printf("get dupNaver: %s\n", buildingName.get(dupNaver));

        System.out.printf("building name size: %d\n", buildingName.size());
    }
}
