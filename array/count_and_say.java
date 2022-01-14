package array;

public class count_and_say {
    public static String count(String a){
         int count=0;
         char init=a.charAt(0);
         StringBuilder str=new StringBuilder();
         for(char item:a.toCharArray()){
             if(init==item){
                 count++;
             }
             else{
                 str.append(count);
                 str.append(init);
                 count=1;
                 init=item;
             }
         }
        str.append(count);
        str.append(init);

        return String.valueOf(str);
    }
    public static void main(String[] args)   {
        int n=10;
        String initial="1";
        int counter=1;
        while(counter ++<n){
            initial=count(initial);
            System.out.print(initial+"  ");

        }
    }
}
