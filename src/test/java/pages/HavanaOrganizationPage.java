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

public class HavanaOrganizationPage {

    /**
     * Constructor
     */
    public HavanaOrganizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[1]")
    private WebElement organization;

    @FindBy(xpath="//*[@id='main-container']/app-sidebar/div/div/div[1]/ul/li[1]/ul/li/a")
    private WebElement employees;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-employeeslist/div[1]/nav/ol")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-employeeslist/div[1]/button")
    private WebElement addEmployeeButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInputField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement sendEmailButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement employeesTable;

    @FindBy(xpath = "//*[@id='resume-width']")
    private WebElement chooseResumeFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[2]/div[1]/div/select")
    private WebElement countrySelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[2]/div[2]/div/input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='lname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[4]/div[1]/div/input")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//*[@id='phone']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[7]/div/div/textarea")
    private WebElement notesInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[8]/div/div/div/div/div[1]/input")
    private WebElement notesAttachmentFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[9]/div[1]/div/div/div/div/div[1]/input")
    private WebElement documentsAttachmentFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/div/button[2]")
    private WebElement addEmployeeSaveBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-employeeslist/p-toast/div/p-toastitem/div/div/div/div[2]")
    private WebElement toastMessage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[1]/input")
    private WebElement firstEmployeeCheckbox;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[3]/div[1]/div/div/div")
    private WebElement addEmployeeRolesDropdown;

    @FindBy(xpath = "//*[@id='flexCheckDefault']")
    private WebElement addEmployeeRolesFirstCheckbox;

    @FindBy(xpath = "//*[@id='dropdown-container']/ul/li[1]/div/div[2]/label/input")
    private WebElement addEmployeeRolesFirstRadioButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addemployee/div[2]/form/div/div[3]/div[2]/div/p-dropdown/div/span")
    private WebElement addEmployeeManagerInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[3]/div[3]/input")
    private WebElement addEmployeeManagerCheckbox;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-addemployee/div[2]/form/div/div[9]/div[2]/div/input")
    private WebElement addEmployeeWelcomeCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr/td[4]/div/a")
    private WebElement firstEmployeeEmailAddress;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[11]/span/i")
    private WebElement firstEmployeeUpdateIcon;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateemployee/div[2]/form/div/div[1]/div[1]/div/select")
    private WebElement updateEmployeeCountrySelect;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updateemployee/div[2]/form/div/div[2]/div[2]/div/p-dropdown/div/span")
    private WebElement updateEmployeeManagerSelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updateemployee/div[2]/div/button[2]")
    private WebElement updateEmployeeSaveBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-employeeslist/div[4]/p-dialog/div/div/div[2]/form/div[3]/select")
    private WebElement sendEmailDialogSelectInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-employeeslist/div[4]/p-dialog/div/div/div[3]/div/button[2]")
    private WebElement sendEmailDialogSendButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[3]/div/a")
    private WebElement firstEmployeeName;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/ul/li[1]")
    private WebElement employeeDetailsTab;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/ul/li[2]")
    private WebElement employeeNotesAndAttachmentsTab;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/ul/li[3]")
    private WebElement employeeDocsTab;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/ul/li[4]")
    private WebElement employeeResumeTab;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[2]/div/div/div[2]/ul/li[1]/span")
    private WebElement employeeRole;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[2]/div/div/div[2]/ul/li[2]/span")
    private WebElement employeePhoneNo;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[2]/div/div/div[2]/ul/li[3]/span")
    private WebElement employeeEmail;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[2]/div/div/div[2]/ul/li[4]/span")
    private WebElement employeeCountry;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[2]/div/div/div[3]/button")
    private WebElement employeeQuickActionsBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeesdetails/div[1]/div[1]/button")
    private WebElement employeeDetailsEditBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeenotes/div/button")
    private WebElement employeeAddNoteBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeedocs/div[1]/button")
    private WebElement employeeAddDocBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeedocs/div[2]/div/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement employeeDocsTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeeresume/shared-resume/div/div/button[1]")
    private WebElement employeeToggleViewBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeeresume/shared-resume/div/div/button[2]")
    private WebElement employeeAddResumeBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeeresume/shared-resume/p-sidebar/div/div[2]/form/div/div/div/div[2]/input")
    private WebElement employeeAddResumeFileInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeessummary/div[3]/app-employeeresume/shared-resume/p-sidebar/div/div[3]/div/button[2]")
    private WebElement employeeSaveResumeBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-employeeslist/div[2]/div/a[1]")
    private WebElement employeesAllTab;

    /**
     * @Method_Description: Navigate to Employees page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckEmployeesPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Jerish Balakrishnan
     * @Modified_Date: 02/05/2024
     */
    public void TC_CheckEmployeesPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver, organization);
            DynamicWait.smallWait();

            Utilities.Click(driver, employees);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Employees Page from side Menu",
                        Status.WARNING, "User is not navigated to Employees page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Employees Page from side Menu",
                        Status.PASS, "User is navigated to Employees page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Employees Page from side Menu",
                    Status.FAIL, "Exception found in Method - TC_CheckEmployeesPage", true, e);
        }
    }

    /**
     * @Method_Description: Check if the employees page elements are displayed correctly
     * @Method_Name: verifyEmployeesPageElementsAndTable
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Jerish Balakrishnan
     * @Modified_Date: 02/05/2024
     */
    public void verifyEmployeesPageElementsAndTable() {
        WebDriver driver = BaseTest.getDriver();
        try {
            if (pageTitle.getText().trim().contains("Organization") &&
                    pageTitle.getText().trim().contains("Employees") &&
                    pageTitle.isDisplayed() && addEmployeeButton.isDisplayed() &&
                    addEmployeeButton.isEnabled() && searchInputField.isDisplayed() && sendEmailButton.isDisplayed() &&
                    !sendEmailButton.isEnabled() && employeesTable.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmployeesPageElementsAndTable",
                        Status.PASS, "Elements on the Employees page are displayed correctly", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmployeesPageElementsAndTable",
                        Status.WARNING, "Elements on the Employees page are not displayed correctly", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmployeesPageElementsAndTable",
                    Status.FAIL, "Exception found in Method - verifyEmployeesPageElementsAndTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify navigation to 'Add Employee' page and the display of a specific input field
     * @Method_Name : VerifyAddEmployeeFunctionality
     * @Input_Parameters : String expectedAddEmployeeUrl, String resumePath, String notesAttachmentPath, String employeesURL
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 02/05/24
     **/
    public void VerifyAddEmployeeFunctionality(String expectedAddEmployeeUrl, String resumePath, String notesAttachmentPath, String employeesURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            String notesAttachmentAbsolutePath = new File(notesAttachmentPath).getAbsolutePath();
            // Click on the 'Add Employee' button
            Utilities.Click(driver, addEmployeeButton);
            DynamicWait.smallWait();

            // Verify the URL change to the Add Employee page
            if (!driver.getCurrentUrl().equals(expectedAddEmployeeUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("URL Verification", Status.WARNING,
                        "URL did not change as expected to 'Add Employee'", true);
                return;
            }

            // Verify 'Save Employee' button
            if (!addEmployeeSaveBtn.isDisplayed() || !addEmployeeSaveBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Employee Button Verification", Status.WARNING,
                        "Save Employee button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add Employee' page is displayed
            if (!countrySelect.isDisplayed() || !firstNameInput.isDisplayed() || !lastNameInput.isDisplayed() || !emailAddressInput.isDisplayed() || !phoneNumberInput.isDisplayed() || !notesInput.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Add Employee' page are not displayed", true);
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

            Utilities.Click(driver, addEmployeeRolesDropdown);
            Utilities.Click(driver, addEmployeeRolesFirstCheckbox);
            Utilities.Click(driver, addEmployeeRolesFirstRadioButton);

            // Utilities.SendKeys(driver, addEmployeeManagerInput, "Test Test");
            // Utilities.Click(driver, addEmployeeManagerCheckbox);

            Utilities.ActionClick(driver, emailAddressInput);

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

            Utilities.Click(driver, addEmployeeWelcomeCheckbox);

            Utilities.Click(driver, addEmployeeSaveBtn);

            // Utilities.WaitTillElementDisplayed(driver, toastMessage);
            // String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (driver.getCurrentUrl().equals(employeesURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddEmployeeFunctionality", Status.PASS,
                        "'Add Employee' functionality is working as expected", true);
                VerifyEmployeeOnTable(uniqueEmail);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddEmployeeFunctionality", Status.WARNING,
                        "'Add Employee' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddEmployeeFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyAddEmployeeFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the newly added Employee is shown on the table
     * @Method_Name : VerifyEmployeeOnTable
     * @Input_Parameters : String emailAddress
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 02/05/24
     **/
    public void VerifyEmployeeOnTable(String emailAddress) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, employeesAllTab);
            Utilities.Click(driver, employeesAllTab);
            DynamicWait.smallWait();

            Utilities.WaitTillElementDisplayed(driver, searchInputField);
            searchInputField.clear();
            Utilities.SendKeys(driver, searchInputField, emailAddress);

            DynamicWait.mediumWait();

            Utilities.WaitTillElementDisplayed(driver, employeesTable);
            String actualEmailAddress = firstEmployeeEmailAddress.getText().trim();

            System.out.println(actualEmailAddress);
            System.out.println(emailAddress);

            if (actualEmailAddress.equals(emailAddress)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeOnTable", Status.PASS,
                        "Newly added Employee is shown on the table", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeOnTable", Status.WARNING,
                        "Newly added Employee is not shown on the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeOnTable",
                    Status.FAIL, "Exception found in Method - VerifyEmployeeOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update employee functionality is working as expected
     * @Method_Name : VerifyUpdateEmployeeFunctionality
     * @Input_Parameters : String employeeURL
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 03/05/2024
     **/
    public void VerifyUpdateEmployeeFunctionality(String employeeURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, employeesTable);

            Utilities.Click(driver, firstEmployeeUpdateIcon);
            Utilities.WaitForPageLoad(driver);

            Utilities.WaitTillElementDisplayed(driver, updateEmployeeCountrySelect);
            Select select1 = new Select(updateEmployeeCountrySelect);
            select1.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            // Utilities.SendKeys(driver, updateEmployeeManagerSelect, "Test Test");

            Utilities.Click(driver, updateEmployeeSaveBtn);

            // Utilities.WaitTillElementDisplayed(driver, toastMessage);
            // String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (driver.getCurrentUrl().equals(employeeURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateEmployeeFunctionality", Status.PASS,
                        "'Update Employee' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateEmployeeFunctionality", Status.WARNING,
                        "'Update Employee' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateEmployeeFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyUpdateEmployeeFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the search employee functionality is working as expected
     * @Method_Name : VerifySearchEmployeeFunctionality
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 03/05/2024
     **/
    public void VerifySearchEmployeeFunctionality() {
        WebDriver driver = BaseTest.getDriver();
        try {
            searchInputField.clear();
            Utilities.SendKeys(driver, searchInputField, "test58682");
            DynamicWait.mediumWait();

            Utilities.WaitTillElementDisplayed(driver, employeesTable);

            // Find all tr elements within the tbody of the employeesTable
            List<WebElement> rows = employeesTable.findElements(By.tagName("tr"));

            if (rows.size() == 2) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchEmployeeFunctionality", Status.PASS,
                        "'Search Employee' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchEmployeeFunctionality", Status.WARNING,
                        "'Search Employee' functionality is not working as expected, expected 2 result but found " + rows.size(), true);
            }
            driver.navigate().refresh();
            Utilities.WaitForPageLoad(driver);
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchEmployeeFunctionality",
                    Status.FAIL, "Exception found in Method - VerifySearchEmployeeFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the send email functionality is working as expected
     * @Method_Name : VerifyEmployeeSendEmailFunctionality
     * @Input_Parameters : String option, String message
     * @Output_Parameters : String emailAddress
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 03/05/2024
     **/
    public String VerifyEmployeeSendEmailFunctionality(String option, String message) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String emailAddress = firstEmployeeEmailAddress.getText().trim();
            Utilities.Click(driver, firstEmployeeCheckbox);
            Utilities.WaitTillElementIsClickable(driver, sendEmailButton);
            Utilities.Click(driver, sendEmailButton);

            Utilities.WaitTillElementDisplayed(driver, sendEmailDialogSelectInput);

            Select select1 = new Select(sendEmailDialogSelectInput);
            select1.selectByVisibleText(option);
            DynamicWait.smallWait();

            Utilities.Click(driver, sendEmailDialogSendButton);

            Utilities.WaitTillElementDisplayed(driver, toastMessage);
            String resultText = toastMessage.getText().trim();

            if (resultText.equals(message)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeSendEmailFunctionality", Status.PASS,
                        "Send Email functionality is working as expected", true);
                return emailAddress;
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeSendEmailFunctionality", Status.WARNING,
                        "Send Email functionality is not working as expected", true);
                return emailAddress;
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeSendEmailFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyEmployeeSendEmailFunctionality", true, e);
            return null;
        }
    }

    /**
     * @Method_Description : Verify if the employee details functionality is working as expected
     * @Method_Name : VerifyEmployeeDetailsFunctionality
     * @Input_Parameters : String resumePath
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 06/05/2024
     **/
    public void VerifyEmployeeDetailsFunctionality(String resumePath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            Utilities.Click(driver, firstEmployeeName);
            DynamicWait.smallWait();

            // Check if the specific input fields on the 'Employee Details' page are displayed
            if (!employeeRole.isDisplayed() || !employeePhoneNo.isDisplayed() || !employeeEmail.isDisplayed() || !employeeCountry.isDisplayed() || !employeeQuickActionsBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Employee Details' page are not displayed", true);
                return;
            }

            // Click on the Details Tab
            Utilities.Click(driver, employeeDetailsTab);
            DynamicWait.smallWait();

            // Check if the elements on the Details tab are displayed
            if (!employeeDetailsEditBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Details' tab are not displayed", true);
                return;
            }

            // Click on the Notes & Attachments Tab
            Utilities.Click(driver, employeeNotesAndAttachmentsTab);
            DynamicWait.smallWait();

            // Check if the elements on the Notes & Attachments Tab are displayed
            if (!employeeAddNoteBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Notes & Attachments' tab are not displayed", true);
                return;
            }

            // Click on the Docs Tab
            Utilities.Click(driver, employeeDocsTab);
            DynamicWait.smallWait();

            Utilities.WaitTillElementDisplayed(driver, employeeDocsTable);

            // Check if the elements on the Docs Tab are displayed
            if (!employeeAddDocBtn.isDisplayed() || !employeeDocsTable.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Docs' tab are not displayed", true);
                return;
            }

            // Click on the Resume Tab
            Utilities.Click(driver, employeeResumeTab);
            DynamicWait.smallWait();

            // Check if the elements on the Resume Tab are displayed
            if (!employeeToggleViewBtn.isDisplayed() || !employeeAddResumeBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Resume' tab are not displayed", true);
                return;
            }

            Utilities.Click(driver, employeeToggleViewBtn);

            Utilities.Click(driver, employeeAddResumeBtn);
            DynamicWait.smallWait();

            // Click on the "Add a Resume" button
            Utilities.SendKeysForFileUpload(driver, employeeAddResumeFileInput, resumeAbsolutePath);
            DynamicWait.smallWait();

            Utilities.Click(driver, employeeSaveResumeBtn);

        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyEmployeeDetailsFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyEmployeeDetailsFunctionality", true, e);
        }
    }
}
