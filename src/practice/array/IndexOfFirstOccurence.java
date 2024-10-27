package practice.array;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "tco";


        int n = haystack.length(), j = needle.length();
        int index = -1;
        for(int i = 0; i<n; i++){
            int k = 0, l = i;
            while(l < n && k < j && needle.charAt(k) == haystack.charAt(l)){
                k++;
                l++;
            }
            if(k == needle.length()){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
