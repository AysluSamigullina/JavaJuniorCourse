package JavaJuniorCourse.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringCheckException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                checkString(scanner.next());
                break;
            } catch (StringCheckException sce) {
                System.out.println(sce.getMessage());

            }
        }
    }

    private static void checkString(String str) throws StringCheckException {
        char[] symbols = str.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isDigit(symbols[i])) {
                throw new StringCheckException("Вы ввели цифру " + symbols[i]);
            }
            if (i > 0 && i < (symbols.length-1)) {
                if (symbols[i-1] == symbols[i] && symbols[i] == symbols[i+1]) {
                    throw new StringCheckException("Вы ввели подряд три буквы " + symbols[i]);
                }
            }
        }
    }
}
