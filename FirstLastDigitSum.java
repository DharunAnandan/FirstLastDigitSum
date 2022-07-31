public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }
    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = number % 10;
        while (number > 0) {
            first = number % 10;
            number /= 10;


        }
        return last + first;
    }
}
