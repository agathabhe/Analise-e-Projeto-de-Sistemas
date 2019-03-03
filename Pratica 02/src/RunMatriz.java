
public class RunMatriz extends Thread {

	int[][] matriz;
	int n;
	int[] vet;
	int aux, aux2;
	
	public RunMatriz(int n) {
		this.n = n;
		matriz = new int[n][n];
		start();
	}
	public void run(int n) {
		int k = 1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = k;
				k++;
			}
		}
		aux = matriz[0][0];
		aux2 = matriz[0][2];
		for(int i = 0; i < n;  i++) {
			matriz[0][i] = aux2;
			matriz[0][i+2] = aux;
			break;
		}
		aux = matriz[1][0];
		aux2 = matriz[1][2];
		for(int i = 0; i < n;  i++) {
			matriz[1][i] = aux2;
			matriz[1][i+2] = aux;
			break;
		}
		aux = matriz[2][0];
		aux2 = matriz[2][2];
		for(int i = 0; i < n;  i++) {
			matriz[2][i] = aux2;
			matriz[2][i+2] = aux;
			break;
		}
		for(int t = 0; t<n; t++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d ", matriz[t][j]);
			}
			System.out.println("\n");
		}
	}
}
