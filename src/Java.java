public class Java {
	public static void main(String[] args) {
		int[] ints = new int[1];
		ints[0] = 0;
		for (int i=0; i < ints.length; i++) {
			int x = ints[i+1];
			System.out.println(x);
		}
	}
}
