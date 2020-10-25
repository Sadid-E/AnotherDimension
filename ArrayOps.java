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
  for (int i = 0; i < matrix.length; i++) {
      sumRows[i] = sum(matrix[i]);
  }
  return sumRows;
}

public static  int[] largestInRows(int[][] matrix) {
  int[] largestInRows = new int[matrix.length];
  for (int i = 0; i < matrix.length; i++) {
    largestInRows[i] = largest(matrix[i]);
  }
  return largestInRows;
}

public static int sum(int[][] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum += sum(arr[i]);
  }
  return sum;
}

public static int[] sumCols(int[][] matrix) {
  int rows = matrix.length;
  int cols = matrix[0].length;
  int[][] arr = new int[cols][rows];
  for (int i = 0; i < cols; i++) {
    int sum = 0;
    for (int j = 0; j < rows; j++) {
      arr[i][j] = matrix[j][i];
    }
  }
  return sumRows(arr);
}

}
