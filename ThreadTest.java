
import java.lang.Thread;

public class ThreadTest extends Thread{
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				//
			}	

			System.out.println("i\'m "+this.getId());
		}
	}

	public static void main(String[] args){
		A pa = new A();
		pa.start();
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				//
			}	
			System.out.println("i\'m "+Thread.currentThread().getId());
		}
	}
}