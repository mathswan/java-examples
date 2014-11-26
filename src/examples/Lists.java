package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snaithm on 26/11/2014.
 */
public class Lists {

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("David");
        names.add("Sarah");
        names.add("James");

        if (names.isEmpty()) System.out.print("End - List is empty");
        else printName(names);
    }

    public static void printName(List names) {
        System.out.println(names);
    }
}
