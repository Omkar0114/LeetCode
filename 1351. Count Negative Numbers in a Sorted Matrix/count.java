class Solution {
    public int countNegatives(int[][] arr) {
        int count = 0;
        
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col <arr[row].length; col++){
                if(arr[row][col] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
