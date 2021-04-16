package Sorting;

public class No4_shellsort {
    public static void shellsort(int[] arr) {
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;

        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }

    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + "");
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Naovi Magfiroh 20090135");

        int A[] = {25, 7, 9, 13, 3};
        No4_shellsort.tampil(A);
        No4_shellsort.shellsort(A);
        No4_shellsort.tampil(A);

    }
}
