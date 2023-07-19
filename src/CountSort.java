import java.util.Arrays;
import java.util.Scanner;
//counter sort or bucket sort
public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        sortedArray(A);
    }
    public static void sortedArray(int A[])
    {
        int count[] = new int[10];
        for(int i=0;i<A.length;i++)
        {
            count[A[i]]++;
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                System.out.println(i+" ");
            }
        }
    }
}
/*
Count Sort
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]
Output 1:
[1, 1, 3]
Output 2:
[1, 2, 3, 4]
 */
