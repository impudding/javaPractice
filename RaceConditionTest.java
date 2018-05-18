
public class RaceConditionTest {
	private static long count;
	
	public static void increase(){
		long local = count;
		local++;
		count = local;
	}
	
	public static void main(String[] args){
		Racer[] racer = new Racer[30000];
		for(int i = 0;i < 30000;i++){
			racer[i] = new Racer();
			racer[i].start();
		}
		
		for(int i = 0;i < 30000;i++){
			try{
				racer[i].join();
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("count = " + count);
	}
}
