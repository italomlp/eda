import java.util.Scanner;

class TeoremaMestre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = split(sc.nextLine());
		
		String result = masterTheorem(nums[0], nums[1], nums[2]);
		
		System.out.println(result);
	}
	
	public static String masterTheorem(int a, int b, int ord){
		String theta = "T(n) = ";
		if(ord < log(b, a))
			return theta + "Θ(n**" + log(b, a) + ")";
		else if(ord == log(b, a))
			return theta + "Θ(n**" + ord + " * log n" + ")";
		else 
			return theta + "Θ(n**" + ord + ")";
	}
	
	public static int log(int base, int num) {
	    return (int) (Math.log(num) / Math.log(base));
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
