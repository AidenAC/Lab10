import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testSelectionSort {
	private SelectionSort temp;

	void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	@Test
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		temp = new SelectionSort();
		int[] test = temp.basicSelectionSort(arr);
		for (int i = 0; i < 5; ++i) {
			assertEquals(Sortedarr[i], test[i]);
		}
	}

	@Test
	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;

		temp = new SelectionSort();
		int[] test = temp.basicSelectionSort(arr);
		for (int i = 0; i < 5; ++i) {
			assertEquals(Sortedarr[i], test[i]);
		}
	}

	@Test
	public void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = 0;
		arr[4] = -2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -2;
		Sortedarr[2] = 0;
		Sortedarr[3] = 7;
		Sortedarr[4] = 8;

		temp = new SelectionSort();
		int[] test = temp.basicSelectionSort(arr);
		for (int i = 0; i < 5; ++i) {
			assertEquals(Sortedarr[i], test[i]);
		}
	}

	@Test
	public void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 8;
		arr[3] = -2;
		arr[4] = -2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -2;
		Sortedarr[2] = -2;
		Sortedarr[3] = 8;
		Sortedarr[4] = 8;

		temp = new SelectionSort();
		int[] test = temp.basicSelectionSort(arr);
		for (int i = 0; i < 5; ++i) {
			assertEquals(Sortedarr[i], test[i]);
		}
	}
}