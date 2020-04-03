public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("2. Stack of Strings");
        stackOfIStrings();
    }

    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        System.out.println("Size: " + stack.size());
        System.out.print("Test pop(): ");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\nSize after pop is: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Size: " + stack.size());
        System.out.print("Test pop(): ");
        System.out.printf("%s ", stack.pop());
        System.out.println("\nSize after pop is: " + stack.size());
    }

}
