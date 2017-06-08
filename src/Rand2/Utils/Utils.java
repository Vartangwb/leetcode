package Utils;

/**
 * Created by twb on 2017/6/8.
 */
public class Utils {

    public static void printArr(int[] arr){
        int len = arr.length;
        for(int ii:arr){
            System.out.print(ii+" ");
        }
    }
    public static void printArr2D(int[][] arr){
        for(int[] ii:arr){
            for(int iii:ii){
                System.out.print(iii+" ");
            }
            System.out.println(" ");
        }
    }

}
