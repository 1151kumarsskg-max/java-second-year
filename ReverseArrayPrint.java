public class ReverseArrayPrint {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 67, 89, 42, 51, 49, 73, 12}; // example array

        System.out.println("Array elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
