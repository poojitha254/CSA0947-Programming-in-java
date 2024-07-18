class ComparisonExample {
    public static void main(String[] args) {
        // Creating two string objects with the same content
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using == to compare references
        if (str1 == str2) {
            System.out.println("str1 == str2: References are the same.");
        } else {
            System.out.println("str1 != str2: References are different.");
        }

        // Using .equals() to compare contents
        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2): Contents are the same.");
        } else {
            System.out.println("str1.equals(str2): Contents are different.");
        }
    }
}
