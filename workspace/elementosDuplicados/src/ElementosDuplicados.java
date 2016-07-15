import java.util.Scanner;

class ElementosDuplicados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = split(sc.nextLine());
		
		System.out.println(verificaDuplicado(nums));
		
	}
	
	public static boolean verificaDuplicado(int[] seq){
		for(int i = 0; i < seq.length; i++){
			for(int j = i + 1; j < seq.length; j++){
				if(seq[i] == seq[j])
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
