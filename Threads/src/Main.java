public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread (new MyRunnable("a", 1000));
		t1.start();
		Thread t2 = new Thread (new MyRunnable("b", 1000));
		t2.start();
	}
}
