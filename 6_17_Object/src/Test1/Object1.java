package Test1;

import Test1.Object1;

/* 2020.6.17 수  (집에서)
 * 
 * 오버로딩  : 같은 이름 메소드에, 매개변수값을 다르게 주어 재정의 한것  
 * 			(실제 호출할때도 인자값을 2개주면 -> 매개변수2개인 메소드실행       /   인자값3개주면 -> 매개변수3개인 메소드실행) 
 * 
 * this.(변수명)  :  해당 클래스 { } 필드안에 있는 멤버변수를 가르키는것  
 * 					(안써도 실행에 문제는 없지만  추후 [상속] 받고난후 (부모)클래스 멤버변수와 (자식)클래스 멤버변수와 헤깔리지않게..)
 * 
 * 오버라이딩 : (배웠는데 까먹) 클래스이름 똑같이 정의하는 내용으로 알고있음
 * 
 * 
 * 인스턴스(객체) 생성할시 쉽게 읽는방법 예시
 * Person p1 = new Person();
 * 
 * p1.display();   --> p1.~   p1의 display() 메소드 
 * p1.add();	   --> p1.~   p1의 add() 메소드 ( add메소드는 Hero에서 상속받은것 ) 
 * 
 */

class Hero {

	String name;
	int hp;
	int mp;

	// 각 멤버변수에 초기값을 넣어주는 메소드
	void inForMation(String a, int b, int c) {
		this.name = a;
		this.hp = b;
		this.mp = c;
	}

	// 멤버변수 name만 출력하는 메소드
	void add(String a) {
		System.out.println("Hero name : " + this.name);
	}

	// 멤버변수 name,hp를 출력하는 메소드
	void add(String a, int b) {
		System.out.println("Hero name : " + this.name);
		System.out.println("Hero HP :" + this.hp);
	}

	// 멤버변수 name,hp,mp를 출력하는 메소드
	void add(String a, int b, int c) {
		System.out.println("Hero name : " + this.name);
		System.out.println("Hero HP : " + this.hp);
		System.out.println("Hero MP : " + this.mp);
	}

}

// Hero 클래스를 상속받음
// Hero -> Person   ( Hero + Person ) 
class Person extends Hero {

	int b;

	Person() {
		super(); // ?? super 기능 배웠는데 아직 긴가민가.. (this는 멤버변수를 가르킨다하면 : super는 Hero클래스 멤버변수를 가르킨다던데
					// ??
		this.b = 20;
	}

	void display() {
		System.out.println(name);
	}
}

public class Object1 {

	public static void main(String[] args) {

		// Hero 상속받은 Person 새로운 인스턴스 생성(객체생성) 인스턴스 = 객체 같은말로 보면됨
		Person p1 = new Person();

		// Hero 클래스 inForMation 메소드 기능보면 알것임 ( 인자로 받은 값을 Hero멤버변수에 대입함 )
		p1.inForMation("헐크", 100, 1000);

		// Person 클래스 display() 메소드 기능보면 알것임 (현재 Person클래스에는 직접 눈으론 안보이지만 Hero상속받았기에
		// Hero클래스 부분 name을 출력하는 기능을 가진 메소드)
		p1.display();

		System.out.println("-------");

		// 인스턴스는 Person 으로 생성했지만 실제 Hero클래스에 있는 메소드이며
		// p1. <-- 이것은 상속받았기에 Hero클래스 메소드 사용가능
		// 현재 Hero 클래스 add는 총 3개의 오버로딩 메소드 존재
		p1.add("영웅이름", 1);
		System.out.println("-------");
		p1.add("영웅이름", 1, 1);

	}

}
