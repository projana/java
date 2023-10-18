public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();

//		예금
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());

		try{
//			출금
			account.withDraw(30000);
		}
		catch (BalanceIsfficientException e){
			String messege = e.getMessage();
			System.out.println(messege);
			System.out.println();
			e.printStackTrace();
//			e.getStackTrace();
		}
	}
}
