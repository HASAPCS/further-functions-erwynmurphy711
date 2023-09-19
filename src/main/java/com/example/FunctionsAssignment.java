package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        return a+b; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String str) {
        String word = "";
        for (int i =str.length()-1; i>=0; i-=1){
            word += str.charAt(i);

        }
        return word; // Replace with your implementation
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"
    public String greeting(String name) {
        return "Hello, "+ name+"!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        int length = arr.length;
        int num = arr[0];
        for (int i = 1; i<length-1; i++){
            if (arr[i] > num){
                num = arr[i];
            }
        }
        return num; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        String word = "";
        for (int i =str.length()-1; i>=0; i-=1){
            word += str.charAt(i);
        }
        if (word.equals(str)) {
            return true;
        }
            return false; 
    }// Replace with your implementation

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        int count = 0;
        int ncount = 0;
        int initial = 0;
        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
               if (ncount>count){
                count = ncount;
                initial = i-count+1;
               }
               ncount = 0;
            }
        ncount++;
        }
        return str.substring(initial, initial+count-1); // Replace with your implementation
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        double count = 0;
        double average = 0;
        for (int i=0; i< nums.length; i++){
            count += nums[i];
        }
        average = count/nums.length;
        return average; // Replace with your implementation
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        int count = 0;
        for (int i =2; i < num; i++){
            if (num % i == 0){
                count +=1;
            }
        }
        if (count == 0){
            return true;
        }
        return false; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent); // Replace with your implementation
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ch){
                count ++;
            }
        }
        return count; // Replace with your implementation
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        int length = nums.length;
        int num = nums[0];
        for (int i = 1; i<length; i++){
            if (nums[i] > num){
                num = nums[i];
            }
        }
        return num; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int count = 0;
        for (int i =0; i < nums.length; i++){
            count += nums[i];
        }
        return count; // Replace with your implementation
    }

    
}
