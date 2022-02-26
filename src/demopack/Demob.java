package demopack;

public class Demob {

	public static void main(String[] args) {
		
		Demob obj = new Demob();
		int product = obj.multiply(5,6);
		System.out.println("Output is " + product);
		
	}
	
	public int multiply(int num1, int num2) {
		return (num1*num2); 
	}

}
