public class Account {

//	예금액
	private long balance;

	public Account() {}

//	balance의 Getter메소드, 현재 예금액 출력
	public long getBalance() {
		return balance;
	}

//	balance 의 Setter메소드, 예금액 추가
	public void deposit(int money){
		balance += money;
	}

//	출금을 위한 메소드
	public void withDraw(int money) throws BalanceIsfficientException {
		if(balance < money) {
//			예외 강제 발생
			throw new BalanceIsfficientException("잔고 부족 : " + (money - balance) + " 부족");
		}

		balance -= money;
	}
}
