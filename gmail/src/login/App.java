package login;
class Counter{
	int count=0;
	public synchronized void increment(){
		count++;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					c.increment();
				}
				
			}
			
		});          
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					c.increment();
				}
				
			}
			
		});    
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.count);
	}
	

}
