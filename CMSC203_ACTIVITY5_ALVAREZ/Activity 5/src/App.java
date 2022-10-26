import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {

		 char operator;
		    Float int1, int2, result;

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // ask users to enter operator
		    System.out.println("Choose an operands : -, +, *, /");
		    operator = input.next().charAt(0);

            System.out.print("Enter first input number: ");
        int1 = input.nextFloat();
        System.out.print("Enter second input number: ");
        int2 = input.nextFloat();
        System.out.println("<><><><><><>");
        System.out.println("Result");
             
            switch (operator) {
                case '-':
                result = int1 - int2;
                System.out.println(result);
                    break;
                    
                    case '+':
                result = int1 + int2;
                System.out.println(result);
                    break;
            
                    case '*':
                result = int1 * int2;
                System.out.println(result);
                break;

                case '/':
                result = int1 / int2;
                System.out.println(result);
                break;

                default:
                System.out.println("Invalid input!");
                    break;
                    
            }

    }
    
}
