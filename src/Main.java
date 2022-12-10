public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1");
        int monthA = 0;
        int bankbDeposit = 15_000;
        int total = 0;
         while (total <= 2_459_000) {
             monthA++;
            bankbDeposit = bankbDeposit + bankbDeposit / 100;
            total = total + bankbDeposit;
            System.out.println("Месяц " + monthA + ", сумма накоплений равна " + total + " рублей");

        }
        //Задание №2
        System.out.println("Задание №2");
        int digit = 0;
        while (digit <= 9) {
            digit++;
            System.out.print(digit+" ");
        }
        System.out.println(" ");
        while (digit >= 1) {
            System.out.print(digit+" ");
            digit--;

        }
        System.out.println(" ");
       //Задание №3
        System.out.println("Задание №3");
        int totalPeoples=12_000_000;
        int year=0;
        int bornYearPeoples=0;
        int deadYearPeoples=0;
        int riseYearPeoples=0;
        while (year <= 9) {
            year++;
            bornYearPeoples=(totalPeoples/1000)*17;
            deadYearPeoples=(totalPeoples/1000)*8;
            totalPeoples=totalPeoples+(bornYearPeoples-deadYearPeoples);

            System.out.println("Год "+year+" , численность населения составляет "+totalPeoples);


        }
        //Задание №4
        System.out.println("Задание №4");
        int incomePercent=7;
        int deposit = 15_000;
        int totalDeposit=deposit;
        int monthDeposit=0;
        while (totalDeposit<=12_000_000 ){
            monthDeposit++;
            totalDeposit=totalDeposit+((totalDeposit*7)/100);
            System.out.println("Месяц " + monthDeposit + ", сумма накоплений равна " + totalDeposit + " рублей");

        }
        //Задание №5
        System.out.println("Задание №5");
        int depositB = 15_000;
        int totalDepositB=depositB;
        int monthDepositB=0;
        while (totalDepositB<=12_000_000 ){
            monthDepositB++;
            totalDepositB=totalDepositB+((totalDepositB*7)/100);
            if(monthDepositB % 6==0){
                System.out.println("Месяц " + monthDepositB + ", сумма накоплений равна " + totalDepositB + " рублей");

            }

        }
        //Задание №6
        System.out.println("Задание №6");
        int depositС = 15_000;
        int totalMonth=9*12;
        int totalDepositС=depositС;
        int monthDepositС=0;
        while (monthDepositС<=totalMonth ){
            monthDepositС++;
            totalDepositС=totalDepositС+((totalDepositС*7)/100);
            if(monthDepositС % 6==0){
                System.out.println("Месяц " + monthDepositС + ", сумма накоплений равна " + totalDepositС + " рублей");

            }

        }

        //Задание №7
        System.out.println("Задание №7");
        int friDay=3;
        int day=0;
        System.out.println("Сегодня пятница," +friDay+"-е число. Необходимо подготовить отчет");

        while (friDay<31){
            friDay++;
            day++;
            if(day % 7==0){

                System.out.println("Сегодня пятница," +friDay+"-е число. Необходимо подготовить отчет");
            }

        }
        //Задание №8
        System.out.println("Задание №8");
        int start=2022-200;
        int stop=2022+100;
        for (int x=start;x<=stop;x++){
            if(x % 79==0){

                System.out.println(x);
            }

        }

    }
}