
public class Array_1 {

	public static void main(String[] args) {
		
		int score1 = 90;
		int score2 = 99;
		int score3 = 87;
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		System.out.println("=====");
		
		int [] scores = {90, 99, 87};
		
		for(int i=0; i<scores.length; i=i+1) {
			System.out.println(scores[i]);
		}
		
		System.out.println("=====");
		
		for(int score : scores) {
			System.out.println(score);
		}
	}
}