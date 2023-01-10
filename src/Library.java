import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int choix = 0;
        System.out.println("********************** Library Mangement **********************");
        System.out.println("1-Menu 1");
        System.out.println("2-Menu 2");
        System.out.println("3-Menu 3");
        System.out.println("4-Menu 4");
        System.out.println("5-Menu 5");
        System.out.println("6-Menu 6");
        System.out.println("7-Quitter L'app");
        Scanner s = new Scanner(System.in);
        choix = s.nextInt();
        switch (choix){
            case 1:
                System.out.println("menu 1");
                menu();
                break;
            case 2:
                System.out.println("menu 2");
                menu();
                break;
            case 3:
                System.out.println("menu 3");
                menu();
                break;
            case 4:
                System.out.println("menu 4");
                menu();
                break;
            case 5:
                System.out.println("menu 5");
                menu();
                break;
            case 6:
                System.out.println("menu 6");
                menu();
                break;
            case 7:
                return;
            default:
                System.out.println("Choix incorrect");
                menu();
                break;
        }
    }
}
