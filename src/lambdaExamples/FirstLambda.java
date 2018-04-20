package lambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class FirstLambda {

	public static void main(String[] args) {

		// Arrow operator (“->”) for defining lambda functions,
		// Double colon operator (“::”) used for method references, and the default
		// keyword.

		// LambdaParameters -> LambdaBody
		// params in (x,y)
		// {} to do stuff

		// No return statement in this lambda expression body and hence the compiler
		// infers
		// the return type of this expression as the void type—that matches with the
		// return type of the call method
		LambdaFunction a = () -> {
			System.out.println("Hello World!");
		};
		a.call();

		/*
		 * Basic syntax of a lambda expression is (parameters) -> expression or
		 * (parameters) -> { statements; } or () -> expression
		 * 
		 * Examples (int a, int b) -> a * b (a, b) -> a - b a -> 2 * a c -> { //some
		 * complex statements }
		 * 
		 */

		// Iterating over a List and perform some operations
		List<String> pointList = new ArrayList<String>();
		pointList.add("1");
		pointList.add("2");
		pointList.forEach(p -> {
			System.out.println(p);
			// Do more work
		});

		// Sorting employees objects by their name
		Employee[] employees = { new Employee("David"), new Employee("Naveen"), new Employee("Alex"),
				new Employee("Richard") };
		System.out.println("Before Sorting Names: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After Sorting Names " + Arrays.toString(employees));
		
		// Adding an event listener to a GUI component
		JButton button =  new JButton("Submit");
		button.addActionListener((e) -> {
		    System.out.println("Click event triggered !!");
		});
	}

	//
	interface LambdaFunction {
		void call();
	}

}

class Employee {
	String name;

	Employee(String name) {
		this.name = name;
	}

	public static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
	}

	public String toString() {
		return name;
	}
}