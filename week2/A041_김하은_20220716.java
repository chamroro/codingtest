
    class Main {
        public static void main(String[] args){
            String s="3people unFollowed me";
            solution(s);
        }
        public static String solution(String s) {
            String answer = "";
            s= s.toLowerCase(); //일단 다 소문자로
            String[] word= s.split(" ");
            for(int i=0; i<word.length; i++){
                if(Character.isLowerCase(word[i].charAt(0))) //만약 맨 앞이 소문자 알파뱃이면
                    answer+=Character.toUpperCase(word[i].charAt(0)); //대문자 알파벳으로
                else answer+=word[i].charAt(0); //아니면 그냥 추가
                if(i==word.length-1) answer+=word[i].substring(1);
                else answer+=word[i].substring(1)+" "; //맨 앞자리 빼고 추가
            }
            System.out.println(answer);
            return answer;
        }
    }

