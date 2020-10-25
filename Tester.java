public class Tester {

public static void main(String[] args) {
  int[] arr = {3,2,8,6};
  int[] arr2 = {};
  int[] arr3 = {2,15,14,9};
  System.out.println(ArrayOps.sum(arr)==19);
  System.out.println(ArrayOps.sum(arr2)==0);
  System.out.println(ArrayOps.largest(arr)==8);
  System.out.println(ArrayOps.largest(arr3)==15);
}

}
