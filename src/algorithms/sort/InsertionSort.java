package algorithms.sort;

public class InsertionSort {

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void sort(int[] arr){
        for(int i=1; i<arr.length; ++i){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void sortDecrease(int[] arr){
        for(int i=0; i<arr.length; ++i){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }


    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,5,3};
        int[] arr2 = arr.clone();

        for(int i:arr){
            System.out.println(i);
        }

        sort(arr);
        System.out.println("Insertion sort");

        for(int i:arr){
            System.out.println(i);
        }

        sortDecrease(arr2);
        System.out.println("Insertion sort decreasing");

        for(int i:arr2){
            System.out.println(i);
        }
    }
}
