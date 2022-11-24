package practice;

import java.util.Scanner;


public class JumpGame {

    private static boolean solve(int[] arr){
        int n = arr.length;
        int last = n-1;
        for(int i=n-2; i>=0; i--){
            if(i+arr[i]>=last)
                last = i;
        }
        return last == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr));
    }
}
