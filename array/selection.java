package array;

public class selection {
    public static void main(String[] args) {
        int marks[]={41,12,31,14,-5};
        int n = marks.length;
        for(int i=0;i<n;i++){
            int min=i;
            for (int j=i;j<n;j++){
                if (marks[j]<marks[min]){
                    min=j;
                }
            }
            int temp=marks[min];
            marks[min]=marks[i];
            marks[i]=temp;
        }
        System.out.println(marks[2]);
    }
}
