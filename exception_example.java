public class exception_example {
    public static void main(String[] args) {
       //Try - Catch in Exception Handling
        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            //do something aftercatching
        }
        System.out.println("The name is Rohit");
    }
}
