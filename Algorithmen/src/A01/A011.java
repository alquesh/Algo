package A01;

public class A011 {

	public static void main(String[] args){
		System.out.println(rekGrowth(50,6.92,1.0122));
		
	}
	
	
	public static String concatPow(String w, int k){
		if (k==0) {
			return "";
		}
		return concatPow(w,k-1)+w;
	}
	
	public static double rekGrowth(int counter, double base, double growth){
		if (counter == 0) return base;
		if (counter > 0){
			counter--;
			return rekGrowth(counter, base*growth, growth);
		}
		return base;
	}
	
	
	
	
}
