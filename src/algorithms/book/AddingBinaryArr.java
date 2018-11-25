package algorithms.book;

public class AddingBinaryArr {


    public static int[] add(int[] a, int[]b){
        int[] result = new int[a.length+1];

        int carrier = 0;

        for(int i= result.length-1; i>0; --i){
            result[i] = (a[i-1] + b[i-1] + carrier)%2;
            carrier = (a[i-1] + b[i-1] + carrier)/2;
        }
        result[0] = carrier;
        return result;
    }


    public static void main(String[] args){
        int[] a = new int[]{1,0,1,0}; //10 01010
        int[] b = new int[]{0,1,0,1};//5   00101
        int[] c = new int[]{0,1,1,1};//7   00111

        //result 01111
        //result c      10001


        int[] result = add(a, b);
        for(int i:result){
            System.out.println(i);
        }
        System.out.println("");

        result = add(a, c);
        for(int i:result){
            System.out.println(i);
        }

    }
}
