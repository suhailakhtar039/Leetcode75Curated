package practice;

import java.util.Scanner;

public class HouseRobberII {
    private static int findMaxProfit(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        if(n==1)return ans[0];
        ans[1] = arr[1];
        if(n<=2)return Math.max(arr[0],arr[1]);
        ans[1] = Math.max(arr[0],arr[1]);
        for(int i=2; i<n; i++){
            // pick
            int pick = arr[i] + ans[i-2];
            int notPick = ans[i-1];
            ans[i] = Math.max(pick,notPick);
        }
        return ans[n-1];
        // int
    }
    private static int solve(int[] arr){
        int n = arr.length;
        if(n==1)return arr[0];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr1[i] = arr[i];
            arr2[i] = arr[i+1];
        }
        return Math.max(findMaxProfit(arr1),findMaxProfit(arr2));
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
