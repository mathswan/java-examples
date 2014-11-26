package examples;

/**
 * Created by snaithm on 25/11/2014.
 */
public class Greeting {

    public static void main(String[] args) {
        String name = "Matthew";

        welcome(name);
        goodbye(name);
    }

    public static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    public static void goodbye(String name) {
        System.out.println("Goodbye " + name);
    }
}