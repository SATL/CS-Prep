package algorithms.sort;

public class BubbleSort {


    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSort(int[] arr){
        boolean isSorted = false;

        int lastSorted = arr.length-1;
        while(!isSorted){
            isSorted = true;
            for(int i=0; i<lastSorted; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    swap(arr, i, i+1);
                }
            }
            lastSorted--;
        }
    }

    public static void bubbleSort2(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }


    public static void main(String[] args){
        int[] arr = new int[]{4,1,3,2, 5};
        int[] arr2 = new int[]{4,1,3,2, 5};


        for(int x:arr)
            System.out.println(x);

        System.out.println("Buuble sort");
        bubbleSort(arr);


        for(int x:arr)
            System.out.println(x);

        System.out.println("Buuble sort 2");
        bubbleSort2(arr);
        for(int x: arr)
            System.out.println(x);
    }
}
