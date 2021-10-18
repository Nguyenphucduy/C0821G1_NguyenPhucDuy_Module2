package l10_dsa_stack_and_queue.exercise.reverse_arraylist_use_stack.controller;

import l10_dsa_stack_and_queue.exercise.reverse_arraylist_use_stack.model.StackReverse;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackReverse stackReverse = new StackReverse();
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(stackReverse.stackOfInteger(number));
    }
}
