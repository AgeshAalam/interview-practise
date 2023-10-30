package DS;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,3,40,0,2,5,77,-1};
        doSorting(arr);
    }
    static void doSorting(int[] ar){
        for(int i=0;i< ar.length;i++){
            for (int j=i+1;j< ar.length;j++){
                int temp;
                if(ar[i]>ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }System.out.print( ar[i]+" ");
        }

    }
}
