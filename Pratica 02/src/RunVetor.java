public class RunVetor extends Thread {
	int[][] matriz;
	int n;
	int[] vet;
	int aux, aux2;
	
	public RunVetor(int n) {
		this.n = n;
		vet = new int[1000];
		start();
	}
	
	public void run() {
		
		for(int i = 0; i< 1000; i++) {
			vet[i] = i;
		}
		
		for(int i = 0; i < 100; i++) {
			vet[i] = vet[i]*2;
		}
			for(int i = 0; i< 1000; i++) {
				System.out.println(vet[i]);
			}
	}		
		
		
}

