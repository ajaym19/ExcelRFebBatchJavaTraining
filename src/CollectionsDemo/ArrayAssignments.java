package CollectionsDemo;

public class ArrayAssignments {

	public static void main(String[] args) {
		// 1. Identify the maximum element in the array

		int[] input = { 21, 103, 45, 67, -812 };
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (max < input[i]) {
				max = input[i];
			}
		}

		System.out.println("Maximum Value is " + max);

		// 2. Identify the minimum element in the array
		// 3. Identify the sum of all the elements in the array
		// 4. Identify the average of all the elements in the array

	}
}
