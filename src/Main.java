class Main {
    static String reverse_String(String st) {
        String ans = new String () ;
        for(int i = st.length()-1 ;i>=0 ;i--){
               ans += st.charAt(i) ;

        }

        return  ans  ;
    }
    public static void main(String... args) {
        String st = "Jishan" ;

        System.out.println(reverse_String(st)) ;


    }
}

