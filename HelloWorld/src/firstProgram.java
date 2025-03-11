public class firstProgram {
	private int [] array=new int [100];
	private int number;
	public void setNumber (int number2) {
		number=number2;
	}
	public int getNumber() {
		return number;
	}
	public static void main(String[] args) {
		firstProgram class2=new firstProgram();
		class2.setNumber(10);
		int answer=class2.getNumber();
		System.out.println("The number is:"+ answer);
		
	}

}
