import java.util.Scanner;

public class Main {
	public static void main(String[]  args){
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		String result = "",temp = "";
		int i = 0,j = 0;
		boolean tOrf = true;
		
		String[] splited = input.split(" ");
		
		if(splited[1].equals("+")){
			IOperation operation = new Addition();
			result = operation.perform(splited[0], splited[2]);
			temp = result;
			//System.out.println(result);
		}
		
		else if(splited[1].equals("-")){
			IOperation operation = new Subtraction();
			result = operation.perform(splited[0],splited[2]);
			temp = result;
			//System.out.println(result);
		}
		
		else if(splited[1].equals(">") || splited[1].equals("=") || splited[1].equals("<")){
			IOperation operation = new Comparison();	
			result = operation.perform(splited[0], splited[2]);
			int resInt = Integer.valueOf(result);
			//System.out.println(resInt);
			
			if(resInt == -1 && splited[1].equals("<")){
				tOrf = true;
			}
			else{
				tOrf = false;
			}
			
			if(resInt == 0 && splited[1].equals("=")){
				tOrf = true;
			}
			else{
				tOrf = false;
			}
			
			if(resInt == 1 && splited[1].equals(">")){
				tOrf = true;
			}
			else{
				//System.out.println("x");
				tOrf = false;
			}
			
			System.out.println(tOrf);
		}
		
		if(splited.length > 3){
			for(i = 3;i < (splited.length) - 1;i++){
				if(splited[i].equals("+")){
					IOperation operation = new Addition();
					temp = operation.perform(temp,splited[i+1]);
				}
				
				if(splited[i].equals("-")){
					IOperation operation = new Subtraction();
					temp = operation.perform(temp,splited[i+1]);
				}
			}
			
			result = temp;
			
		}
		System.out.println(result);
	}
}
