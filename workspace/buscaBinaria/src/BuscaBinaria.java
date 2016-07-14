import java.util.Scanner;

class BuscaBinaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = split(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		busca(nums, n);
		
	}
	
	public static void busca(int[] seq, int n){
		buscaBinaria(seq, n, 0, seq.length - 1);
	}
	
	private static void buscaBinaria(int[] seq, int n, int ini, int fim){
		int med = (ini + fim) / 2;
		
		if(ini <= fim){
			System.out.println(med);
			if(seq[med] == n){
				return;
			}
			
			if(seq[med] > n){
				buscaBinaria(seq, n, ini, med - 1);
			} else {//if(seq[med] < n){
				buscaBinaria(seq, n, med + 1, fim);
			}
			
		} else {
			System.out.println(-1);
		}
	}
	
	public static int[] split(String values){
		String[] val = values.split(" ");
		int[] seq = new int[val.length];
		
		for(int i = 0; i < val.length; i++){
			seq[i] = Integer.parseInt(val[i]);
		}
		return seq;
	}

	
}