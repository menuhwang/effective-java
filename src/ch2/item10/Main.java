package ch2.item10;

public class Main {
    public static void main(String[] args) {
        // 경기 성남시 분당구 정자일로 95
        Address naver = new Address("경기 성남시 분당구", "정자일로", 95);

        System.out.print("self: ");
        System.out.println(naver.equals(naver));

        System.out.print("null: ");
        System.out.println(naver.equals(null));

        System.out.print("other class: ");
        System.out.println(naver.equals(new Object()));

        // 경기 성남시 분당구 판교역로 166
        Address kakao = new Address("경기 성남시 분당구", "판교역로", 166);

        Address dupNaver = new Address("경기 성남시 분당구", "정자일로", 95);

        System.out.print("naver and kakao: ");
        System.out.println(naver.equals(kakao));

        System.out.print("naver and duplicated naver: ");
        System.out.println(naver.equals(dupNaver));
    }
}
