package practice.DP;

public class DominoAndTrimono {
    public static void main(String[] args) {
        int n = 39;


        int mod = 1000000007;
        long []nums = new long[1001];
        nums[1]=1;
        nums[2]=2;
        nums[3]=5;
        if(n<=3)
            System.out.println(nums[n]);
        for(int i=4;i<=n;++i){
            nums[i]=2*nums[i-1]%mod+nums[i-3]%mod;
            nums[i]%=mod;
        }
        System.out.println(nums[n]);
    }
}
