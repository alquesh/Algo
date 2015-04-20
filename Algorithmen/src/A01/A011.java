package A01;

public class A011 {

	public static void main(String[] args){
		System.out.println(concatPow("Test",10));
	}
	
	
	public static String concatPow(String w, int k){
		if (k==0) {
			return "";
		}
		return concatPow(w,k-1)+w;
	}
	
	
	
	
}
