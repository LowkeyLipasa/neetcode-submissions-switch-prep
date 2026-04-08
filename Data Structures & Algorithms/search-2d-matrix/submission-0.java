class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==matrix[mid][0])
                return true;

            else if(target<matrix[mid][0])
                right=mid-1;

            else{
                if(target==matrix[mid][m-1])
                    return true;

                else if(target<matrix[mid][m-1]){
                    int templ=0;
                    int tempr=m-1;
                    while(templ<=tempr){
                        int tempmid=templ+(tempr-templ)/2;
                        if(target==matrix[mid][tempmid])
                            return true;

                        else if(target<matrix[mid][tempmid])
                            tempr=tempmid-1;

                        else
                            templ=tempmid+1;
                    }

                    return false;

                }

                else
                    left=mid+1;
            }
        }
        return false;
    }
}