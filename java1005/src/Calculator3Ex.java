public class Calculator3Ex {

	public static void main(String[] args) {

//		문제 1) 계산을 하기 위한 Calculator3 클래스를 생성하고, 사칙 연산을 하기 위한 메소드를 생성 후 계산을 진행하는 프로그램을 작성하세요.
//		- 메소드 명 : sum (2번 방식), sub(3번 방식), multi(4번 방식), div(1번 방식)
//		- 출력 예시 : "두 수의 덧셈은 -- 입니다."
		Calculator3 cal = new Calculator3();

		cal.sum(2, 3);

		int result = cal.sub();
		System.out.println("두 수의 뺄셈은 " + result + "입니다.");

		result = cal.multi(5, 3);
		System.out.println("두 수의 곱셉은 " + result + "입니다.");

		cal.div();

	}
}
