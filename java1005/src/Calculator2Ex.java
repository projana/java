import java.util.Scanner;

public class Calculator2Ex {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();

		cal.sum();
		cal.sub();
		cal.multi();
		cal.div();

//		문제 1) 계산을 하기 위한 Calculator3 클래스를 생성하고, 사칙 연산을 하기 위한 메소드를 생성 후 계산을 진행하는 프로그램을 작성하세요.
//		- 메소드 명 : sum (2번 방식), sub(3번 방식), multi(4번 방식), div(1번 방식)
//		- 출력 예시 : "두 수의 덧셈은 -- 입니다."

		System.out.println("-------- 문제 2 ---------");
// 		문제 2) 사용자에게서 국어, 영어, 수학 점수를 각각 입력받고 총점과 평균을 구한 후,  평균 점수에[ 따라서 등급을 출력하는 프로그램을 작성하세요.
//		- A : 90점 이상, B : 80점 이상, C : 70점 이상, D : 60점 이상 ,F : 60점 미만
//		- 출력 예제 : "당신의 총점은 xxx점이고, 평균은 xx점 이며, 등급은 X입니다."

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력하셈>>");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력하셈>>");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력하셈>>");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println("총점 : " + total + " 입니다.");
		System.out.println("평균 : " + avg + " 입니다.");

		String grade = " ";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade + "등급 입니다.");


		System.out.println("--------- 문제 3 --------");
//		문제 3) 위의 문제 2번을 메소드를 사용하는 방식으로 수정하세용;
//		- 클래스명 : Grade.java
//		- 메소드명 : gradeCal(등급 계산), inputScore(사용자 점수 입력 받기 메소드)
//		3번형태
		Grade grade2 = new Grade();

//		1. 점수 입력
//		2. 총점 계산
		int total1 = grade2.inputScore();

//		3. 평균 계산

//		4. 등급 계싼
		grade2.gradeCal(total1);

//		5. 화면 출력70
//		System.out.println(total1);


		System.out.println("--------- 문제 4 --------");
//		문제 4) 사용자 입력을 통해서 출력하고자 하는 구구단의 단수를 입력받고 해당 단수의 구구단을 출력하는 프로그램을 작성하세요
//		- 클래스 명 : Gugudan
		System.out.print("구구단의 단수를 입력하세요>>>>");
		int dan = sc.nextInt();



		System.out.println( dan + "단 !!");

		for (int i = 0; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}

		System.out.println("--------- 문제 5 --------");
//		문제 5) 문제4번 활용하여 메소드를 사용하여 지정한 단수의 구구단을 출력하는 츠로그램을 작성하세요
//		- 클래스명 : Gugudan2
//		- 메소드명 : inputDansu(키보드 입력부분), outputGugudan(구구단 출력)

		Gugudan2 gugu = new Gugudan2();
		int gugu1 = gugu.intputDansu();
		gugu.outputGugudan(gugu1);

//		문제 6) 책 184페이지 1번 문제
//		문제 7) 책 184페잉지 2번 문제

	}
}
