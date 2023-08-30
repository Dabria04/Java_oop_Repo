package Exercises;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		System.out.println(++i);
		
		int j = 0;
		System.out.println(j++);
		
		int ii = 100 - (100 - 50 * 30);
		System.out.println(ii);
		
		int jj = (100 - 50 * 30);
		System.out.println(jj);
	}

}
