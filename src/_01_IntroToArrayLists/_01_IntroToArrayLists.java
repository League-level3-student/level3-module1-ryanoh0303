package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
			ArrayList<String> arr= new ArrayList<String>();
		//2. Add five Strings to your list
		arr.add("JACOB");
		arr.add("BOB");
		arr.add("BOO");
		arr.add("JACK");
		arr.add("JAKE");
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : arr) {
			System.out.println(string);
		} 
			
		
		
		//5. Print only the even numbered elements in the list.
		for(int i=0; i<arr.size(); i++) {
			if(i%2==0) {
				System.out.println(arr.get(i));
			}
		}
		
		//6. Print all the Strings in reverse order.
		for(int i=arr.size()-1; i>0; i--) {
			System.out.println(arr.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).contains("e")) {
				System.out.println(arr.get(i));
			}
		}
	}
}
