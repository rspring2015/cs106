
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSum(10));
	}
		//public static void Count(int n){
			//if (n>1){
				//Count(n-1);
		//}
		
		//System.out.println(n);
	//}


// print numbers 1-10

	public static int countSum (int max){
		if (max>1){
			return max + countSum(max-1);
		}
		System.out.println(max);
		return 1;

	}
	}
	