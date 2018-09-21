import java.util.*;

public class Lab2_Mataga_CarlJeric{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		var lastName = "N/A";
		var firstName = "N/A";
		var middleName = "N/A";
		var birthDate = "N/A";
		var martialStatus = "N/A";
		var homeAddress = "N/A";
		var provincialAddress = "N/A";
		var mobileNumber = "N/A";
		var landLineNumber = "N/A";
		var emailAddress = "N/A";
		var tertiary = "N/A";
		var secondary = "N/A";
		var primary = "N/A";
		
		System.out.println("Curriculum Vitae\n");
		System.out.println("Instructions: Input your information, and the compilation will be at the end.");
		System.out.println("If the whole line is not applicable, just press enter.\n");
		System.out.println("Personal Information");
		System.out.println("Please Input Your Last Name");
		lastName = input.nextLine();
		System.out.println("Please Input Your First Name");
		firstName = input.nextLine();
		System.out.println("Please Input Your Middle Name");
		middleName = input.nextLine();
		System.out.println("Please Input Your Birthdate");
		birthDate = input.nextLine();
		System.out.println("Please Input Your Martial Status");
		martialStatus = input.nextLine();
		System.out.println("Please Input Your Home Address");
		homeAddress = input.nextLine();
		System.out.println("Please Input Your Provinicial Address");
		provincialAddress = input.nextLine();
		System.out.println(" ");
		System.out.println("Contact Details");
		System.out.println("Please Input Your Mobile Number - If multiple, format: number/number/etc");
		mobileNumber = input.nextLine();
		System.out.println("Please Input Your Landline Number - If multiple, format: number/number/etc");
		landLineNumber = input.nextLine();
		System.out.println("Please Input Your E-mail Address - If multiple, format: e-mail/e-mail/etc");
		emailAddress = input.nextLine();
		System.out.println(" ");
		System.out.println("Education History");
		System.out.println("Please Input Your Tertiary School Information - Format (Course, School, Inclusive Years, Honors Received)");
		tertiary = input.nextLine();
		System.out.println("Please Input Your Secondary School Information - Format (School, Inclusive Years, Honors Received)");
		secondary = input.nextLine();
		System.out.println("Please Input Your Primary Information - Format (School, Inclusive Years, Honors Received)");
		primary = input.nextLine();
		
		System.out.println("Here is your curriculum vitae:");
		System.out.println(" ");
		System.out.println("                    CV                    ");
		System.out.println("Personal Information");
		System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
		System.out.println("Birthdate: " + birthDate);
		System.out.println("Martial Status: " + martialStatus);
		System.out.println("Home Address: " + homeAddress);
		System.out.println("Provincial Address: " + provincialAddress + "\n");
		System.out.println("Contact Details");
		System.out.println("Mobile Number(s): " + mobileNumber);
		System.out.println("Landline Number(s): " + landLineNumber);
		System.out.println("E-mail Address(es): " + emailAddress + "\n");
		System.out.println("Education History");
		System.out.println("Tertiary: " + tertiary);
		System.out.println("Secondary: " + secondary);
		System.out.println("Primary: " + primary);
	}
}