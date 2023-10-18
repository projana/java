import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("\n---------- 문제 1 -----------\n");

//        문제1 ) 크기가 10인 배열 scores를 선언하고 각각의 점수를 사용자 키보드 입력을 통해서 입력받은 후 scores에 저장하고 해당배열의 총합 및 평균을 구하는 프로그램을 작성하세요.

////        배열의 크기가 10인 배열 선언
//        int[] score = new int[10];
//
////        사용자 키보드 입력을 위한 scanner객체 선언
//        Scanner scanner =new Scanner(System.in);
//
////      사용자 입력수 확인용 변수, 배열의 index
//        int count = 0;
//
////        반복문을 무한 반복
//        while(true){
//            count++;
//            System.out.println((count) + "번째 숫자를 입력하세요(00 입력 시 종료)>>");
//            String inputData = scanner
//        }





        int[] score = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("점수를 입력하세요>>");
        Scanner scanner =new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
            total += score[i];
        }

        double avg = total / score.length;
        int avg1 = (int)avg;
        System.out.println("총합 : "+ total + ", 평균 : " + avg1);



//        문제2 ) 해당 총합 및 평균을 저장한 배열을 활용하여 각 등급을 출력하는 프로그램을 작성하세요
//        A : 90이상, B : 80점 이상, C : 70점이상, D : 60점 이상, F : 60점 미만

//        int tatal = 0;
//        double avg = 0.0;
//        String grade = "F";
//
//        if (avg >= 90){
//            grade= "A";
//        } else if (avg >= 80) {
//            System.out.println("B");
//        } else if (avg >= 70) {
//            System.out.println("C");
//        }else if (avg >= 60) {
//            System.out.println("D");
//        }else {
//            grade = "F";
//        }


//        문제3 ) 배열 scores의 내용을 반복문을 사용하여 모두 출력하는 프로그램을 작성하세요.
//        ps) 등급이 C 이상인 학생의 점수 및 등급을 출력하세요





    }
}
