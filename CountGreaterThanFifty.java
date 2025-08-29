public class CountGreaterThanFifty {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 88, 67, 89, 42, 51, 49, 73, 12}; // example list
        int count = 0;

        for (int num : numbers) {
            if (num > 50) {
                count++;
            }
        }

        System.out.println("Count of numbers greater than 50: " + count);
    }
}
