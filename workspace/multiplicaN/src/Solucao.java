import java.util.Scanner;

class Solucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String seqString = scanner.nextLine();
		int[] seq = split(seqString);
		int[] results = multiplies(n, seq);
		for(int i = 0; i < results.length; i++){
			if(i < (results.length - 1))
				System.out.print(results[i] + " ");
			else
				System.out.println(results[i]);
		}
		
	}
	
	public static int[] multiplies(int n, int[] seq){
		int[] results = new int[seq.length];
		for(int i = 0; i < seq.length; i++){
			results[i] = n * seq[i];
		}
		return results;
	}
	
	private static int[] split(String values){
		String[] val = values.split(" ");
		int[] seq = new int[val.length];
		for(int i = 0; i < val.length; i++){
			seq[i] = Integer.parseInt(val[i]);
		}
		return seq;
	}
	
	
}