
public class Subtraction implements IOperation{
	public String perform(String num1,String num2){
		String result;
		long firstNum = Integer.valueOf(num1);
		long secondNum = Integer.valueOf(num2);
		long subtracted = firstNum - secondNum;
		result = Long.toString(subtracted);
		return result;
	}
}
