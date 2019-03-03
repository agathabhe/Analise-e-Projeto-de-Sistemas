public class MyRunnable implements Runnable {
	int i;
	String a;
	
	public MyRunnable (String a, int i) {
		this.i = i;
		this.a = a;
	}

	@Override
	public void run() {
		for(int j = 0; j < i; j++) {
			System.out.println(a + " - " + j);
		}
	}

}
