import java.util.Scanner;

class Bubble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] seq = split(scanner.nextLine());
		bubble(seq);
	}
	
	private static void bubble(int[] seq){
		for(int i = 0; i < seq.length; i++){
			boolean troca = false;
  			for(int j = 1; j < seq.length - i; j++){
  				if(seq[j-1] > seq[j]){
  					int aux = seq[j-1];
  					seq[j-1] = seq[j];
  					seq[j] = aux;
  					troca = true;
  				}
  			}
  			if(troca){
  				imprimeArray(seq);
  			}
		}
	}
	
	private static void imprimeArray(int[] seq){
		String arrayString = "";
		for(int i : seq){
			arrayString += i + " ";
		}
		System.out.println(arrayString.trim());
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
