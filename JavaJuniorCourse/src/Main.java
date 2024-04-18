import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
//        exercise3();
      //  exercise4();
        exercise5("ayslu 1104");

    }

        public static void exercise1(){
            String output = "___________\'\"___\n" +
                    "__________---___\n" +
                    "_______/\\_|_|___\n" +
                    "______/__\\|_|____\n" +
                    "_____/____\\_|____\n" +
                    "____/______\\|____\n" +
                    "___/__[__]__\\____\n" +
                    "__/|________|\\___\n" +
                    "_/_|________|_\\__\n" +
                    "___|__---___|____\n" +
                    "___|__| |___|____\n";
            System.out.println(output);
        }

        public static void exercise2() {
            System.out.printf("В городе %s с населением %d человек процент безработных равен %.2f \n", "Иннополис", 4000, 19.3F);
            System.out.printf("В секции %c %d мест с ценой %d", 'A', 350, 3500);
        }

        public static void exercise3() {
            int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]%2==0 ? array[i]+" " : "");
            }
            System.out.println();

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 100 && array[i] > 9) {
                    System.out.print(array[i]+" ");
                }
            }
            System.out.println();

            int max = array[0];
            for(int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(max);

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);

            for (int i = 0; i < array.length/2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+ " ");
            }
        }

        public static void exercise4() {
            int[][] array = new int[4][3];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < array.length; i++) {
                int lineSum = 0;
                for (int j = 0; j < array[i].length; j++) {
                    lineSum += array[i][j];
                }
                System.out.println("Line " + i + ": " + lineSum);
            }

            for (int i = 0; i < array[0].length; i++) {            //вывести сумму элементов столбцов
                int colSum = 0;

                for (int j = 0; j < array.length; j++) {
                   colSum += array[j][i];
                }
                System.out.println("Column " + i + ": " + colSum);
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]%2 == 0) {
                        array[i][j] = 0;
                    } else array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < array.length; i++) {
                int sumLine = 0;
                for (int j = 0; j < array[i].length; j++) {
                    sumLine += array[i][j];
                }
                int average = sumLine/array[0].length;
                System.out.printf("Average of line %d : %d \n", i, average);
            }
            scanner.close();

        }

        static void exercise5(String str) {
            String[] words = str.split(" ");
            char[] nums = words[1].toCharArray();
            int[] numnbers = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                numnbers[i] = convert(nums[i]);
            }

            System.out.println("Здравствуйте, " + words[0] + "! Сумма цифр в числе = " + convert(summ(numnbers)));
        }

        static int summ(int[] nums) {
            int result = 0;

            for (int i = 0; i < nums.length; i++) {
                result += nums[i];
            }
            return result;
        }

        private static int convert(char aChar) {
            switch (aChar) {
                case '1': return 1;
                case '2': return 2;
                case '3': return 3;
                case '4': return 4;
                case '5': return 5;
                case '6': return 6;
                case '7': return 7;
                case '8': return 8;
                case '9': return 9;
                default: return 0;
            }
        }
        private static String convert(int n) {
            switch (n) {
                case 1: return "один";
                case 2: return "два";
                case 3: return "три";
                case 4: return "четыре";
                case 5: return "пять";
                case 6: return "шесть";
                case 7: return "семь";
                case 8: return "восемь";
                case 9: return "девять";
                default: return "ноль";
            }
        }
}
