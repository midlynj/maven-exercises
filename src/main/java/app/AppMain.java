package app;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = scanner.next();
        System.out.println("userInput = " + userInput);
        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));
    }
}
