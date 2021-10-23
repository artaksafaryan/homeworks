public class task2a {
    public static void main(String[] args) {

        int[] myarray = {5, 45, 7, 16, 24, 6, 13};
        int min = myarray[0];
        int max = myarray[0];
        for (int i = 1; i < myarray.length; i++) {
            if (min > myarray[i]) {
                min = myarray[i];
            }
            if (max < myarray[i]) {
                max = myarray[i];
            }

        }

        System.out.println("min * max =" + min * max);

    }
}
