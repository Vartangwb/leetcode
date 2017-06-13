package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main088 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLen = m + n - 1;
        int index_1 = m - 1;
        int index_2 = n - 1;
        while(index_1 >= 0 && index_2 >= 0){
            int x = nums1[index_1];
            int y = nums2[index_2];
            nums1[totalLen--] = Math.max(x, y);
            if(x == Math.max(x, y)){
                index_1--;
            }else{
                index_2--;
            }
        }
        while(index_1 >= 0){
            nums1[totalLen--] = nums1[index_1--];
        }
        while(index_2 >= 0){
            nums1[totalLen--] = nums2[index_2--];
        }

    }
    public static void main(String[] args) {

        merge(new int[]{2,2,3,0,0,0},3,new int[]{3,4,5},3);
    }
}
