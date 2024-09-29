import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        // Задача 1.
        int year = 2000;
        checkAndPrintYear(year);

    }

    private static void checkAndPrintYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год -високосный год");
        } else {
            System.out.println(year + "  год - невисокосный год");
        }
        //Задача 2
        int deviseYear = 2015;
        int clientOs = 1;
        System.out.println(RecommendAppCurrentVersion(2017, 1));
    }

    private static String RecommendAppCurrentVersion(int deviceYear, int clientOs) {
        String resultMessage = " Усановите ";
        if (isOldDevise(deviceYear)) {
            resultMessage += " lite ";
        }
        resultMessage += " версию для ";
        if (clientOs == 1) {
            resultMessage += " Android ";
        } else {
            resultMessage += " IOS ";
        }
        return resultMessage;
    }

    private static boolean isOldDevise(int deviseYear) {
        int currentYear = LocalDate.now().getYear();//2024
        return deviseYear < currentYear && deviseYear < 2015;
    }

}

class Homework {
    public static void main(String[] args) {
        System.out.println(calculateDeliveryDays(80));
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = -1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            result = 1;
        } else if (deliveryDistance <= 60) {
            result = 2;
        } else if (deliveryDistance <= 100) {
            result = 3;
        }
        return result;

    }
}