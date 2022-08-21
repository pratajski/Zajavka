public class OperatorsExamples {

    public static void doubleSum(double x, double y) {
        System.out.println(x + y);
    }
    public static void colors (int lines){
        int colors = 6;
        if (lines % colors == 0){
            System.out.println("brown");
        }else if (lines % colors == 1){
            System.out.println("red");
        }else if (lines % colors == 2){
            System.out.println("green");
        }else if (lines % colors == 3){
            System.out.println("blue");
        }else if (lines % colors == 4){
            System.out.println("black");
        }else if (lines % colors == 5){
            System.out.println("yellow");
        }
    }

    public static void divisionBy3and7(int number){
        if ((number%3 == 0)&& (number%7 == 0)){
            System.out.println("Liczba podzielna przez 3 i 7");
        } else if (number%3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        } else if (number%7 == 0) {
            System.out.println("Liczba podzielna przez 7");
        }else {
            System.out.println("Liczba nie jest podzielna ani przez 3, ani przez 7");
        }
    }
}
