import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department ;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String CompanySuffix = "nsdcompany.com";

    // Constructor to receive the first and last Name 
    public Email ( String firstName , String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
       
        System.out.println("Email Created : " + this.firstName + " "+ this.lastName);

        // Call a method asking for the Department - return the Department
        this.department = setDepartment();
        System.out.println("Department is : " + this.department );

        // Call a methods which return the random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password : " + this.password );

        // Combine elements to generate Emails 
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + CompanySuffix;
        System.out.println("Your Email is : " + email );
    }

    // Ask for the Department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nEnter Department CODE : ");
        
        Scanner sc = new Scanner(System.in);

        int depChoice = sc.nextInt();

        if( depChoice == 1 ) return "sales";
        else if( depChoice == 2 ) return "development";
        else if( depChoice == 3 ) return "accounting";
        else return "none";

    }

    //Generate a Random password 

    private String randomPassword( int length ){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$&*";

        char[] password = new char[length];
        for(int i=0 ; i<length ; i++){
            int rand = ( int ) ( Math.random() * passwordSet.length() );
            password[i] = passwordSet.charAt(rand);
        }
        return new String( password );
    }

    // Set the mailbox Capacity


}