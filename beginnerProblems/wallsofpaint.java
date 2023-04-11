//Create a function that returns the number of complete walls that can be painted, before the painters need to head to the shops to buy more.

//n is the number of square meters of paint.
//w and h are the widths and heights of a single wall in meters


public class BlueShade {
  public static int howManyWalls(int n, int w, int h) {
		int area = w * h;
		if (area > n) {
			return 0;
		} else {
			return (int) (n / area);
		}
  }
}
