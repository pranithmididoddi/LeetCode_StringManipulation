/**
 * Created by Pranith on 12/28/16.
 */
public class Solution {

    /** Palindrome check*/
    public int isPalindrome(String a) {
        if(isaPalindrome(a)) return 1;

        return 0;
    }

    public boolean isaPalindrome(String string){

        if(string==null || string.length()==0) return false;

        string=string.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Solution sc=new Solution();
        String str="A man, a plan, a canal: Panama";

        System.out.println(sc.isPalindrome(str));
    }
}