import java.util.Scanner;

class BuscaBinaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
	
	public void buscaBinaria(int[] seq, int n){
		int[] indicesVisitados = new int[0];
		int indMediana = (seq.length - 1) / 2;
		if(seq.length == 1 && seq[0] != n){
			System.out.println(-1);
		}
		
		if(seq[indMediana] < n){
			System.out.println(indMediana);
			buscaBinaria(divideArray(seq, 0, seq.length / 2), n);
		} else if(seq[indMediana] > n){
			System.out.println(indMediana);
			buscaBinaria(divideArray(seq, seq.length / 2, seq.length - 1), n);
		} else { //if(seq[indMediana] == n){
			System.out.println(indMediana);
		}
		
	}
	
	public int[] divideArray(int[] array, int indComeco,
			int indFim){
		int[] seq = new int[(indFim - indComeco)];
		int indControle = indComeco;
		for(int i = 0; i < seq.length; i++){
			seq[i] = array[indControle];
			indControle++;
		}
		return seq;
	}
	
	public int[] split(int[] array)
	
}
