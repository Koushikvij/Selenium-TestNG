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

import javax.security.auth.x500.X500Principal;
import java.io.File;
import java.util.List;
import java.util.Random;

public class HavanaJobsPage {
    /**
     * Constructor
     */
    public HavanaJobsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */
    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[2]/div/a")
    private WebElement jobFromDashboard;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[2]/ul/li[1]/a")
    private WebElement jobList;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement tableBodyInJobListPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[1]/button")
    private WebElement createNewJobBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/form/div/div[1]/div[1]/div/input")
    private WebElement titleInCreateNewJobPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/form/div/div[2]/div[3]/div/input")
    private WebElement jobCodeInCreateNewJobPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/form/div/div[3]/div[2]/div/textarea")
    private WebElement shortDescInCreateNewJobPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/form/div/div[1]/div[2]/div/select")
    private WebElement jobLocationSelectInCreateNewJobPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/form/div/div[5]/div[1]/div/select")
    private WebElement selectHiringManager;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-addjob/div[2]/div/button[2]")
    private WebElement createNewJobSaveBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr")
    private WebElement firstTableRow;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr/td[12]/span/i")
    private WebElement updateJobPageIcon;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatejobs/div[2]/form/div/div[4]/div[1]/div/select")
    private WebElement chooseCountryInUpdateJob;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatejobs/div[2]/form/div/div[7]/div/div/textarea")
    private WebElement longDescInUpdateJob;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatejobs/div[2]/div/button[2]")
    private WebElement updateJobBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobslist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[3]/div/a")
    private WebElement firstJobCodeInTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[1]")
    private WebElement detailsInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-details/div[2]/div[1]/h6")
    private WebElement detailsHeadingInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[2]")
    private WebElement notesAndAttachmentInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-notes/div/div/button")
    private WebElement addANoteBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[5]")
    private WebElement recruiterInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobrecruiter/div/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement recruiterTableBody;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[6]")
    private WebElement interviewerInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobinterviewers/div/form/div/div[2]/div/div[2]/button")
    private WebElement addInterviewerBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[7]")
    private WebElement candidateInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-candidates/div/div/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement candidateTableBody;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[8]")
    private WebElement interviewInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobinterview/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement interviewTableBody;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[9]")
    private WebElement vendorsInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobvendor/div/div/div[2]/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement vendorAssignBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/ul/li[10]")
    private WebElement jobQuestionInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-job-qa/div/div/div/div/div/div/div[2]/form[2]/div/div[2]/div[1]/button")
    private WebElement addQuestionBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[2]/ul/li[2]")
    private WebElement jobsInterview;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement tableBodyOfInterview;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInputOfInterview;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[2]/div/a")
    private WebElement firstTableRowInterviewId;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[2]/td[2]/div/a")
    private WebElement secondTableRowInterviewId;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewslist-details/div[3]/p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForInterviewSummary;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-notes/div/shared-notes/p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForAddNotesAndAttachment;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewslist-details/div[3]/div/div[3]/div/div[2]/textarea")
    private WebElement addNoteInputInInterviewSummary;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewslist-details/div[3]/div/div[3]/div/div[3]/div/input")
    private WebElement addAttachmentInputInInterviewSummary;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-interviewslist-details/div[3]/div/div[3]/div/div[4]/button")
    private WebElement addNoteInInterviewSummaryBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-notes/div/shared-notes/p-sidebar/div/div[2]/form/div[1]/textarea")
    private WebElement addNoteTextField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-notes/div/shared-notes/p-sidebar/div/div[2]/form/div[2]/input")
    private WebElement addAttachmentInNotesAndAttachment;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-notes/div/shared-notes/p-sidebar/div/div[3]/div/button[2]")
    private WebElement addNoteBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobrecruiter/div/form/div/div[2]/div/div[1]/div/p-multiselect/div/div[2]")
    private WebElement selectRecruiter;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/ul/p-multiselectitem[3]/li/div")
    private WebElement selectRecruiterCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobrecruiter/div/form/div/div[2]/div/div[2]/button")
    private WebElement addRecruiterBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobrecruiter/p-toast[2]/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForAddRecruiter;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobinterviewers/div/form/div/div[2]/div/div[1]/div/p-multiselect/div/div[2]")
    private WebElement selectInterviewer;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobinterviewers/div/form/div/div[2]/div/div[1]/div/p-multiselect/div/p-overlay/div/div/div/div[2]/ul/p-multiselectitem[1]/li/div/div")
    private WebElement selectInterviewerCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobdetails/div[3]/app-jobinterviewers/p-toast[2]/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForAddInterviewer;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/div/div[1]/a")
    private WebElement timeStampDropdownInJobInterviewPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-jobinterviewlist/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/div/div[2]/nav[1]/div/ul/li[1]/a")
    private WebElement selectScheduledTimeStamp;



    /**
     * @Method_Description: Navigate to Jobs ->List page from Havana Dashboard.
     * @Method_Name: navigateToJobsListPage
     * @Input_Parameters:String String jobListPageUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 30/04/2024
     */
    public void navigateToJobsListPage(String jobListPageUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,jobFromDashboard);
            Utilities.Click(driver,jobList);
            DynamicWait.smallWait();

            if (driver.getCurrentUrl().equals(jobListPageUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("navigateToJobListPage",
                        Status.PASS, "User is navigated to Job list page", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("navigateToJobListPage",
                        Status.WARNING, "User is not navigate to Job List  page", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("",
                    Status.FAIL, "Exception found in Method - navigateToJobListPage", true, e);
        }
    }

    /**
     * @Method_Description: Check All the element and button is visible in Job List page.
     * @Method_Name: checkAllElementInJobListPage
     * @Input_Parameters:String none
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 01/05/2024
     */
    public void checkAllElementInJobListPage() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();
            if (!tableBodyInJobListPage.isDisplayed() ||!searchInput.isDisplayed() ||!createNewJobBtn.isDisplayed() ||!createNewJobBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobListPage",
                        Status.WARNING, "All the element in Jobs List page  is not displayed", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobListPage",
                        Status.PASS, "All the element in Jobs List page is displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobListPage",
                    Status.FAIL, "Exception found in Method - checkAllElementInJobListPage", true, e);
        }
    }

    /**
     * @Method_Description : Verify the functionality of create new job page.
     * @Method_Name : VerifyCreateNewJobFunctionality
     * @Input_Parameters : String expectedAddJobUrl,String clientUrl
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 01/05/24
     **/
    public void VerifyCreateNewJobFunctionality(String expectedAddJobUrl, String jobListPageUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            // Click on the 'Create New Job' button
            Utilities.Click(driver, createNewJobBtn);
            DynamicWait.smallWait();

            // Verify the URL change to the Add job page
            if (!driver.getCurrentUrl().equals(expectedAddJobUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("URL Verification", Status.WARNING,
                        "URL did not change as expected to 'Add Job'", true);
                return;
            }

            // Verify 'Save Job' button
            if (!createNewJobSaveBtn.isDisplayed() || !createNewJobSaveBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Add Job Button Verification", Status.WARNING,
                        "Save job button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add job' page is displayed
            if (!titleInCreateNewJobPage.isDisplayed() ||!jobCodeInCreateNewJobPage.isDisplayed() ||!shortDescInCreateNewJobPage.isDisplayed()
                    ||!jobLocationSelectInCreateNewJobPage.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Add Job' page are not displayed", true);
                return;
            }

            Utilities.SendKeys(driver,titleInCreateNewJobPage,"TestJob");
            Select select = new Select(jobLocationSelectInCreateNewJobPage);
            select.selectByVisibleText("INDIA");

            // Input data to fields
            Random random = new Random();
            // Generate a random number up to 100000
            int randomNumber = random.nextInt(1000);
            String uniqueJobCode = "" +randomNumber;

            Utilities.SendKeys(driver,jobCodeInCreateNewJobPage , uniqueJobCode);
            Utilities.SendKeys(driver,shortDescInCreateNewJobPage,"Testing");

            Select select1 = new Select(selectHiringManager);
            select1.selectByIndex(1);

            Utilities.Click(driver,createNewJobSaveBtn);
            DynamicWait.smallWait();

//            Utilities.WaitTillElementDisplayed(driver, toastMessage);
//            String resultText = toastMessage.getText().trim();

            if (driver.getCurrentUrl().equals(jobListPageUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCreateNewJobFunctionality", Status.PASS,
                        "Add Job functionality is working as expected.", true);
                //verify new job is added to the table.
                verifyJobsOnTable(uniqueJobCode);

            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCreateNewJobFunctionality", Status.WARNING,
                        "'Add job' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCreateNewJobFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyCreateNewJobFunctionality", true, e);
        }
    }


    /**
     * @Method_Description : Verify if the newly added job is shown at the table.
     * @Method_Name : VerifyJobOnTable
     * @Input_Parameters : String uniqueJobCode
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 02/05/24
     **/
    public void verifyJobsOnTable(String uniqueJobCode) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver,searchInput);
            Utilities.SendKeys(driver,searchInput,uniqueJobCode);
            DynamicWait.smallWait();
            WebElement emailRow = firstTableRow.findElement(By.xpath("td[3]/div/a"));

            String actualJobCode = emailRow.getText().trim();

            if (actualJobCode.equals(uniqueJobCode)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyJobsOnTable", Status.PASS,
                        "Newly added job is shown at the top of the table", true);

            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyJobsOnTable", Status.WARNING,
                        "Newly added job is not shown at the top of the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyJobsOnTable",
                    Status.FAIL, "Exception found in Method - verifyJobsOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update Job functionality is working as expected
     * @Method_Name : verifyUpdateJobFunctionality
     * @Input_Parameters : JobListUrl
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 02/05/24
     **/
    public void verifyUpdateJobFunctionality(String jobListUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,updateJobPageIcon);
            Utilities.WaitForPageLoad(driver);

            Select select1 = new Select(chooseCountryInUpdateJob);
            select1.selectByVisibleText(" INDIA ");
            DynamicWait.smallWait();

            // Utilities.SendKeys(driver, longDescInUpdateJob,"Some description");

            Utilities.Click(driver, updateJobBtn);
            DynamicWait.smallWait();

//            Utilities.WaitTillElementDisplayed(driver, toastMessage);
//            String resultText = toastMessage.getText().trim();


            //When updated it will redirect to client page.

            if (driver.getCurrentUrl().equals(jobListUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyUpdateJobFunctionality", Status.PASS,
                        "'Update Job' functionality is working as expected. ", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyUpdateJobFunctionality", Status.WARNING,
                        "'Update Job' functionality is not working", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyUpdateJobFunctionality",
                    Status.FAIL, "Exception found in Method - verifyUpdateJobFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Check the sections of candidate detail page and verify everything in sections.
     * @Method_Name : checkJobListDetails
     * @Input_Parameters : String documentAttachmentPath
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 06/05/24
     **/

    public void checkJobListDetails(String documentAttachmentPath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String documentAttachmentAbsolutePath = new File(documentAttachmentPath).getAbsolutePath();
            Utilities.Click(driver,firstJobCodeInTable);
            DynamicWait.smallWait();

            if(!detailsInDetailPage.isDisplayed() ||!notesAndAttachmentInDetailPage.isDisplayed() ||!recruiterInDetailPage.isDisplayed()
                    ||!interviewerInDetailPage.isDisplayed() ||!candidateInDetailPage.isDisplayed() ||!interviewInDetailPage.isDisplayed()
                    ||!vendorsInDetailPage.isDisplayed() ||!jobQuestionInDetailPage.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check all section in Jobs Detail Page",Status.WARNING,
                        "All the section in Client Detail is not displayed", true);
            }
            if(!detailsHeadingInDetailPage.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the client detail element",Status.WARNING,
                        "Client detail is not visible.", true);
            }

            Utilities.Click(driver,notesAndAttachmentInDetailPage);
            DynamicWait.smallWait();
            if(!addANoteBtn.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Notes And Attachment Section element",Status.WARNING,
                        "Notes and attachment section Element is not visible",true);
            }
            Utilities.Click(driver,addANoteBtn);
            DynamicWait.smallWait();
            Utilities.SendKeys(driver,addNoteTextField,"Testing");
            Utilities.SendKeysForFileUpload(driver,addAttachmentInNotesAndAttachment,documentAttachmentAbsolutePath);
            Utilities.Click(driver,addNoteBtn);
            DynamicWait.smallWait();

            if(!toastMsgForAddNotesAndAttachment.getText().equals("Success")){
                ExtentTestManager.createAssertTestStepWithScreenshot("Add Note and upload document in Notes And Attachment in Job detail page",
                        Status.WARNING,"Add Note functionality is not working",true);
            }

            Utilities.Click(driver,recruiterInDetailPage);
            DynamicWait.smallWait();
            if(!recruiterTableBody.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Recruiter section element in Job Detail page",Status.WARNING,
                        "Table inside Recruiter is not visible.",true);
                return;
            }
            Utilities.Click(driver,selectRecruiter);
            Utilities.Click(driver,selectRecruiterCheckbox);
            Utilities.Click(driver,addRecruiterBtn);
            if(!toastMsgForAddRecruiter.getText().equalsIgnoreCase("Success")){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the add Recruiter Functionality",Status.WARNING,
                        "Add Recruiter Functionality is not working",true);
            }

            Utilities.Click(driver,interviewerInDetailPage);
            DynamicWait.smallWait();
            if(!addInterviewerBtn.isDisplayed())
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Interviewer section element in Job Detail page",Status.WARNING,
                        "Elements inside Interviewers is not visible",true);
            Utilities.Click(driver,selectInterviewer);
            Utilities.Click(driver,selectInterviewerCheckbox);
            Utilities.Click(driver,addInterviewerBtn);

            if(!toastMsgForAddInterviewer.getText().equals("Success")){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the add Interviwer Functionality",Status.WARNING,
                        "Add Interviewer functionality is not working",true);
            }

            Utilities.Click(driver,candidateInDetailPage);
            DynamicWait.smallWait();
            if(!candidateTableBody.isDisplayed())
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Candidate section element in Job Detail page",Status.WARNING,
                        "Table inside Candidate is not visible",true);

            Utilities.Click(driver,interviewInDetailPage);
            DynamicWait.smallWait();
            if(!interviewTableBody.isDisplayed())
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Interview section element in Job Detail page",Status.WARNING,
                        "Table inside Interview is not visible",true);

            Utilities.Click(driver,vendorsInDetailPage);
            DynamicWait.smallWait();
            if(!vendorAssignBtn.isDisplayed())
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Vendor section element in Job Detail page",Status.WARNING,
                        "Elements inside Vendor section is not visible",true);

            Utilities.Click(driver,jobQuestionInDetailPage);
            DynamicWait.smallWait();
            if (!addQuestionBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the Job Questions element in Job Detail page", Status.WARNING,
                        "Elements inside Job Questions is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkJobListDetails", Status.PASS,
                        "Everything in Job detail page is displayed as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkJobListDetails",
                    Status.FAIL, "Exception found in Method -checkJobListDetails", true, e);
        }
    }

    /**
     * @Method_Description: Check All the element and button is visible in Job Interview page.
     * @Method_Name: checkAllElementInJobInterviewPage
     * @Input_Parameters:String none
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 03/05/2024
     */
    public void checkAllElementInJobInterviewPage() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,jobsInterview);
            DynamicWait.smallWait();
            if (!tableBodyOfInterview.isDisplayed() ||!searchInputOfInterview.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobInterviewPage",
                        Status.WARNING, "All the element in Jobs Interview page  is not displayed", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobInterviewPage",
                        Status.PASS, "All the element in Jobs Interview page is displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkAllElementInJobInterviewPage",
                    Status.FAIL, "Exception found in Method - checkAllElementInJobInterviewPage", true, e);
        }
    }

    /**
     * @Method_Description: Check the upload of file in interview summary page.
     * @Method_Name: checkInterviewSummaryPage
     * @Input_Parameters: String documentAttachmentPath
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 06/05/2024
     */
    public void checkInterviewSummaryPage(String documentAttachmentPath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String documentAttachmentAbsolutePath = new File(documentAttachmentPath).getAbsolutePath();
            Utilities.Click(driver,timeStampDropdownInJobInterviewPage);
            Utilities.Click(driver,selectScheduledTimeStamp);
            DynamicWait.smallWait();

            Utilities.Click(driver,firstTableRowInterviewId);
            DynamicWait.smallWait();

            Utilities.SendKeys(driver,addNoteInputInInterviewSummary,"Pdf Upload");
            Utilities.SendKeysForFileUpload(driver,addAttachmentInputInInterviewSummary,documentAttachmentAbsolutePath);
            Utilities.Click(driver,addNoteInInterviewSummaryBtn);

            if(toastMsgForInterviewSummary.getText().equals("Success")){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the upload of file",Status.PASS,
                        "File is uploaded",true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the upload of file",
                        Status.WARNING, "File is not uploaded", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Check the upload of file",
                    Status.FAIL, "Exception found in Method - Check the upload of file", true, e);
        }
    }
}