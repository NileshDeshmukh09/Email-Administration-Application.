

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
    }

    // Ask for the Department
    private String setDepartment(){
        System.out.print("Enter the Department : \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
        
    }

    //Generate a Random password 

    // Set the mailbox Capacity


}