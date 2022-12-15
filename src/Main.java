public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int a = 0;
        while ( total < 2_459_000) {
            total =total+total/100;
            total =total+salary;
            a=a+1;
            System.out.println("Месяц "+a+" сумма накоплений равна "+total+ " рублей" );
        }

        int start = 1;
        while (start < 11) {
            System.out.println (start);
            start = start + 1 ;
        }

        int stirt = 11;
        for (; stirt > 1 ;) {
            stirt = stirt - 1;
            System.out.println(stirt);
        }

        int y = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int next=0;
        for (int i=1; i < 11; i++) {
            y=y+y*dif/1000;

            System.out.println("Год "+i+" численность населения составляет "+ y);
        }

        int In = 15000;
        int all = 0;
        int b = 0;
        for (;all<12_000_000;b++) {
            all = all + 7 * (all / 100);
            all = all + In;
            if (b%6==0) {
                System.out.println("Месяц " + b + " количество накоплений " + all);
            }
        }

        int sa= 15000;
        int al= 0;
        for (int i = 1;i<109;i++) {
            al = al + 7 * (al / 100);
            al = al + sa;
            if(i%6==0) {
                System.out.println("Месяц "+i+" количество наколпений "+al);
            }
        }

        int friday=2;
        while (friday<30) {
            friday=friday+7;
            System.out.println("Сегодня пятница "+friday+"-е число. Необходимо подготовить отчёт");



        }

        int c = 1817;
        while (c<2054) {
            c=c+79;
            System.out.println(c);

        }





    }
}