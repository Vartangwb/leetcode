package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main011 {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length;
        int max = 0;

        while(left<right){

            int minx = Math.min(height[left], height[right]);
            max = Math.max(max, minx*(right - left));

            if(minx == height[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxArea(new int[]{});
    }
}
