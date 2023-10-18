package quiz;

public class CircleManager { // static 메소드만 가짐
	// 		StaticTest 클래스에서 copy() 메소드를 사용하고 있으므로 접근제한자가 public 혹은 default임
//		StaticTest클래스에서  copy()메소드가 객체명이 아닌 클래스명을 하숑해서 메소드를 제공하고 있음
		public static void copy(Circle src, Circle dest) { // scr를 dest에 복사
			dest.setRadius(src.getRadius()); // scr의 반지름을 dest 에 복사
		}

//		StaticTest  클래스에서 equeals() 메소드를 사용하고 있으므로 접근제한자가 public 혹은 default임
//	 	위의 소스에서 eqia;s 메소드가 객체 생성없이 사용되고 있으므로 정적 메소드임
		public static boolean equeals(Circle a, Circle b) {
//			클래스 Circle의 필드값을 비교하여 같으면 true를 출력하고 다르면 false를 출력
			if (a.getRadius() == b.getRadius()) {
				return true;
			} else {
				return false;
			}

		}
	}

