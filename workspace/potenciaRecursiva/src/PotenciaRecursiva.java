import java.util.Scanner;

class PotenciaRecursiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		int j = Integer.parseInt(sc.nextLine());
		
		int result = pow(i, j);
		
		System.out.println(result);
		
	}
	
	public static int pow(int i, int j){
		if(j == 0)
			return 1;
		return i * pow(i, j - 1);
	}
	
}
