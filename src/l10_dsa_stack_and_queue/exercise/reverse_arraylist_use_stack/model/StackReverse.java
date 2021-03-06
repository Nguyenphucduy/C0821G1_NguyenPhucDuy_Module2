package l10_dsa_stack_and_queue.exercise.reverse_arraylist_use_stack.model;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public int stackOfInteger(int number){
        Stack<Integer> stack = new Stack<>();
        while(number != 0){
            int temp = number % 10; // %10 vì /10 là 1 đơn vị phần tử
            stack.push(temp);// dư 54321
            number = number / 10; // int -> loai 0.54321
        }
        int reverse = 0;
        int i = 1;

        while (!stack.isEmpty()){
            reverse = reverse + (stack.peek() * i);
            stack.pop();
            i = i * 10;
        }
        return reverse;
    }
    public void stackOfString(String string){
//        Stack<Character> stack = new Stack<>();
        Stack<String> stack = new Stack<>();

        int i;
        StringBuilder reverse = new StringBuilder();
        for (i = 0; i < string.length(); i++)
            stack.push(string.charAt(i) + "" );// int - > + "" -> string

        while (!stack.isEmpty()){
          reverse.append(stack.pop());
        }
        System.out.println(reverse);

    }
}
