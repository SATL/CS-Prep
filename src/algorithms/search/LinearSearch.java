package algorithms.search;

public class LinearSearch {

    public static int linearSearch(int[] arr, int value){
        int position = -1;
        for(int i=0; i<arr.length; ++i){
            if(arr[i] == value)
                return i;
        }
        return position;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,5,3};

        for(int i:arr){
            System.out.println(i);
        }

        int search = 5;

        System.out.println("Element "+search+" in position:"+linearSearch(arr, search));

    }
}
