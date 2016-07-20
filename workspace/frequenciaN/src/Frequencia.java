import java.util.Scanner;

class Frequencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] seq = split(scanner.nextLine());
		
		System.out.println(frequencia(n, seq));
		
	}
	
	public static int frequencia(int n, int[] seq){
		int count = 0;
		for(int i = 0; i < seq.length; i++){
			if(seq[i] == n){
				count++;
			}
		}
		return count;
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
