package datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {


    public static void addValue(int value, PriorityQueue<Integer> lowerQueue, PriorityQueue<Integer> upperQueue){
        if(lowerQueue.size() == 0 || value < lowerQueue.peek()){
            lowerQueue.add(value);
        }else{
            upperQueue.add(value);
        }
    }

    public static void balanceQueues(PriorityQueue<Integer> lowerQueue, PriorityQueue<Integer> upperQueue){
        PriorityQueue<Integer> smaller = lowerQueue.size() < upperQueue.size()?lowerQueue:upperQueue;
        PriorityQueue<Integer> bigger = lowerQueue.size() > upperQueue.size()?lowerQueue:upperQueue;

        if(bigger.size() - smaller.size() > 2 ){
            smaller.add(bigger.poll());
        }

    }
    public static double getMedian(PriorityQueue<Integer> lowerQueue, PriorityQueue<Integer> upperQueue){
        PriorityQueue<Integer> smaller = lowerQueue.size() < upperQueue.size()?lowerQueue:upperQueue;
        PriorityQueue<Integer> bigger = lowerQueue.size() > upperQueue.size()?lowerQueue:upperQueue;
        if(lowerQueue.size() == upperQueue.size()){
            return ( (double) lowerQueue.peek() + upperQueue.peek() ) /2;
        }else{
            return bigger.peek();
        }
    }

    public static double[] getMedian(int[] arr){
        PriorityQueue<Integer> lowerQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> upperQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        double[] medians = new double[arr.length];

        for(int i=0; i<arr.length; ++i){
            addValue(arr[i], lowerQueue, upperQueue);
            balanceQueues(lowerQueue, upperQueue);
            medians[i] = getMedian(lowerQueue, upperQueue);
        }

        return medians;

    }


    public static void main(String[] args){

    }
}
