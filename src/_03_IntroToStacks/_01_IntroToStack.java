package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Stack<Double> stack= new Stack<Double>();
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand= new Random();
		for(int i=0; i<100; i++) {
			double x= 100*rand.nextDouble();
			stack.push(x);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String input= JOptionPane.showInputDialog("Enter two numbers between 0 and 100" );
		String input2= JOptionPane.showInputDialog("Second number?");
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("POPPING ELEMENTS OFF STACK");
			for(double i= Integer.parseInt(input); i<Integer.parseInt(input2); i++) {
				System.out.println(stack.pop());
			}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
