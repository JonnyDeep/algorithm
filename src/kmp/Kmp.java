package kmp;

public class Kmp {

    private static int next[];
    public static void getNext(String pattern){
        next = new int[pattern.length()];
        next[0] = 0;
        int j = 1,k = 0;
        int size = pattern.length();
        while (j<size){
            if(pattern.charAt(j)==pattern.charAt(k)){
                k++;
                next[j]=k;
                j++;
            }else if(k>0){
                k = next[k-1];
            }else {
                next[j]=0;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        String pattern="abcabdddabcabc";
        getNext(pattern);

        for (int i : next) {
            System.out.println(i);
        }
    }
}
