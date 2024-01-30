class InitClass {
	static int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static int[] arr2 = new int[10];
	
	static {  //static변수의 초기화는 이와 같이 static블럭을 통해 초기화
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 10) + 1;
		}
	}
}

public class InitTest1 {
	public static void main(String[] args) {
		for(int i = 0; i < InitClass.arr1.length; i++) {
			System.out.print(InitClass.arr1[i] + " ");
		}
		System.out.println();

		for(int i = 0; i < InitClass.arr2.length; i++) {
			System.out.print(InitClass.arr2[i] + " ");
		}
	}
}
