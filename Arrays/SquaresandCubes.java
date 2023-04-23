//Create a function that takes an array of two numbers and checks if the square root of the first number is equal to the cube root of the second number

public class Challenge{
	public static boolean squaresAndCubes(int[] arr) {
		double squareRoot = Math.sqrt(arr[0]);
		double cube = Math.pow(squareRoot, 3);
		return cube == arr[1];
	}
}
