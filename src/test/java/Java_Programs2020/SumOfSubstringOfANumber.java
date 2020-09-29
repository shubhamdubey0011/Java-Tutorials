package Java_Programs2020;

public class SumOfSubstringOfANumber {
    public static void main(String[] args) {
        String num = "1234";
        System.out.println(sumOfSubString(num));

    }

    public static int sumOfSubString(String number) {

        int size = number.length();
        int[] sumofdigit = new int[size];
        sumofdigit[0] = number.charAt(0) - '0';
        int res = sumofdigit[0];
        for (int i = 1; i < size; i++) {
            int numi = number.charAt(i) - '0';
            sumofdigit[i] = (i + 1) * numi + 10 * sumofdigit[i - 1];
            res += sumofdigit[i];

        }

        return res;
    }
}
