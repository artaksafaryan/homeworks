public class task3a {
    public static void main(String[] args) {
       String str = "qaxaq";
       int start = 0;
       boolean is_palindrum=true;
       int end = str.length()-1;
       while (start<=end){
           if (str.charAt(start)!=str.charAt(end)){
               is_palindrum=false;
               break;
           }
           start++;
           end--;
       }


        System.out.println(is_palindrum);
    }
}