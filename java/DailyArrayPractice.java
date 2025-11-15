
//import java.util.Arrays;
/**
 * DAILY ARRAY PRACTICE - 15-20 minutes each Complete one per day. Test with
 * your own examples in main().
 *
 * Tips: - Write the method signature first - Think through the logic with a
 * simple example - Code it, then test with edge cases
 */
public class DailyArrayPractice {

    // ============= WEEK 1: Building on Basics =============
    /**
     * DAY 1: Find the second largest number in an array Example: [3, 7, 1, 9,
     * 2] → 7 Edge case: What if there are duplicates? [9, 9, 7] → 7
     */
    public static int secondLargest(int[] arr) {
        /*-------------------*/
        if (arr.length < 2) { // Revision: check for invalid length (1 or 0) before exec
            return -1;
        }
        /*-------------------*/

        int max = arr[0];
        //int secondMax = -999;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        /*-------------------------------*/
        int secondMax = Integer.MIN_VALUE; // Revision: use built-in min , better than -999...
        /*-------------------------------*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        /*-----------------------------------*/
        if (secondMax == Integer.MIN_VALUE) {// Revision: if 2nd max never changes (i.e, all numbers equal, catch it)
            return -1;
        }
        /*-----------------------------------*/

        return secondMax;
    }

    /**
     * DAY 2: Check if an array is a palindrome Example: [1, 2, 3, 2, 1] → true
     * Example: [1, 2, 3, 4] → false
     */
    public static boolean isPalindrome(int[] arr) {
        if (arr.length < 2) { // REVISION: length 1 and 0 technically ARE palindromes
            //return false;
            return true;
        }

        for (int i = 0; i < arr.length / 2 /*efficient*/; i++) { // revision: more efficient to cut search in half!
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * DAY 3: Rotate array right by k positions Example: [1, 2, 3, 4, 5], k=2 →
     * [4, 5, 1, 2, 3] Hint: What happens if k > arr.length?
     */
    public static int[] rotateRight(int[] arr, int k) {
        // YOUR CODE HERE
        return arr;
    }

    /**
     * DAY 4: Merge two sorted arrays into one sorted array Example: [1, 3, 5]
     * and [2, 4, 6] → [1, 2, 3, 4, 5, 6] This is a classic interview question!
     */
    public static int[] mergeSorted(int[] arr1, int[] arr2) {
        // YOUR CODE HERE
        return new int[0];
    }

    /**
     * DAY 5: Remove all duplicates and return unique elements Example: [1, 2,
     * 2, 3, 3, 3, 4] → [1, 2, 3, 4] Hint: You might need to use ArrayList for
     * this one
     */
    public static int[] removeDuplicates(int[] arr) {
        // YOUR CODE HERE
        return arr;
    }

    // ============= WEEK 2: Common Patterns =============
    /**
     * DAY 6: Find two numbers that add up to target (Two Sum) Example: [2, 7,
     * 11, 15], target=9 → [0, 1] (indices) Return the indices of the two
     * numbers This is THE classic LeetCode problem - worth learning!
     */
    public static int[] twoSum(int[] arr, int target) {
        // YOUR CODE HERE
        return new int[0];
    }

    /**
     * DAY 7: Find the longest consecutive sequence length Example: [100, 4,
     * 200, 1, 3, 2] → 4 (because 1,2,3,4) Don't sort! Can you do it
     * efficiently?
     */
    public static int longestConsecutive(int[] arr) {
        // YOUR CODE HERE
        return 0;
    }

    /**
     * DAY 8: Move all zeros to the end, keep order of others Example: [0, 1, 0,
     * 3, 12] → [1, 3, 12, 0, 0] Challenge: Can you do it in-place (modifying
     * original array)?
     */
    public static void moveZeros(int[] arr) {
        // YOUR CODE HERE
    }

    /**
     * DAY 9: Find missing number in range [0, n] Example: [3, 0, 1] → 2 (array
     * should have 0,1,2,3 but 2 is missing) Array has n numbers, one is missing
     * from 0 to n
     */
    public static int missingNumber(int[] arr) {
        // YOUR CODE HERE
        return -1;
    }

    /**
     * DAY 10: Buy and sell stock for max profit Example: [7, 1, 5, 3, 6, 4] → 5
     * (buy at 1, sell at 6) You can only buy once and sell once Another classic
     * interview problem!
     */
    public static int maxProfit(int[] prices) {
        // YOUR CODE HERE
        return 0;
    }

    // ============= WEEK 3: 2D Arrays =============
    /**
     * DAY 11: Create a tic-tac-toe board checker Return 'X', 'O', 'T' (tie), or
     * 'N' (no winner yet)
     */
    public static char checkTicTacToe(char[][] board) {
        // YOUR CODE HERE
        // Check rows, columns, diagonals
        return 'N';
    }

    /**
     * DAY 12: Rotate a 2D matrix 90 degrees clockwise Example: [1, 2, 3] [7, 4,
     * 1] [4, 5, 6] → [8, 5, 2] [7, 8, 9] [9, 6, 3]
     */
    public static int[][] rotateMatrix(int[][] matrix) {
        // YOUR CODE HERE
        return matrix;
    }

    /**
     * DAY 13: Find the sum of each diagonal Return array [primaryDiagonal,
     * secondaryDiagonal]
     */
    public static int[] diagonalSum(int[][] matrix) {
        // YOUR CODE HERE
        return new int[2];
    }

    /**
     * DAY 14: Spiral traversal of matrix Example: [1, 2, 3] [4, 5, 6] → [1, 2,
     * 3, 6, 9, 8, 7, 4, 5] [7, 8, 9] Print elements in spiral order
     */
    public static int[] spiralOrder(int[][] matrix) {
        // YOUR CODE HERE
        return new int[0];
    }

    // ============= BONUS: Strings (Super useful for web dev!) =============
    /**
     * BONUS 1: Check if two strings are anagrams Example: "listen" and "silent"
     * → true Useful for: comparing passwords, checking duplicates, etc.
     */
    public static boolean isAnagram(String s1, String s2) {
        // YOUR CODE HERE
        return false;
    }

    /**
     * BONUS 2: Find first non-repeating character Example: "leetcode" → 'l'
     * Example: "loveleetcode" → 'v'
     */
    public static char firstUniqChar(String s) {
        // YOUR CODE HERE
        return '\0';
    }

    // ============= TESTING AREA =============
    public static void main(String[] args) {
        // Test your methods here!
        // Example:
        System.out.println("=== DAY 1: Second Largest ===");
        int[] test1 = {3, 7, 1, 9, 2};
        System.out.println("Expected: 7, Got: " + secondLargest(test1));

        int[] test2 = {9, 9, 7, 5};
        System.out.println("Expected: 7, Got: " + secondLargest(test2));

        //More test cases (special cases)
        System.out.println(secondLargest(new int[]{5, 5, 5, 5}));        // Should be -1
        System.out.println(secondLargest(new int[]{-10, -5, -3, -1}));   // Should be -3
        System.out.println(secondLargest(new int[]{42}));                // Should be -1

        System.out.println("\n=== DAY 2: Palindrome ===");
        System.out.println(isPalindrome(new int[]{1, 2, 3, 2, 1})); //true
        System.out.println(isPalindrome(new int[]{1, 2, 3, 4}));//false
        System.out.println(isPalindrome(new int[]{1, 1}));//true
        System.out.println(isPalindrome(new int[]{9, 8, 7, 7, 8, 9}));//true
        System.out.println(isPalindrome(new int[]{1, 1, 2, 1, 1}));//true
        System.out.println(isPalindrome(new int[]{1, 2, 3, 4, 2, 1}));//false
        System.out.println(isPalindrome(new int[]{1})); //true
        System.out.println(isPalindrome(new int[]{})); // true

        System.out.println("\n=== DAY 3: Rotate Array ===");
        // YOUR TESTS HERE
    }
}
