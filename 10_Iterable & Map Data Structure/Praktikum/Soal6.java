/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IterableAndMapStructure;

/**
 *
 * @author WINDOWS 11
 */
public class Soal6 {

    public static int findMaxSubArray(int[] arr, int k) {
        int maxSum = 0, windowSum = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];  // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];  // subtract the element going out
                windowStart++;  // slide the window ahead
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println(findMaxSubArray(arr1, k1));  // Output: 9

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println(findMaxSubArray(arr2, k2));  // Output: 7
    }
}
