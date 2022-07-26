public class CoppyArrayDay3 {
    public static void max(int n , int[] arr){
        n = 100;
        arr[0]=100;
    }
    public static void main(String[] args){
        // int[] sourceArray = {2, 3, 1, 5, 10};
        // // coppy each element of the array
        // int[] coppyEachElement = new int[sourceArray.length];
        // System.out.println("Coppy each element");
        // for (int i = 0; i < sourceArray.length; i++) {
        //     coppyEachElement[i] = sourceArray[i];
        //     System.out.print("a["+i+"]: " + coppyEachElement[i] +" " );
        // }

        // // coppy uses static arraycopy method
        // int[] coppyUsesMethod = new int[sourceArray.length];
        // System.arraycopy(sourceArray, 0, coppyUsesMethod, 0, sourceArray.length);
        // System.out.println("\nCoppy uses method:" );
        // for (int i = 0; i < sourceArray.length; i++) {
        //     System.out.print("a["+i+"]: " + coppyUsesMethod[i] +" " );
        // }
        
        int a =3;
        int[] b = {1,2,3};
        max(a,b);
        System.out.println("a = " + a + " , b = " + b[0]);


    }   
}
