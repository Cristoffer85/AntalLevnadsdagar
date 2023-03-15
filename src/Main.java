import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nedan följer ett program som räknar ut hur många dagar du har levt hittills fram till dagens datum.");
        System.out.println("Ange svar på följande frågor i siffror. " + "\n");

        Scanner flanderiDiddilios = new Scanner(System.in);
        System.out.print("Vilket år föddes du? "); int bornYear = flanderiDiddilios.nextInt();
        System.out.print("Vilken månad föddes du? "); int bornMonth = flanderiDiddilios.nextInt();
        System.out.print("Vilken dag föddes du? "); int bornDay = flanderiDiddilios.nextInt();
        System.out.print("Vad är det nuvarande året? "); int currentYear = flanderiDiddilios.nextInt();
        System.out.print("Vad är den nuvarande månaden? "); int currentMonth = flanderiDiddilios.nextInt();
        System.out.print("Vad är den nuvarande dagen? " ); int currentDay = flanderiDiddilios.nextInt();

        int yearsLived = currentYear - bornYear;
        double daysLived = yearsLived * 365.25 + (currentMonth - bornMonth) * 30.475 + (currentDay - bornDay);

        System.out.print("\n" + "Du har levt i " + daysLived + "dagar");
    }
}

