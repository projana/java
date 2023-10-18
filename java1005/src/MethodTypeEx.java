public class MethodTypeEx {
	public static void main(String[] args) {
//		메소드의 형태 4가지
//		- 반환값과 매개변수 유무를 통해서 총 4가지의 형태가 존재함

//		1. 반환값과 매개변수가 모두 없는 형태
//		- 매개변수가 없기 때문에 메소드 실행에 필요한 모든 데이터를 메소드 내부에서 선언하고, 사용함
//		- 메소드의 실행 결과가 동일함
//		- 반환값이 없기 때문에 메소드의 실행 결과를 외부에서 활용할 수 없음
//		- 메소드의 실행 결과를 메소드 내부에서 출력해야 함

//		2. 반환값은 없고, 매개변수가 존재하는 형태
//		- 매개변수가 존재하기 때문에 메소드 실행에 필요한 데이터를 외부에서 제공함
//		- 메소드 실행 시 전달되는 데이터에 따라서 실행 결과가 달라짐
//		- 반환값이 없기 때문에 메소드의 실행 결과를 외부에서 활용할 수 없음
//		- 메소드의 실행 결과를 메소드 내부에서 출력해야 함

//		3. 반환값은 존재하고, 매개변수가 없는 형태
//		- 매개변수가 없기 때문에 메소드 실행에 필요한 모든 데이터를 메소드 내부에서 선언하고, 사용함
//		- 메소드의 실행 결과가 동일함
//		- 반환값이 존재하기 때문에 메소드의 실행 결과를 외부에서 활용핤 수 없음
//		- 메소드의 실행 결과를 메소드 외부에서 출력함

//		4. 반환값과 매개변수가 모두 존재하는 형태
//		- 매개변수가 존재하기 때문에 메소드 실행에 필요한 데이터를 외부에서 제공함
//		- 메소드 실행 시 전달되는 데이터에 따라서 실행 결과가 달라짐
//		- 반환값이 존재하기 때문에 메소드의 실행 결과를 외부에서 활용핤 수 없음
//		- 메소드의 실행 결과를 메소드 외부에서 출력함

		MethodType mt = new MethodType();

		mt.func01();

		mt.func02(10,3);

		int result = 0;

		result = mt.func03();
		System.out.println("두 수의 덧셈은 " + result+ "입니다.");


		result = mt.func04(10,3);
		System.out.println("두 수의 덧셈은 " + result+ "입니다.");
		result = mt.func04(100,200);
		System.out.println("두 수의 덧셈은 " + result+ "입니다.");

	}
}