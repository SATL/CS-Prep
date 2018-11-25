package algorithms.sort;

public class SelectionSort {


    public static void selectionSort(int[] arr){

        for(int i=0; i<arr.length-1; ++i){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,1,3,2, 5};


        for(int x:arr)
            System.out.println(x);

        System.out.println("Selection sort");
        selectionSort(arr);
        for(int x:arr)
            System.out.println(x);
    }
}
