import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int r=0;
        int[] ordered = heights.clone();
        Arrays.sort(ordered);
        for(int i=0; i<heights.length; i++){
            if(ordered[i]!=heights[i]) r++;
        }
        return r;
    }
}
