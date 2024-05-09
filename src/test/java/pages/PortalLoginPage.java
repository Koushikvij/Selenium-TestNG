package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;
import utils.utilities.ValidationUtils;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PortalLoginPage {

    /**
     * Constructor
     */
    public PortalLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */
    @FindBy(id = "inputEmailAddress")
    private WebElement divinityUserName;
    @FindBy(id = "inputChoosePassword")
    private WebElement divinityPassword;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private WebElement divinityLogin;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='inputEmailAddress']"),
            @FindBy(how = How.XPATH, using = "//*[@id='email']"),
            @FindBy(how = How.ID, using = "email,"),
    })
    private List<WebElement> userName;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='inputChoosePassword']"),
            @FindBy(how = How.XPATH, using = "//input[@type='password']")
    })
    private List<WebElement> password;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]"),
            @FindBy(how = How.XPATH, using = "//button[contains(text(),'Log In')]")
    })
    private List<WebElement> login;
    @FindBy(xpath = "//*[@id='mainApp']")
    private WebElement dashboard;
    @FindBy(xpath = "//*[@class='menu-list']//a//img")
    private WebElement Divinity_Side_Menu;
//    @FindBy(xpath = "//div[contains(@class,'toast-error')]/div")
//    private WebElement errorMessage;
//    @FindBy(xpath = "//*[text()='Forgot password?']")
//    private WebElement forgetPasswordOption;
//    @FindBy(xpath = "//*[@class='title']")
//    private WebElement forgetPasswordHeader;
//    @FindBy(xpath = "//div[normalize-space()='< Back to login']")
//    private WebElement backToLoginOption;
//    @FindBy(xpath = "//*[@class='show_hide' and text()=' Show ']")
//    private WebElement toShowbutton;
//    @FindBy(xpath = "//*[@class='show_hide' and text()=' Hide ']")
//    private WebElement toHideButton;
//    @FindBy(xpath = "//button[contains(text(),'Submit')]")
//    private WebElement ForgetPasswordsubmitbutton;
//    @FindBy(xpath = "//small[normalize-space()='Email Address is required']")
//    private WebElement forgetPasswordPageErrorMessage;
//    @FindBy(xpath = "//input[@formcontrolname='email']")
//    private WebElement forgetPasswordEmail;
//    @FindBy(xpath = "//div[@role='alert']")
//    private WebElement successMessage;
//    @FindBy(xpath = "//*[@id='toast-container']//div[contains(@class,'toast-success') or contains(@class,'toast-error')]")
//    private WebElement Toaster_Container;
    @FindBy(xpath = "//ul[contains(@class,'nav-links')]")
    private WebElement SideMenu;
//    @FindBy(xpath = "//input[@id='email']")
//    private WebElement email;
//    @FindBy(xpath = "//input[@id='password']")
//    private WebElement pass;
//    @FindBy(xpath = "//button[normalize-space()='Sign In']")
//    private WebElement sign;
//    @FindBy(xpath = "//span[@class='role-name']")
//    private WebElement Role_Login;
//    @FindBy(xpath = "//*[@class='org-name']//img")
//    private WebElement Left_Group_Name;
//


    /**
     * Page Methods
     */

//    /**
//     * @Method_Description : validating the error message validation of Not registered user
//     * @Method_Name : ErrorMessageForNotRegisteredUser
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void ErrorMessageForNotRegisteredUser(String uname)
//    {
//        try {
//            Utilities.ActionClick(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.SendKeys(BaseTest.getDriver(), forgetPasswordEmail, uname);
//            Utilities.Click(BaseTest.getDriver(), ForgetPasswordsubmitbutton);
//            if (forgetPasswordPageErrorMessage.isDisplayed())
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Email Error message is showing in Forget password page",Status.PASS,
//                        "Successfully Email Error message is showing in Forget password page", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot(
//                        "Not Showing the error message in Forget password page", Status.FAIL,
//                        "Failed to showing the error message in Froget password page", true);
//            }
//        }
//        catch (Exception e)
//        {
//            ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMessageForNotRegisteredUser", Status.FAIL,
//                    "Exception found in Method - ErrorMessageForNotRegisteredUser",true, e);
//        }
//    }



    /**
     * @Method_Description : Login into the portal using Username and Password
     * @Method_Name : LogInToPortal
     * @Input_Parameters : String uname, String pwd
     * @Output_Parameters : String , String
     * @Modified_By : Kunal Kaviraj
     * @Modified_Date : 18/05/23
     **/
    public void LogInToPortal(String uname, String pwd)
    {
        try {
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), userName.get(0));
            Utilities.SendKeys(BaseTest.getDriver(), userName.get(0), uname);
            Utilities.SendKeys(BaseTest.getDriver(), password.get(0), pwd);
            Utilities.Click(BaseTest.getDriver(), login.get(0));
            //            DynamicWait.smallWait();
            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), this.dashboard);
            DynamicWait.smallWait();
            if (SideMenu.isDisplayed())
            {
                if (SideMenu.findElements(By.tagName("li")).size() > 0)
                    ExtentTestManager.createAssertTestStepWithScreenshot("Log Into Portal", Status.INFO,
                            "Successfully logged into the Portal", true);
                else
                {
                    BaseTest.getDriver().navigate().refresh();
                    Utilities.WaitForPageLoad(BaseTest.getDriver());
                    ExtentTestManager.createAssertTestStepWithScreenshot("Log Into Portal", Status.INFO,
                            "Successfully logged into the Portal", true);
                }
            }
            else
                BaseTest.getDriver().navigate().refresh();
            Utilities.WaitForPageLoad(BaseTest.getDriver());
        }
        catch (Exception e)
        {
            ExtentTestManager.createAssertTestStepWithScreenshot("LogInToPortal",
                    Status.FAIL, "Exception found in Method - LogInToPortal",true, e);
        }
    }

    /**
     * @Method_Description : Login into the portal using Username and Password
     * @Method_Name : LogInToDivinityAdminPortal
     * @Input_Parameters : String uname, String pwd
     * @Output_Parameters : String , String
     * @Modified_By : Kumar Vikash
     * @Modified_Date : 01/08/23
     **/
    public void LogInToDivinityAdminPortal(String uname, String pwd)
    {
        try {
            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), divinityUserName);
            Utilities.SendKeys(BaseTest.getDriver(), divinityUserName, uname);
            Utilities.SendKeys(BaseTest.getDriver(), divinityPassword, pwd);
            Utilities.Click(BaseTest.getDriver(), divinityLogin);

            DynamicWait.smallWait();
            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), this.Divinity_Side_Menu);
//            DynamicWait.smallWait();
//            if (Divinity_Side_Menu.isDisplayed())
//            {
//                if (Divinity_Side_Menu.findElements(By.tagName("li")).size() > 0)
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Log Into Portal", Status.INFO,
//                            "Successfully logged into the Portal", true);
//                else
//                {
//                    BaseTest.getDriver().navigate().refresh();
//                    Utilities.WaitForPageLoad(BaseTest.getDriver());
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Log Into Portal", Status.INFO,
//                            "Successfully logged into the Portal", true);
//                }
//            }
//            else
//                BaseTest.getDriver().navigate().refresh();
//
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
        }
        catch (Exception e)
        {
            ExtentTestManager.createAssertTestStepWithScreenshot("LogInToDivinityAdminPortal",
                    Status.FAIL, "Exception found in Method - LogInToDivinityAdminPortal",true, e);
        }
    }


//    /**
//     * @Method_Description : Verifying the Back to login option availability.
//     * @Method_Name : BackToLoginOption
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void BackToLoginOption() {
//        try
//        {
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.ActionClick(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), backToLoginOption);
//            String expectedString = "< Back to login";
//            if (backToLoginOption.getText().equals(expectedString))
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Back to Login option status", Status.INFO,
//                        "The page contains Back to Login option", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Back to Login option is not showing", Status.INFO,
//                        "The page does not contains Back to Login option", true);
//            }
//            Utilities.Click(BaseTest.getDriver(), backToLoginOption);
//
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("BackToLoginOption", Status.FAIL,
//                    "Exception found in Method - BackToLoginOption", true, e);
//        }
//    }
//
//
//
//    /**
//     * @Method_Description : Login with the already register user
//     * @Method_Name : AlreadyRegisteredUser
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void AlreadyRegisteredUser(String uname, String pwd)
//    {
//        try
//        {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            Utilities.Click(BaseTest.getDriver(), login);
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),this.dashboard);
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            if (dashboard.isDisplayed())
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("After Login", Status.INFO,
//                        "Logged in to the Portal and Home Page", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("After Login", Status.INFO,
//                        "Not Logged in to the Portal and Home Page", true);
//            }
//        }
//        catch (Exception e)
//        {
//            ExtentTestManager.createAssertTestStepWithScreenshot("AlreadyRegisteredUser", Status.FAIL,
//                    "Exception found in Method - AlreadyRegisteredUser", true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Login with the already register user with incorrect password
//     * @Method_Name : AlreadyRegisteredUserwithIncorrectPassword
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void AlreadyRegisteredUserwithIncorrectPassword(String uname, String pwd)
//    {
//        try
//        {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            Utilities.Click(BaseTest.getDriver(), toShowbutton);
//            Utilities.Click(BaseTest.getDriver(), login);
//            String error_message = "The Email and Password does not match. Please try again.";
//            if (errorMessage.isDisplayed())
//            {
//                if(errorMessage.getText().equals(error_message))
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Error Message is showing",Status.INFO,
//                        "Not Logged in to the Portal and showing the error message also " + error_message, true);
//
//                else
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Verify Error Message ",Status.INFO,
//                            "Error message shown is not correct -> " + errorMessage.getText(), true);
//            }
//            else
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Error Message is not showing",Status.INFO,
//                        " Logged in to the Portal page instead of showing the error message & stand in the Login page ",
//                        true);
//            }
//            ExtentTestManager.createAssertTestStepWithScreenshot("Incorrect Password", Status.PASS, "Not Logged in to the Portal", true);
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("AlreadyRegisteredUserwithIncorrectPassword", Status.FAIL,
//                    "Exception found in Method - AlreadyRegisteredUserwithIncorrectPassword at line number " + e.getStackTrace()[17].getLineNumber(),true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Login with the user with not registered user
//     * @Method_Name : LoginWithNonRegisteredUser
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void LoginwithNonRegisteredUser(String uname, String pwd) {
//        try
//        {
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            Utilities.Click(BaseTest.getDriver(), toShowbutton);
//            Utilities.Click(BaseTest.getDriver(), login);
//            if (ValidationUtils.CheckElementExists(errorMessage))
//            {
//                String error_message_Actual = errorMessage.getText();
//                String error_message_Expected = "Invalid login credentials, please try again.";
//                assertEquals(error_message_Actual, error_message_Expected);
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify correct error msg is shown", Status.PASS,
//                        "Correct error msg is shown as:  " + error_message_Actual, true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify correct error msg is shown", Status.FAIL,
//                        " InCorrect error msg is shown -> " + errorMessage.getText(), true);
//            }
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify if account is logged In ", Status.INFO,
//                    "Not Logged in to the Portal and Unable to locate the user", true);
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("LoginWithNonRegisteredUser", Status.FAIL,
//                    "Exception found in Method - LoginWithNonRegisteredUser", true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Login with the junk values of input
//     * @Method_Name : LoginWithJunkValues
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void LoginwithJunkValues(String uname, String pwd)
//    {
//        try
//        {
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            Utilities.Click(BaseTest.getDriver(), toShowbutton);
//            Utilities.Click(BaseTest.getDriver(), login);
//            if (ValidationUtils.CheckElementExists(errorMessage))
//            {
//                String error_message_Actual = errorMessage.getText();
//                String error_message_Expected = "Invalid login credentials, please try again.";
//                assertEquals(error_message_Actual, error_message_Expected);
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify correct error msg is shown", Status.PASS,
//                        "Correct error msg is shown as:  " + error_message_Actual, true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify correct error msg is shown", Status.FAIL,
//                        " InCorrect error msg is shown -> " + errorMessage.getText(), true);
//            }
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify if account is logged In ",Status.INFO,
//                    "Not Logged in to the Portal and Unable to locate the user", true);
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("LoginWithNonRegisteredUser", Status.FAIL,
//                    "Exception found in Method - LoginWithNonRegisteredUser", true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Entered the login credentials whether the password is masked
//     * @Method_Name : PasswordFieldMaskValidation
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void PasswordFieldMaskValidation(String uname, String pwd)
//    {
//        try
//        {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            assertEquals(password.getAttribute("type"), "password", "the Password is not masked");
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify password field is masked by default", Status.PASS,
//                    "Password field is masked", true);
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("PasswordFieldMaskValidation", Status.FAIL,
//                    "Exception found in Method - PasswordFieldMaskValidation",true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Entered the login credentials Un masking the password
//     * @Method_Name : PasswordFieldTaptoHidePasswordandMask
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void PasswordFieldTaptoHidePasswordandMask(String uname, String pwd) {
//        try {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify password field is masked - Before tapping",Status.INFO,
//                    "Before tapping the show button the password is masked", true);
//            Utilities.ActionClick(BaseTest.getDriver(), toShowbutton);
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), toHideButton);
//            assertEquals(toHideButton.getText().trim(), "Hide", "Verify password is unmasked after clicking Show");
//            ExtentTestManager.createAssertTestStepWithScreenshot("After tapping",Status.INFO,
//                    "After tapping the show button the password is unmasked", true);
//            Utilities.ActionClick(BaseTest.getDriver(), toHideButton);
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), toShowbutton);
//            assertEquals(toShowbutton.getText().trim(), "Show", "the Password is in hide Status");
//            ExtentTestManager.createAssertTestStepWithScreenshot("Again tapping",Status.INFO,
//                    "Again tapping the Hide button the password to be masked", true);
//            ExtentTestManager.createAssertTestStepWithScreenshot(toShowbutton.getText(), Status.INFO,
//                    "Hide option status", true);
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("PasswordFieldTaptoHidePasswordandMask", Status.FAIL,
//                    "Exception found in Method - PasswordFieldTaptoHidePasswordandMask", true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Entered the login credentials tapping to view the
//     * password
//     * @Method_Name : PasswordFieldTaptoViewPassword
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void PasswordFieldTaptoViewPassword(String uname, String pwd) {
//        try {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), userName);
//            Utilities.SendKeys(BaseTest.getDriver(), userName, uname);
//            Utilities.SendKeys(BaseTest.getDriver(), password, pwd);
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify password field is masked - Before tapping",Status.INFO,
//                    "Before tapping the show button the password is masked", true);
//            Utilities.ActionClick(BaseTest.getDriver(), toShowbutton);
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), toHideButton);
//            ValidationUtils.compareText(toHideButton, "Hide");
//            ExtentTestManager.createAssertTestStepWithScreenshot("Verify password field is unmasked -After tapping",Status.INFO,
//                    "After tapping the show button the password is unmasked", true);
//            ExtentTestManager.createAssertTestStepWithScreenshot(toHideButton.getText(), Status.INFO,
//                    "Hide option status", true);
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("PasswordFieldMaskValidation", Status.FAIL,
//                    "Exception found in Method - PasswordFieldMaskValidation", true, e);
//        }
//    }
//
//    /**
//     * @Method_Description : Navigating to forget password page from Login page
//     * @Method_Name : NavigateToForgetPasswordPage
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void NavigateToForgetPasswordPage() {
//        try
//        {
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.ActionClick(BaseTest.getDriver(), forgetPasswordOption);
//            String expectedString = "FORGOT PASSWORD";
//            if (forgetPasswordHeader.getText().trim().equals(expectedString)) {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify user navigates to Forget password page", Status.PASS,
//                        "Successfully navigated to Forget password page", true);
//            } else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify user navigates to Forget password page", Status.FAIL,
//                        "Failed navigated to Forget password page", true);
//            }
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("NavigateToForgetPasswordPage", Status.FAIL,
//                    "Exception found in Method - NavigateToForgetPasswordPage", true, e);
//        }
//    }
//
//
//    /**
//     * @Method_Description : Validating the error message in forget password page of Email
//     * @Method_Name : ErrorMessageValidationinForgetPasswordPage
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void ErrorMessageValidationofEmailinForgetPasswordPage()
//    {
//        try {
//            Utilities.ActionClick(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            String expectedString = "FORGOT PASSWORD";
//            if (forgetPasswordHeader.getText().equals(expectedString)) {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Forget password page",Status.PASS,
//                        "Successfully navigated to forget password page", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Not Navigated to Forget password page", Status.FAIL,
//                        "Failed navigated to Forget password page", true);
//            }
//            Utilities.Click(BaseTest.getDriver(), ForgetPasswordsubmitbutton);
//            String errorMsg = "Email Address is required" ;
//
//            if (forgetPasswordPageErrorMessage.isDisplayed())
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Email Error message is showing in Forget password page",Status.PASS,
//                        "Successfully Email Error message is showing in Forget password page",true);
//
//                if(!forgetPasswordPageErrorMessage.getText().equals(errorMsg))
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Verify Error Message", Status.WARNING,
//                            "Correct Error is not shown ->" + forgetPasswordPageErrorMessage.getText(),true );
//
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot(
//                        "Not Showing the error message in Forget password page", Status.FAIL,
//                        "Failed to showing the error message in Froget password page", true);
//            }
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMessageValidationinForgetPasswordPage", Status.FAIL,
//                    "Exception found in Method - ErrorMessageValidationinForgetPasswordPage",false, e);
//        }
//
//    }
//
//    /**
//     * @Method_Description : submitting the password reset mail
//     * @Method_Name : ValidationofSubmittingEmailingForgetPasswordPage
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void ValidationofsubmittingEmailinForgetPasswordPage(String uname) {
//        try {
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), forgetPasswordOption);
//            Utilities.ActionClick(BaseTest.getDriver(), forgetPasswordOption);
//            String expectedstring = "FORGOT PASSWORD";
//            if (forgetPasswordHeader.getText().equals(expectedstring)) {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Forget password page",Status.INFO,
//                        "Successfully navigated to Forget password page", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Not Navigated to Forget password page",Status.INFO,
//                        "Failed navigated to Forget password page", true);
//            }
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), forgetPasswordEmail);
//            Utilities.SendKeys(BaseTest.getDriver(), forgetPasswordEmail, uname);
//            Utilities.ActionClick(BaseTest.getDriver(), ForgetPasswordsubmitbutton);
//        }
//        catch (Exception e)
//        {
//            ExtentTestManager.createAssertTestStepWithScreenshot("ValidationofsubmittingEmailingForgetPasswordPage", Status.FAIL,
//                    "Exception found in Method - ValidationofsubmittingEmailinForgetPasswordPage",true, e);
//        }
//
//    }
//
//    /**
//     * @Method_Description : submitting the password reset mail and validating the success message
//     * @Method_Name : SuccessMessageValidationInForgetPasswordPage
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void ValidationfSubmittingEmailInForgetPasswordPageAndSuccessMessageValidation(String uname) {
//        try
//        {
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), forgetPasswordEmail);
//            Utilities.SendKeys(BaseTest.getDriver(), forgetPasswordEmail, uname);
//            Utilities.ActionClick(BaseTest.getDriver(), ForgetPasswordsubmitbutton);
//            String successMsg = "We have emailed your password reset link!" ;
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), successMessage);
//
//            if (successMessage.isDisplayed())
//            {
//                if(!successMessage.getText().isEmpty())
//                {
//                    Assert.assertEquals(successMessage.getText(),successMsg);
//                    ExtentTestManager.createAssertTestStepWithScreenshot( "Verify Success message is Displayed", Status.PASS,
//                            "Correct Success message is Displayed after submitting Email",true);
//                }
//                else
//                    ExtentTestManager.createAssertTestStepWithScreenshot( "Verify Success message is Displayed", Status.FAIL,
//                            "Success message dialog is Displayed but contains no text",true);
//
//                //Check Text Alignment
//                if(!successMessage.getCssValue("text-align").equals("start"))
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Check Success message is Start aligned",
//                            Status.WARNING, "Success message is not Start aligned",true);
//
//                //Check text colour
//                if(!Toaster_Container.getCssValue("background-color").equals("rgba(81, 163, 81, 1)"))
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Verify color of Success msg is Green",
//                            Status.WARNING, "Success msg color is not Green",true);
//                else
//                    ExtentTestManager.createAssertTestStepWithScreenshot("Verify color of Success msg is Green",
//                            Status.PASS, "Success msg color is Green",true);
//
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("Verify Success message is Displayed", Status.FAIL,
//                        "Success message not showing in forget password page while submitting the record", true);
//            }
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("ValidationofsubmittingEmailinForgetPasswordPage", Status.FAIL,
//                    "Exception found in Method - ValidationofsubmittingEmailinForgetPasswordPage",true, e);
//        }
//    }
//
//
//    /**
//     * @Method_Description : Login into the portal using Username and Password
//     * @Method_Name : LogInToPortal
//     * @Input_Parameters : String uname, String pwd
//     * @Output_Parameters : String , String
//     * @Modified_By : Kunal Kaviraj
//     * @Modified_Date : 18/05/23
//     **/
//    public void LogInToPortalafterReset(String email, String password) {
//        try {
//            ArrayList<String> tabs2 = new ArrayList<String>(BaseTest.getDriver().getWindowHandles());
//            BaseTest.getDriver().switchTo().window(tabs2.get(1));
//            Utilities.WaitForPageLoad(BaseTest.getDriver());
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), userName);
//            Utilities.SendKeys(BaseTest.getDriver(), userName, email);
//            Utilities.SendKeys(BaseTest.getDriver(), this.password, password);
//            Utilities.Click(BaseTest.getDriver(), login);
//            DynamicWait.longWait();
//            Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), this.dashboard);
//            if (dashboard.isDisplayed())
//            {
//                ExtentTestManager.createAssertTestStepWithScreenshot("dashboard Viewing Status - Pass", Status.INFO,
//                        "Successfully showing the Dashboard and Navigated to Home Page also", true);
//            }
//            else {
//                ExtentTestManager.createAssertTestStepWithScreenshot("dashboard Viewing Status - Fail", Status.INFO,
//                        "Not showing the Dashboard and Not Navigated to Home Page", true);
//            }
//        }
//        catch (Exception e) {
//            ExtentTestManager.createAssertTestStepWithScreenshot("ValidationofsubmittingEmailinForgetPasswordPage", Status.FAIL,
//                    "Exception found in Method - ValidationofsubmittingEmailinForgetPasswordPage", true, e);
//        }
//    }



}