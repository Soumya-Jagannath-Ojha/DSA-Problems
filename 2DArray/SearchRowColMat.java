public class SearchRowColMat {
    
    // Search in a row col sorted matrix
    public static boolean matSearch(int mat[][], int x) {
        // Using staircase method
        int row = 0;
        int col = mat[0].length - 1;
        
        while(row < mat.length && col >= 0){
            if(mat[row][col] == x){
                return true;
            }else if(mat[row][col] > x){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {{18,21,27},{38,55,67}};
        System.out.println(matSearch(mat, 55));
    }
}
