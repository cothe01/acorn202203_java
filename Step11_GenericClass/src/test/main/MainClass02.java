package test.main;

import test.mypac.*;

public class MainClass02 {
    public static void main(String[] args) {
    	//객체를 생성할때 Generic 클래스는 생략이 가능하다
		FruitBox<Apple> box1=new FruitBox<>();
		FruitBox<Banana> box2=new FruitBox<>();
		FruitBox<Orange> box3=new FruitBox<>();
	}
}
