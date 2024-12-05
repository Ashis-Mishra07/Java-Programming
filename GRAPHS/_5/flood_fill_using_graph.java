package GRAPHS._5;
public class flood_fill_using_graph {
    //o( no of rows +no of columns )
    public static void helper(int image[][],int start_row,int start_col,int color,boolean visited[][],int orgColour){
        if(start_row<0 || start_col<0 || start_col>=image[0].length || start_row>=image.length || visited[start_row][start_col] || image[start_row][start_col]!=orgColour){
            return;
        }
        //left
        helper(image, start_row, start_col-1, color, visited, orgColour);
        //right
        helper(image, start_row, start_col+1, color, visited, orgColour);
        //up
        helper(image, start_row-1, start_col, color, visited, orgColour);
        //down
        helper(image, start_row+1, start_col, color, visited, orgColour);
    }
    //0(1)
    public static int [][] floodfill(int image[][],int start_row,int start_col,int color){
        boolean visited [][]=new boolean[image.length][image[0].length];
        helper(image,start_row,start_col,color,visited,image[start_row][start_col]);
        return image;
    }
    public static void main(String[] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(floodfill(image,0,0,1));;
    }
}
