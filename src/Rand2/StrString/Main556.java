package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main556 {

    public static int nextGreaterElement(int n) {
        char[] a=(""+n).toCharArray();
        int i = a.length-2;
        while(i>=0 && a[i+1]<=a[i]){
            i--;
        }
        if(i<0)
            return -1;
        int j = a.length-1;
        while(j>=0 && a[j]<=a[i]){
            j--;
        }
        swap(a, i, j);
        reverse(a, i+1);
        try{
            return Integer.parseInt(new String(a));
        }
        catch(Exception e){
            return -1;
        }
    }
    private static void reverse(char[] a, int start) {
        int i = start, j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void swap(char[] a, int i, int j){
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
            System.out.println(nextGreaterElement(21));
    }

}
