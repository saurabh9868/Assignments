package array;

public class find_base_string {
    public static void main(String[] args) {
        String a[]={"geekster","geek","geeksterorgeekster"};
        int min=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<a.length;i++){
            if(a[i].length()<min){
                min=a[i].length();
                 pos=i;
            }
        }
        String str=a[pos];
        int count=0;
        int len=0;
        for(int i=0;i<a.length;i++){
            String d=a[i];
             len=0;
            for(int j=0;j<str.length();j++){
                if(d.charAt(j)!=str.charAt(j)){
                    if(count>len){
                        count=len;
                    }
                }
                else{
                    len++;
                }
            }
        }
        for(int k=0;k<len;k++){
            System.out.print(str.charAt(k));
        }
    }
}
