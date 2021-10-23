public class task2a {
    public static void main(String[] args) {
        int length = 0;
        int count_of_negative = 0;
        int sum_of_positives=0;
        int sum_of_odd_indexes_items=0;
        int mull_of_seven=1;
        int i = -100;
        int j = 0;
        while (i <= 100) {
            if (i % 3 != 0) {
                length++;
            }
            i++;
        }
        i = -100;
        int myarray[] = new int[length];
        while (i <= 100) {
            if (i % 3 != 0) {
                myarray[j] = i;
                if (j%2>0){
                    sum_of_odd_indexes_items+=myarray[j];
                }
                if(j%7==0 && j!=0 ){
                    mull_of_seven*=j;
                }
                if (i<0){
                    count_of_negative++;
                }else {
                    sum_of_positives+=myarray[j];
                }
                j++;
            }
            i++;
        }
        System.out.println("chi bajanvum 3_i");
        for (int k = 0; k < myarray.length; k++){
            System.out.println(+myarray[k]);

        }
        System.out.println("My array lenght is: "+myarray.length);
        System.out.println("Count of negatives is: : "+count_of_negative);
        System.out.println("The arithmetic average of positives is: " + sum_of_positives/(myarray.length-count_of_negative));
        System.out.println("The sum of odd indexes items is: "+  sum_of_odd_indexes_items);
        System.out.println("The mull of seven is: "+ mull_of_seven);
    }
}
