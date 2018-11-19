package algorithms.sort;

public class MergeSort {


    public static void mergeHalf(int[] arr, int[] temp, int l, int r){
        int leftEnd = r-1;

    }

    public static void mergeSort(int[] arr, int[] temp, int l, int r){
        int middle = (l+r)/2;

        mergeSort(arr, temp, l, middle);
        mergeSort(arr, temp, middle+1, r);
        mergeHalf(arr, temp, l, r);

    }

    public static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,1,3,2, 5};


        for(int x:arr)
            System.out.println(x);

        System.out.println("Buuble sort");
        mergeSort(arr);

        for(int x:arr)
            System.out.println(x);
    }
}
