package test.mypac;

public class Control implements Remocon {

	@Override
	public void up() {
		System.out.println("채널 올려요!");
		
	}

	@Override
	public void down() {
		System.out.println("채널 내려요!");
		
	}

}
