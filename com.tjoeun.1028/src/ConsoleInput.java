
public class ConsoleInput {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("이름:" + name);
		
		System.out.println("점수를 입력하세요:");
		int score = sc.nextInt();
		System.out.println("점수:" + score);
		
		sc.close();
	}

}
