
package company.lianjia.exam.p3;

import java.util.Scanner;

/**
 * Created by Dell on 2017-08-19.
 */
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=in.nextInt();
            }
            int height = in.nextInt()+30;
            int res=0;
            for(int i=0;i<n;i++) {
                if(arr[i]<=height){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
