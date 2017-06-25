package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int arr[] = new int[set2.size()];
        int i = 0;
        for(Integer u:set2){
            arr[i++] = u;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(intersection(new int[]{1,1,1,2,2,3,3},new int[]{2,2,2,3}));
    }



}