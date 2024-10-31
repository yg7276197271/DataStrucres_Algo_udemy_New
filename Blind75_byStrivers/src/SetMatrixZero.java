//https://takeuforward.org/data-structure/set-matrix-zero/
import java.util.*;

public class SetMatrixZero {
	static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }
       
       //We have now marked row and col arrays with 1
       //Now iterate again over matrix and check row and col array .
       //and accordingly mark matrix elements to 0
       
        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
