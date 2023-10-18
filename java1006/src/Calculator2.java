public class Calculator2 {
	int num1 ;
	int num2;
	int result;

//	생성자 선언
//	public Calculator2(){
////		생성자를 사용한 기본값 설정
////		num1 = 10;
////		num2 = 20;
////		result = 0;
//		defaultSetup();
//	}

	public Calculator2(){

	}

	//	메소드 선언
	public void outputResult(){
		System.out.println("결과는 " + result);
	}
	public void defaultSetup() {
		result = num1 + num2;
		System.out.println("num1 + num2");

	}
}
