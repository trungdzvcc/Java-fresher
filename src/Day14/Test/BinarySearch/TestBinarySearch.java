package Day14.Test.BinarySearch;

public class TestBinarySearch {
    public static boolean BinarySearch(int a[], int x){
        int l=0;
        int r= a.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(a[mid]==x){
                return true;
            } else if (a[mid]<x){
                    l = mid+1;
            }else{
                r=mid-1;
            }
        }
    return false;
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

    public static void main(String[] args){
        int[] a = new int[]{1, 3, 5, 7, 9, 10, 12, 16, 18, 20};
        int x = 19;
        if(BinarySearch(a,x)) System.out.println("Succes");
        else System.out.println("faild");
        x=22;
        if(BinarySearchRecusive(a,x,0,9)) System.out.println("Succes");
        else System.out.println("Faild recusive");
    }
}
