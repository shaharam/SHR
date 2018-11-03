package question2;
import java.util.Scanner;

public class Monomial {
	private double _coefficient;
	private int _power;
	
	public Monomial(double _coefficient, int _power) {
		super();
		this._coefficient = _coefficient;
		this._power = _power;
	}
	
	public static double[] coefficientArray(int num) {
		double[] array = new double[num];
		Scanner scan = new Scanner (System.in);
		for (int i=0; i<num; i++) {
			System.out.printf("Enter the coefficient of monomial number %d: ", i+1);
			array[i] = scan.nextDouble();
		}
		return array;
	}
	
	public static int[] powerArray(int num) {
		int[] array = new int[num];
		Scanner scan = new Scanner (System.in);
		for (int i=0; i<num; i++) {
			System.out.printf("Enter the power of monomial number %d: ", i+1);
			array[i] = scan.nextInt();
		}
		return array;
	}

	/**
	 * @return the _coefficient
	 */
	public double get_coefficient() {
		return _coefficient;
	}

	/**
	 * @return the _power
	 */
	public int get_power() {
		return _power;
	}
}
