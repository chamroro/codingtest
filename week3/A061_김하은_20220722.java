import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        System.out.println(convertToTitle(1170001));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>26){
            sb.append((char)(columnNumber%26+64));
            columnNumber/=26;
        }
        sb.append((char)(columnNumber+64));
        return String.valueOf(sb.reverse());
    }
}
