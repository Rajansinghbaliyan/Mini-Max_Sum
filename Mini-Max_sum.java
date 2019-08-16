import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    int loc;
    int com=0;
    int dir;
    for(int i= 0;i<arr.length;i++){
      for (int j=0;j<arr.length;j++) {
        com++;
        dir=i;
        if (arr[dir]<arr[j]){
          loc= i;
          int swap = arr[i];
          arr[i]=arr[j];
          arr[j]=swap;
          loc= j;
          dir=loc;
        }
      }
    }
        long min=0;
        long max=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(i<(n-1))
            min=min+arr[i];
            if(i>0)
            max=max+arr[i];

        }
        System.out.print(min+" "+max);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        miniMaxSum(arr);
        scanner.close();
    }
}
