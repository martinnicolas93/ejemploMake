public class Utilitario {
	private String name;
	private int age;
	
	public Utilitario(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("Hola " + name + "! Usted tiene " + age + " años ");
		}
	}
