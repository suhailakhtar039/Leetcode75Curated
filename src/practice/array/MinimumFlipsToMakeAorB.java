package practice.array;

public class MinimumFlipsToMakeAorB {
    public static void main(String[] args) {
        int a = 2, b = 6, c = 5;

        System.out.println(Integer.bitCount(c ^= (a | b)) + Integer.bitCount(a & b & c));
    }
}
