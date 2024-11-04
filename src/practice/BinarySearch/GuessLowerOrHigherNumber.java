package practice.BinarySearch;

public class GuessLowerOrHigherNumber {
    static int n;
    static int pick;
    public static void main(String[] args) {
        n = 2;
        pick = 1;

        long st = 0, en = n;
        while(st <= en){
            long mid = (st + en)/2;
            if(guess(mid) == 0){
                System.out.println("found");
                System.exit(0);
            }else if(guess(mid) == 1) st = mid+1;
            else en = mid - 1;
        }
        System.out.println("outside");
    }
    public static int guess(long k){
        if(pick == k)
            return 0;
        else if(pick < k)
            return -1;
        else return 1;
    }

}
