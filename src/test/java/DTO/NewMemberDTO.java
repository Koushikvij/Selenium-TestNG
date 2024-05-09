package DTO;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import utils.utilities.Dateformat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NewMemberDTO extends Faker
{
    //Constructor
    public NewMemberDTO(Locale locale)
    {
        super(locale);
    }
    //Constructor
    public NewMemberDTO()
    {
        super(new Locale("en-US")); //en-US //en-IND
    }


    public String EmployeeFirstName = name().firstName();
    public String SpouseFirstName = name().firstName();
    public String Child1FirstName = lordOfTheRings().character();
    public String Child2FirstName = harryPotter().character();
    public String EmployeeLastName = name().lastName();
    public String Email = EmployeeFirstName.toLowerCase() + "_" + EmployeeLastName.toLowerCase() + "_"+"@yopmail.com" ;
    public String MobileNum = number().digits(10);
    public String Role = String.valueOf(Roles.Interviewer);
    public String Address1 = address().streetAddress();
    public String Address2 = address().streetName();
    public String Location = String.valueOf(Country.India);

    public String Primary_SSN = idNumber().ssnValid();
    public String Spouse_SSN = idNumber().ssnValid();
    public String Child1_SSN = idNumber().ssnValid();
    public String Child2_SSN = idNumber().ssnValid();


    public  String City = address().state();
    List<String> States = Arrays.asList("Andaman and Nicobar Islands", "Andhra Pradesh", "Uttarakhand", "West Bengal", "Uttar Pradesh",
            "Tripura", "Telangana", "Tamil Nadu", "Sikkim", "Rajasthan", "Punjab", "Puducherry", "Odisha", "Nagaland", "Mizoram",
            "Meghalaya", "Manipur", "Maharashtra", "Madhya Pradesh", "Lakshadweep", "Kerala", "Karnataka", "Jharkhand", "Jammu and Kashmir",
            "Himachal Pradesh", "Haryana", "Gujarat", "West Bengal", "Bihar", "Assam");

    public String State = States.get(random().nextInt(States.size()));
    public String ZipCode = numerify("5####");
    public String Date = Dateformat.getDateInGivenFormat(java.time.LocalDate.now().toString(),"MM/dd/yyyy");
    public String Primary_DOB = Dateformat.getDateInGivenFormat(java.time.LocalDate.of(1975,05,22).toString(),"MM/dd/yyyy");
    public String Spouse_DOB = Dateformat.getDateInGivenFormat(java.time.LocalDate.of(1985,11,17).toString(),"MM/dd/yyyy");
    public String Child1_DOB = Dateformat.getDateInGivenFormat(java.time.LocalDate.of(2009,03,12).toString(),"MM/dd/yyyy");
    public String Child2_DOB = Dateformat.getDateInGivenFormat(java.time.LocalDate.of(2014,10,19).toString(),"MM/dd/yyyy");

    //CC Details
    public String Creditcard = finance().creditCard(CreditCardType.AMERICAN_EXPRESS);
    public String CC_Expiry = business().creditCardExpiry();

    //ACH Details
    public String RoutingNumber = "072403004" ;
    public String AccountNumber = "856667" ;


    public enum Country
    {
        India, USA
    }

    public enum Roles
    {
        Hiring_Manager("Hiring Manager"), HR_Manager("HR Manager"), Recruiter("Recruiter"), Candidate("Candidate"),
        Recruiting_Manager("Recruiting Manager"), CSM("CSM"), Employee("Employee"), Interviewer("Interviewer"),
        Executive("Executive"), Admin("Admin");

        private final String roles;
        private Roles(String roles)
        {
            this.roles = roles;
        }
        public String getRole(){
            return roles;
        }
    }


}
