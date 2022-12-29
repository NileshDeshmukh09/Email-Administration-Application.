import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department ;
    private int mailBoxCapacity;
    private String alternateEmail;

    // Constructor to receive the first and last Name 
    public Email ( String firstName , String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
       
        System.out.println("Email Created : " + this.firstName + " "+ this.lastName);

        // Call a method asking for the Department - return the Department
        this.department = setDepartment();
        System.out.println("Department is :" + this.department );
    }

    // Ask for the Department
    private String setDepartment(){
        System.out.print("Choose Department : \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \n Enter the Department : ");
        
        Scanner sc = new Scanner(System.in);

        int depChoice = sc.nextInt();

        if( depChoice == 1 ) return "Sales";
        else if( depChoice == 2 ) return "Development";
        else if( depChoice == 3 ) return "Accounting";
        else return "";

    }

    //Generate a Random password 

    // Set the mailbox Capacity


}