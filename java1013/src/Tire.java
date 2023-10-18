public class Tire {
	public int maxRotation;
	public int accRotation;
	public String position;
	public Tire(String position, int maxRotation){
		this.position = position;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accRotation; // 누적 회전수를 1 증가

//		누적 회전수가 최대 회전수보다 작은지 확인
		if (accRotation < maxRotation) {
//			최대 회전수에서 누적 회전수 빼기
			System.out.println(position + " Tire 수명 : " + (maxRotation - accRotation) + "회");
			return true;
		} else {
			System.out.println("***** " + position + " Tire 평크 *****");
			return false;
		}
	}

}
