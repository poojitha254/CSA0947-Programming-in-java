class SpecialCharacters 
{
    public static void main(String[] args) 
    {
        String input = "Hello, World! 1234 @#$%^";
        int specialCharCount = 0;

        System.out.println("Special characters:");
        for (int i = 0; i < input.length(); i++) 
	{
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch)) 
	    {
                System.out.println(ch);
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
    }
}
