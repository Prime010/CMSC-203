import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double enter1;
		double enter2;
		double result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.print("First Number : ");
		enter1 = s.nextDouble();
		
		System.out.print("Second Number : ");
		enter2 = s.nextDouble();
		
		System.out.println("==================");
		result = enter1 + enter2;
		
	
		System.out.println(enter1 + " + " + enter2 + " = " + result);
		System.out.println("==================");
    }
}
