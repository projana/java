package Quiz;

public class StaicTest {
	public static void main(String[] args) {

		Circle pizza =  new Circle(5); // 반지름이 5인 원 생성
		Circle waffle = new Circle(1); // 반지름이 1인 원 생성

		boolean res = Circle.CircleManager.equeals(pizza,waffle); // pizza와 waffle비교
		if(res == true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");

		Circle.CircleManager.copy(pizza,waffle); //  pizza를 waffle에 복사
		res= Circle.CircleManager.equeals(pizza,waffle);// pizza와 waffle 비교
		if(res == true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
	}
}
