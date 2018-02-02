public class ReverseString {
    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in); 
        System.out.print("Enter a string: "); 
        String inp = input.next(); 

        int yString = inp.length(); 
        for (int i = 1 ; i <= yString; i++) { 
            System.out.print(inp.charAt(yString-i)); 
        } 
    } 
}
