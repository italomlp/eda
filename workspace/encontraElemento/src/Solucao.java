import java.util.Scanner;

class Solucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] seq = split(scanner.nextLine());
		
		if(hasNumber(n, seq))
			System.out.println("sim");
		else
			System.out.println("não");
		
	}
	
	public static boolean hasNumber(int n, int[] seq){
		for(int i = 0; i < seq.length; i++){
			if(seq[i] == n){
				return true;
			}
		}
		return false;
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
