package String;

public class Game_with_string {
    public static int game(String a,int k){
        int arr[]=new int[26];
        for(int i=0;i<a.length()-k;i++){
            char ch=a.charAt(i);
            arr[ch-'a']++;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]*arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       String s="aabcbcbcabcc";
       int k=3;
        System.out.println(game(s,k));
    }
}
