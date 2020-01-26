package com.bsj.hacker.samples;

public class PalindromCounter {
    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    /*public static int count = 0;
    public static int countPalindromes(String s) {
        for(int i = 0; i < s.length() ; i++){
            //expand(s,i,i);
            expand(s,i,i+1);
        }
        return count;
    }
    public static void expand(String s , int left, int right){
        while(left >= 0 && right < s.length() && (s.charAt(left) ==
                s.charAt(right))){
            count++;
            left--;
            right++;
        }
    }*/
    public static int count = 0;
    public static int countPalindromes(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=0;j+i+1<s.length()&&i-j>=0;j++){
                if(s.charAt(1+j+1)!=s.charAt(i-j)) break;
                else {
                    System.out.println(s.substring(i-j,i+j+1));
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        PalindromCounter counter=new PalindromCounter();
        System.out.println("Count of mom : "+countPalindromes("mom"));
    }
}
