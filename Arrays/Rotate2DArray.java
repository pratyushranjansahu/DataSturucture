public class Rotate2DArray {

    public static void main(String[] args) {
         int[][] arr= { {1,2, 3}, 
                         {4, 5, 6}, 
                         {7,8,9} };
        System.out.println("Giver Matrix");
        printArray(arr);
        transposeMatrix(arr);
        System.out.println("Transpose Matrix");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            reverseMatrix(arr[i]);
        }
        System.out.println("Final Rotate");
        printArray(arr);

    }

    private static void reverseMatrix(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private static void transposeMatrix(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


    }

}
