package pages;

import com.aventstack.extentreports.Status;
import jdk.jshell.execution.Util;
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

public class HavanaVendorPage {

    /**
     * Constructor
     */
    public HavanaVendorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */

    @FindBy(xpath = "//*[@id='child6']/a")
    private WebElement vendors;

    @FindBy(xpath = "//*[@id='child7']/a")
    private WebElement vendors1;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/div[1]/nav/ol/li")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/div[1]/button")
    private WebElement addVendorButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorlist/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInputField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorlist/div[2]/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement vendorsTable;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[3]/div/div/button[2]")
    private WebElement addVendorSaveBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[1]/div[1]/div/input")
    private WebElement companyInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[1]/div[2]/div/input")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[2]/div[1]/div/select")
    private WebElement addVendorCountrySelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[2]/div[2]/div/input")
    private WebElement addressInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[8]/div[1]/div/input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[8]/div[2]/div/input")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[9]/div[1]/div/input")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-sidebar/div/div[2]/form/div/div[9]/div[2]/div/input")
    private WebElement emailAddressInput2;

    @FindBy(xpath = "//*[@id='uploadFIle']")
    private WebElement logoAttachmentFileInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorlist/p-toast/div/p-toastitem/div/div/div/div[2]")
    private WebElement toastMessage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[2]/div/a")
    private WebElement firstVendorName;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[8]/div/a")
    private WebElement firstVendorEmailAddress;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[11]/span/i")
    private WebElement firstVendorUpdateIcon;

    @FindBy(xpath = "//*[@id='tabs-strip']/li[1]")
    private WebElement updateDetailsTab;

    @FindBy(xpath = "//*[@id='tabs-strip']/li[2]")
    private WebElement updateAdminDetailsTab;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updatesummary/div[2]/app-updatevendor/div/form/div/div[1]/div[2]/div/select")
    private WebElement updateVendorCountrySelect;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updatesummary/div[2]/app-updateadmindetails/div/form/div/div[1]/div[1]/div/select")
    private WebElement updateVendorCountrySelect2;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-updatesummary/div[2]/app-updateadmindetails/div/div/button[2]")
    private WebElement updateVendorSaveBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorsummary/div[2]/div/div/div[2]/h5")
    private WebElement vendorDetailsName;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorsummary/div[2]/div/div/div[2]/ul/li[2]/span")
    private WebElement vendorDetailsEmail;

    @FindBy(xpath = "//*[@id='tabs-strip']/div/li[1]")
    private WebElement vendorDetailsTab;

    @FindBy(xpath = "//*[@id='tabs-strip']/div/li[2]")
    private WebElement vendorAdminDetailsTab;

    @FindBy(xpath = "//*[@id='tabs-strip']/div/li[3]")
    private WebElement vendorEmployeesTab;

    @FindBy(xpath = "//*[@id='tabs-strip']/div/li[4]")
    private WebElement vendorJobsTab;

    @FindBy(xpath = "//*[@id='tabs-strip']/div/li[5]")
    private WebElement vendorNotesAttachmentsTab;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendordetails/div/div/div[1]/button")
    private WebElement vendorDetailsTabEditBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendordetails/div/div/div[2]/div/div[1]/div/p")
    private WebElement vendorDetailsTabCompanyName;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendordetails/div/div/div[2]/div/div[2]/div/p")
    private WebElement vendorDetailsTabCountry;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendordetails/div/div/div[2]/div/div[10]/div/p")
    private WebElement vendorDetailsTabEmail;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendoradmindetails/div[1]/div/div[1]/div/button[1]")
    private WebElement vendorAdminDetailsTabSendEmailBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendoradmindetails/div[1]/div/div[1]/div/button[2]")
    private WebElement vendorAdminDetailsTabEditBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendoradmindetails/div[1]/div/div[2]/div/div[1]/div/p")
    private WebElement vendorAdminDetailsTabCountry;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendoremployees/div/div/div/button")
    private WebElement vendorEmployeesTabSendEmailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorsummary/div[3]/app-vendoremployees/div/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement vendorEmployeesTabTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-vendorsummary/div[3]/app-vendorjobs/div/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement vendorJobsTabTable;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/div/div/button")
    private WebElement vendorNotesAttachmentsTabAddBtn;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/shared-notes/p-sidebar/div")
    private WebElement vendorAddNotesDialog;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/shared-notes/p-sidebar/div/div[2]/form/div[1]/textarea")
    private WebElement vendorAddNotesInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/shared-notes/p-sidebar/div/div[2]/form/div[2]/input")
    private WebElement vendorAddNotesAttachmentInput;

    @FindBy(xpath = "//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/shared-notes/p-sidebar/div/div[3]/div/button[2]")
    private WebElement vendorAddNotesSaveBtn;

    /**
     * @Method_Description: Navigate to Vendor page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckVendorsPage
     * @Input_Parameters: String expectedUrl, String role
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 26/04/2024
     */
    public void TC_CheckVendorsPage(String expectedUrl, String role) {
        WebDriver driver = BaseTest.getDriver();
        try {
            if (role.equals("Recruiter")) {
                Utilities.Click(driver, vendors);
            } else {
                Utilities.Click(driver, vendors1);
            }
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Vendors Page from side Menu",
                        Status.WARNING, "User is not navigated to Vendors page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Vendors from side Menu",
                        Status.PASS, "User is navigated to Vendors page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Vendors page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Vendors from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Check if the vendors page elements are displayed correctly
     * @Method_Name: verifyVendorsPageElementsAndTable
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Jerish Balakrishnan
     * @Modified_Date: 26/04/2024
     */
    public void verifyVendorsPageElementsAndTable() {
        WebDriver driver = BaseTest.getDriver();
        try {
            if (pageTitle.getText().trim().equals("Vendor") && pageTitle.isDisplayed() && addVendorButton.isDisplayed() &&
                    addVendorButton.isEnabled() && searchInputField.isDisplayed() && vendorsTable.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyVendorsPageElementsAndTable",
                        Status.PASS, "Elements on the Vendors page are displayed correctly", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyVendorsPageElementsAndTable",
                        Status.WARNING, "Elements on the Vendors page are not displayed correctly", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyVendorsPageElementsAndTable",
                    Status.FAIL, "Exception found in Method - verifyVendorsPageElementsAndTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify navigation to 'Add Vendor' page and the display of a specific input field
     * @Method_Name : VerifyAddVendorsFunctionality
     * @Input_Parameters : String logoAttachmentPath
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 29/04/24
     **/
    public void VerifyAddVendorsFunctionality(String logoAttachmentPath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String logoAttachmentAbsolutePath = new File(logoAttachmentPath).getAbsolutePath();
            // Click on the 'Add Vendor' button
            Utilities.Click(driver, addVendorButton);
            DynamicWait.smallWait();

            // Verify 'Save Vendor' button
            if (!addVendorSaveBtn.isDisplayed() || !addVendorSaveBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Vendor Button Verification", Status.WARNING,
                        "Save Vendor button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add Interviewer' page is displayed
            if (!companyInput.isDisplayed() || !emailAddressInput.isDisplayed() || !addressInput.isDisplayed() || !firstNameInput.isDisplayed() || !lastNameInput.isDisplayed() || !emailAddressInput2.isDisplayed() || !phoneNumberInput.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Add Vendor' page are not displayed", true);
                return;
            }

            Random random = new Random();
            // Generate a random number up to 100000
            int randomNumber = random.nextInt(100000);

            // Append the random number to the email address
            String uniqueEmail = "test" + randomNumber + "@yopmail.com";
            System.out.println("Email address: " + uniqueEmail);

            Utilities.WaitTillElementDisplayed(driver, addVendorCountrySelect);
            Select select1 = new Select(addVendorCountrySelect);
            select1.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver, companyInput, "Test"  + randomNumber);
            Utilities.SendKeys(driver, firstNameInput, "Test");
            Utilities.SendKeys(driver, lastNameInput, "Test");
            Utilities.SendKeys(driver, addressInput, "Test");
            Utilities.SendKeys(driver, emailAddressInput, uniqueEmail);
            Utilities.SendKeys(driver, emailAddressInput2, uniqueEmail);
            Utilities.SendKeys(driver, phoneNumberInput, "6666667666");
            DynamicWait.smallWait();

            Utilities.SendKeysForFileUpload(driver, logoAttachmentFileInput, logoAttachmentAbsolutePath);
            DynamicWait.smallWait();

            Utilities.Click(driver, addVendorSaveBtn);

            Utilities.WaitTillElementDisplayed(driver, toastMessage);
            String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (resultText.equals("Vendor added successfully")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddVendorFunctionality", Status.PASS,
                        "'Add Vendor' functionality is working as expected", true);
                VerifyVendorOnTable(uniqueEmail);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddVendorFunctionality", Status.WARNING,
                        "'Add Vendor' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddVendorFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyAddVendorFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the newly added vendor is shown at the top of the table
     * @Method_Name : VerifyVendorOnTable
     * @Input_Parameters : String emailAddress
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 29/04/24
     **/
    public void VerifyVendorOnTable(String emailAddress) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, vendorsTable);

            String actualEmailAddress = firstVendorEmailAddress.getText().trim();

            System.out.println(actualEmailAddress);
            System.out.println(emailAddress);

            if (actualEmailAddress.equals(emailAddress)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorOnTable", Status.PASS,
                        "Newly added vendor is shown at the top of the table", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorOnTable", Status.WARNING,
                        "Newly added vendor is not shown at the top of the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorOnTable",
                    Status.FAIL, "Exception found in Method - VerifyVendorOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update vendor functionality is working as expected
     * @Method_Name : VerifyUpdateVendorFunctionality
     * @Input_Parameters : String vendorURL
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 29/04/24
     **/
    public void VerifyUpdateVendorFunctionality(String vendorURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, vendorsTable);

            Utilities.Click(driver, firstVendorUpdateIcon);
            Utilities.WaitForPageLoad(driver);

            Utilities.Click(driver, updateDetailsTab);
            DynamicWait.mediumWait();

            Utilities.WaitTillElementDisplayed(driver, updateVendorCountrySelect);
            Select select1 = new Select(updateVendorCountrySelect);
            select1.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Utilities.Click(driver, updateAdminDetailsTab);
            DynamicWait.mediumWait();

            Select select2 = new Select(updateVendorCountrySelect2);
            select2.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Utilities.Click(driver, updateVendorSaveBtn);

            // Utilities.WaitTillElementDisplayed(driver, toastMessage);
            // String resultText = toastMessage.getText().trim();

            DynamicWait.mediumWait();

            if (driver.getCurrentUrl().equals(vendorURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateVendorFunctionality", Status.PASS,
                        "'Update Vendor' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateVendorFunctionality", Status.WARNING,
                        "'Update Vendor' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateVendorFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyUpdateVendorFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the search vendor functionality is working as expected
     * @Method_Name : VerifySearchVendorFunctionality
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 29/04/24
     **/
    public void VerifySearchVendorFunctionality() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver, searchInputField);
            searchInputField.clear();
            Utilities.SendKeys(driver, searchInputField, "Test46103");

            DynamicWait.smallWait();

            Utilities.WaitTillElementDisplayed(driver, vendorsTable);

            // Find all tr elements within the tbody of the interviewersTable
            List<WebElement> rows = vendorsTable.findElements(By.tagName("tr"));

            if (rows.size() == 2) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchVendorFunctionality", Status.PASS,
                        "'Search Vendor' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchVendorFunctionality", Status.WARNING,
                        "'Search Vendor' functionality is not working as expected, expected 2 result but found " + rows.size(), true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifySearchVendorFunctionality",
                    Status.FAIL, "Exception found in Method - VerifySearchVendorFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the vendor details functionality is working as expected
     * @Method_Name : VerifyVendorDetailsFunctionality
     * @Input_Parameters : String resumePath
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 30/04/24
     **/
    public void VerifyVendorDetailsFunctionality(String resumePath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            Utilities.Click(driver, firstVendorName);
            Utilities.WaitForPageLoad(driver);

            Utilities.WaitTillElementDisplayed(driver, vendorDetailsName);

            // Check if the name and email address are displayed on the page
            if (!vendorDetailsName.isDisplayed() || !vendorDetailsEmail.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Name and Email Address are not displayed on this page", true);
                return;
            }

            // Vendor Details Tab
            Utilities.Click(driver, vendorDetailsTab);
            DynamicWait.mediumWait();

            if (!vendorDetailsTabCompanyName.isDisplayed() || !vendorDetailsTabCountry.isDisplayed() || !vendorDetailsTabEmail.isDisplayed() || !vendorDetailsTabEditBtn.isDisplayed() || !vendorDetailsTabEditBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Vendor Details Tab is not getting displayed correctly", true);
                return;
            }

            // Vendor Admin Details Tab
            Utilities.Click(driver, vendorAdminDetailsTab);
            DynamicWait.mediumWait();

            if (!vendorAdminDetailsTabCountry.isDisplayed() || !vendorAdminDetailsTabSendEmailBtn.isDisplayed() || !vendorAdminDetailsTabEditBtn.isDisplayed() || !vendorAdminDetailsTabSendEmailBtn.isEnabled() || !vendorAdminDetailsTabEditBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Vendor Admin Details Tab is not getting displayed correctly", true);
                return;
            }

            // Employees Tab
            Utilities.Click(driver, vendorEmployeesTab);
            DynamicWait.mediumWait();

            if (!vendorEmployeesTabSendEmailBtn.isDisplayed() || !vendorEmployeesTabTable.isDisplayed() || vendorEmployeesTabSendEmailBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Vendor Employees Tab is not getting displayed correctly", true);
                return;
            }

            // Jobs Tab
            Utilities.Click(driver, vendorJobsTab);
            DynamicWait.mediumWait();

            if (!vendorJobsTabTable.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Vendor Jobs Tab is not getting displayed correctly", true);
                return;
            }

            // Notes & Attachments Tab
            Utilities.Click(driver, vendorNotesAttachmentsTab);
            DynamicWait.mediumWait();

            if (!vendorNotesAttachmentsTabAddBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Vendor Notes & Attachments Tab is not getting displayed correctly", true);
                return;
            }

            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.PASS,
                    "Vendor details functionality is working as expected", true);

            // Add test notes
            Utilities.WaitTillElementDisplayed(driver, vendorNotesAttachmentsTabAddBtn);
            Utilities.Click(driver, vendorNotesAttachmentsTabAddBtn);

            Utilities.WaitTillElementDisplayed(driver, vendorAddNotesDialog);

            Utilities.SendKeys(driver, vendorAddNotesInput, "Test");
            Utilities.SendKeysForFileUpload(driver, vendorAddNotesAttachmentInput, resumeAbsolutePath);
            Utilities.Click(driver, vendorAddNotesSaveBtn);

            WebElement toastMessage = driver.findElement(By.xpath("//*[@id='visible-content']/div/app-vendorsummary/div[3]/app-vendornotes/shared-notes/p-toast/div/p-toastitem/div/div/div/div[2]"));

            Utilities.WaitTillElementDisplayed(driver, toastMessage);
            String resultText = toastMessage.getText().trim();

            if (resultText.equals("Vendor Notes Added Successfully")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.PASS,
                        "Add Notes functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality", Status.WARNING,
                        "Add Notes functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyVendorDetailsFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyVendorDetailsFunctionality", true, e);
        }
    }
}
