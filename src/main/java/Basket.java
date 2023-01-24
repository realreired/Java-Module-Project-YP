import static com.sun.tools.doclint.Entity.sum;

import com.sun.tools.doclint.Entity;

import java.util.Scanner;

public class Basket {



    public static void fillProductInfo() {

        Scanner productScanner = new Scanner(System.in);
        int friends = Friends.comeFriends();
        String rouble = Rubles.writeRouble();
        String name = null;
        double price = 0;
        String nameList = " набрали: ";
        double sum = 0;
        double payPerFriend = 0;

        System.out.println("Что взяли? ");
        while ((name = productScanner.next()) != null) {

            nameList += " " + name + "\n";


            System.out.println("И почём сие добро?");
            if (productScanner.hasNextDouble()) {

                price = productScanner.nextDouble();
                productScanner.nextLine();
                if (price <= 0) {
                    System.out.println("Таких цен не бывает");
                } else if (price > 0) {
                    sum += price;

                payPerFriend = sum / friends;
                    double result = Double.parseDouble(String.format("%.2f", payPerFriend));
                }
                System.out.println("Добавили " + name + " по цене " + price + ", товаров на общую сумму " + sum);
            } else {
                System.out.println("Что-то не то. Давайте всё по-новой");
                productScanner.nextLine();
            }
            if (name.equalsIgnoreCase("завершить")) {
                String text = "Вы" + nameList + "С каждого человека %.2f";
                System.out.println(String.format(text, payPerFriend) + rouble);
                break;
            }

            System.out.println("Если вы сегодня на легке, или в вас больше ничего не лезет, напишите \"Завершить\", \nили напишите следующий продукт");


        }
    }

    public String writeRouble() {
        String rouble;
        double payPerFriend = 0;
        int intPayPerFriend = (int) payPerFriend;
        if (intPayPerFriend % 100 >= 10 && intPayPerFriend % 100 <= 20) {
            rouble = " рублей";
        } else {
            switch (intPayPerFriend % 10) {
                case 1:
                    rouble = " рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    rouble = " рубля";
                    break;
                default:
                    rouble = " рублей";
            }
        }
return rouble;
    }
        }



