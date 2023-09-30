import java.util.Scanner;

public class player {
    public String name;

    public player(){
        System.out.println("Введите имя");
        Scanner console = new Scanner(System.in);
        name = console.nextLine();
        System.out.println("Ваше имя " + name);
    }
   //
}
