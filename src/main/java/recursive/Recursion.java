package recursive;

public class Recursion {

    public int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        return powerOf10(n - 1) * 10;
    }

    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1); // recursive call
        }
        return 1;
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String toBinary(int n) {
        if (n <= 1) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }

    public Integer findGreatestCommonDivisor(Integer n, Integer n2) {
        if (n2 != 0) {
            return findGreatestCommonDivisor(n2, n % n2);
        }
        return n;
    }

    public static int addNumbers(int num) {
        if (num != 0) {
            return num + addNumbers(num - 1);
        }
        return num;
    }

    public static int recursiveBinarySearch(int[] sortedArray, int begin, int end, int key) {
        if (begin < end) {
            int middle = begin + (end - begin) / 2;
            if (key < sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, begin, middle, key);
            } else if (key > sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, middle + 1, end, key);
            } else {
                return middle;
            }
        }
        return -(begin = 1);
    }

    public static String reverse(String str) {
        if ((str == null || str.trim().isEmpty())) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }

}
