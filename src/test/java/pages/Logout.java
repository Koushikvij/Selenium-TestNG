package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;
import java.time.Duration;
import static org.testng.Assert.assertEquals;

public class Logout{
	/**
	 * Constructor
	 */
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Web Elements
	 */
	@FindBy(xpath = "//*[@id='navbarDropdown']/img")
	private WebElement navDropDown;
	@FindBy(xpath = "//*[contains(text(),' Change Password')]")
	private WebElement changePassword;
	@FindBy(xpath = "//*[contains(text(),'Sign out')]")
	private WebElement signout;
	@FindBy(xpath = "//*[@class='breadcrumb-item' and text()='Dashboard']")
	private WebElement dashBoard_breadCrumb;
	@FindBy(xpath = "(//*[text()='Change Password'])[1]")
	private WebElement changePasswordHeader;
	@FindBy(xpath = "//*[@placeholder='Enter Old Password']")
	private WebElement oldPassword_Field;
	@FindBy(xpath = "//*[@placeholder='Enter New Password']")
	private WebElement NewPassword_Field;
	@FindBy(xpath = "//*[@placeholder='Re-enter New Password']")
	private WebElement reEnterNewPassword_Field;
	@FindBy(xpath = "//button[text()='Change Password']")
	private WebElement changePasswordButton;
	@FindBy(xpath = "//button[text()='Close']")
	private WebElement CloseButton;
	@FindBy(xpath = "//div[contains(text(),'please enter correct old password!')]")
	private WebElement oldPassword_Errmsg;
	@FindBy(xpath = "//*[@id='myModal']/div/div/div[2]/form/div[2]/div[2]/div/div")
	private WebElement NewPassword_Errmsg;
	@FindBy(xpath = "(//*[@class='errormsg'])[3]")
	private WebElement reEnterNewPassword_Errmsg;
	@FindBy(xpath = "//*[@aria-label='Password Changed Successfully!']")
	private WebElement successMessage_changePassword;
	@FindBy(xpath = "//small[contains(text(),'*Password must include')]")
	private WebElement passwordformat_overlay;
	@FindBy(xpath = "//*[@class='errormsg']")
	private WebElement mismatchErrorMessage;
	@FindBy(xpath = "(//*[@class='name'])[2]")
	private WebElement roleActual;

	/**
	 * Page Methods
	 */
	/**
	 * @Method_Description : Validating the toast message in the web site
	 * @Method_Name : validateToastMessage
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void validateToastMessage() {
		try {
			WebElement element = BaseTest.getDriver()
					.findElement(By.xpath("//*[@id='toast-container']//button[contains(@class,'toast-close-button')]"));
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			if (!element.isDisplayed() || !element.isEnabled())
				ExtentTestManager.createAssertTestStepWithScreenshot("Validate Toast Message", Status.FAIL,
						"Toast Message Element is not visible", true);
			else {
				BaseTest.getDriver().findElement(By.xpath("//div[@id='toast-container']//div[contains(@class,'toast-message')]"))
						.click();
				String toastMsgText = BaseTest.getDriver()
						.findElement(By.xpath("//div[@id='toast-container']//div[contains(@class,'toast-message')]"))
						.getText();
				if (toastMsgText.trim().toLowerCase().contains("failure"))
					ExtentTestManager.createAssertTestStepWithScreenshot("Validate Toast Message", Status.FAIL,
							"Toast Message - " + toastMsgText, true);
				else
					ExtentTestManager.createAssertTestStepWithScreenshot("Validate Toast Message", Status.PASS,
							"Toast Message - " + toastMsgText, true);
				Utilities.Click(BaseTest.getDriver(), element);
			}
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("validateToastMessage", Status.FAIL,
					"Exception found in Method - validateToastMessage", true, e);
		}
	}

	/**
	 * @Method_Description : Logout from the Admin portal web page
	 * @Method_Name : signOutAdminPortal
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void signOutAdminPortal() {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			DynamicWait.smallWait();
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),this.navDropDown);
			Utilities.Click(BaseTest.getDriver(), this.navDropDown);
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),this.signout);
			Utilities.ActionClick(BaseTest.getDriver(), this.signout);
			ExtentTestManager.createAssertTestStepWithScreenshot("Sign Out", Status.INFO,"Signed out of the portal",
					true);
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("signOutAdminPortal", Status.FAIL,
					"Exception found in Method - signOutAdminPortal", true, e);
		}
	}

	/**
	 * @Method_Description : Verifying the change password option availability
	 * @Method_Name : ChangePasswordAvailability
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void ChangePasswordAvailability() {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), navDropDown);
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(), signout);
			Utilities.MouseOver(BaseTest.getDriver(), signout);
			Utilities.JavaScriptClick(BaseTest.getDriver(), signout);
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.FAIL,
					"Exception found in Method - ChangePasswordAvailability", true, e);
		}
	}

	/**
	 * @Method_Description : Verifying the change password option availability and Selecting
	 * @Method_Name : SelectingChangePasswordButton
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void SelectingChangePasswordButton() {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is Available and select & navigated to the window also ",true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is not Available  ", true);
			}
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("SelectingChangePasswordButton", Status.FAIL,
					"Exception found in Method - SelectingChangePasswordButton", true, e);
		}
	}

	/**
	 * @Method_Description : Verify the fields available in Change password popup
	 * @Method_Name : ChangePasswordFieldAvailability
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void ChangePasswordFieldsAvailability() {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability",Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword",Status.INFO,
						"ChangePassword option is Available and select & navigated to the window also ",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword",Status.INFO,
						"ChangePassword option is not Available  ", true);
			}
			if (oldPassword_Field.isDisplayed() && NewPassword_Field.isDisplayed()
					&& reEnterNewPassword_Field.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword fields Availability",Status.INFO,
						"ChangePassword fields are Available ", true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword fields Availability",Status.INFO,
						"ChangePassword fields are not Available  ", true);
			}
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordFieldAvailability", Status.FAIL,
					"Exception found in Method - ChangePasswordFieldAvailability", true, e);
		}
	}

	/**
	 * @Method_Description : Verify user can change the password with incorrect old password
	 * @Method_Name : IncorrectOldPwdErrorMsgValidation
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void IncorrectOldPwdErrorMsgValidation(String oldpassword, String newpassword, String reEnterNewPassword) {
		try
		{
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability",Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword",Status.INFO,
						"ChangePassword option is Available and select & navigated to the window also ",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword",Status.INFO,
						"ChangePassword option is not Available  ", true);
			}
			Utilities.SendKeys(BaseTest.getDriver(), oldPassword_Field, oldpassword);
			Utilities.SendKeys(BaseTest.getDriver(), NewPassword_Field, newpassword);
			Utilities.SendKeys(BaseTest.getDriver(), reEnterNewPassword_Field, reEnterNewPassword);
			Utilities.ActionClick(BaseTest.getDriver(), changePasswordButton);
			if (oldPassword_Errmsg.isDisplayed())
			{
				ExtentTestManager.createAssertTestStepWithScreenshot("oldPassword_Errmsg", Status.PASS,
						"oldPassword_Error message is showing: ->  " + oldPassword_Errmsg.getText(), true );
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("oldPassword_Errmsg", Status.FAIL,
						"oldPassword_Error message is not showing ", true);
			}

		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("IncorrectOldPwdErrorMsgValidation", Status.FAIL,
					"Exception found in Method - IncorrectOldPwdErrorMsgValidation", true, e);
		}
	}

	/**
	 * @Method_Description : Verify user can change the password with correct old
	 *         password & invalid new passwords
	 * @Method_Name : IncorrectOldPwdErrorMsgValidation
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void ErrorMsgValidationInvalidNew_reEnter(String oldpassword, String newpassword, String reEnterNewPassword) {
		try
		{
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is Availabile and select & navigated to the window also ",true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is not Availabile  ", true);
			}
			Utilities.SendKeys(BaseTest.getDriver(), oldPassword_Field, oldpassword);
			Utilities.SendKeys(BaseTest.getDriver(), NewPassword_Field, newpassword);
			Utilities.SendKeys(BaseTest.getDriver(), reEnterNewPassword_Field, reEnterNewPassword);
			if (NewPassword_Errmsg.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("NewPassword_Errmsg ", Status.INFO,
						"NewPassword_Errmsg message is showing: ->  " + NewPassword_Errmsg.getText(),
						true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("NewPassword_Errmsg", Status.INFO,
						"NewPassword_Errmsg message is not showing ", true);
			}
			ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMsgValidationInvalidNew_reEnter", Status.INFO,
					"ErrorMsgValidationInvalidNew_reEnter messages are Availabile ", true);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMsgValidationInvalidNew_reEnter", Status.FAIL,
					"Exception found in Method - ErrorMsgValidationInvalidNew_reEnter", true, e);
		}
	}

	/**
	 * @Method_Description : Verify user can change the password with correct old
	 *         password & valid new password
	 * @Method_Name : successfullyChangedPassword
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void successfullyChangedPassword(String oldpassword, String newpassword, String reEnterNewPassword) {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is Availabile and select & navigated to the window also ",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is not Availabile  ", true);
			}
			Utilities.SendKeys(BaseTest.getDriver(), oldPassword_Field, oldpassword);
			Utilities.SendKeys(BaseTest.getDriver(), NewPassword_Field, newpassword);
			Utilities.SendKeys(BaseTest.getDriver(), reEnterNewPassword_Field, reEnterNewPassword);
			Utilities.ActionClick(BaseTest.getDriver(), changePasswordButton);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			if (successMessage_changePassword.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("successMessage_changePassword ", Status.INFO,
						"successMessage_changePassword message is showing: ->  "
								+ successMessage_changePassword.getText(),	true);
			}
			else {
				ExtentTestManager.createAssertTestStepWithScreenshot("successMessage_changePassword", Status.INFO,
						"successMessage_changePassword message is not showing ", true);
			}
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("successfullyChangedPassword", Status.FAIL,
					"Exception found in Method - successfullyChangedPassword", true, e);
		}
	}

	/**
	 * @Method_Description : Verify the password format message is displayed in the bottom of the overlay
	 * @Method_Name : successfullyChangedPasswordwithValidation
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void PasswordFormat_Overlay() {
		try {
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),passwordformat_overlay);
			if (passwordformat_overlay.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("Password Format Display Status", Status.INFO,
						"Password format message is showing: ->  "+ passwordformat_overlay.getText(),true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("PasswordFormat_Overlay", Status.INFO,
						"PasswordFormat_Overlay message is not showing ", true);
			}
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("PasswordFormat_Overlay", Status.FAIL,
					"Exception found in Method - PasswordFormat_Overlay", true);
		}
	}

	/**
	 * @Method_Description : Verify the error message when new password & re-enter new password data is not matched
	 * @Method_Name : ErrorMsgValidationPwdMismatch
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void ErrorMsgValidationPwdMismatch(String oldpassword, String newpassword, String reEnterNewPassword) {
		try
		{
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(9));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.ActionClick(BaseTest.getDriver(), navDropDown);
			String expected = "Change Password";
			String actual = changePassword.getText();
			assertEquals(actual, expected);
			ExtentTestManager.createAssertTestStepWithScreenshot("ChangePasswordAvailability", Status.INFO,
					"ChangePassword option is Availabile ", true);
			Utilities.ActionClick(BaseTest.getDriver(), changePassword);
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.WaitTillElementDisplayed(BaseTest.getDriver(),changePasswordHeader);
			if (changePasswordHeader.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is Availabile and select & navigated to the window also ",
						true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("changePassword", Status.INFO,
						"ChangePassword option is not Availabile  ", true);
			}
			Utilities.SendKeys(BaseTest.getDriver(), oldPassword_Field, oldpassword);
			Utilities.SendKeys(BaseTest.getDriver(), NewPassword_Field, newpassword);
			Utilities.SendKeys(BaseTest.getDriver(), reEnterNewPassword_Field, reEnterNewPassword);
			if (mismatchErrorMessage.isDisplayed()) {
				ExtentTestManager.createAssertTestStepWithScreenshot("mismatchErrorMessage ", Status.INFO,
						"mismatchErrorMessage message is showing: ->  " + mismatchErrorMessage.getText(),true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("mismatchErrorMessage", Status.INFO,
						"mismatchErrorMessage message is not showing ", true);
			}
			ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMsgValidationPwdMismatch", Status.INFO,
					"ErrorMsgValidationPwdMismatch message is Availabile ", true);
		}
		catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("ErrorMsgValidationPwdMismatch", Status.FAIL,
					"Exception found in Method - ErrorMsgValidationPwdMismatch", true, e);
		}
	}
	
	/**
	 * @Method_Description : Verify user login as group admin with existing credentials 
	 * @Method_Name : signOutAdminRoleVerification
	 * @Modified_By : Kunal Kaviraj
	 * @Modified_Date : 18/05/23
	 **/
	public void signOutAdminRoleVerification() {
		try {
			String roleExpected = "Admin";
			WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(navDropDown));
			Utilities.WaitForPageLoad(BaseTest.getDriver());
			Utilities.Click(BaseTest.getDriver(), navDropDown);
			if (roleActual.getText().equalsIgnoreCase(roleExpected)) {
				ExtentTestManager.createAssertTestStepWithScreenshot("role page Navigation Status", Status.INFO,
						"role page is Navigated Successfully and admin role is showing", true);
			} else {
				ExtentTestManager.createAssertTestStepWithScreenshot("role page Navigation Status - Fail", Status.INFO,
						"role is Not Navigated", true);
			}
		} catch (Exception e) {
			ExtentTestManager.createAssertTestStepWithScreenshot("signOutAdminRoleVerification", Status.FAIL,
					"Exception found in Method - signOutAdminRoleVerification", true, e);
		}
	}
}