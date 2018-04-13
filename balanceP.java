import java.util.Stack;

public class balanceP {
    static class Stack{
        int size;
        int top;
        char a[];
        Stack(){
            char a[]=new char[size];
            top=-1;

        }
        void push(char x) {
            if (top > size) {
                System.out.println("syock overflow");
            } else {

                a[++top] = x;
            }
        }
        char pop() {
            if (top < 0) {
                System.out.println("empty");
                return 0;
            }
            else {
                char x = a[top--];
                return x;

            }
        }

        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
        static boolean ismatch( char ch1, char ch2) {
            if (ch1 == '(' && ch2 == ')') {
                return true;
            }
            if (ch1 == '{' && ch2 == '}') {
                return true;
            }
            if (ch1 == '[' && ch2 == ']') {

                return true;
            }
        }
        static boolean Pbalanced(char exp[]) {
            Stack s = new Stack();
            for (int i = 0; i < exp.length; i++) {
                if (exp[i] == '[' || exp[i] == '{' || exp[i] == '(') {
                    s.push(exp[i]);

                    if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {

                        if (s.isEmpty()) {
                            return false;
                        } else if (!ismatch(s.pop(), exp[i])) {
                            return false;
                        }


                    }
                    if (s.isEmpty())
                        return true;
                    else {
                        return false;
                    }
                }

                public static void main (String[] args){


                    char exp[] = {'{', '(', ')', '}', '[', ']'};
                    if (Pbalanced(exp))
                        System.out.println("Balanced ");
                    else
                        System.out.println("Not Balanced ");

                }


