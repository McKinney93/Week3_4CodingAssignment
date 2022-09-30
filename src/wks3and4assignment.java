import java.lang.reflect.Array;
import java.util.Arrays;

public class wks3and4assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Question 1");
		//1. create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		//1a. programmatically subtract the value of the first element in the array from the value of the last element in the array (i.e do not use ages[7] in your code). Print result to console.
		//1b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths)
		//1c. use a loop to iterate through the array and calculate the average age. Print result to console
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//System.out.println(ages[ages.length -1]);
		
		//1a.
		int firstLastAgeDifference = (ages[ages.length -1] - ages[0]);
		System.out.println(firstLastAgeDifference);
		//1b.
		ages[ages.length - 1] = 100;
		System.out.println(ages[ages.length -1] - ages[0]);
		//1c. 
		double sum = 0;
			for (int number : ages) {
				sum += number;
			}
			System.out.println(sum / ages.length);
			
		System.out.println("Question 2");	
		//2. Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
		//2a. use a loop to iterate through the array and calculate the average number of letters per name. print result to console. 
		//2b. use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to console.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//2a.
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		//System.out.println(sumOfLetters);
		
		int averageLetters = sumOfLetters / names.length;
		System.out.println(averageLetters);
		//2b.
		String allNames = "";
		for (String names2 : names) {
			allNames = allNames + names2 + " ";
		}
		System.out.println(allNames);	
		
		//3. How do you access the last element of any array?
		//system.out.println(array(array.length -1));
		
		//4. How do you access the first element of any array? 
		//system.out.println(array(array[0]));
		
		System.out.println("Question 5");
		//5. create a new array of int called nameLengths. write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int [names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		for (int name : nameLengths) {
			System.out.println(name);
		}
		System.out.println(Arrays.toString(nameLengths));
		
		System.out.println("Question 6");
		//6. write a loop to iterate over nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. 
		
		int sumOfNames = 0;
		for (int name : nameLengths) {
			sumOfNames += name;
		}
		System.out.println(sumOfNames);
		
		System.out.println("Question 7");
		//7. write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times 
		//(i.e. if i pass in "Hello" and 3, I expect the method to return "HelloHelloHello").
		String duplicateStr = multiplyString("Hello", 3);
		System.out.println(duplicateStr);
		
		System.out.println("Question 8");
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = "Sally";
		String lastName = "Lewis";
		System.out.println(fullName(firstName, lastName));
		
		System.out.println("Question 9");
		//9. write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		//Used the Ages array and sum variable for ages array as the pass-ins for this method
		System.out.println(isGreaterThan100(nameLengths));
		
		System.out.println("Question 10");
		//10. write a method that takes an array of double and returns the average of all the elements in the array
		double[] avgCostOfGroceries = {76.45, 65.33, 86.29, 70.96};
		System.out.println(groceryAverage(avgCostOfGroceries));
		
		System.out.println("Question 11");
		//11. write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] avgCostOfTakeOut = {57.89, 65.93, 47.50, 54.36, 125.56};
		System.out.println(isGroceriesMore(avgCostOfGroceries, avgCostOfTakeOut));
		
		System.out.println("Question 12");		
		//12. write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 11.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		System.out.println("Question 13");
		//13. create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		int[] store1 = {54, 22};
		int[] store2 = {100, 56, 64};
		System.out.println(spentInOneDay(store1, store2));
		
	}
	//Question 7 Method:
	public static String multiplyString(String str, int numReps) {
		String result = "";
		for (int i = 0; i < numReps; i++) {
			result += str;
		}
		return result;
		}
	
	//Question 8 Method:
	public static String fullName(String firstName, String lastName) {
		String result = "";
		result = firstName + " " + lastName;
		return result;
	}
	
	//Question 9 Method:
	public static boolean isGreaterThan100(int[]nameLengths) {
		int namesum = 0;
		for (int nmLgth : nameLengths) {
			namesum += nmLgth;
		}
		if (namesum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question 10 Method:
	public static double groceryAverage(double[] avgCostOfGroceries) {
		double sumOfGroceries = 0;
		for (double cost : avgCostOfGroceries) {
			sumOfGroceries += cost;
			}
		return sumOfGroceries / avgCostOfGroceries.length;
	}
	
	//Question 10 Extra Method - Used for Question 11:
	public static double takeOutAverage(double[] avgCostOfTakeOut) {
		double sumOfTakeOut = 0;
		for (double cost2 : avgCostOfTakeOut) {
			sumOfTakeOut += cost2;
		}
		return sumOfTakeOut / avgCostOfTakeOut.length;
	}
	
	//Question 11 Method:
	public static boolean isGroceriesMore(double[] avgCostOfGroceries, double[] avgCostOfTakeOut) {
	double groceriesMore = 0;
	double takeOutLess = 0;
	for (double x : avgCostOfGroceries) {
		groceriesMore += x;
	}
	for (double y : avgCostOfTakeOut) {
		takeOutLess += y;
	}
	if (groceriesMore / avgCostOfGroceries.length > takeOutLess / avgCostOfTakeOut.length) {
		return true;
	} else {
		return false;
	}
}
	
	//Question 12 Method:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} 
		return false;
	}
		
	//Question 13 Method: This method was written to add together the cost of all items between two int arrays and return the overall cost of products. 
	public static int spentInOneDay(int[] store1, int[] store2) {
		int cost1 = 0;
		int cost2 = 0;
		for (int item : store1) {
			cost1 += item;
		}
		for (int item2 : store2) {
			cost2 += item2;
		}
		return cost1 + cost2;		
	}
	
	
}

		

