import java.time.LocalDate;

public class Main {

    static int currentYear = LocalDate.now().getYear();

    public static int getLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return currentYear;
    }

    public static void getVersionOS(int clientOS) {
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS != 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS != 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int getDeliveryDays(int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else {
            System.out.println("Потребуется 3 дня");
    }
        return deliveryDistance;
    }
    public static void main (String[] args){
            getLeapYear(currentYear);
            int OS = 0;
            getVersionOS(OS);
            int distance = 95;
            getDeliveryDays(distance);
        }
    }
