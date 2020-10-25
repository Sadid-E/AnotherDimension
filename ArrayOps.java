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

public static boolean isRowMagic(int[][] matrix) {
  int[] sumRows = sumRows(matrix);
  boolean magic = true;
  for (int i = 1; i < sumRows.length; i++) {
        if (sumRows[i] != sumRows[i-1]) {
          magic = false;
        }
  }
  return magic;
}

public static boolean isColMagic(int[][] matrix) {
  int[] sumCols = sumCols(matrix);
  boolean magic = true;
  for (int i = 1; i < sumCols.length; i++) {
        if (sumCols[i] != sumCols[i-1]) {
          magic = false;
        }
  }
  return magic;
}

}
