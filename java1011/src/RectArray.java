import java.util.Scanner;

public class RectArray {
	public static void main(String[] args) {
		Rect [] r;
		r = new Rect[4];

		Scanner sc = new Scanner(System.in);

		System.out.print("너비와 높이 >> ");
		int width = sc.nextInt();
		int height = sc.nextInt();

		r[0] = new Rect(width, height );

		System.out.print("너비와 높이 >> ");
		width = sc.nextInt();
		height = sc.nextInt();

		r[1] = new Rect(width, height );

		System.out.print("너비와 높이 >> ");
		width = sc.nextInt();
		height = sc.nextInt();

		r[2] = new Rect(width, height );

		System.out.print("너비와 높이 >> ");
		width = sc.nextInt();
		height = sc.nextInt();

		r[3] = new Rect(width, height );

		int total =0;
		for (int i = 0; i < r.length ; i++) {
			total = total +r[i].getArea();
		}
		System.out.println("사각형의 합은 : " +total);




	}
}
