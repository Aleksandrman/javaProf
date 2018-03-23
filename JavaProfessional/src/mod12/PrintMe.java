package mod12;



public class PrintMe implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
			} catch (Exception e) {
			// TODO: handle exception
						}
					}
				}	
		

}
