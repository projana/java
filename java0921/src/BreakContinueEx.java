import java.util.Scanner;

public class BreakContinueEx {
    public static void main(String[] args) {
//        break : 제어문 내부에서 동작하며 현재 제어문을 즉시 종료하는 명령어
//        continue : 반복문 내부에서 동작하며 프로그램의 실행 흐름 중 현재 루프를 종료하고 다음 루프를 실행하는 명령어
//        사용법 :
//        반복문 {
//         break;
//       }
//        반복문{
//          continue;
//        }

        System.out.println("\n---------break---------\n");

        int dan = 5;

        for (int i = 1; i < 10; i++) {
            if(i == 5){
//                break를 만난서 반복문이 즉시 종료
                break;
            }
            System.out.println(dan +" * "+i + " = " +(dan * i));
        }

        System.out.println("\n--------continue---------\n");
        for (int i = 1; i < 10; i++) {
            if(i ==5){
//                continue를 만나서 현재 루프만 종료, 다음 루프로 이동
                continue;
            }
            System.out.println(dan +" * "+i + " = " +(dan * i));
        }

//        문제 6) 구구단을 2 ~ 9단까지 모두 출력하는 프로그램을 작성하세요
//        *사용자 입력을 통해서 숫자(2~9) 하나를 입력받고, 해단 단수의 구구단을 제외하고 모두 출력
        System.out.println("--------- 문제 6 ---------");
        System.out.print("숫자를 입력해 >>");
        Scanner sc = new Scanner(System.in);
        int dan2 = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            if (i == dan2){
                continue;
            }
            System.out.println( i+"단-----------");
            for (int j = 2; j < 10; j++) {

                System.out.println(i+ " * " + j + " = "+ ( i*j));
            }
        }
//        ㅇ while 문 해야함


//        문제 7) 사용자 입력을 통해서 숫자 (2 ~9) 하나를 입력받고, 해당단수의 구구단에서 구구단 출력을 멈추는 프로그램을 작성하세요
        System.out.println("--------- 문제 7 ---------");
        System.out.print("숫자 입력 >>");
        int dan3 = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            if (i == dan3){
                break;
            }
            System.out.println( i+"단-----------");
            for (int j = 2; j < 10; j++) {

                System.out.println(i+ " * " + j + " = "+ ( i*j));
            }
        }



    }
}
