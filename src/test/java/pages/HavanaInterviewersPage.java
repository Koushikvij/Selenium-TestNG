package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;

import java.io.File;
import java.util.List;
import java.util.Random;

public class HavanaInterviewersPage {

    /**
     * Constructor
     */
    public HavanaInterviewersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */

    @FindBy(xpath = "//*[@id='visible-content']/div/app-interviewers/div[1]/nav/ol/li")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-interviewers/div[1]/button")
    private WebElement addInterviewerButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInputField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement sendEmailButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement interviewersTable;

    @FindBy(xpath = "//*[@id='resume-width']")
    private WebElement chooseResumeFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[2]/div[1]/div/select")
    private WebElement countrySelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[2]/div[2]/div/input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[2]/div[3]/div/input")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[3]/div[1]/div/input")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[3]/div[2]/div/input")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[5]/div[3]/div/textarea")
    private WebElement notesInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[6]/div/div/div/div/div[1]/input")
    private WebElement notesAttachmentFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[2]/form/div/div[7]/div/div/div/div/div/div[1]/input")
    private WebElement documentsAttachmentFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addinterviewers/div[3]/button[2]")
    private WebElement addInterviewerSaveBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-interviewers/p-toast/div/p-toastitem/div/div/div/div[2]")
    private WebElement toastMessage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[1]/input")
    private WebElement firstInterviewerCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[6]/div/a")
    private WebElement firstInterviewerEmailAddress;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewers/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[11]/span/i")
    private WebElement firstInterviewerUpdateIcon;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateinterviewers/div[2]/form/div/div[1]/div[1]/div/select")
    private WebElement updateInterviewerCountrySelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateinterviewers/div[2]/form/div/div[2]/div[3]/div/div[1]/div/select")
    private WebElement updateInterviewerStatusSelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateinterviewers/div[2]/form/div/div[4]/div[3]/div/select")
    private WebElement updateInterviewerGenderSelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateinterviewers/div[2]/div/button[2]")
    private WebElement updateInterviewerSaveBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-interviewers/div[3]/p-dialog/div/div/div[2]/form/div[3]/select")
    private WebElement sendEmailDialogSelectInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-interviewers/div[3]/p-dialog/div/div/div[3]/div/button[2]")
    private WebElement sendEmailDialogSendButton;

    /**
     * @Method_Description: Check if the interviewers page elements are displayed correctly
     * @Method_Name: verifyInterviewersPageElementsAndTable
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Jerish Balakrishnan
     * @Modified_Date: 15/04/2024
     */
    public void verifyInterviewersPageElementsAndTable() {
        WebDriver driver = BaseTest.getDriver();
        try {
            if (pageTitle.getText().trim().equals("Interviewers") && pageTitle.isDisplayed() && addInterviewerButton.isDisplayed() &&
                    addInterviewerButton.isEnabled() && searchInputField.isDisplayed() && sendEmailButton.isDisplayed() &&
                    !sendEmailButton.isEnabled() && interviewersTable.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyInterviewersPageElementsAndTable",
                        Status.PASS, "Elements on the Interviewers page are displayed correctly", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyInterviewersPageElementsAndTable",
                        Status.WARNING, "Elements on the Interviewers page are not displayed correctly", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyInterviewersPageElementsAndTable",
                    Status.FAIL, "Exception found in Method - verifyInterviewersPageElementsAndTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify navigation to 'Add Interviewer' page and the display of a specific input field
     * @Method_Name : VerifyAddInterviewerFunctionality
     * @Input_Parameters : String expectedAddInterviewerUrl, String resumePath, String notesAttachmentPath, String interviewersURL
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 15/04/24
     **/
    public void VerifyAddInterviewerFunctionality(String expectedAddInterviewerUrl, String resumePath, String notesAttachmentPath, String interviewersURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            String notesAttachmentAbsolutePath = new File(notesAttachmentPath).getAbsolutePath();
            // Click on the 'Add Interviewer' button
            Utilities.Click(driver, addInterviewerButton);
            DynamicWait.smallWait();

            // Verify the URL change to the Add Interviewer page
            if (!driver.getCurrentUrl().equals(expectedAddInterviewerUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("URL Verification", Status.WARNING,
                        "URL did not change as expected to 'Add Interviewer'", true);
                return;
            }

            // Verify 'Save Interviewer' button
            if (!addInterviewerSaveBtn.isDisplayed() || !addInterviewerSaveBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Interviewer Button Verification", Status.WARNING,
                        "Save Interviewer button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add Interviewer' page is displayed
            if (!countrySelect.isDisplayed() || !firstNameInput.isDisplayed() || !lastNameInput.isDisplayed() || !emailAddressInput.isDisplayed() || !phoneNumberInput.isDisplayed() || !notesInput.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Add Interviewer' page are not displayed", true);
                return;
            }

            // Input data to fields
            Utilities.SendKeysForFileUpload(driver, chooseResumeFileInput, resumeAbsolutePath);
            DynamicWait.mediumWait();

            Select select = new Select(countrySelect);
            select.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver, firstNameInput, "Test");
            Utilities.SendKeys(driver, lastNameInput, "Test");

            Random random = new Random();
            // Generate a random number up to 100000
            int randomNumber = random.nextInt(100000);

            // Append the random number to the email address
            String uniqueEmail = "test" + randomNumber + "@yopmail.com";
            System.out.println("Email address: " + uniqueEmail);
            Utilities.SendKeys(driver, emailAddressInput, uniqueEmail);
            Utilities.SendKeys(driver, phoneNumberInput, "6666667666");
            Utilities.SendKeys(driver, notesInput, "Test");
            DynamicWait.smallWait();

            Utilities.SendKeysForFileUpload(driver, notesAttachmentFileInput, notesAttachmentAbsolutePath);
            DynamicWait.smallWait();

            Utilities.SendKeysForFileUpload(driver, documentsAttachmentFileInput, resumeAbsolutePath);
            DynamicWait.smallWait();

            Utilities.Click(driver, addInterviewerSaveBtn);

            // Utilities.WaitTillElementDisplayed(driver, toastMessage);
            // String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (driver.getCurrentUrl().equals(interviewersURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddInterviewerFunctionality", Status.PASS,
                        "'Add Interviewer' functionality is working as expected", true);
                VerifyInterviewerOnTable(uniqueEmail);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddInterviewerFunctionality", Status.WARNING,
                        "'Add Interviewer' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddInterviewerFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyAddInterviewerFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the newly added interviewer is shown at the top of the table
     * @Method_Name : VerifyInterviewerOnTable
     * @Input_Parameters : String emailAddress
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 16/04/24
     **/
    public void VerifyInterviewerOnTable(String emailAddress) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, interviewersTable);

            String actualEmailAddress = firstInterviewerEmailAddress.getText().trim();

            System.out.println(actualEmailAddress);
            System.out.println(emailAddress);

            if (actualEmailAddress.equals(emailAddress)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerOnTable", Status.PASS,
                        "Newly added interviewer is shown at the top of the table", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerOnTable", Status.WARNING,
                        "Newly added interviewer is not shown at the top of the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerOnTable",
                    Status.FAIL, "Exception found in Method - VerifyInterviewerOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update interviewer functionality is working as expected
     * @Method_Name : VerifyUpdateInterviewerFunctionality
     * @Input_Parameters : String interviewersURL
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 16/04/24
     **/
    public void VerifyUpdateInterviewerFunctionality(String interviewersURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, interviewersTable);

            Utilities.Click(driver, firstInterviewerUpdateIcon);
            Utilities.WaitForPageLoad(driver);

            Utilities.WaitTillElementDisplayed(driver, updateInterviewerCountrySelect);
            Select select1 = new Select(updateInterviewerCountrySelect);
            select1.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Select select2 = new Select(updateInterviewerStatusSelect);
            select2.selectByVisibleText("Active");
            DynamicWait.smallWait();

            Select select3 = new Select(updateInterviewerGenderSelect);
            select3.selectByVisibleText("Male");
            DynamicWait.smallWait();

            Utilities.Click(driver, updateInterviewerSaveBtn);

            // Utilities.WaitTillElementDisplayed(driver, toastMessage);
            // String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (driver.getCurrentUrl().equals(interviewersURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateInterviewerFunctionality", Status.PASS,
                        "'Update Interviewer' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateInterviewerFunctionality", Status.WARNING,
                        "'Update Interviewer' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateInterviewerFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyUpdateInterviewerFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the search interviewer functionality is working as expected
     * @Method_Name : VerifySearchInterviewerFunctionality
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 18/04/24
     **/
    public void VerifySearchInterviewerFunctionality() {
        WebDriver driver = BaseTest.getDriver();
        try {
            searchInputField.clear();
            Utilities.SendKeys(driver, searchInputField, "test40712");
            DynamicWait.mediumWait();

            Utilities.WaitTillElementDisplayed(driver, interviewersTable);

            // Find all tr elements within the tbody of the interviewersTable
            List<WebElement> rows = interviewersTable.findElements(By.tagName("tr"));

            if (rows.size() == 2) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchInterviewerFunctionality", Status.PASS,
                        "'Search Interviewer' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchInterviewerFunctionality", Status.WARNING,
                        "'Search Interviewer' functionality is not working as expected, expected 2 result but found " + rows.size(), true);
            }
            driver.navigate().refresh();
            Utilities.WaitForPageLoad(driver);
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchInterviewerFunctionality",
                    Status.FAIL, "Exception found in Method - VerifySearchInterviewerFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the send email functionality is working as expected
     * @Method_Name : VerifyInterviewerSendEmailFunctionality
     * @Input_Parameters : String option, String message
     * @Output_Parameters : String emailAddress
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 18/04/24
     **/
    public String VerifyInterviewerSendEmailFunctionality(String option, String message) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String emailAddress = firstInterviewerEmailAddress.getText().trim();
            Utilities.Click(driver, firstInterviewerCheckbox);
            Utilities.WaitTillElementIsClickable(driver, sendEmailButton);
            Utilities.Click(driver, sendEmailButton);

            Utilities.WaitTillElementDisplayed(driver, sendEmailDialogSelectInput);

            Select select1 = new Select(sendEmailDialogSelectInput);
            select1.selectByVisibleText(option);
            DynamicWait.smallWait();

            Utilities.Click(driver, sendEmailDialogSendButton);

            // WebElement toastMessage = driver.findElement(By.xpath("//*[@id='visible-content']/div/app-interviewers/p-toast/div/p-toastitem/div/div/div/div[2]"));

            Utilities.WaitTillElementDisplayed(driver, toastMessage);
            String resultText = toastMessage.getText().trim();

            if (resultText.equals(message)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerSendEmailFunctionality", Status.PASS,
                        "Send Email functionality is working as expected", true);
                return emailAddress;
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerSendEmailFunctionality", Status.WARNING,
                        "Send Email functionality is not working as expected", true);
                return emailAddress;
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyInterviewerSendEmailFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyInterviewerSendEmailFunctionality", true, e);
            return null;
        }
    }

    /**
     * @Method_Description : Verify all tabs on 'Interviewer Details' page are displayed and clickable, then click on each tab
     * @Method_Name : CheckInterviewerDetails
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 23/04/24
     **/
    public void CheckInterviewerDetails() {
        WebDriver driver = BaseTest.getDriver();
        try {
            // Array of XPaths for each tab on the Interviewer Details page
            String[] tabXPaths = new String[] {
                    "//*[@id='tabs-strip']/li[1]",
                    "//*[@id='tabs-strip']/li[2]",
                    "//*[@id='tabs-strip']/li[3]",
                    "//*[@id='tabs-strip']/li[4]",
                    "//*[@id='tabs-strip']/li[5]",
                    "//*[@id='tabs-strip']/li[5]",
                    "//*[@id='tabs-strip']/li[6]"
            };

            // Verify each tab is displayed and clickable, then click on it
            for (String tabXPath : tabXPaths) {
                WebElement tab = driver.findElement(By.xpath(tabXPath));
                if (tab.isDisplayed() && tab.isEnabled()) {
                    Utilities.Click(driver, tab);
                    DynamicWait.smallWait(); // Wait after each click
                    ExtentTestManager.createAssertTestStepWithScreenshot("Tab Clicked", Status.PASS,
                            "Successfully clicked on tab: " + tab.getText(), true);
//                    if (tab.getText().trim().equals("Details")) {
//                        TestDetailsTab();
//                    }
//                    if (tab.getText().trim().contains("Notes & Attachments")) {
//                        TestDetailsTab();
//                    }
//                    if (tab.getText().trim().contains("Docs")) {
//                        TestDetailsTab();
//                    }
//                    if (tab.getText().trim().contains("Resume")) {
//                        TestDetailsTab();
//                    }
//                    if (tab.getText().trim().contains("Messages")) {
//                        TestDetailsTab();
//                    }
//                    if (tab.getText().trim().contains("Interview")) {
//                        TestDetailsTab();
//                    }
                } else {
                    ExtentTestManager.createAssertTestStepWithScreenshot("Tab Check Failed", Status.WARNING,
                            "Tab is either not displayed or not clickable: " + tabXPath, true);
                    return;
                }
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("CheckInterviewerDetails",
                    Status.FAIL, "Exception found in Method - CheckInterviewerDetails", true, e);
        }
    }

    /**
     * @Method_Description : Test the Details Tab
     * @Method_Name : TestDetailsTab
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 23/04/24
     **/
    public void TestDetailsTab() {
        WebDriver driver = BaseTest.getDriver();
        try {
            // Implement the logic for testing the use of parentheses here

        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("TestComposeSummary",
                    Status.FAIL, "Exception found in Method - TestComposeSummary", true, e);
        }
    }
}
