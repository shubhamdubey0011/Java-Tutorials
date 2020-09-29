package Java_Programs2020;

public class findMissingNumberInArray {
    public static void main(String[] args) {
        /*
         * int total_num; int[] numbers = new int[] { 1, 2, 3, 5, 6, 7 }; total_num =
         * numbers.length + 1;// 7 int expected_num_sum = total_num * ((total_num + 1) /
         * 2); int num_sum = 0; for (int i : numbers) { num_sum += i; }
         * System.out.print(expected_num_sum - num_sum); System.out.print("\n");
         */

        int ar[] = { 2, 3, 4, 5, 6, 8 };
        int size = ar.length;
        System.out.println("Missing number: " + search(ar));
    }

    static int search(int ar[]) {
        int rightend = 0, leftend = ar.length - 1;
        int mid = 0;
        while (leftend - rightend > 1) {
            mid = (rightend + leftend) / 2;
            if ((ar[rightend] - rightend) != (ar[mid] - mid))
                leftend = mid;
            else if ((ar[leftend] - leftend) != (ar[mid] - mid))
                rightend = mid;
        }

        return (ar[mid] + 1);

    }
}
