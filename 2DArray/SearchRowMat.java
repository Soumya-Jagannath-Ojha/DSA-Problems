public class SearchRowMat {

    public static boolean searchRowMatrix(int[][] mat, int x) {
        // Using binary Search
        
        for(int row[] : mat){
            if(binarySearch(row,x)){
                return true;
            }
        }
        return false;
    }
    
    private static boolean binarySearch(int row[], int x){
        int low = 0;
        int high = row.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(row[mid] == x){
                return true;
            }else if(row[mid] > x){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searchRowMatrix(mat, 6));
    }
}
