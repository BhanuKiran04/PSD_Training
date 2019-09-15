import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class RpcCalc {

    private String operators = "+_*/^";
    private String twoParaOperator = "+_*/^";

    public int compute(String expr) throws ArithmeticException, EmptyStackException {
        Stack<Integer> stack = new Stack<>();
        System.out.println(expr);
        System.out.println("Input\tOperation\tStack after");

        for (String token : expr.split("\\s+")) {
            System.out.print(token + "\t");

            if (operators.contains(token)) {
                operate(stack, token);
            } else {
                defaultStep(token, stack);
            }
            System.out.println(stack);
        }
        return stack.pop();
    }

    private void operate(Stack<Integer> stack, String token) {
        if(twoParaOperator.contains(token)) {
            operateOnTwo(stack, token);
        } else {
            operateOnOne(stack, token);
        }
    }

    private void operateOnTwo(Stack<Integer> stack, String token) {
        switch (token) {
            case "+":
                add(stack);
                break;
            case "-":
                sub(stack);
                break;
            case "*":
                mul(stack);
                break;
            case "/":
                divide(stack);
                break;
            case "^":
                pow(stack);
                break;
            case "%":
                mod(stack);
                break;
        }
    }

    private void operateOnOne(Stack<Integer> stack, String token) {
        switch (token) {
            case "!":
                fact(stack);
                break;
        }
    }

    private void defaultStep(String token, Stack<Integer> stack) {
        System.out.print("Push\t\t");
        stack.push(Integer.parseInt(token));
    }

    private void add(Stack<Integer> stack) {
        System.out.print("Operate\t\t");
        stack.push(stack.pop() + stack.pop());
    }

    private void sub(Stack<Integer> stack) {
        System.out.print("Operate\t\t");
        stack.push(-stack.pop() + stack.pop());
    }

    private void divide(Stack<Integer> stack) {
        System.out.print("Operate\t\t");
        double divisor = stack.pop();
        stack.push((int) (stack.pop() / divisor));
    }

    private void mul(Stack<Integer> stack) {
        System.out.print("Operate\t\t");
        stack.push(stack.pop() * stack.pop());
    }

    private void pow(Stack<Integer> stack) {
        System.out.print("Operate\t\t");
        double exponent = stack.pop();
        stack.push((int) Math.pow(stack.pop(), exponent));
    }

    private void fact(Stack<Integer> stack) {

    }

    private void mod(Stack<Integer> stack) {

    }
}
