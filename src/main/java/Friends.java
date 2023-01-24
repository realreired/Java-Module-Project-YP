import java.util.Scanner;

public class Friends {

    public static int comeFriends() {
        Scanner friendScanner = new Scanner(System.in);
        int friends = 0;
        while (true) {
            System.out.println("Сколько вас тут собралось?");
            if (friendScanner.hasNextInt()) {
                friends = friendScanner.nextInt();
                if (friends == 1) {
                    System.out.println("Введите число большее одного");
                } else if (friends < 1) {
                    System.out.println("Продавцы съели сами. Попробуйте ещё раз");
                } else if (friends > 1) {
                    break;
                }
            } else {
                System.out.println("В чём вы измеряете людей? Напишите корректное число от 1");
                friendScanner.next();
            }
        }
    return friends; }
}
