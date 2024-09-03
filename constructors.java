public class constructors {
    //public class constructors {}

//    class ProgrammingLanguages {
        String language;

        // Constructor accepting a single value
        constructors (String lang) {
            language = lang;
            System.out.println(language + " Programming Language");
        }

        public static void main(String[] args) {
            // Call constructor by passing a single value
           constructors obj1 = new constructors ("Java");
            constructors obj2 = new constructors ("Python");
            constructors obj3 = new constructors ("C");
        }
    }


