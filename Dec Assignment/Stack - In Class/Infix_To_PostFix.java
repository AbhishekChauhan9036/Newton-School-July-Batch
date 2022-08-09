import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String inp = sc.nextLine();
        String result = solve(inp);
        System.out.println(result);
    }

    private static String solve(String inp) {
        Stack<Character> stk = new Stack<>();
        String postfix = "";

        for (int i = 0; i < inp.length(); i++) {
            Character ch = inp.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            }
            if (ch == '(') {
                stk.push(ch);
            } else if (Character.isLetter(ch) || Character.isDigit(ch)) {
                postfix += ch;
            } else { 
                if (stk.isEmpty()) {
                    stk.push(ch);
                } else {
                 
                    if (isClosedParanthesis(ch)) { 
                        while (!stk.isEmpty() && !isPairParanthesis(stk.peek() ,ch)) {
                            postfix += stk.pop();
                        }
                        stk.pop();
                        continue;
                    }

                    while (!stk.isEmpty() && stk.peek() != '(' && isCharhasHigherPrecendence(stk.peek(), ch)) { 
                        postfix += stk.pop();
                    }
                    stk.push(ch); 
                }
            }
        }
        while (!stk.isEmpty()) {
            postfix += stk.pop();
        }
        return postfix;
    }

    private static boolean isPairParanthesis(Character open, Character closed) {
        if (open == '(' && closed ==')') {
            return true;
        } else if (open == '{' && closed == '}') {
            return true;
        } else if (open =='[' && closed == ']') {
            return true;
        }
        return false;
    }

    private static boolean isClosedParanthesis(Character ch) {
        return (ch == ')' || ch == '}' || ch == ']') ? true : false;
    }

    private static int getIntMapping(Character ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }

    private static boolean isCharhasHigherPrecendence(Character ts, Character ch) {
        return getIntMapping(ts) >= getIntMapping(ch);
    }
}