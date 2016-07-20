import java.util.Arrays;
import java.util.Scanner;

class Inserction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] seq = split(scanner.nextLine());
		inserction(seq);
		
	}
	
	private static void inserction(int[] seq){
		for(int i = 1; i < seq.length; i++){
			int eleito = seq[i];
			int j = i;
//			boolean trocou = false;
			
			while(j > 0 && seq[j-1] > eleito){
//				trocou = true;
				int aux = seq[j];
				seq[j] = seq[j-1];
				seq[j-1] = aux;
				j--;
				
			}
			
//			if(trocou)
				System.out.println(Arrays.toString(seq));
			
		}
		
		
	}
	
	public static int[] split(String values){
		if(values.trim().equals(""))
			return new int[0];
		String[] val = values.split(" ");
		int[] seq = new int[val.length];
		for(int i = 0; i < val.length; i++){
			seq[i] = Integer.parseInt(val[i]);
		}
		return seq;
	}
	
}


