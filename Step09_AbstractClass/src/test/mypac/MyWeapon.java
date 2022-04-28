package test.mypac;

public class MyWeapon extends Weapon {

	@Override
	public void attack() {
		System.out.println("내 마음대로 공격해요!");
		
	}

}
//부모 메소드가 미완성이니까 자식 메소드에서 덮어쓰기를 해서 완성시켜야함