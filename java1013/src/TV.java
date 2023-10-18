public class TV implements RemoteControl{
	private int volume ;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : "+ this.volume);
	}
}

