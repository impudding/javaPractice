
public class Comparison implements IOperation{
	public String perform(String num1,String num2){
		String result = "0";
		
		int i;
		int length1 = num1.length();
		int length2 = num2.length();
		
		if(length1 < 19 && length2 < 19){	
			long firstNum = Long.valueOf(num1);
			long secondNum = Long.valueOf(num2);
		
			if(firstNum < secondNum){
				result = "-1";
			}
			else if(firstNum == secondNum){
				result = "0";
			}
			else{
				result = "1";
			}
			
			return result;
		}
		else{
			if(num1.charAt(0) == '-' && num2.charAt(0) != '-'){
				return result = "-1";
			}
			
			else if(num1.charAt(0) != '-' && num2.charAt(0) == '-'){
				return result = "1";
			}
			
			else if(num1.charAt(0) == '-' && num2.charAt(0) == '-'){
				int[] intArr1 = new int[length1];
				int[] intArr2 = new int[length2];
				
				if(length1 > length2){
					return result = "-1";
				}
				
				else if(length1 < length2){
					return result = "1";
				}
				else{ //same length
					for(i = 1;i < length1;i++){
						intArr1[i] = Character.digit(num1.charAt(i), 10);
					}
					for(i = 0;i < length2;i++){
						intArr2[i] = Character.digit(num2.charAt(i), 10);
					}
				
					for(i = length1 - 1;i > 0;i--){
						if(intArr1[i] < intArr2[i]){
							return result = "1";
						}
						
						else if(intArr1[i] > intArr2[i]){
							return result = "-1";
						}
					}
				}
			}
			else if(num1.charAt(0) != '-' && num2.charAt(0) != '-'){
				int[] intArr1 = new int[length1];
				int[] intArr2 = new int[length2];
				
				if(length1 > length2){
					return result = "1";
				}
				
				else if(length1 < length2){
					return result = "-1";
				}
				else{ //same length
					for(i = 1;i < length1;i++){
						intArr1[i] = Character.digit(num1.charAt(i), 10);
					}
					for(i = 0;i < length2;i++){
						intArr2[i] = Character.digit(num2.charAt(i), 10);
					}
				
					for(i = length1 - 1;i > 0;i--){
						if(intArr1[i] < intArr2[i]){
							return result = "-1";
						}
						
						else if(intArr1[i] > intArr2[i]){
							return result = "1";
						}
					}
				}
			}			
			return result = "0";
		}
	}
}
