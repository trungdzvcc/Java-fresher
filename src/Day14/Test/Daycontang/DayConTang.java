package Day14.Test.Daycontang;

public class DayConTang {
    public static void main(String[] args){
        int[] a = new int[]{1,2,5,4,6,2};
        int[] l = new int[]{1,1,1,1,1,1};
        int i;
        int j;
        int n;
        int max=0;
        for (i = 0; i < a.length-1; i++) {
            for (j = i+1; j <= a.length-1; j++) {
                if((a[j]>a[i])&&(l[j]<l[i]+1)){
                    l[j]=l[i]+1;
                    System.out.println(l[j]);
                }
                if(max<l[j]){
                    max=l[j];
                }


            }

        }
        System.out.println(max);
    }
}
