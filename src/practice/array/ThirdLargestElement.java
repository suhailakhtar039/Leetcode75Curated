package practice.array;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,4,1,6,5};

        int n = nums.length;
        int a = nums[0], b = Integer.MIN_VALUE, c = Integer.MIN_VALUE;
        for(int i:nums){
            if(i > a){
                b = a;
                c = b;
                a = i;
            }else if(a > b){
                c = b;
                b = i;
            }else c = i;
        }
        System.out.println(c);
    }
}
