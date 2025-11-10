// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double plsMns = -1;
		double aprox = 1;
		for (int i = 3; i<=(2*num); i = i+2) {
			aprox = aprox + (plsMns / i);
			plsMns = plsMns * (-1);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*aprox);
	}
}
