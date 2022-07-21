public class Main {
    public static void main(String[] args){
        System.out.println(addBinary("11", "1111"));
    }
    public static String addBinary(String a, String b) {
        StringBuffer sb1= new StringBuffer();
        StringBuffer sb2= new StringBuffer();
        StringBuffer re= new StringBuffer();
        sb1.append(a);
        sb2.append(b);
        String ar= sb1.reverse().toString();
        String br= sb2.reverse().toString();
        String max= a.length()>b.length()? ar:br;
        String min= a.length()>b.length()? br:ar;
        int p=0;
        int plus=0;

        for(int i=0; i<max.length(); i++){
            if(i<min.length())
                plus=p+Character.getNumericValue(ar.charAt(i))+ Character.getNumericValue(br.charAt(i));
            else plus=p+Character.getNumericValue(max.charAt(i));
            if(plus>=2) {
                p=1;
                re.append(plus-2);
            } else {
                re.append(plus);
                p=0;
            }
        }
        if(p!=0) re.append(1);
        return re.reverse().toString();
    }
}
