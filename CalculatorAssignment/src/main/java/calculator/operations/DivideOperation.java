package calculator.operations;

final public class DivideOperation {
	
	int a = 0; 
	int b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public double getResult() {
		return Math.round((1.0 * this.a) / this.b * 10.0)/10.0;
	}


}
