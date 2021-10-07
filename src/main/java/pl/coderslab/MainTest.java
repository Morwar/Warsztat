package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

public class MainTest {
    public static void main(String[] args) {
        String s = StringUtils.deleteWhitespace("adfdsfg");

        System.out.println(ConsoleColors.GREEN_BOLD + " green bold ");
        System.out.println(ConsoleColors.RED + " red ");
        System.out.println(ConsoleColors.BLUE + " blue ");
        System.out.println(ConsoleColors.RESET + " back to default");
    }
}
