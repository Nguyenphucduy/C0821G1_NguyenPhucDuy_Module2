package s12_search;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1); //0
        myStack.push(2);
        myStack.push(3);

//        System.out.println(myStack.pop());
//        System.out.println(myStack.get(0));
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }

        for(int index = 0; index <myStack.size(); index++){
            System.out.println(myStack.get(index));
        }
    }
}
