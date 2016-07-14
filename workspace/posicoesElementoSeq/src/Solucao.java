import java.util.Scanner;

class Solucao {

	final static int[] none = {-1};
	static int[] occurrence;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] seq = split(scanner.nextLine());
		
		occurrence = numberOcurrence(n, seq);
		
		for(int i = 0; i < occurrence.length; i++){
			if(i < (occurrence.length - 1))
				System.out.print(occurrence[i] + " ");
			else
				System.out.println(occurrence[i]);
		}
		
	}
	
	public static int[] numberOcurrence(int n, int[] seq){
		occurrence = none;
		for(int i = 0; i < seq.length; i++){
			if(seq[i] == n)
				addNumberIntoOccurrences(i);
		}
		return occurrence;
	}
	
	public static void addNumberIntoOccurrences(int n){
		if(occurrence == none)
			occurrence = new int[0];
		
		int[] seqFinal = new int[occurrence.length+1];
		
		for(int i = 0; i < occurrence.length; i++){
			seqFinal[i] = occurrence[i];
		}
		seqFinal[occurrence.length] = n;
		occurrence = seqFinal;
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
