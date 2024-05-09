package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;

public class HavanaLoginPage {

    /**
     * Constructor
     */
    public HavanaLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */

    @FindBy(xpath = "//*[@id='username']")
    private WebElement userName;

    @FindBy(xpath = "/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/div[4]/form/div[2]/button")
    private WebElement nextBtn;

    @FindBy(xpath = "/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/div[4]/form/div[2]/div/div/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/div[4]/form/div[3]/button")
    private WebElement loginButton;

    @FindBy(xpath="/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/div[4]/form/div[2]/div/div/span/a")
    private WebElement togglePasswordButton;

    @FindBy(xpath ="/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/form/div[4]/h6")
    private WebElement forgotPasswordBtn;

    @FindBy(xpath ="/html/body/app-root/app-forgotpassword/div/div/div[2]/div/form/div[1]/div[2]/input")
    private WebElement emailInputInForgotPassword;

    @FindBy(xpath = "/html/body/app-root/app-forgotpassword/div/div/div[2]/div/form/div[3]")
    private WebElement backToLoginFromForgotPasswordPage;

    @FindBy(xpath = "//*[@id='toast-container']/div")
    private WebElement toastMsgInForgotPasswordPage;

    @FindBy(xpath = "/html/body/app-root/app-forgotpassword/div/div/div[2]/div/form/div[2]/button")
    private WebElement submitButtonFromForgotPasswordPage;


    /**
     * @Method_Description: Check if the user is able to login with the correct username and password
     * @Method_Name: verifyLoginWithCorrectCredentials
     * @Input_Parameters: String correctUname, String correctPwd, String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Jerish Balakrishnan
     * @Modified_Date: 01/04/2024
     */
    public void verifyLoginWithCorrectCredentials(String correctUname, String correctPwd, String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            password.clear();
            Utilities.SendKeys(driver, password, correctPwd);
            Utilities.Click(driver, loginButton);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyLoginWithCorrectCredentials",
                        Status.WARNING, "User is not able to login with correct credentials.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyLoginWithCorrectCredentials",
                        Status.PASS, "User is able to login with correct credentials.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyLoginWithCorrectCredentials",
                    Status.FAIL, "Exception found in Method - verifyLoginWithCorrectCredentials", true, e);
        }
    }
    /**
     * @Method_Description: Check password is visible when the user click on show password button.
     * @Method_Name: TC_Login_07
     * @Input_Parameters: String correctUname, String correctPwd
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 01/04/2024
     */
    public void TC_Login_07(String correctUname,String correctPwd){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            password.clear();
            Utilities.SendKeys(driver, password, correctPwd);
            Utilities.Click(driver,togglePasswordButton);
            String fieldType = password.getAttribute("type");
            DynamicWait.smallWait();

            if ("text".equals(fieldType)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordShowButton",
                        Status.PASS, "Password is displayed after clicking the 'show' button.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordShowButton",
                        Status.WARNING, "Password is not displayed after clicking the 'show' button.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordShowButton",
                    Status.FAIL, "Exception found in Method - verifyPasswordShowButton", true, e);
        }

    }

    /**
     * @Method_Description: Check password is masked when the user click on hide password button.
     * @Method_Name: TC_Login_08
     * @Input_Parameters: String correctUname, String correctPwd
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 02/04/2024
     */
    public void TC_Login_08(String correctUname,String correctPwd){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            password.clear();
            Utilities.SendKeys(driver, password, correctPwd);
            Utilities.Click(driver,togglePasswordButton);
            Utilities.Click(driver,togglePasswordButton);
            DynamicWait.smallWait();
            String fieldType = password.getAttribute("type");

            if ("password".equals(fieldType)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordHideButton",
                        Status.PASS, "Password is masked after clicking the 'hide' button.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordHideButton",
                        Status.WARNING, "Password is still displaying after clicking the 'hide' button.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyPasswordShowButton",
                    Status.FAIL, "Exception found in Method - verifyPasswordShowButton", true, e);
        }

    }
    /**
     * @Method_Description: User would navigate to forgotPassword page.
     * @Method_Name: TC_Login_09
     * @Input_Parameters: String forgotPwdURl,String correctUname
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 02/04/2024
     */

    public void TC_Login_09(String forgotPwdURL,String correctUname){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            // password.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            //Clicks forgot password page
            Utilities.Click(driver,forgotPasswordBtn);
            DynamicWait.smallWait();
            String currentUrl = driver.getCurrentUrl();

            if (forgotPwdURL.equals(currentUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Forgot password page check",
                        Status.PASS, "User is navigated to forgot password page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Forgot password page check",
                        Status.WARNING, "User is not navigated to Forgot Password page", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Forgot password page check",
                    Status.FAIL, "Exception found in Method - Forgot password page check", true, e);
        }

    }
    /**
     * @Method_Description: User would navigate to forgotPassword page and check the visibility of email input field.
     * @Method_Name: TC_Login_13
     * @Input_Parameters: String correctUname
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 02/04/2024
     */
    public void TC_Login_13(String correctUname){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            // password.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            //Clicks forgot password page
            Utilities.Click(driver,forgotPasswordBtn);
            DynamicWait.smallWait();

            if (emailInputInForgotPassword.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Email input field in Forgot password page check",
                        Status.PASS, "Input Field for email in forgot password page is displayed.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Email input field in Forgot password page check",
                        Status.WARNING, "User is not navigated to Forgot Password page", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Email input field in Forgot password page check",
                    Status.FAIL, "Exception found in Method - Email input field in Forgot password page check", true, e);
        }

    }
    /**
     * @Method_Description: User would navigate to forgot password page and check the visibility of back to login link.
     * @Method_Name: TC_Login_14
     * @Input_Parameters: String correctUname
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 02/04/2024
     */
    public void TC_Login_14(String correctUname){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            // password.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            //Clicks forgot password page
            Utilities.Click(driver,forgotPasswordBtn);
            DynamicWait.smallWait();

            if (backToLoginFromForgotPasswordPage.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Back to login link is displayed",
                        Status.PASS, "Back to login link is visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Back to login link is displayed",
                        Status.WARNING, "Back to login link is not visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Back to login page is displayed",
                    Status.FAIL, "Exception found in Method - Back to login page is displayed", true, e);
        }

    }
    /**
     * @Method_Description: User would navigate from forgotPassword page to login page.
     * @Method_Name: TC_Login_15
     * @Input_Parameters: String correctUname, String LoginURL
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 02/04/2024
     */
    public void TC_Login_15(String correctUname, String LoginURL){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            // password.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            //Clicks forgot password page
            Utilities.Click(driver,forgotPasswordBtn);
            DynamicWait.smallWait();
            Utilities.Click(driver,backToLoginFromForgotPasswordPage);
            String currentURL = driver.getCurrentUrl();

            if (LoginURL.equals(currentURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Back to Login page from forgot password page",
                        Status.PASS, "Login page is displayed.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Back to Login page from forgot password page",
                        Status.WARNING, "Login page is not displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Back to Login page from forgot password page",
                    Status.FAIL, "Exception found in Method - Back to Login page from forgot password page", true, e);
        }

    }
    /**
     * @Method_Description: User would navigate to forgotPassword page and input an email which is not registered.
     * @Method_Name: TC_Login_16
     * @Input_Parameters: String correctUname, String incorrectEmail
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 03/04/2024
     */
    public void TC_Login_16(String correctUname, String incorrectEmail){

        WebDriver driver = BaseTest.getDriver();
        try {
            userName.clear();
            // password.clear();
            Utilities.SendKeys(driver, userName, correctUname);
            Utilities.Click(driver, nextBtn);
            Utilities.WaitTillElementDisplayed(driver, password);
            //Clicks forgot password page
            Utilities.Click(driver,forgotPasswordBtn);
            DynamicWait.smallWait();
            Utilities.SendKeys(driver,emailInputInForgotPassword, incorrectEmail);
            Utilities.Click(driver,submitButtonFromForgotPasswordPage);

            if (toastMsgInForgotPasswordPage.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Enter Incorrect email from forgot password page",
                        Status.PASS, "Email is invalid is displayed as flash message.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Enter Incorrect email from forgot password page",
                        Status.WARNING, "Email is invalid is not displayed as flash message", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Enter Incorrect email from forgot password page",
                    Status.FAIL, "Exception found in Method - Back to Login page from forgot password page", true, e);
        }

    }

}
