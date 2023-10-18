import java.util.Scanner;
// 문제3번 풀이 클래스
public class Grade {

	public int inputScore(){
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력하셈>>");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력하셈>>");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력하셈>>");
		int math = sc.nextInt();
		return kor + eng + math;

	}
	public void gradeCal(int a){
		double avg = a / 3;
		String grade = "F";
		if (avg >= 90){
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >=60) {
			grade = "D";
		}
//		return grade;
		System.out.println( grade + "등급 입니다.");

	}

}
