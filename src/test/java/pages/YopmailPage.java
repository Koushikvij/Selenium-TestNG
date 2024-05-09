package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;
import utils.utilities.ValidationUtils;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;

public class YopmailPage {
	/**
	 * Constructor
	 */
	public YopmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * Web Elements
	 */
	@FindBy(xpath = "//*[@id='login']")
	private WebElement Email_Field;
	@FindBy(xpath = "//*[@id='login']")
	private WebElement Email;
	@FindBy(xpath = "//*[@id='login']")
	private WebElement ClearButton;
	@FindBy(xpath = "//*[@id='refreshbut']")
	private WebElement submitButton;
	@FindBy(xpath = "//*[@id=\"refresh\"]")
	private WebElement refreshButton;
	@FindBy(xpath = "//*[@class='ellipsis nw b f18']")
	private WebElement receivedmailNotificationHeader;
	@FindBy(xpath = "//*[@id='mail']/div/div/div[2]/p/a")
	private WebElement receivedmailLink;
	@FindBy(xpath = "//*[@id='mail']/div/h1")
	private WebElement QuoteReceiptName;
	@FindBy(xpath = "//*[@id='mail']/div/div[1]/div[2]/p/text()[4]")
	private WebElement ProductName;
	@FindBy(xpath = "//*[@formcontrolname='email']")
	private WebElement PasswordResetPage_Email;
	@FindBy(xpath = "//*[text()='Create Password']")
	private WebElement PasswordResetPage_CreatePassword;

	/**
	 * @Method_Description : Launching the URL of YOPmail
	 * @Method_Name : MailURl
	 * @Input_Parameters : NA
	 * @Output_Parameters : NA
	 * @Modified_By : Suraj Tiwari
	 * @Modified_Date : 18/05/23
	 **/
	public void MailURl() {
		try {
			String MailUrl = "https://yopmail.com/en/";
			BaseTest.getDriver().navigate().to(MailUrl);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("MailURl", Status.FAIL,
					"Exception found in Method - MailURl", true, e);
		}
	}

	/**
	 * @Method_Description : Clearing the already entered text and Entered the Email
	 * @Method_Name : EraseAfterEnterMailAddress
	 * @Input_Parameters : String username
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void EraseAfterEnterMailAddress(String username) {
		try {
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),Email);
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, username);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.ActionClick(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailNotificationHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Password reset mail received",
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page not laucnhed and Entered into Some ohter page", true);
			}
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("EraseAfterEnterMailAddress", Status.FAIL,
					"Exception found in Method - EraseAfterEnterMailAddress", true, e);
		}
	}

	/**
	 * @Method_Description : Verifying the Reset mail available in Mail
	 * @Method_Name : VerificationofResetLinkAvailableinMail
	 * @Input_Parameters : String username
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void VerificationofResetLinkAvailableinMail(String username) {
		try
		{
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),Email);
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, username);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.ActionClick(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailLink.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Body of the Mail", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Password reset mail received -> reset mail link also Available",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page is not contains the Password Reset Link", true);
			}
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("VerificationofResetLinkAvailableinMail", Status.WARNING,
					"Exception found in Method - VerificationofResetLinkAvailableinMail", true, e);
		}
	}

	/**
	 * @Method_Description : Tapping the Reset mail available in Mail
	 * @Method_Name : VerificationofResetLinkAvailableinMail
	 * @Input_Parameters : String username
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void TappingthePasswordResetLinkinMail(String username)
	{
		try
		{
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),Email);
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, username);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.ActionClick(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			Utilities.Click(BaseTest.getDriver(),refreshButton);
			DynamicWait.smallWait();
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailLink.isDisplayed()) {
				Utilities.Click(BaseTest.getDriver(), receivedmailLink);
				ExtentTestManager.createAssertTestStepWithScreenshot("Body of the Mail", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Password reset mail received -> reset mail link also Available",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page is not contains the Password Reset Link", true);
			}
			Utilities.Click(BaseTest.getDriver(), receivedmailLink);
			ValidationUtils.switchTab(BaseTest.getDriver(),1);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("TappingthePasswordResetLinkinMail", Status.FAIL,
					"Exception found in Method - TappingthePasswordResetLinkinMail", true, e);
		}
	}

	/**
	 * @Method_Description : Mail receives verification after submitting the Get Quote
	 * @Method_Name : VerificationofMailReceivesGetQuote
	 * @Input_Parameters : String eMail
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void VerificationofMailReceivesGetQuote_User(String firstName, String lastName, String eMail) {
		try {
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, eMail);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.Click(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailNotificationHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Get Quote mail received",
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("User Mail Page", Status.INFO,
						"The Mail page not launched and Entered into Some other page", true);
			}
			String Expected = "Hi " + firstName + " " + lastName + ",";
			String Actual = this.QuoteReceiptName.getText();
			assertEquals(Actual, Expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("User Mail Page", Status.INFO,
					"Mail has been received from the respective one = " + Expected, true);
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("VerificationofMailReceivesGetQuote_User", Status.FAIL,
					"Exception found in Method - VerificationofMailReceivesGetQuote_User", true, e);
		}
	}
	/**
	 * @Method_Description : Mail receives verification after submitting the Get Quote
	 * @Method_Name : VerificationofMailReceivesGetQuote_Individual Health
	 * @Input_Parameters : String eMail
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void VerificationofMailReceivesGetQuote_IndividualHealth_User(String individualLegalName, String eMail) {
		try {
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, eMail);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.Click(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailNotificationHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Get Quote mail received",
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("User Mail Page", Status.INFO,
						"The Mail page not launch and Entered into Some other page", true);
			}
			String Expected = "Hi " + individualLegalName + " " + ",";
			String Actual = this.QuoteReceiptName.getText();
			assertEquals(Actual, Expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("User Mail Page", Status.INFO,
					"Mail has been received from the respective one = " + Expected, true);
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("VerificationofMailReceivesGetQuote_User", Status.FAIL,
					"Exception found in Method - VerificationofMailReceivesGetQuote_User", true, e);
		}
	}
	/**
	 * @Method_Description : Mail receives verification after submitting the Get
	 *         Quote in Admin mail
	 * @Method_Name : VerificationofMailReceivesGetQuote_Admin
	 * @Input_Parameters : String eMail
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void VerificationofMailReceivesGetQuote_Admin(String firstName, String lastName, String adminMail) {
		try {
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, adminMail);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.Click(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Admin Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			if (receivedmailNotificationHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Admin Mail Page", Status.INFO,
						"The Mail page laucnhed -> Entered into the Inbox -> Get Quote mail received",
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("VerificationofMailReceivesGetQuote_Admin",
						Status.FAIL, "Exception found in Method - VerificationofMailReceivesGetQuote_Admin - "
								+ BaseTest.getDriver(), true);
				ExtentTestManager.createAssertTestStepWithScreenshot("Admin Mail Page", Status.INFO,
						"The Mail page not launched and Entered into Some other page", true);
			}
			ExtentTestManager.createAssertTestStepWithScreenshot("Admin Mail Page", Status.INFO,
					"Mail has been received from the respective one = ", true);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("VerificationofMailReceivesGetQuote_Admin",
					Status.FAIL,
					"Exception found in Method - VerificationofMailReceivesGetQuote_Admin", true, e);
		}
	}


	/**
	 * @Method_Description : Verifying the Reset mail available in Mail
	 * @Method_Name : VerificationWelcomeMail
	 * @Input_Parameters : String username
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public  void VerificationWelcomeMailandResetMailLink(String username) {
		try {
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),Email);
			this.Email.clear();
			Utilities.SendKeys(BaseTest.getDriver(), Email, username);
			ExtentTestManager.createAssertTestStepWithScreenshot("username Entered", Status.INFO,
					"Entering the username (mail address) into the username box", true);
			Utilities.ActionClick(BaseTest.getDriver(), submitButton);
			ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
					"Successfully navigated to the Mail Home page", true);
			BaseTest.getDriver().switchTo().frame("ifmail");
			String ExpectedWelcomeText = "ARK Group Welcome Email";
			String ActualWelcomeText = "ARK Group Welcome Email";
			if (ExpectedWelcomeText.equals(ActualWelcomeText)) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Welcome Mail Receiving Status - Pass", Status.INFO,
						"The Mail page launched -> Entered into the Inbox -> Password reset mail received -> " +
								"reset mail link also Available",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("Welcome Mail Receiving Status - Fail", Status.INFO,
						"The Mail page is not contains the Password Reset Link", true);
			}
			if (receivedmailLink.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Body of the Mail", Status.INFO,
						"The Mail page launched -> Entered into the Inbox -> Password reset mail received ->" +
								" reset mail link also Available",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("Mail Page", Status.INFO,
						"The Mail page is not contains the Password Reset Link", true);
			}
			Utilities.Click(BaseTest.getDriver(), receivedmailLink);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("VerificationWelcomeMail", Status.FAIL,
					"Exception found in Method - VerificationWelcomeMail", true, e);
		}
	}
	/**
	 * @Method_Description : Verify Email Id is Auto Populated when user tap on set password link
	 * @Method_Name : AutoPopulatedMailVerification
	 * @Input_Parameters : String username
	 * @Output_Parameters : String
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void AutoPopulatedMailVerification(String Email) {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(BaseTest.getDriver().getWindowHandles());
			BaseTest.getDriver().switchTo().window(tabs2.get(1));
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),PasswordResetPage_CreatePassword);
			String ActualEmail = PasswordResetPage_Email.getAttribute("value");
			if (Email.equals(ActualEmail)) {
				ExtentTestManager.createAssertTestStepWithScreenshot("AutoPopulated Email Verification Status - Pass", Status.INFO,
						"The Auto Populated the Respective Mail Box is Displayed and Respective Mail also Same",
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("AutoPopulated Email Verification Status - Fail", Status.INFO,
						"Not showing Auto Populated the Respective Mail Box and The Mail is different", true);
			}

		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("AutoPopulatedMailVerification", Status.FAIL,
					"Exception found in Method - AutoPopulatedMailVerification", true, e);
		}
	}
}