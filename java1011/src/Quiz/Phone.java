package Quiz;

public class Phone {
	private String name;

	public String getTel() {
		return tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	private String tel;

	public Phone(){
		name = "";
		tel = "";
	}
	public Phone(String name, String tel){
		this.name =name;
		this.tel = tel;
	}



}
