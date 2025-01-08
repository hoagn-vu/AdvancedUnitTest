/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author hoangvu
 */
public class AlgorithmUtils {    

    private AlgorithmUtils() {}
    
    // 1. Tìm số nguyên tố lớn nhất trong một mảng số nguyên
    public static Integer findLargestPrime(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Integer largestPrime = null;

        for (int num : arr) {
            if (isPrime(num)) {
                if (largestPrime == null || num > largestPrime) {
                    largestPrime = num;
                }
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 2. Kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 3. Sắp xếp danh sách nhân viên theo tuổi
    public static List<Employee> sortEmployeesByAge(List<Employee> employees) {
        if (employees == null) return Collections.emptyList();
        employees.sort(Comparator.comparingInt(Employee::getAge));
        return employees;
    }

    // Class Employee
    public static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
