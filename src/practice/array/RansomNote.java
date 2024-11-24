package practice.array;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "b";

        int[] first = new int[26];
        int[] second = new int[26];

        for(int i = 0; i<ransomNote.length(); i++){
            first[ransomNote.charAt(i)-'a']++;
        }

        for(int i = 0; i<magazine.length(); i++){
            second[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(second[i] < first[i]){
                System.out.println(false);
                System.exit(5);
            }
        }
        System.out.println(true);
    }
}
