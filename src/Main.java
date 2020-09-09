public class Main{
        public static void main(String[] arg) {
            double i=1;
            double s=0;
            double k;
            for (i=1;i<11;i++)
            {
                k=1/i;
                System.out.println(k);
                s=s+k;
            }
            System.out.println("Сумма гармонического ряда:");
            System.out.println(s);
        }
}
