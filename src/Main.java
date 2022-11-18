
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("1. your visa grade : ");  
        int visa1 = scanner.nextInt();
        
        System.out.println("2. your visa grade : ");
        int visa2 = scanner.nextInt();
        
        System.out.println("Enter Final grade : ");
        
        int finalnote = scanner.nextInt();
        
        System.out.println("Your overall average :");
        double ortalama = scanner.nextDouble();
        
        double totalgrade = (visa1 * 3/ 10.0) + (visa2 * 3 / 10.0) + (finalnote * 4/10);
        
        if (totalgrade >= 90) {
            System.out.println("you got AA");  
    }
        else if (totalgrade >= 85) {
            System.out.println("you got BA");
         }   
        else if (totalgrade >= 80) {
            System.out.println("you got BB");
         }       
        else if (totalgrade >= 75) {
            System.out.println("you got CB");
         }      
        else if (totalgrade >= 70) {
            System.out.println("you got CC");
         }     
        else if (totalgrade >= 65) {
            System.out.println("you got DC");
         } 
        else if (totalgrade >= 60) {
            System.out.println("you got DD");
            if (ortalama < 2.50) {
                System.out.println("You got a DD and your grade point average is low. You may consider taking this course again."); 
            }
         }
        else if (totalgrade >= 55) {
            System.out.println("You took FD and failed the course...");
       }
          else  {
            System.out.println("You took FF and failed the course...");
       }  
          
    }
 
}
