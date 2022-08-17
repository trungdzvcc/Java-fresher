package Day14.Excercise.BinarySearchRecusive;

import java.util.Scanner;

public class TestBinarySearch {
    public static Scanner sc = new Scanner(System.in);
    public static void Enter(int[] a , int n){

        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = sc.nextInt();
        }
    }
    public static void sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j <=a.length-1; j++) {
                if(a[i] >a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }
    }
    public static boolean BinarySearchRecusive(int[] a, int x, int l, int r){

        if(l<=r){
            int mid = (l+r)/2;
            if(a[mid]==x){
                return true;
            } else if (a[mid]<x){
                return BinarySearchRecusive(a,x,mid+1,r);
            }else{
                return BinarySearchRecusive(a,x,l,mid-1);
            }
        }
        else return false;
    }
    public static  void main(String[] args){
        System.out.println("Enter the number of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        Enter(a,n);
        sort(a);
        System.out.println("Enter the element value");
        int x = sc.nextInt();
        if(BinarySearchRecusive(a,x,0,n-1)) System.out.println("Succes");
        else System.out.println("Can not find element");
    }

}
