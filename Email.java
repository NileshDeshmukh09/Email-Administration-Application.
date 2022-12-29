import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department ;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String CompanySuffix = "nsdcompany.com";

    // Constructor to receive the first and last Name 
    public Email ( String firstName , String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the Department - return the Department
        this.department = setDepartment();

        // Call a methods which return the random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password : " + this.password );

        // Combine elements to generate Emails 
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + CompanySuffix;
    }

    // Ask for the Department
    private String setDepartment(){
        System.out.print("New Worker : " + firstName + "." + " DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nEnter Department CODE : ");
        
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
    public void setMailboxCapacity( int capacity ){
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email 
    public void setAlternateEmail( String altEmail ){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword( String password ){
        this.password = password;
    }

    public int getMailboxCapacity(){ return mailBoxCapacity; }
    public String getAlternateEmail(){ return alternateEmail; }
    public int getPassword(){ return mailBoxCapacity; }

    public String showInfo(){
        return "DISPLAY NAME : " + firstName + " " + lastName +
            "\nCOMPANY NAME : " + email + 
            "\nMAILBOX CAPACITY : " + mailBoxCapacity + " mb";
    }

}