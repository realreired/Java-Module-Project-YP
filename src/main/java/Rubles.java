
public class Rubles {

    public static String writeRouble() {
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
    return rouble; }
}

