package _24_04_09;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{2, 3, 5, 6, 9},
                                    {4, 7, 8, 11, 13},
                                    {14, 19, 25, 26, 27},
                                    {15, 21, 28, 33, 36},
                                    {24, 29, 44, 55, 66}};
        numInMatrix(array,25);

    }


    public static boolean numInMatrix (int[][] matrix, int findMe){
        int count = 0;

        for (int i = 0; i < matrix.length ; i++) {
            if (matrix[i][matrix[i].length-1]<findMe){
                count++;
                continue;
            }
            for (int j = matrix[i].length-1; j >=0; j--) {
                count++;
                if (matrix[i][j]==findMe){
                    System.out.println(count);
                    return true;}
                if (matrix[i][j]<findMe) {
                    j++;
                    i++;
                }
            }
        }
        System.out.println(count);
        return false;
    }

        }




