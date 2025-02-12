
public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions();
        print("1. Next");
        print(functions.next(3));

        print("2. Previous");
        print(functions.previous(4));

        print("3. Double");
        print(functions.doubleOf(15));

        print("4. Square");
        print(functions.square(5));

        print("5. Difference");
        print(functions.difference(5, 11));

        print("6. Average double");
        print(functions.averageDouble(5, 30));

        print("7. Average int");
        print(functions.averageInt(2, 13));

        print("8. Round");
        print(functions.round(4.9));

        print("9. isNegative");
        print(functions.isNegative(-3));

        print("10. IsDigit");
        print(functions.eDigito(3));

        print("11. isEven");
        print(functions.isEven(7));

        print("12. IsOdd");
        print(functions.isOdd(3));

        print("13. abs");
        print(functions.abs(-3));

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    static void print(Object value) {
        System.out.println(value.toString());
    }
}