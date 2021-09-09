package silver;

public class Silver5_4673 {

	public static void main(String[] args) {
		int[] intArray = new int[11000];

		for (int i = 1; i < 10001; i++) {
			if (i < 10) {
				intArray[i + (i % 10) - 1]--;
			} else if (i < 100) {
				intArray[i + (i % 10) + (i - i % 10) / 10 - 1]--;
			} else if (i < 1000) {
				intArray[i + (i % 10) + (i - i % 10 - (i - i % 100)) / 10 + (i - i % 100) / 100 - 1]--;
			} else {
				intArray[i + (i % 10) + (i % 100 - i % 10) / 10 + (i % 1000 - i % 100) / 100 + (i - i % 1000) / 1000
						- 1]--;
			}

		}
		for (int i = 0; i < 10000; i++) {
			if (intArray[i] >= 0) {
				System.out.println(i + 1);
			}
		}
	}
}
