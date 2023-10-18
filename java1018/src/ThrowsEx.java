import java.util.Scanner;

public class ThrowsEx {
	public static void main(String[] args) {
//		throws 를 총해서 넘겨 받은 예외를 처리하는 try ~ catch문
		try {
			findClass();
			int result = div();
			System.out.println("두 수의 나눗셈은 " + result + "입니다.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "클래스가 존재하지않습니다.");
		}catch (ArithmeticException e) {
			System.out.println("0 으로는 나눌 수 없습니다.");
		}

	}

//throws : 특정 메소드 안에서 발생하는 예외를 처리하기위한 예외 처리 구문을 해당 메소드안에서 처리하는 것이 아니라 해당  메소드는 호출하는 위치에서 예외처리를 하도록 지시하는 명령어

	//	throws를 통해서 해당 메소드를 호출할 곳으로 예외처리르 떠넘김
	public static void findClass() throws ClassNotFoundException {
//		예외가 발생할 수 있는 소스 코드, try ~ catch를 사용하지 않음
		try {
			Class clazz = Class.forName("jaca.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
//			강제로 예외 발생시키기
//			throw new RuntimeException(e);
		}
	}

	public static int div() {
		Scanner sc = new Scanner(System.in);
		int result = 0;

//		try {
			System.out.println("첫번째 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요 : ");
			int num2 = sc.nextInt();

			result = num1 / num2;

//		}
//		catch (ArithmeticException e) {
//			System.out.println("0 으로는 나눌 수 없습니다.");
//		}
		return result;
	}
}
