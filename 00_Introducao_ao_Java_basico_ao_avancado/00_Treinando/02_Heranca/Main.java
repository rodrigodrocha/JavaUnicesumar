public class Main{
	public static void main(String[] args){


		System.out.println("--Cachorro--");
		Dog p1 = new Dog();
		p1.setColor("black");
		p1.talk();
		p1.walk();

		System.out.println("--Gato--");
		Cat p2 = new Cat();
		p2.setColor("white");
		p2.talk();
		p2.walk();


		System.out.println("--Peixe--");
		Fish p3 = new Fish();
		p3.setColor("yellow");
		p3.swim();

	}
}