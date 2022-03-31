package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	
	public void flying() {
		System.out.println("하늘을 날아갑니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		Animal a = new Human(); //다음과 같은 선언은 32번줄에서 moveAnimal의 매개변수로 대입되는것과 똑같은 효과이다.
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	 }
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		
	}
}
