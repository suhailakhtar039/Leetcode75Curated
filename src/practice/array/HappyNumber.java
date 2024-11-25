package practice.array;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 10;

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            int temp = 0;
            int d = n;
            while (d > 0) {
                int rem = d % 10;
                temp += (rem * rem);
                d /= 10;
            }
            sum = temp;
            n = sum;
        }
        System.out.println((sum == 1));
    }
}
