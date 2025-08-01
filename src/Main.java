class Main {
    static String reverse_String(String st,int idx) {
        if(idx>=st.length()) return "" ;
        String ans = new String () ;

         String s =  reverse_String(st,idx+1) ;
         ans += st.charAt(idx) ;



        return  s+ans  ;
    }
    public static void main(String... args) {
        String st = "Jishan" ;

        System.out.println(reverse_String(st,0)) ;


    }
}

