import java.util.Scanner;
import java.util.Vector;

class TresNmaisUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());
		
		System.out.println(Math.max(fazArray(n).size(), fazArray(m).size()));
		
	}
	
	public static Vector fazArray(int n){
		Vector<Integer> seq = new Vector<>();
		seq.add(n);
		while(n != 1){
			n = calcula(n);
			seq.add(n);
		}
		return seq;
	}
	
	public static int calcula(int n){
		if(n % 2 == 0)
			return n / 2;
		else 
			return 3 * n + 1;
	}
	
}
