
public class PrintStreamTest1 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		double height = 180.575;
		System.out.printf("이름:%s, 나이:%d, 키:%.2f", name, age, height);  //%.1f : 소수점 둘째자리에서 반올림해서 첫째자리까지 출력
	}
}
