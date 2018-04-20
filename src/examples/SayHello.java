

package examples;
import java.lang.*;

//JavaPlatformModuleSystem
public class SayHello {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Greet greet = new Greet();
		greet.greetSomeone("Lee", false);
		
	}
}



class Greet implements GreeterPrivateMethods{
	
	public void greetSomeone(String personName, boolean female) {
		// TODO Auto-generated method stub
		GreeterPrivateMethods.super.greetSomeone(personName, female);
	}
}


