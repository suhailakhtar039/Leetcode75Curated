package practice.DP;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2};

        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        if (n == 1) System.out.println(ans[0]);
        ans[1] = Math.max(arr[0],arr[1]);
        // if(n<=2) System.out.println(Math.max(arr[0],arr[1]));
        if (n <= 2) System.out.println(ans[1]);
        for (int i = 2; i < n; i++) {
            // pick
            int pick = arr[i] + ans[i - 2];
            int notPick = ans[i - 1];
            ans[i] = Math.max(pick, notPick);
        }
        System.out.println(ans[n - 1]);
    }
}
