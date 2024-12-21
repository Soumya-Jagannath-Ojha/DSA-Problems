public class Rotate90deg {
    public static void rotateby90(int mat[][]) {
        int n = mat.length;
        // Transpose(swap only the down triangle)
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //Transpose -> Row transpose(swap upto < middle row)
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        rotateby90(mat);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
