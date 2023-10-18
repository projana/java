import java.util.Scanner;

public class Gugudan2 {
		Scanner sc = new Scanner(System.in);
//	출력하고자 하는 구구단의 단수를 입력
	public int intputDansu() {
//		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단수를 입력하세요>>>>>");
		int dan = sc.nextInt();
		return dan;

	}
//  입력받은 구구단의 단수를 출력
	public void outputGugudan(int gugu1) {
		System.out.println(gugu1 +"단 !!");
		for (int i = 1; i < 10; i++) {
			System.out.println(gugu1 + " X " + i + " = " + gugu1 * i);
		}
	}
}
