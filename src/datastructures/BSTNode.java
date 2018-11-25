package datastructures;

import java.util.Scanner;

    public class BSTNode<T extends Comparable<T> >{
        BSTNode<T> left;
        BSTNode<T> right;
        T data;

        public BSTNode(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }



        public void insert(T value){
            BSTNode BSTNode = new BSTNode(value);
            if(value.compareTo(data)<=0){
                if(left == null){
                    left = BSTNode;
                }
                else{
                    left.insert(value);
                }
            }else{
                if(right == null){
                    right = BSTNode;
                }else{
                    right.insert(value);
                }

            }
        }

        public boolean contains(T value){
            int comparation = value.compareTo(data);
            if(comparation == 0){
                return true;
            }
            else if(comparation < 0){
                return (left == null) ?
                        false:left.contains(value);
            }else{
                return right != null && right.contains(value);
            }

        }

        public void printInOrder(){
            if(left != null){
                left.printInOrder();
            }
            System.out.println(data+ " ");
            if(right != null){
                right.printInOrder();
            }
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            BSTNode<Integer> root = new BSTNode<Integer>(scanner.nextInt());
            while(scanner.hasNextInt()) {
                int value = scanner.nextInt();
                root.insert(value);
            }
            scanner.close();

            root.printInOrder();
        }



}
