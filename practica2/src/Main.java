import java.util.Scanner;

public class PrimitiveTypesInfo {
    public static void main(String[] args) {
        // Виводимо інформацію про примітивні типи даних
        System.out.println("Інформація про примітивні типи даних:");
        printPrimitiveTypeInfo();

        // Створюємо сканер для зчитування вводу користувача
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введіть тип даних (int, double, boolean, char або 'exit' для виходу):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Введіть значення:");
            String value = scanner.nextLine();

            convertAndPrintValue(input, value);
        }

        scanner.close();
    }

    private static void printPrimitiveTypeInfo() {
        System.out.printf("%-10s %-10s %-20s %-20s%n", "Тип", "Розмір (байт)", "Мінімальне значення", "Максимальне значення");
        System.out.printf("%-10s %-10d %-20d %-20d%n", "byte", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20d %-20d%n", "short", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20d %-20d%n", "int", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20d %-20d%n", "long", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20s %-20s%n", "float", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20s %-20s%n", "double", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20s %-20s%n", "char", Character.BYTES, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("%-10s %-10d %-20s %-20s%n", "boolean", 1, "false", "true");
    }

    private static void convertAndPrintValue(String type, String value) {
        try {
            switch (type.toLowerCase()) {
                case "int":
                    int intValue = Integer.parseInt(value);
                    System.out.println("Перетворене значення (int): " + intValue);
                    break;
                case "double":
                    double doubleValue = Double.parseDouble(value);
                    System.out.println("Перетворене значення (double): " + doubleValue);
                    break;
                case "boolean":
                    boolean booleanValue = Boolean.parseBoolean(value);
                    System.out.println("Перетворене значення (boolean): " + booleanValue);
                    break;
                case "char":
                    if (value.length() == 1) {
                        char charValue = value.charAt(0);
                        System.out.println("Перетворене значення (char): " + charValue);
                    } else {
                        System.out.println("Помилка: значення для char повинно містити один символ.");
                    }
                    break;
                default:
                    System.out.println("Невідомий тип даних: " + type);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Помилка: неможливо перетворити '" + value + "' на тип " + type);
        }
    }
}
