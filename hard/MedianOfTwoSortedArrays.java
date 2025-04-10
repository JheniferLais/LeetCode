package hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Combina os dois arrays
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        // Ordena o array combinado
        Arrays.sort(mergedArray);

        // Calcula o comprimento do array combinado
        int n = mergedArray.length;

        // Se o comprimento for par, retorna a média dos dois elementos do meio
        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            // Se o comprimento for ímpar, retorna o elemento do meio
            return mergedArray[n / 2];
        }
    }
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}