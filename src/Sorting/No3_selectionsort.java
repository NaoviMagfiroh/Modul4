package Sorting;

public class No3_selectionsort {
    public static void selectionsort(int [] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j] < A[smallIndex]) {
                    smallIndex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }

    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("Naovi Magfiroh 20090135");
        int A[] = {25, 7, 9, 13, 3};
        No3_selectionsort.tampil(A);
        No3_selectionsort.selectionsort(A);
        No3_selectionsort.tampil(A);


                }
            }

