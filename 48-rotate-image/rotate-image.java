class Solution {
    public void rotate(int[][] matrix) {
        int[][] b= new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                b[i][j]=matrix[matrix.length-1-j][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=b[i][j];
            }
        }
        
    }
}