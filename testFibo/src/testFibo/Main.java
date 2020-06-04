package testFibo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 0;
		int z = 0;
		for (int x = 1; x < 9000;) {
			System.out.println(y);
			z = y;
			y += x;
			x = z;
		}
	}

}
