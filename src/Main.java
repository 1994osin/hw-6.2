public class Main {
    public static void main(String[] args) {
        int originalDeposit = 15_000;
        double depositInterest = 0.07;

        // Task 1
        int originalAmount = 0;
        int finalAmount = 12_000_000;
        int needMonths = 0;
        while (originalAmount <= finalAmount) {
            originalAmount += originalAmount * depositInterest;
            originalAmount += originalDeposit;
            needMonths++;
            System.out.println("Месяц " + needMonths + ", сумма накоплений составляет " + originalAmount);
        }
        System.out.println();

        // Task 2
        originalAmount = 0;
        needMonths = 0;
        while (originalAmount <= finalAmount) {
            originalAmount += originalAmount * depositInterest;
            originalAmount += originalDeposit;
            needMonths++;
            if (needMonths % 6 == 0) {
                System.out.println("Месяц " + needMonths + ", сумма накоплений составляет " + originalAmount);
            }
        }
        System.out.println();

        // Task 3
        originalAmount = 0;
        needMonths = 0;
        int timelineInYears = 9;
        int timelineInMonth = timelineInYears * 12;
        while (needMonths <= timelineInMonth) {
            originalAmount += originalAmount * depositInterest;
            originalAmount += originalDeposit;
            needMonths++;
            if (needMonths % 6 == 0) {
                System.out.println("Месяц " + needMonths + " сумма накоплений составляет " + originalAmount);
            }
        }
        System.out.println();

        // Task 4
        int firstFridayNumber = 7;
        int daysIn_a_Month = 31;
        while (firstFridayNumber <= daysIn_a_Month) {
            System.out.println("Сегодня пятница, " + firstFridayNumber + "-е число. Необходимо подготовить отчет");
            firstFridayNumber += 7;
        }

    }
}