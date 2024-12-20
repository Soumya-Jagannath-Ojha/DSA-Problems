import java.util.*;

public class SpiralMatrix {

    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // using While Lopp
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length -1;
        int endCol = mat[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol){
            //Top
            for(int i = startCol; i<=endCol; i++){
                ans.add(mat[startRow][i]);
            }
            
            //Right
            for(int j = startRow + 1; j<=endRow; j++){
                ans.add(mat[j][endCol]);
            }
            
            //bottom
            for(int k = endCol - 1; k >= startCol; k--){
                if(startRow == endRow){
                    break;
                }
                ans.add(mat[endRow][k]);
            }
            
            //left
            for(int l = endRow - 1; l>=startRow+1; l--){
                if(startCol == endCol){
                    break;
                }
                ans.add(mat[l][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }


    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
        System.out.println(spirallyTraverse(mat));
    }    
}
