public class BitOperations {


    //[ 1, 2,3,1,2]
    /*
        001
        010
        011
        001
        010

        011

     */
    public static int lonelyInteger(int[] args){
        int val=0;
        for(int i=0; i<args.length; ++i){
            val^=args[i];
        }
        return val;
    }


    public static void main(String[] args){
        int a = 0x0005; //5   0101
        int b = 0x0009; //10  1001

        int add = a & b; // 0001 = 1
        System.out.println("a&b="+add);

        int or = a |b; //1101 = 13
        System.out.println("a|b="+or);

        int xor = a^b; //1100 12
        System.out.println("a^b="+xor);

        int inv = ~a; //1010
        System.out.println("~a="+inv);

        int[] arr = new int[]{1,2,3,1,2};
        System.out.println("Lonely integer "+lonelyInteger(arr));
    }
}
