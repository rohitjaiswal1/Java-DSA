package conditionalStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch) {
            case 'd'  : System.out.println("samosa");
                        break;
            case 'a'  : System.out.println("burger");
                        break;
            case 'c'  : System.out.println("mango shake");
                        break;
            default   : System.out.println("we wake up");
        }
    }
}
