/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

/**
 *
 * @author hoangvu
 */
public class AlgorithmUtilsTest {
    
    @Test
    public void testFindLargestPrime() {
        assertNull(AlgorithmUtils.findLargestPrime(null)); // Test với mảng null
        assertNull(AlgorithmUtils.findLargestPrime(new int[]{})); // Test với mảng rỗng
        assertNull(AlgorithmUtils.findLargestPrime(new int[]{4, 6, 8, 10})); // Không có số nguyên tố
        assertEquals(7, AlgorithmUtils.findLargestPrime(new int[]{4, 6, 7, 3, 8, 2})); // Có số nguyên tố
        assertEquals(13, AlgorithmUtils.findLargestPrime(new int[]{13, 7, 3})); // Số lớn nhất là đầu mảng
    }
    
    @Test
    public void testFindLargestPrimeNullOrUpdate() {
        // Trường hợp largestPrime ban đầu là null
        int[] arr = {4, 6, 7, 3};
        assertEquals(7, AlgorithmUtils.findLargestPrime(arr)); // Số 7 lớn nhất, largestPrime ban đầu là null

        // Trường hợp largestPrime được cập nhật
        arr = new int[]{2, 5, 11, 3};
        assertEquals(11, AlgorithmUtils.findLargestPrime(arr)); // largestPrime được cập nhật liên tục
    }
    
    @Test
    public void testIsPrimeWithSmallNumbers() {
        assertFalse(AlgorithmUtils.isPrime(-1)); // Số âm
        assertFalse(AlgorithmUtils.isPrime(0));  // Số 0
        assertFalse(AlgorithmUtils.isPrime(1));  // Số 1
        assertTrue(AlgorithmUtils.isPrime(2));   // Số nguyên tố nhỏ nhất
        assertTrue(AlgorithmUtils.isPrime(3));   // Số nguyên tố
    }

    @Test
    public void testSortEmployeesWithNull() {
        assertTrue(AlgorithmUtils.sortEmployeesByAge(null).isEmpty()); // Danh sách nhân viên null
    }

    @Test
    public void testIsPalindrome() {
        assertFalse(AlgorithmUtils.isPalindrome(null)); // Chuỗi null
        assertTrue(AlgorithmUtils.isPalindrome("")); // Chuỗi rỗng
        assertTrue(AlgorithmUtils.isPalindrome("a")); // Chuỗi 1 ký tự
        assertTrue(AlgorithmUtils.isPalindrome("madam")); // Chuỗi đối xứng
        assertFalse(AlgorithmUtils.isPalindrome("hello")); // Chuỗi không đối xứng
    }

    @Test
    public void testSortEmployeesByAge() {
        List<AlgorithmUtils.Employee> employees = Arrays.asList(
                new AlgorithmUtils.Employee("Alice", 30),
                new AlgorithmUtils.Employee("Bob", 25),
                new AlgorithmUtils.Employee("Charlie", 35)
        );
        List<AlgorithmUtils.Employee> sorted = AlgorithmUtils.sortEmployeesByAge(employees);
        assertEquals("Bob", sorted.get(0).getName()); // Người trẻ nhất
        assertEquals("Alice", sorted.get(1).getName());
        assertEquals("Charlie", sorted.get(2).getName());
    }
    
}
