import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
//        arrayExamples.arraysExample1();
//        arrayExamples.arraysExample2();
//        arrayExamples.maxElement();
//        arrayExamples.avgElement();
//        arrayExamples.sortedArray();
//        arrayExamples.median();
//        arrayExamples.factorial(2);
//        arrayExamples.factorial(6);
//        arrayExamples.palindrome("Kobyła ma mały bok");
//        arrayExamples.palindrome("Kajak  ");
//        arrayExamples.tree(8, '@');
//        arrayExamples.markers(50);
//        arrayExamples.primeNumbers(80);
//        arrayExamples.primeNumbers(10);
//        arrayExamples.marks(1000);
        arrayExamples.fibo(19);
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

    private void median() {
        int[] array = new int[]{1, 3, 4, 6, 7, 9, 8, 5, 2};
        int[] newArray = Arrays.stream(array).sorted().toArray();
        System.out.println(newArray[newArray.length / 2]);

    }

    private void factorial(int liczba) {
        int result = 1;
        for (int i = 1; i <= liczba; i++) {
            result *= i;
        }
        System.out.println("silnia = " + result);
    }

    private void palindrome(String text) {
        String fraze = text.toLowerCase().trim().replace(" ", "");
        String result = "";
        for (int i = (fraze.length() - 1); i >= 0; i--) {
            char letter = fraze.charAt(i);
//            if (fraze.charAt(i) == ' ') {
//                continue;
//            }
            result += fraze.charAt(i);
        }
//        System.out.println(result);
        if (result.toLowerCase().equals(fraze)) {
            System.out.println("ciąg jest palindromem");
        } else {
            System.out.println("ciąg NIE jest palindromem");
        }
    }

    private void tree(int quantity, char mark) {
        int number = quantity + 1;
        int floor = number / 2;
        for (int i = floor; i > 0; i--) {
            for (int j = 0; j <= number; j++) {
                if ((j < floor) || (j > (number - floor))) {
                    System.out.print(" ");
                } else {
                    System.out.print(mark);
                }
            }
            System.out.println("");
            floor -= 1;
        }
    }

    private void markers(int quantity) {
        String red = "Red";
        String green = "Green";
        String blue = "Blue";
        String black = "Black";
        String yellow = "Yellow";
        String brown = "Brown";

        for (int i = 0; i < quantity; i++) {
            if (i % 6 == 5) {
                System.out.println(brown);
            } else if (i % 6 == 0) {
                System.out.println(red);
            } else if (i % 6 == 1) {
                System.out.println(green);
            } else if (i % 6 == 2) {
                System.out.println(blue);
            } else if (i % 6 == 3) {
                System.out.println(black);
            } else if (i % 6 == 4) {
                System.out.println(yellow);
            }
        }
    }

    private int primeNumbers(int number) {
        if (number < 2) {
            System.out.println("Liczba musi być >= 2");
            return 0;
        } else {
            System.out.println("2");
            for (int i = 3; i <= number; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                boolean prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) { //równoznaczne z (prime == true)
                    System.out.println(i);
                }
            }
            return -1;
        }
    }

    private void marks(int quantity) {
        int x = 39;
        int y = 11;
        for (int i = 0; i < quantity; i++) {
            if ((i % 2 != 0) && (i != (quantity - 1))) {
                System.out.print(y + ", ");
                y -= 3;
            } else if ((i % 2 == 0) && (i != (quantity - 1))) {
                System.out.print(x + ", ");
                x += 2;
            } else if ((i % 2 != 0) && (i == (quantity - 1))) {
                System.out.print(y);
            } else if ((i % 2 == 0) && (i == (quantity - 1))) {
                System.out.print(x);
            }
        }
    }

    private void fibo(int quantity) {
        int x = 0;
        int y = 1;
        int result = 0;
        System.out.println("0");
        System.out.println("1");
        for (int i = 1; i < quantity; i++) {
            result = x + y;
            System.out.println(result);
            x = y;
            y = result;
        }
    }
}
