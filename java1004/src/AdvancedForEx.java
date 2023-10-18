import java.util.Arrays;

public class AdvancedForEx {
    public static void main(String[] args) {
        System.out.println("\n----- 향상된  for 문 -----\n");

        int[] scores = {96, 71, 84, 93, 87};

        int total = 0;

        for (int score : scores) {
            total = total + score;
        }

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + (total / scores.length));

        System.out.println("\n----- 일반 for 문 -----\n");

        total = 0;

        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + (total / scores.length));

        System.out.println("\n----- 문제 1 -----\n");
//        문제 1) 배열 iArr1 에 10,20,30,40,50,60,70,80,90,100을 입력하고 향상된 for문을 사용하여 배열의 모든 데이터의 합을 구하는 프로그램을 작성하세요/
        int[] scores2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int total2 = 0;

        for (int num : scores2) {
            total2 = total2 + num;
        }

        System.out.println("총합 : " + total2);

        System.out.println("\n----- 문제 2 -----\n");
//        문제 2 ) 배열 lotto에 6개의 임의의 숫자를 입력하고, 입력된 데이터를 향상된 for문을 통해서 출력하는 프로그램을 작성하세요
//        - 임의의 숫자는 1 ~ 45  까지임
//        - 1 ~ 10까지 임의의 숫자 출력 방법 : int rnd = (int) (Math.random() * 10) + 1;
//        - 중복된 데이터가 없도록하세요( 중복 제거 사 2즁 for문 필요)
//        - 일반 2중 for문을 사용하여 데이터를 입력하고, if문으로 중복을 확인히야 함
//        - 출력 부분만 향상된 for문을 사용하여 데이터 출력

//        로또 번호를 저장할 크기가 6인 배열 선언
        int[] lotto = new int[6];

//        6번 반복해서 임의의 숫자를 6번 받아옴
        for (int i = 0; i < lotto.length; i++) {
//            1 ~ 45까지의 임의의 숫자를 받아옴
            int rnd = (int) (Math.random() * 45) + 1;
//            임의의 숫자를 받아 온 것을 배열에 저장
            lotto[i] = rnd;

//              중복제거
//            반복 조건이 j가 i보다 1작도록 설정해서 i번째 index의 값에 접근하지 못함
//            i번째 index의 값과 j번째 index의 값을 모두 비교
            for (int j = 0; j < i; j++) {
//            현재 i 값의 index와 j값의 index에 저장되 ㄴ데이터가 같은지가 확인
                if (lotto[i] == lotto[j]) {
//                    i값을 1감소 시켜서 현재 루프를 다시 한번 실행하여 임의의 숫자를 새로 받아 올 수 있도록 설정함
                    i--;
                    break; // 동일한 값이 확인 되었으므로 더 이상의 추가 비교는 필요없음
                }
            }
        }
//        정렬 메소드 - 오름차순
        Arrays.sort(lotto);

        for (int number : lotto) {
            System.out.println("번호 : " + number);
        }

//        for (int i = 1; i < 7; i++) {
//            System.out.println(i + "번째 번호: " + rnd);
//        }


    }
}
