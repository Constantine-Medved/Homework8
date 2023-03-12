import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1.");
        int [] myFirstArray = new int [3];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;
        double [] mySecondArray = {1.57, 7.654, 9.986};
        int [] myThirdArray = new int []{2, 4, 6, 8, 10, 12};
    }
    public static void task2() {
        System.out.println("Задача 2.");
        int [] myFirstArray = new int [3];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;
        double [] mySecondArray = {1.57, 7.654, 9.986};
        int [] myThirdArray = new int [] {2, 4, 6, 8, 10, 12};
        for (int i = 0; i < myFirstArray.length; i++) {
            if (i == myFirstArray.length - 1) {
                System.out.println(myFirstArray[i]);
                break;
            }
            System.out.print(myFirstArray[i] + ", ");
        }
        for (int i = 0; i < mySecondArray.length; i++) {
            if (i < mySecondArray.length - 1) {
                System.out.print(mySecondArray[i] + ", ");
            } else {
                System.out.println(mySecondArray[i]);
            }
        }
        for (int i = 0; i < myThirdArray.length; i++) {
            if (i < myThirdArray.length - 1) {
                System.out.print(myThirdArray[i] + ", ");
            } else {
                System.out.println(myThirdArray[i]);
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3.");
        int [] myFirstArray = new int [3];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;
        double [] mySecondArray = {1.57, 7.654, 9.986};
        int [] myThirdArray = new int [] {2, 4, 6, 8, 10, 12};
        for (int i = myFirstArray.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(myFirstArray[i] + ", ");
            } else {
                System.out.println(myFirstArray[i]);
            }
        }
        for (int i = mySecondArray.length-1; i >= 0 ; i--) {
            if (i > 0) {
                System.out.print(mySecondArray[i] + ", ");
            } else {
                System.out.println(mySecondArray[i]);
            }
        }
        for (int i = myThirdArray.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(myThirdArray[i] + ", ");
            } else {
                System.out.println(myThirdArray[i]);
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4.");
        int [] myFirstArray = new int [3];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;
        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] % 2 != 0) {
                myFirstArray[i] = myFirstArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(myFirstArray));
    }
}