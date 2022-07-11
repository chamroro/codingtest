class A006 {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr= s.split("");
        int p=0;
        int y=0;
        for(int i=0; i < arr.length; i++){
            if(arr[i].equals("P")||arr[i].equals("p"))
                p++;
            else if (arr[i].equals("Y") || arr[i].equals("y"))
                y++;
        }
        if(p!=y) answer = false;
        return answer;
    }
}
