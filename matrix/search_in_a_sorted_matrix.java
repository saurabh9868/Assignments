package matrix;

public class search_in_a_sorted_matrix {

    public static void main(String[] args) {
        int num[][] ={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,51}};
        int find=29;
        boolean flag=false;
        int i=0;
        int j= num[0].length-1;
        while(i< num.length && j>=0){
            if(num[i][j]==find){
                System.out.println("number is at row number "+i+"  and column number "+j);
                flag=true;
                break;
            }
            if(num[i][j]>find){
                j--;
            }
            else{
                i++;
            }
        }
        if(flag==false){
            System.out.println("element is not present");
        }
    }


}
