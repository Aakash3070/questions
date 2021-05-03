package mathematics;

public class GcdOfTwoNumbers {
  
	public static void main(String[] args) {
		
		System.out.println(gcdOfNumbers(12, 36));
	}
	
	
	
	
	
//	public static int gcdOfNumbers(int a,int b) {
//		if(b==0) {
//			return a;
//		}
//		else {
//			return gcdOfNumbers(b,a%b);
//		}
//	}
	
	public static int gcdOfNumbers(int a,int b) {
	
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		
		return a;
		
}
}
