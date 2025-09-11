// public class EqualExample {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         if (a == b) {
//             System.out.println("a is equal to b");
//         } else {
//             System.out.println("a is not equal to b");
//         }
//     }
// }

// public class EqualToExample {
//     public static void main(String[] args) {
//         int x = 10, y = 10;

//         System.out.println("x == y: " + (x == y)); // true
//     }
// }

// public class NotEqualExample {
    // public static void main(String[] args) {
    //     int x = 10, y = 20;

    //     System.out.println("x != y: " + (x != y)); // true
    // }
// }

// public class LogicalAndExample {
//     public static void main(String[] args) {
//         boolean result = true && false;

//         System.out.println("The result is: " + result); // false
//     }
// }

public class LogicalOrExample {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isTeacher = false;

        if (isStudent || isTeacher) {
            System.out.println("You can enter the campus.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

