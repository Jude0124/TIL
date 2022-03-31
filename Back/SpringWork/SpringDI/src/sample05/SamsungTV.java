package sample05;

public class SamsungTV implements TV{
	
	
	public SamsungTV() {
		super();
		System.out.println("SamsungTV 객체가 생성되었어요...");		
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원을 켠다.");		
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원을 끈다.");		
		
	}

	@Override
	public void volumnUp() {
		System.out.println("SamsungTV --- 소리를 높인다.");		
		
	}

	@Override
	public void volumnDown() {
		System.out.println("SamsungTV --- 소리를 줄인다.");		
	}

}
