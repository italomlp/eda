import java.util.Scanner;

class BuscaLinearRecursiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = split(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println(busca(nums, n));
		
	}
	
	public static int busca(int[] seq, int n){
		return buscaLinear(seq, n, 0, seq.length - 1);
	}
	
	private static int buscaLinear(int[] seq, int n, int ini, int fim){
		
		if(ini <= fim){
			if(seq[ini] == n){
				return ini;
			} else {
				return buscaLinear(seq, n, ini + 1, fim);
			}
		}
		return -1;
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
