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

public class HavanaClientPage {

    /**
     * Constructor
     */
    public HavanaClientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */
    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[6]/div/a")
    private WebElement clientFromSideMenu;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[1]")
    private WebElement allSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[2]")
    private WebElement leadSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[3]")
    private WebElement suspectSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[4]")
    private WebElement prospectSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[6]")
    private WebElement closedSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[2]/div/a[5]")
    private WebElement soldSection;

    @FindBy(xpath = "//*[@id='pn_id_103-table']")
    private WebElement table;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement tablebody;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[3]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchKeywordInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[1]/button")
    private WebElement addClientBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[1]/div[1]/div/input")
    private WebElement companyNameInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[1]/div[2]/div/select")
    private WebElement chooseStatusInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[2]/div[1]/div/input")
    private WebElement emailInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[2]/div[2]/div/select")
    private WebElement chooseCountryInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[3]/div[1]/div/input")
    private WebElement addressInAddClient;

    @FindBy(xpath = "//*[@id='uploadFIle']")
    private WebElement logoUploadInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[2]/form/div/div[5]/div[1]/div/input")
    private WebElement phoneInAddClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-sidebar/div/div[3]/div/div/button[2]")
    private WebElement saveClientBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]")
    private WebElement firstTableRow;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr/td[9]/span/i")
    private WebElement updateClientPageIcon;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updateclientsummary/div[2]/app-updateclient/div/div/div[1]/div[2]/form/div/div[2]/div[2]/div/input")
    private WebElement updateClientAddress2;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updateclientsummary/div[2]/app-updateclient/div/div/div[1]/div[2]/form/div/div[3]/div/div/select")
    private WebElement updateClientStateSelect;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updateclientsummary/div[2]/app-updateclient/div/div/div[2]/button[2]/span[1]")
    private WebElement updateClientBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[2]/div/a")
    private WebElement firstNameOnTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/ul/li[1]")
    private WebElement clientDetailsSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/ul/li[2]")
    private WebElement adminDetailSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/ul/li[3]")
    private WebElement jobsSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/ul/li[4]")
    private WebElement reportsSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/ul/li[5]")
    private WebElement notesAndAttachmentSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientdetails/div/div[1]/h6")
    private WebElement clientDetailsHeading;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientdetails/div/div[1]/div/button")
    private WebElement clientDetailEditBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientadmindetails/div/div[1]/h6")
    private WebElement adminDetailHeading;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientadmindetails/div/div[1]/div/button[2]")
    private WebElement adminDetailEditBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientjobs/div/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement jobsSectionTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientreports/div/div/div/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement reportsSectionTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientsummary/div[3]/app-clientnotes/div/div/button")
    private WebElement notesAndAttachmentAddNoteBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-clientlist/p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForAddClient;

    /**
     * @Method_Description: Navigate to client page from Havana Dashboard.
     * @Method_Name: navigateToClientPage
     * @Input_Parameters:String String clientPageUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 26/04/2024
     */
    public void navigateToClientPage(String clientPageUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,clientFromSideMenu);
            Utilities.Click(driver,allSection);
            DynamicWait.smallWait();

            if (driver.getCurrentUrl().equals(clientPageUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("navigateToClientPage",
                        Status.PASS, "User is navigate to Client page", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("navigateToClientPage",
                        Status.WARNING, "User is not navigate to Client page", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("",
                    Status.FAIL, "Exception found in Method - navigateToClientPage", true, e);
        }
    }

    /**
     * @Method_Description: Check All the element are present in client page and button is visible.
     * @Method_Name: checkAllElementInClientPage
     * @Input_Parameters:String none
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 26/04/2024
     */
    public void checkAllElementInClientPage() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();
            if (!tablebody.isDisplayed() || !searchKeywordInput.isDisplayed() || !addClientBtn.isDisplayed() || !addClientBtn.isEnabled() ) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInClientPage",
                        Status.WARNING, "All the element in Client page is not displayed", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInClientPage",
                        Status.PASS, "All the element in Client page is displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInClientPage",
                    Status.FAIL, "Exception found in Method - checkAllElementInClientPage", true, e);
        }
    }

    /**
     * @Method_Description: Check the table is filtered by 3rd column status -> Lead,Suspect,Prospect,Closed and Sold.
     * @Method_Name: checkClientByStatus
     * @Input_Parameters:String none
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 29/04/2024
     */
    public void getClientByStatus() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,leadSection);
            DynamicWait.smallWait();
            List<WebElement> leadTableRows = tablebody.findElements(By.tagName("tr"));
            boolean statusLeadFound = true;

            for(int i=0; i < leadTableRows.size()-1; i++){
                WebElement row  = leadTableRows.get(i);

                WebElement statusCell = row.findElement(By.xpath("td[3]/div/span"));
                String statusText = statusCell.getText().trim();

                if(!statusText.equals("Lead")){
                    statusLeadFound=false;
                    break;
                }
            }

            if (!statusLeadFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatusLead",
                        Status.WARNING, "Client based on status Lead not found", true);
            }

            Utilities.Click(driver,suspectSection);
            DynamicWait.smallWait();
            List<WebElement> suspectTableRows = tablebody.findElements(By.tagName("tr"));
            boolean statusSuspectFound = true;

            for(int i=0; i < suspectTableRows.size()-1; i++){
                WebElement row  = suspectTableRows.get(i);

                WebElement statusCell = row.findElement(By.xpath("td[3]/div/span"));
                String statusText = statusCell.getText().trim();

                if(!statusText.equals("Suspect")){
                    statusSuspectFound=false;
                    break;
                }
            }

            if (!statusSuspectFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatusSuspect",
                        Status.WARNING, "Client based on status Suspect not found", true);
            }

            Utilities.Click(driver,prospectSection);
            DynamicWait.smallWait();
            List<WebElement> prospectTableRows = tablebody.findElements(By.tagName("tr"));
            boolean statusProspectFound = true;

            for(int i=0; i < prospectTableRows.size()-1; i++){
                WebElement row  = prospectTableRows.get(i);

                WebElement statusCell = row.findElement(By.xpath("td[3]/div/span"));
                String statusText = statusCell.getText().trim();

                if(!statusText.equals("Prospect")){
                    statusProspectFound=false;
                    break;
                }
            }

            if (!statusProspectFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatusProspect",
                        Status.WARNING, "Client based on status Prospect not found", true);
            }

            Utilities.Click(driver,soldSection);
            DynamicWait.smallWait();
            List<WebElement> soldTableRows = tablebody.findElements(By.tagName("tr"));
            boolean statusSoldFound = true;

            for(int i=0; i < soldTableRows.size()-1; i++){
                WebElement row  = soldTableRows.get(i);

                WebElement statusCell = row.findElement(By.xpath("td[3]/div/span"));
                String statusText = statusCell.getText().trim();

                if(!statusText.equals("Sold")){
                    statusSoldFound=false;
                    break;
                }
            }

            Utilities.Click(driver,closedSection);
            DynamicWait.smallWait();
            List<WebElement> closedTableRows = tablebody.findElements(By.tagName("tr"));
            boolean statusClosedFound = true;

            for(int i=0; i < closedTableRows.size()-1; i++){
                WebElement row  = closedTableRows.get(i);

                WebElement statusCell = row.findElement(By.xpath("td[3]/div/span"));
                String statusText = statusCell.getText().trim();

                if(!statusText.equals("Closed")){
                    statusClosedFound=false;
                    break;
                }
            }

            if (!statusClosedFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatusClosed",
                        Status.WARNING, "Client based on status Closed not found", true);
            }

            if (!statusSoldFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatusSold",
                        Status.WARNING, "Client based on status Sold not found", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatus",
                        Status.PASS, "Client based on status Lead,Suspect,Prospect,Closed and Sold is displayed respectively", true);
            }

        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkClientBasedOnStatus",
                    Status.FAIL, "Exception found in Method - checkClientBasedOnStatus", true, e);
        }
    }


    /**
     * @Method_Description : Verify the functionality of Add client page.
     * @Method_Name : VerifyAddClientFunctionality
     * @Input_Parameters : String documentAttachmentPath
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 29/04/24
     **/
    public void VerifyAddClientFunctionality(String documentAttachmentPath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String documentAttachmentAbsolutePath = new File(documentAttachmentPath).getAbsolutePath();
            // Click on the 'Add Candidate' button
            Utilities.Click(driver, addClientBtn);
            DynamicWait.smallWait();


            // Verify 'Save Add client' button
            if (!saveClientBtn.isDisplayed() || !saveClientBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Add Candidate Button Verification", Status.WARNING,
                        "Save Client button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add Candidate' page is displayed
            if (!companyNameInAddClient.isDisplayed() ||!chooseStatusInAddClient.isDisplayed() ||!emailInAddClient.isDisplayed()
                    ||!chooseCountryInAddClient.isDisplayed() ||!addressInAddClient.isDisplayed() ) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Add client' page are not displayed", true);
                return;
            }


            // Input data to fields
            Random random = new Random();
            // Generate a random number up to 100000
            int randomNumber = random.nextInt(100000);
            String uniqueCompanyName = "Testing" + randomNumber;

            Utilities.SendKeys(driver, companyNameInAddClient, uniqueCompanyName);

            Select select1 = new Select(chooseStatusInAddClient);
            select1.selectByVisibleText("Lead");


            // Append the random number to the email address
            String uniqueEmail = "testing" + randomNumber + "@yopmail.com";
            System.out.println("Email address: " + uniqueEmail);
            Utilities.SendKeys(driver, emailInAddClient, uniqueEmail);
            DynamicWait.smallWait();

            Select select = new Select(chooseCountryInAddClient);
            select.selectByVisibleText("INDIA");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver, phoneInAddClient, "6666667666");

            Utilities.SendKeys(driver, addressInAddClient, "Address");


            Utilities.SendKeysForFileUpload(driver, logoUploadInAddClient, documentAttachmentAbsolutePath);
            DynamicWait.mediumWait();

            Utilities.Click(driver,saveClientBtn);
            DynamicWait.smallWait();


            if (toastMsgForAddClient.getText().equalsIgnoreCase("Success")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddClientFunctionality", Status.PASS,
                        "Add Client functionality is working as expected.", true);
                //verify new candidate is added to the table.
                VerifyClientOnTable(uniqueEmail);

            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddClientFunctionality", Status.WARNING,
                        "'Add Client' functionality is not working.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddClientFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyAddClientFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the newly added Client is shown at the table
     * @Method_Name : VerifyClientOnTable
     * @Input_Parameters : String emailAddress
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 29/04/24
     **/
    public void VerifyClientOnTable(String emailAddress) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver,searchKeywordInput);
            Utilities.Click(driver,allSection);
            Utilities.SendKeys(driver,searchKeywordInput,emailAddress);
            DynamicWait.smallWait();
            WebElement emailRow = firstTableRow.findElement(By.xpath("td[4]/div/a"));

            String actualEmailAddress = emailRow.getText().trim();

            if (actualEmailAddress.equals(emailAddress)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyClientOnTable", Status.PASS,
                        "Newly added Client is shown at the top of the table", true);

            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyClientOnTable", Status.WARNING,
                        "Newly added Client is not shown at the top of the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyClientOnTable",
                    Status.FAIL, "Exception found in Method - VerifyClientOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update Client functionality is working as expected
     * @Method_Name :  VerifyUpdateClientFunctionality
     * @Input_Parameters : ClientPageURl
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 29/04/24
     **/
    public void VerifyUpdateClientFunctionality(String clientPageURL) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,updateClientPageIcon);
            Utilities.WaitForPageLoad(driver);

            Select select1 = new Select(updateClientStateSelect);
            select1.selectByVisibleText("Delhi");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver,updateClientAddress2,"Address2");

            Utilities.Click(driver, updateClientBtn);
            DynamicWait.smallWait();

//            Utilities.WaitTillElementDisplayed(driver, toastMessage);
//            String resultText = toastMessage.getText().trim();


            //When updated it will redirect to client page.

            if (driver.getCurrentUrl().equals(clientPageURL)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateClientFunctionality", Status.PASS,
                        "'Update Client' functionality is working as expected but Modify the test method when toast msg will work", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateClientFunctionality", Status.WARNING,
                        "'Update Client' functionality is not working", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateClientFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyUpdateClientFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Check the sections of candidate detail page and verify everything in sections.
     * @Method_Name : checkClientDetails
     * @Input_Parameters : ResumePath
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 30/04/24
     **/

    public void checkClientDetails() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,firstNameOnTable);
            DynamicWait.smallWait();
            if(!clientDetailsSection.isDisplayed() || !adminDetailSection.isDisplayed() ||!jobsSection.isDisplayed()
                    ||!reportsSection.isDisplayed() ||!notesAndAttachmentSection.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check all section in Client Detail Page",Status.WARNING,
                        "All the section in Client Detail is not displayed", true);
            }
            if(!clientDetailsHeading.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the client detail element",Status.WARNING,
                        "Client detail is not visible.", true);
            }

            Utilities.Click(driver,adminDetailSection);
            DynamicWait.smallWait();
            if(!adminDetailHeading.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the admin Detail element",Status.WARNING,
                        "Admin Detail Element is now visible",true);
            }
            Utilities.Click(driver,jobsSection);
            DynamicWait.smallWait();
            if(!jobsSectionTable.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the jobs element in Client Detail page",Status.WARNING,
                        "Table inside jobs is not visible.",true);
            }
            Utilities.Click(driver,reportsSection);
            DynamicWait.smallWait();
            if(!reportsSectionTable.isDisplayed())
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Reports element in Client Detail page",Status.WARNING,
                        "Table inside Reports is not visible",true);

            Utilities.Click(driver,notesAndAttachmentSection);
            DynamicWait.smallWait();
            if (!notesAndAttachmentAddNoteBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Notes And Attachment in Client Detail page", Status.WARNING,
                        "Elements inside Notes And Attachment  is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkClientDetailSectionElements", Status.PASS,
                        "Everything in Client detail page is displayed as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkCandidateDetails",
                    Status.FAIL, "Exception found in Method - checkCandidateDetails", true, e);
        }
    }

}
