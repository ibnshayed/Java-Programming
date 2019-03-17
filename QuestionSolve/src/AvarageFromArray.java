public class AvarageFromArray {
    public static void main(String[] args) {
        int[] array = {0,5,1,4};
        double average;
        double sumOfArrayElements = 0;

        for(int i = 0; i<array.length; i++){
            sumOfArrayElements += array[i];
        }

        average = sumOfArrayElements / array.length;

        System.out.println("Avarage is: " + average);


    }
}
