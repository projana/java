public class Audio implements RemoteControl{

	private int volume ;

//	부모 인터페이스에서 상속받은 추상 메소드를 구현
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume){
		if(volume > RemoteControl.MAX_VLOUME){
			this.volume = RemoteControl.MAX_VLOUME;
		}
		else if(volume > RemoteControl.MIN_VLOUM){
			this.volume = RemoteControl.MIN_VLOUM;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨 : "+ this.volume);
	}
}
