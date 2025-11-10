// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt (args [0]);
        String mode = args[1];
		if (mode.equals("v")){
			int count = 1;
			for (int i = 1; i<=N; i++) {
				int j = i;
				do {
					System.out.print(j + " ");
					if (j%2 == 0) {
						j /= 2;
					} else {
						j = (j * 3) + 1;
					}
					count++;
				} while (j != 1);
				System.out.println(1 + " (" + count + ")");
				count = 1;
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		} else {
			for (int i = 1; i<=N; i++) {
				int j = 1;
				do { 
					if (j%2 == 0) {
						j /= 2;
					} else {
						j = (j * 3) + 1;
					}
				} while (j != 1);
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}
}
