class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Terminate the loop when i is 5
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop terminated.");
    }
}
