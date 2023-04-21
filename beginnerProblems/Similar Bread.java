/*
Given two arrays, which represent two sandwiches, 
return whether both sandwiches use the same type of bread. 
The bread will always be found at the start and end of the array.
*/

public class Sandwiches {
	public static boolean hasSameBread(String[] a, String[] b) {
		return a[0] == b[0] && a[2] == b[2];
	} 
}
