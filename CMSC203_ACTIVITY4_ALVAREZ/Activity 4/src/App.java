import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
    
    System.out.print("Month: ");
    int month = s.nextInt();
    
    System.out.print("Day: ");
    int Day = s.nextInt();
    
    System.out.print("Year: ");
    int year = s.nextInt();
    
  
    
    switch(month) 
    {
    case 1:
    System.out.print ("January ");
        break;
    
    case 2:
    System.out.print ("February ");
        break;
    
    case 3:
    System.out.print ("March ");
        break;
    
    case 4:
    System.out.print ("April ");
        break;
        
    case 5:
    System.out.print ("May ");
        break;
        
    case 6:
    System.out.print ("June ");        
    break;
        
    case 7:
    System.out.print ("July ");        
    break;
        
    case 8:
    System.out.print ("August ");
        break;
        
   	case 9:
       System.out.print ("September ");
        break;
             
    case 10:
    System.out.print ("October ");
        break;
            
    case 11:
    System.out.print ("November ");
        break;
            
    case 12:
    System.out.print ("December ");
        break;
    default:
    System.out.print("Month is Invalid!");
    break;    
  }
  	

    if (Day > 31 || Day <= 0) System.out.print("Invalid Date");
    else System.out.print( " " + Day + "," + year);
    }
}
