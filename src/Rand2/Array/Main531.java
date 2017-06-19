package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main531 {
    static int findLonelyPixel(char[][] picture) {

        int m = picture.length;
        int n = picture[0].length;
        int res = 0;
        int[] countm = new int[m];
        int[] countn = new int[n];
        for(int i = 0;i<m;i++){
            for(int j = 0; j < n; j++){
                if(picture[i][j]=='B'){
                    countm[i]++;
                    countn[j]++;
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0; j < n; j++){
                if(picture[i][j]=='B'){
                    if(countm[i]==1 && countn[j]==1)
                        res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Main531 main = new Main531();
        System.out.println(findLonelyPixel(null));
    }

}
