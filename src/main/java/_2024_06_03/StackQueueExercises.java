package _2024_06_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExercises {

    public static void main(String[] args) {
        // Задача 1: Реверс элементов в очереди.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

        // Задача 2: Проверка на сбалансированность скобок.
        String expression = "{[()]}";
        System.out.println("Expression: " + expression + " is balanced: " + isBalanced(expression));

        // Задача 3: Сортировка стека с использованием дополнительного стека.
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);

        // Задача 4: Первый неповторяющийся символ.
        String stream = "geeksforgeeks";
        firstNonRepeating(stream);

        // Задача 5: Генерация всех возможных правильных комбинаций скобок.
        int n = 3;
        generateParenthesis(n);
    }

    // Задача 1: Реверс очереди.
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }


    }

    // Задача 2: Проверка сбалансированности скобок.
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        char[] chars = new char[expression.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = expression.charAt(i);
            if (chars[i] == '{' || chars[i] == '(' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {
                stack2.push(chars[i]);
            }
        }
        while (!stack.isEmpty() && !stack2.isEmpty()) {
            for (int i = 0; i < stack.size(); i++) {
                for (int j = 0; j < stack2.size(); j++) {
                    if (stack.pop().equals(stack2.pop())) {
                        return true;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    // Задача 3: Сортировка стека.
    public static void sortStack(Stack<Integer> stack) {
        int tempVariable = 0;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < stack.size()-1; i++) {
            for (int j = 0; j < stack.size()-i-1; j++) {
                int cur = stack.pop();
                int next = stack.peek()+j;
                if(cur>next){
                    stack.pop();
                    tempStack.push(cur);
                    tempStack.push(next);
                } else {
                    tempStack.push(cur);
                }
                }
            }

        }


    // Задача 4: Первый неповторяющийся символ.
    public static void firstNonRepeating(String stream) {
//        int[] charCount = new int[26];
//        Queue<Character> queue = new LinkedList<>();

    }

    // Задача 5: Генерация всех возможных правильных комбинаций скобок.
    public static void generateParenthesis(int n) {
        generateParenthesisRecursive("", n, n);
    }

    private static void generateParenthesisRecursive(String current, int open, int close) {

    }
}

/**
 * Если все сделаете то классика с собеседования:
 * <p>
 * <p>
 * Задача: Реализация очереди с использованием двух стеков
 * <p>
 * Напишите класс QueueUsingTwoStacks, который реализует структуру
 * данных очередь с использованием двух стеков. Класс должен содержать следующие методы:
 * <p>
 * enqueue(int x): Добавляет элемент x в конец очереди.
 * dequeue(): Удаляет и возвращает элемент из начала очереди. Если очередь пуста, возвращает -1.
 * isEmpty(): Возвращает true, если очередь пуста, и false в противном случае.
 * <p>
 * Используйте два стека типа java.util.Stack для реализации очереди.
 * <p>
 * Не забудьте обработать случай, когда попытка удалить элемент из пустой очереди,
 * и убедитесь, что методы выполняются с асимптотической сложностью O(1), когда это возможно.
 * <p>
 * public class QueueUsingTwoStacks {
 * private Stack<Integer> stack1;
 * private Stack<Integer> stack2;
 * <p>
 * public QueueUsingTwoStacks() {
 * stack1 = new Stack<>();
 * stack2 = new Stack<>();
 * }
 */
