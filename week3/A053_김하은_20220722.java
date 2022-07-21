import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;

class Main{
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int rp = Integer.parseInt(br.readLine());
        while (rp-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
                case "push":
                    stack.push(st.nextToken());
                    break;
                case "top":
                    if(!stack.empty()) sb.append(stack.peek()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(!stack.empty()) sb.append("0\n");
                    else sb.append("1\n");
                    break;
                case "pop":
                    if(!stack.empty()) sb.append(stack.pop()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}