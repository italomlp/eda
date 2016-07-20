import java.util.Arrays;
import java.util.Scanner;

class Selection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] seq = split(scanner.nextLine());
		selection(seq);
		
	}
	
	private static void selection(int[] seq){
		for(int i = 0; i < seq.length -1; i++){
			int iMenor = i;
			boolean trocou = false;
			for(int j = i + 1; j < seq.length; j++){
				if(seq[j] < seq[iMenor]){
					iMenor = j;
					trocou = true;
				}
			}
			if(trocou){
				int aux = seq[i];
				seq[i] = seq[iMenor];
				seq[iMenor] = aux;
				System.out.println(Arrays.toString(seq));
			}
			
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
