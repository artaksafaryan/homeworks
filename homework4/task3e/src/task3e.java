public class task3e {
    public static void main(String[] args) {

        String s = "Lorem ipsum is placeholder text commonly";
        String[] word = s.split(" ");
        String longword = word[0];
        for (int i = 1; i < word.length; i++) {
            if (longword.length() <= word[i].length()) {
                longword = word[i];
            }
        }

        System.out.println("longword is;  " + longword);

    }
}
