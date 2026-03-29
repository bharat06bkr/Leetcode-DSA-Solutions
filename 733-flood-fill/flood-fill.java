class Solution 
{
    static int value;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        value=image[sr][sc];
        traversal(image,sr,sc,color);
        return image;
    }
    public static void traversal(int image[][],int i,int j,int color)
    {
        if(i>=image.length || j>=image[0].length || i<0 || j<0 || image[i][j]!=value || image[i][j]==color) return;
        image[i][j]=color;
        traversal(image,i-1,j,color);
        traversal(image,i+1,j,color);
        traversal(image,i,j-1,color);
        traversal(image,i,j+1,color);
    }
}