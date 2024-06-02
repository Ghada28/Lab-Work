public class HW1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 3 == 0) {
                result.append("Fizz");
            }
            if (i % 5 == 0) {
                result.append("Buzz");
            }
            if (i % 7 == 0) {
                result.append("Jazz");
            }

            if (result.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}

