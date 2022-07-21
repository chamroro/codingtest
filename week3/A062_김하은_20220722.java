public class Main {
    public static void main(String[] args){
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        String[] week={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] day={31,29,31,30,31,30,31,31,30,31,30,31};
        int days=0;
        for(int i=0; i<a-1; i++){
            days+=day[i];
        }
        days+=b;
        answer=week[days%7];
        return answer;
    }
}
