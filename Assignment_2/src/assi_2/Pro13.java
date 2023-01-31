package assi_2;

interface Animal 
{
	void makesound();
}

class Dog implements Animal
{
	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
	
}

class Cat implements Animal
{

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
	
}

public class Pro13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.makesound();
		cat.makesound();
		
//		Dog d = new Dog();
//		d.makesound();
//		Cat c = new Cat();
//		c.makesound();
	}

}
