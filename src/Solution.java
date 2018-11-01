import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Set<Integer> store = new HashSet<>();
        for (int item : ar) {
            if (store.add(item) == false) {
                result++;
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        System.out.println(sockMerchant(10, ar));

    }
}
