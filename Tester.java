import java.util.Arrays;

public class Tester {

public static void main(String[] args) {
  int[] arr = {3,2,8,6};
  int[] arr1 = {};
  int[] arr2 = {2,15,14,9};
  System.out.println(ArrayOps.sum(arr)==19);
  System.out.println(ArrayOps.sum(arr1)==0);
  System.out.println(ArrayOps.largest(arr)==8);
  System.out.println(ArrayOps.largest(arr2)==15);
  int[][] arr3 = {{1},{100,10,1},{1,9,2,8,3,7,4,6,5,5}};
  int[] a = {1, 111, 50};
  int[] b = {1, 100, 9};
  System.out.println(Arrays.equals(ArrayOps.sumRows(arr3), a));
  System.out.println(Arrays.equals(ArrayOps.largestInRows(arr3), b));
  System.out.println(ArrayOps.sum(arr3)==162);
}

}
