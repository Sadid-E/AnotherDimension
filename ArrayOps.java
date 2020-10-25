public class ArrayOps {

public static int sum(int[] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

public static int largest(int[] arr) {
  int largest = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > largest) {
      largest = arr[i];
    }
  }
  return largest;
}

public static int[] sumRows(int[][] matrix) {
  int[] sumRows = new int[matrix.length];
  int sum = 0;
  for (int i = 0; i < matrix.length; i++) {
      sumRows[i] = sum(matrix[i]);
  }
  return sumRows;
}

}
