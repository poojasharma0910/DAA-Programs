

import java.util.Stack;

public class stackpostfixE {
    static int E(String exp) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                s.push(c - '0');
            } else {
                int val1 = s.pop();
                int val2 = s.pop();
                switch (c) {
                    case '+':
                        s.push(val1 + val2);
                    case '-':
                        s.push(val1 + val2);
                    case '*':
                        s.push(val1 + val2);
                    case '/':
                        s.push(val1 + val2);
                }

            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String exp = "123+*9-";
        System.out.println(E(exp));
    }
}





















