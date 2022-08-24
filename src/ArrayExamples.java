import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
//        arrayExamples.arraysExample1();
//        arrayExamples.arraysExample2();
//        arrayExamples.maxElement();
//        arrayExamples.avgElement();
//        arrayExamples.sortedArray();
        arrayExamples.median();
    }

    private void arraysExample1() {
        String[] array = new String[10];

        int i = 0;
        while (i < 5) {
            array[i] = "Hello new index: " + i;
            i++;
        }

        System.out.println(Arrays.toString(array));

        String completeContent = "";
        for (int k = 0; k < 7; k++) {
            completeContent = completeContent + array[k] + ";";
            System.out.println("Print => " + array[k]);
        }

        System.out.println(completeContent);
    }

    private void arraysExample2() {
        double[] array = new double[]{1.0, 2.5, 3.72, 3.0, 9.34, 1.29, 2.55, 1.23894};

        //total
        double total = 0;
        for (double element : array) { //foreach loop
            total += element;
        }
        System.out.println("Total: " + total);
    }

    //max
    private void maxElement() {
        int[] array = new int[]{8, 4, 18, 25, 45, 74, 2, 68};
        int maximum = 0;
        for (int j : array) {
            if (j > maximum) {
                maximum = j;
            }
        }
        System.out.println("Maximum = " + maximum);
    }

    private void avgElement() {
        int[] array = new int[]{2, 5, 6, 7, 4, 2, 1, 8, 3, 9};
        int sum = 0;
        for (int k : array) {
            sum += k;
        }
        System.out.println("Avg = " + ((double) (sum) / array.length));
    }

    private void sortedArray() {
        int[] array = new int[]{1, 3, 4, 6, 7, 9, 8, 5, 2};
        int[] newArray = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(newArray));
    }

    private void median(){
        int[] array = new int[]{1, 3, 4, 6, 7, 9, 8, 5, 2};
        int[] newArray = Arrays.stream(array).sorted().toArray();
        System.out.println(newArray[newArray.length/2]);

    }

}
