package Quiz;

import pack2.C;

//		문제 2 ) 책 186 의 문제 5번 풀기
public class Circle {
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return this.radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}

	class CircleManager{ // static 메소드만 가짐
//		빈칸 static
		static void copy(Circle pizza, Circle waffle){ // scr를 dest에 복사
			waffle.setRadius(pizza.getRadius()); // scr의 반지름을 dest 에 복사
		}
//		빈칸 static
		static boolean equeals(Circle a, Circle b){ // a와 b의 반지름이 같으면 true 리턴
			if (a.getRadius() == b.getRadius()){ // 빈칸
				return true;
			}
			else {
				return false; //빈칸
			}

		}


		}
	}

