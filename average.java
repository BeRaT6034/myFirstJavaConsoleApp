import java.util.Scanner;
import java.lang.Thread;

public class average {
    public static void main(String[] args) {
        while(true){
            System.out.print("\033[H\033[2J");
            Scanner input = new Scanner(System.in);

            int number;
            int number2;
            float average;

            boolean hesaplanabilir = true;
            boolean hesaplanabilir2 = true;

            System.out.print("İlk notunuzu girin -> ");
            number = input.nextInt();

            if(number >100 || number <0){
                hesaplanabilir = false;
            }

            while(hesaplanabilir == false){
                System.out.print("Notunuz 100 ile 0 arasında bir değer olmak zorunda. İlk notu tekrar giriniz -> ");
                number = input.nextInt();
                if(number <= 100 && number >=0){
                   break;   
                }

            }

            System.out.print("İkinci notunuzu girin -> ");
            number2 = input.nextInt();

            if(number2 > 100 || number2 < 0){
                hesaplanabilir2 = false;
            }

            while(hesaplanabilir2 == false){
                System.out.print("Notunuz 100 ile 0 arasında bir değer olmak zorunda. İkinci notu tekrar giriniz -> ");
                number2 = input.nextInt();

                if(number2 <= 100 && number2 >= 0){
                    break;
                }
            }
            average = (float)(number + number2)/2;
            System.out.println("Ortalamanız -> "+ average);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
            }
            
        }
    }
}
