
public class Array {

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		for (int i =arr.length; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
