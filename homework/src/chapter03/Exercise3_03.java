package chapter03;

public class Exercise3_03 {

	public static void main(String[] args) {
		int num = 10;
		String type = num == 0 ? "0" : (num > 0 ? "양수" : "음수");
		System.out.println(type);
	}

}
