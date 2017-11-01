import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Ingrese nombre ");
		String name = keyboard.next();
		
		System.out.print("Ingrese su edad ");
		int age = keyboard.nextInt();
		
		Utilitario miUtilitario = new Utilitario(name, age);
		
		miUtilitario.sayHello();
	}
}
	
