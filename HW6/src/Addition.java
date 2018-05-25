import java.util.Arrays;
public class Addition implements IOperation{
	
	public String perform(String num1,String num2){
		String result = "";
		int length1 = num1.length();
		int length2 = num2.length();
		int i = 0,j = 0;
				
		if(length1 > 18 || length2 > 18){
			int max = Math.max(length1, length2);
			int[] sum = new int[max];
			int[] intArr1 = new int[max];
			int[] intArr2 = new int[max];
		}	
		
		else{
			long firstNum = Integer.valueOf(num1);
			long secondNum = Integer.valueOf(num2);
			long added = firstNum + secondNum;
			result = Long.toString(added);
		}	
		return result;
	}	
}
