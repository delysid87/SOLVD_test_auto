public class User {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java UserInfoApp <firstName> <lastName> <age>");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);

        System.out.println("User Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}