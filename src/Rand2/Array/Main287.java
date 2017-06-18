package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main287 {

    public static int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast!=slow);
        int find = 0;
        while(find!=slow){
            find = nums[find];
            slow = nums[slow];
        }
        return find;
    }
    public static void main(String[] args) {
        Main287 main = new Main287();
        System.out.println(findDuplicate(new int[]{2,1,3,1}));
    }

}
