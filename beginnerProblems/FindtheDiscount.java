//Create a function that takes two arguments: 
//the original price and the discount percentage as integers and returns the final price after the discount.


public class Sales {
	public static double discount(int price, int percentage) {
		return (1 - percentage * 0.01) * price;
	}
} 
