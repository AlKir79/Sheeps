
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Flock herd = new Flock();
    Sheep baran;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Открылась шашлычная со своим собственным стадом баранов.");
    System.out.println("Наше стадо:");
    herd.getInfo();
    System.out.println("Нажмите любую клавишу.");
    scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // начинаем работу
       for(int i=0;i<30;i++) {
            if (i%5==0) {
               herd.addSheep();
          }
            herd.oneDayHerd();
         }
        herd.getInfo();

    }

}