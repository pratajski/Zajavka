public class Conditionals {
    public static void loopYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");

        }
    }

    public static void maxNumber(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                System.out.println("Max a: " + a);
            } else {
                System.out.println("Max c: " + c);
            }
        }
        if (a < b) {
            if (b >= c) {
                System.out.println("Max b: " + b);
            } else {
                System.out.println("Max c: " + c);
            }
        }
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    private static void month30d() {
        System.out.println("Ilość dni w miesiącu: 30");
    }

    private static void month31d() {
        System.out.println("Ilość dni w miesiącu: 31");
    }

    public static void numberOfDaysInTheMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                month31d();
                break;
            case 2:
                System.out.println("Ilość dni w miesiącu: 28 lub 29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                month30d();
                break;
            default:
                System.out.println("Nie ma takiego miesiąca");
                break;
        }
    }

    public static void numberOfDays(int month) {
        int sum = 0;
        switch (month) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += 31;
                break;
            default:
                System.out.println("Nie ma takiego miesiąca");
                return;
        }
        System.out.format("Ilość dni roku na koniec %s miesiąca = %s", month, sum);
    }
}
