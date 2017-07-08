package StrString;

import java.util.Collections;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main541 {

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int len = s.length();
        int flag = 1;
        int nums = len/k;
        int rest = len%k;
        for(int i = 0; i< len-rest;i++){

            if((i+1)%k==0 && flag==1){
                reverse(arr,i+1-k,i);
                flag = -1;
            }else if((i+1)%k==0 && flag==-1){
                flag = 1;
            }


        }
        if(flag==1 && k<len){
            reverse(arr,nums*k,len-1);
            flag = -1;
        }
        if(k>len){
            reverse(arr, 0,len-1);
        }
        return new String(arr);
    }
    public static void reverse(char[] arr, int start,int end){
        while(start<end){
            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
            System.out.println(reverseStr("asd",4));
    }

}
