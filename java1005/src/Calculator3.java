public class Calculator3 {

	//		문제 1) 계산을 하기 위한 Calculator3 클래스를 생성하고, 사칙 연산을 하기 위한 메소드를 생성 후 계산을 진행하는 프로그램을 작성하세요.
//		- 메소드 명 : sum (2번 방식), sub(3번 방식), multi(4번 방식), div(1번 방식)
//		- 출력 예시 : "두 수의 덧셈은 -- 입니다."
	public void sum(int a,int b){
		int result = a + b;
		System.out.println("두 수의 덧셈은 " + result + "입니다." );
	}
	public int sub(){
		int a = 20;
		int b = 10;
		int result = a - b;
		return result;    // return a - b; 도 가능
	}
	public int multi(int a, int b){
		return a * b;
	}
	public void div(){
		int a = 100;
		int b = 5;
		double result = a / b;
		System.out.println("두 수의 나눗셈은 " + result + "입니다.");
	}
}
