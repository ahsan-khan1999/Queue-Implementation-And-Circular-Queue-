import java.util.Stack;
import java.util.Queue;
public class CircularQueue {

        int rear;
        int front;
        int[] array;
        int [] carray;
        int length ;
    Stack<Integer> stack = new Stack<>();
        public CircularQueue(int rear, int front, int[] array,int length) {
            this.rear = rear;
            this.front = front;
            this.array = array;
            this.length= length;

        }

        public CircularQueue(int[] carray) {
            this.carray = carray;
        }

        public void enquee(int item){
            if (array.length == rear){
                System.out.println("Not Possible");
            }
            else if (front == rear){
                front = 0;
                rear = 0;
                array[rear] = item;
                rear++;
//                System.out.println(array[rear]);
//                length++;
            }
            else if (rear == array.length -1){
                if (front != 0){
                    rear = 0;
                    array[rear] = item;
                    rear++;
                }
                else {
                    System.out.println("Queue is full please dequ2eue some elements to addd more");
                }
            }
            else {
                front =0;
//                rear =-1;
//                rear=rear + 1;
                array[rear]=item;
                rear++;
//                length++;
                stack.push(array[rear]);

            }


            //            array[rear] =
//  front = 0;
        }
    public boolean isFull(){
            return front == 0 && rear == array.length-1;
    }
    public int dequee(){
        int element=0;
        if (isEmpty()){
                throw new ArrayIndexOutOfBoundsException("Out of bound");
            }

//        int i = front;
            else {
//                element = array[front];
//                front++;
            if (front == rear){
//                return 0;
                element = array[front];
                front =-1;
                rear = -1;
                return element;
            }
            else if (front == rear -1){
//                front++;
                element = array[front];
                front++;
//                length--;
                return element;
            }
                else {

                element = array[front];
                front++;
//                length--;
                return element;
            }
//
//                if (front ==-1 && rear == -1){
//                    System.out.println("queue is empty!");
//                }
//                else {
//
//                }
            }
//return
//return 1;
//            return  array[front];
        }
    //        public void reverseQueue(){
//
//            while (isEmpty()){
//                stack.push(dequee());
//            }
//        }
        public void reverseQueue(){
            for (int i=0; i <this.stack.peek(); i++) {
                System.out.println(stack.pop());
            }
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            }
//            while (stack.isEmpty()){
//            System.out.println(stack.pop());
//
//            }
//            System.out.println(stack.pop());
        }
        public void swapUsingtwovar(int i , int  k){
            i = i+k;
            k = i-k;
            i=i-k;
            System.out.println(i +"After swap "+k);
        }

        public void enqueeCirc(int data){
            if (rear == array.length -1 && front == 0 || rear == front -1){
                System.out.println("Cannot insert");
            }
            else {
                if (rear == array.length -1 && front !=0){
                    rear =0;
                    array[rear] = data;
//                System.out.println(array[rear]);

                }
            }
        }
        //                rear =0;re
//                rear = rear +1;
        public void dequeueC(){
            if (front == -1){
                return;
            }
            else if (front == rear){
                front = rear -1;
            }
            else {
                if (front == array.length-1){
                    front =0;
                    System.out.println(array[front]);
                }
            }
        }

        public boolean isEmpty(){
            if (front== -1){
                return true;
            }
            else {
                return false;
            }
        }

    }



