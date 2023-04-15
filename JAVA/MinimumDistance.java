
// Java Program to Find the minimum
// distance between two numbers
import java.io.*;
import java.util.Scanner;

class MinimumDistance {
	int minDist(int arr[], int n, int x, int y) {
		int i, j;
		int min_dist = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((x == arr[i] && y == arr[j]
						|| y == arr[i] && x == arr[j])
						&& min_dist > Math.abs(i - j))
					min_dist = Math.abs(i - j);
			}
		}
		if (min_dist > n) {
			return -1;
		}
		return min_dist;
	}

	public static void main(String[] args) {
		MinimumDistance min = new MinimumDistance();
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("Minimum distance between " + x
				+ " and " + y + " is "
				+ min.minDist(arr, n, x, y));
	}
}
