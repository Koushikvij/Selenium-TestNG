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

public class HavanaCandidatePage {

    /**
     * Constructor
     */
    public HavanaCandidatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */
    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[3]")
    private WebElement candidateFromDashboard;
    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[1]/div[1]/div/input")
    private WebElement nameField;

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/input")
    private WebElement phoneField;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[1]/div[4]/div/select")
    private WebElement selectStatus;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div/div/div[2]/div[1]/div/div/p-dropdown/div/span")
    private WebElement chooseClient;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/input")
    private WebElement skillField;

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/select")
    private WebElement timestamp;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[2]/div[3]/div/select")
    private WebElement chooseCountry;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div[1]/div/div[1]/div[2]/div[4]/div/p-dropdown/div/span")
    private  WebElement chooseRecruiter;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[1]/div/button/span[2]")
    private WebElement addCandidateBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[2]/div/div/div[2]/div[2]/div/button")
    private WebElement searchBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement tableOfCandidate;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr/td")
    private WebElement candidateNotFoundRow;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]")
    private WebElement firstTableRow;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/div/button[2]")
    private WebElement addCandidateSaveBtn;

    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='industry']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id='profilesummary']")
    private WebElement profileSummaryInput;

    @FindBy(xpath = "//*[@id='currentposition']")
    private WebElement currentPositionInput;

    @FindBy(xpath = "//*[@id='totalexp']")
    private WebElement totalExpInput;

    @FindBy(xpath = "//*[@id='annualsalary']")
    private WebElement annualSalaryInput;

    @FindBy(xpath = "//*[@id='noticeperiod']")
    private WebElement noticePeriodInput;

    @FindBy(xpath = "//*[@id='keyskills']")
    private WebElement keySkillsInput;

    @FindBy(xpath = "//*[@id='employmentdetails']")
    private WebElement employmentDetailsInput;

    @FindBy(xpath = "//*[@id='industry']")
    private WebElement industryInput;

    @FindBy(xpath = "//*[@id='phonenumber']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[7]/div/div/textarea")
    private WebElement address1;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[8]/div/div/textarea")
    private WebElement address2;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[9]/div[1]/div/select")
    private WebElement chooseCountryDropdown;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[9]/div[2]/div/select")
    private WebElement chooseStateDropdown;

    @FindBy(xpath = "//*[@id='city']")
    private WebElement cityInput;

    @FindBy(xpath = "//*[@id='zip']")
    private WebElement zipInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[10]/div[2]/div/select")
    private WebElement genderDropdown;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[11]/div/div/textarea")
    private WebElement notesInput;

    @FindBy(xpath = "//*[@id='additionalinfo']")
    private WebElement referralInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[6]/div[1]/div")
    private WebElement workPermitRadio;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[1]/div/div/input")
    private WebElement chooseResumeFileInput;

    @FindBy(xpath ="/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/div[2]/form/div/div[12]/div/div/div/div/div/div/input")
    private WebElement documentsAttachmentFileInput;

    @FindBy(xpath = "//p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMessage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-notes/shared-notes/p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsgForNotesAndAttachment;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateadd/p-toast/div/p-toastitem/div/div/div/div[1]")
    private WebElement toastMsg2;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table/div/table/tbody/tr/td[14]/span/i")
    private WebElement firstCandidateUpdateIcon;

    @FindBy(xpath = "//html/body/app-root/app-pagelayout/section/div/div/div/app-updatecandidate/div[2]/div/div/div[2]/div/div/div/form/div[5]/div[2]/select")
    private WebElement updateCandidateGenderSelect;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatecandidate/div[2]/div/div/div[2]/div/div/div/form/div[19]/div[2]/input")
    private WebElement updateCandidateCityInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatecandidate/div[2]/div/div/div[2]/div/div/div/form/div[9]/div[2]/input")
    private WebElement updateCandidateCurrentPositionInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-updatecandidate/div[2]/div/div/div[2]/div/div/div/form/div[23]/div[1]/button")
    private WebElement updateCandidateSaveBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[1]/input")
    private WebElement selectCandidateCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement sendEmailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[4]/p-dialog/div/div/div[2]/form/div[3]/select")
    private WebElement selectEmailType;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[4]/p-dialog/div/div/div[3]/div/button[2]")
    private WebElement yesSendItBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[7]/div/a")
    private WebElement firstCandidateEmailAddress;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-searchcandidate/div[3]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[4]/div/a")
    private WebElement firstCandidateNameOnTable;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[1]")
    private WebElement detailsInDetailSection;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[2]")
    private WebElement jobsInDetailsPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[3]")
    private WebElement resumeInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[4]")
    private WebElement docsInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[5]")
    private WebElement notesAndAttachmentInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[6]")
    private WebElement interviewInDetailPage;

    @FindBy(xpath = "//html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[contains(text(),'Candidate')]")
    private WebElement candidateQAInDetailPage;

    @FindBy(xpath = "//html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/ul/li[contains(text(),'Job Q&A')]")
    private WebElement jobQAInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-details/div[1]/div[1]/h6")
    private WebElement BasicInformationHeading;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-details/div[2]/div[1]/h6")
    private WebElement summaryDetailsHeading;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-details/div[3]/div[1]/h6")
    private WebElement addressHeading;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-questionsanswers/div[1]/form/div/div[2]/div/button")
    private WebElement addQuestionBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[2]/div[2]/app-candidate-qa/div/div/div/div/div[2]/h6")
    private WebElement headingInsideJobQaInDetailPage;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[2]/aside/button")
    private WebElement candidateSummaryExpandBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-jobs/shared-candidate-jobs/div/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement tableForJobs;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-interview/div/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement tableForInterviews;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-interview/div/div/app-table-prime/p-table/div/div[1]/div/div[1]/div/input")
    private WebElement searchInputInCandidateDetail;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/div/div/button[1]")
    private WebElement toggleViewOfResumeSectionBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/div/div[1]/button[2]")
    private WebElement addResumeInCandidateDetailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/div/app-table-prime/p-table/div/div[2]/table")
    private WebElement tableForResumeInCandidateDetail;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/div/app-table-prime/p-table/div/div[2]/table/tbody")
    private WebElement tableBodyForResume;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/p-sidebar/div/div[2]/form/div/div/div[1]/div[1]/div/div/input")
    private WebElement resumeNameInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/p-sidebar/div/div[2]/form/div/div/div[1]/div[2]/div/div/textarea")
    private WebElement resumeDescInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/p-sidebar/div/div[2]/form/div/div/div[2]/div[2]/input")
    private WebElement attachResumeInCandidateDetailInput;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/p-sidebar/div/div[3]/div/button[2]")
    private WebElement saveResumeInCandidateDetailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-resume/shared-resume/p-sidebar/div/div[3]/div/button[1]")
    private WebElement cancelInCandidateDetailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-docs/div/div/button[2]")
    private WebElement addDocInCandidateDetailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-docs/div/div/button[1]")
    private WebElement toggleViewInDocsInDetailBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-notes/div/button")
    private WebElement addNoteInNotesAttachmentBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-jobs/shared-candidate-jobs/div/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement assignJobBtn;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateassignjob/div[2]/div/app-table-prime/p-table/div/div[2]/table/tbody/tr[1]/td[1]/input")
    private WebElement selectFirstJobCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidateassignjob/div[2]/div/app-table-prime/p-table/div/div[1]/div/div[2]/div[2]/button")
    private WebElement assignJobBtn2;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-notes/shared-notes/p-sidebar/div/div[2]/form/div[1]/textarea")
    private WebElement textAreaForNotesAndAttachmentInCandidateDetail;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-notes/shared-notes/p-sidebar/div/div[2]/form/div[2]/input")
    private WebElement addAttachmentInputInCandidateDetail;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/div/div/app-candidate-summary/div[3]/app-candidate-notes/shared-notes/p-sidebar/div/div[3]/div/button[2]")
    private WebElement addNoteInNotesAttachmentBtn2;

    /**
     * @Method_Description: Check if the name input field is visible inside candidate page.
     * @Method_Name: verifyNameField()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyNameField() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,nameField);
            DynamicWait.smallWait();

            if (!nameField.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyNameField",
                        Status.WARNING, "Name Field is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyNameField",
                        Status.PASS, "Name Field is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyNameField",
                    Status.FAIL, "Exception found in Method - verifyNameField", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Email input field is visible inside candidate page.
     * @Method_Name: verifyNameField()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyEmailField() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,emailField);
            DynamicWait.smallWait();

            if (!emailField.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmailField",
                        Status.WARNING, "Email Field is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmailField",
                        Status.PASS, "Email Field is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyEmailField",
                    Status.FAIL, "Exception found in Method - verifyEmailField", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Phone input field is visible inside candidate page.
     * @Method_Name: verifyPhoneField()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyPhoneField() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,phoneField);
            DynamicWait.smallWait();

            if (!phoneField.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPhoneField",
                        Status.WARNING, "Phone Field is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyPhoneField",
                        Status.PASS, "Phone Field is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyPhoneField",
                    Status.FAIL, "Exception found in Method - verifyPhoneField", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Select Status drop down is visible inside candidate page.
     * @Method_Name: verifySelectStatusDropDown()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifySelectStatusDropDown() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,selectStatus);
            DynamicWait.smallWait();

            if (!selectStatus.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySelectStatusDropDown",
                        Status.WARNING, "Select Status drop down is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySelectStatusDropDown",
                        Status.PASS, "Select Status is drop down is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifySelectStatusDropDown",
                    Status.FAIL, "Exception found in Method - verifySelectStatusDropDown", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Choose Client drop down is visible inside candidate page.
     * @Method_Name: verifyChooseClientDropDown()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyChooseClientDropDown() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,chooseClient);
            DynamicWait.smallWait();

            if (!chooseClient.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseClientDropDown",
                        Status.WARNING, "Choose client drop down is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseClientDropDown",
                        Status.PASS, "Choose client drop down is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseClientDropDown",
                    Status.FAIL, "Exception found in Method - verifyChooseClientDropDown", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Skill input field is visible inside candidate page.
     * @Method_Name: verifySkillField()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifySkillField() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,skillField);
            DynamicWait.smallWait();

            if (!skillField.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySkillField",
                        Status.WARNING, "Skill Field is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySkillField",
                        Status.PASS, "Skill Field is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifySkillField",
                    Status.FAIL, "Exception found in Method - verifySkillField", true, e);
        }
    }

    /**
     * @Method_Description: Check if the TimeStamp drop down is visible inside candidate page.
     * @Method_Name: verifyTimeStampDropDown()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyTimeStampDropDown() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,timestamp);
            DynamicWait.smallWait();

            if (!timestamp.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyTimeStampDropDown",
                        Status.WARNING, "TimeStamp drop down is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyTimeStampDropDown",
                        Status.PASS, "TimeStamp drop down is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyTimeStampDropDown",
                    Status.FAIL, "Exception found in Method - verifyTimeStampDropDown", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Choose country drop down is visible inside candidate page.
     * @Method_Name: verifyChooseCountryDropDown()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyChooseCountryDropDown() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,chooseCountry);
            DynamicWait.smallWait();

            if (!chooseCountry.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseCountryDropDown",
                        Status.WARNING, "Choose Country drop down is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseCountryDropDown",
                        Status.PASS, "Choose Country drop down is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseCountryDropDown",
                    Status.FAIL, "Exception found in Method - verifyChooseCountryDropDown", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Choose Recruiter drop down is visible inside candidate page.
     * @Method_Name: verifyChooseRecruiterDropDown()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void verifyChooseRecruiterDropDown() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,chooseRecruiter);
            DynamicWait.smallWait();

            if (!chooseRecruiter.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseRecruiterDropDown",
                        Status.WARNING, "Choose Recruiter drop down is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseRecruiterDropDown",
                        Status.PASS, "Choose Recruiter drop down is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifyChooseRecruiterDropDown",
                    Status.FAIL, "Exception found in Method - verifyChooseRecruiterDropDown", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Add Candidate Button is visible inside candidate page.
     * @Method_Name: checkVisibilityOfAddCandidateBtn()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void checkVisibilityOfAddCandidateBtn() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();

            if (!addCandidateBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkVisibilityOfAddCandidateBtn",
                        Status.WARNING, "Add Candidate Button is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkVisibilityOfAddCandidateBtn",
                        Status.PASS, "Add Candidate Button is visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkVisibilityOfAddCandidateBtn",
                    Status.FAIL, "Exception found in Method - checkVisibilityOfAddCandidateBtn", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Add Candidate Button is Enabled.
     * @Method_Name: checkAddCandidateBtnIsEnabled()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void checkAddCandidateBtnIsEnabled() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();

            if (!addCandidateBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAddCandidateBtnIsEnabled",
                        Status.WARNING, "Add Candidate Button is not Enabled.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkAddCandidateBtnIsEnabled",
                        Status.PASS, "Add Candidate Button is Enabled.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkAddCandidateBtnIsEnabled",
                    Status.FAIL, "Exception found in Method - checkVisibilityOfAddCandidateBtn", true, e);
        }
    }

    /**
     * @Method_Description: Check if the search Button is visible.
     * @Method_Name: checkSearchBtnIsVisible()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void checkSearchBtnIsVisible() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();

            if (!searchBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsVisible",
                        Status.WARNING, "Search Button is not Visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsVisible",
                        Status.PASS, "Search Button is Visible.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsVisible",
                    Status.FAIL, "Exception found in Method - checkSearchBtnIsVisible", true, e);
        }
    }

    /**
     * @Method_Description: Check if the Search Button is Enabled.
     * @Method_Name: checkSearchBtnIsEnabled()
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 15/04/2024
     */

    public void checkSearchBtnIsEnabled() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();

            if (!searchBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsEnabled",
                        Status.WARNING, "Search Button is not Enabled.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsEnabled",
                        Status.PASS, "Search Button is Enabled.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkSearchBtnIsEnabled",
                    Status.FAIL, "Exception found in Method - checkSearchBtnIsEnabled", true, e);
        }
    }

    /**
     * @Method_Description: Click on Search Button and observe the record in table.
     * @Method_Name: verifySearchBtn
     * @Input_Parameters: None
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 16/04/2024
     */

    public void verifySearchBtn() {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.mediumWait();
            Utilities.Click(driver,searchBtn);
            DynamicWait.mediumWait();
            List<WebElement> tableRows = tableOfCandidate.findElements(By.tagName("tr"));
            int numRows = tableRows.size();

            if (numRows <= 1) {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySearchBtn",
                        Status.WARNING, "Table is not populated.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("verifySearchBtn",
                        Status.PASS, "Table is populated.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("verifySearchBtn",
                    Status.FAIL, "Exception found in Method - verifySearchBtn", true, e);
        }
    }

    /**
     * @Method_Description: Search on Candidate page based on 'Name'.
     * @Method_Name: searchByName
     * @Input_Parameters: String name
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 16/04/2024
     */

    public void searchByName(String name) {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();
            Utilities.Click(driver,nameField);
            Utilities.SendKeys(driver,nameField,name);
            Utilities.Click(driver,searchBtn);
            DynamicWait.smallWait();
            // Locate all the 'Tr'.
            List<WebElement> tableRows = tableOfCandidate.findElements(By.tagName("tr"));
            System.out.println(tableRows.size());;
            // Locate all td inside first 'Tr'
            List<WebElement> tableData = firstTableRow.findElements(By.tagName("td"));
            // No of 'Td' inside 'Tr'
            int numTd = tableData.size();
            boolean nameFound = false;

            for (int i = 0; i < tableRows.size() - 1; i++) {
                WebElement row = tableRows.get(i);
                //When none of the data is found then the size of td is 1
                if(numTd > 1) {
                    WebElement nameCell = row.findElement(By.xpath("td[4]/div/a"));
                    String cellText = nameCell.getText().trim();

                    if (cellText.toLowerCase().contains(name.toLowerCase())) {
                        nameFound = true;
                    }
                } else {
                    ExtentTestManager.createAssertTestStepWithScreenshot("searchByName",
                            Status.PASS, "Candidate list not found.", true);
                    return;
                }
            }
            if (!nameFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByName",
                        Status.WARNING, "Candidate based on Name not found in the table.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByName",
                        Status.PASS, "Candidate based on 'Name' found in the table.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("searchByName",
                    Status.FAIL, "Exception found in Method - searchByName", true, e);
        }
    }

    /**
     * @Method_Description: Search on Candidate page based on 'email'.
     * @Method_Name: searchByName
     * @Input_Parameters: String email
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 24/04/2024
     */

    public void searchByEmail(String email) {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();
            Utilities.SendKeys(driver,emailField,email);
            Utilities.Click(driver,searchBtn);
            DynamicWait.mediumWait();
            // Locate all the 'Tr'.
            List<WebElement> tableRows = tableOfCandidate.findElements(By.tagName("tr"));
            // Locate all td inside first 'Tr'
            List<WebElement> tableData = firstTableRow.findElements(By.tagName("td"));
            // No of 'Td' inside 'Tr'
            int numTd = tableData.size();
            boolean emailFound = false;

            for (int i = 0; i < tableRows.size() - 1; i++) {
                WebElement row = tableRows.get(i);
                //When none of the data is found then the size of td is 1
                if(numTd > 1) {
                    WebElement nameCell = row.findElement(By.xpath("td[7]/div/a"));
                    String cellText = nameCell.getText().trim();

                    if (cellText.toLowerCase().contains(email.toLowerCase())) {
                        emailFound = true;
                    }
                } else {
                    ExtentTestManager.createAssertTestStepWithScreenshot("searchByEmail",
                            Status.PASS, "Candidate list not found.", true);
                    return;
                }
            }
            if (!emailFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByEmail",
                        Status.WARNING, "Candidate based on 'Email' not found in the table.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByEmail",
                        Status.PASS, "Candidate based on 'Email' found in the table.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("searchByEmail",
                    Status.FAIL, "Exception found in Method - searchByEmail", true, e);
        }
    }

    /**
     * @Method_Description: Search on Candidate page based on 'Phone'.
     * @Method_Name: searchByPhone
     * @Input_Parameters: String phone
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 24/04/2024
     */

    public void searchByPhone(String phone) {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();
            Utilities.SendKeys(driver,phoneField,phone);
            Utilities.Click(driver,searchBtn);
            DynamicWait.mediumWait();
            // Locate all the 'Tr'.
            List<WebElement> tableRows = tableOfCandidate.findElements(By.tagName("tr"));
            // Locate all td inside first 'Tr'
            List<WebElement> tableData = firstTableRow.findElements(By.tagName("td"));
            // No of 'Td' inside 'Tr'
            int numTd = tableData.size();
            boolean phoneFound = false;

            for (int i = 0; i < tableRows.size() - 1; i++) {
                WebElement row = tableRows.get(i);
                //When none of the data is found then the size of td is 1
                if(numTd > 1) {
                    WebElement nameCell = row.findElement(By.xpath("td[8]/div/span"));
                    String cellText = nameCell.getText().trim();

                    if (cellText.contains(phone)) {
                        phoneFound = true;
                    }
                } else {
                    ExtentTestManager.createAssertTestStepWithScreenshot("searchByPhone",
                            Status.PASS, "Candidate list not found.", true);
                    return;
                }
            }
            if (!phoneFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByPhone",
                        Status.WARNING, "Candidate based on 'Phone' not found in the table.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchByPhone",
                        Status.PASS, "Candidate based on 'Phone' found in the table.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("searchByPhone",
                    Status.FAIL, "Exception found in Method - searchByPhone", true, e);
        }
    }

    /**
     * @Method_Description: Search on Candidate page based on 'Skill'.
     * @Method_Name: searchBySkill
     * @Input_Parameters: String skill
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 24/04/2024
     */

    public void searchBySkill(String skill) {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.mediumWait();
            Utilities.Click(driver,skillField);
            Utilities.SendKeys(driver,skillField,skill);
            Utilities.Click(driver,searchBtn);
            DynamicWait.smallWait();
            // Locate all the 'Tr'.
            List<WebElement> tableRows = tableOfCandidate.findElements(By.tagName("tr"));
            // Locate all td inside first 'Tr'
            List<WebElement> tableData = firstTableRow.findElements(By.tagName("td"));
            // No of 'Td' inside 'Tr'
            int numTd = tableData.size();
            boolean skillFound = false;

            for (int i = 0; i < tableRows.size() - 1; i++) {
                WebElement row = tableRows.get(i);
                //When none of the data is found then the size of td is 1
                if(numTd > 1) {
                    WebElement nameCell = row.findElement(By.xpath("td[6]/div"));
                    String cellText = nameCell.getText().trim();

                    if (cellText.toLowerCase().contains(skill.toLowerCase())) {
                        skillFound = true;
                    }
                } else {
                    ExtentTestManager.createAssertTestStepWithScreenshot("searchBySkill",
                            Status.PASS, "Candidate list not found.", true);
                    return;
                }
            }
            if (!skillFound) {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchBySkill",
                        Status.WARNING, "Candidate based on 'Skill' not found in the table.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("searchBySkill",
                        Status.PASS, "Candidate based on 'Skill' found in the table.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("searchBySkill",
                    Status.FAIL, "Exception found in Method - searchBySkill", true, e);
        }
    }

    /**
     * @Method_Description : Verify navigation to 'Add Candidate' page and check the display of all input field
     * @Method_Name : VerifyAddCandidateFunctionality
     * @Input_Parameters : String expectedAddCandidateUrl, String resumePath, String documentAttachmentPath
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 24/04/24
     **/
    public void VerifyAddCandidateFunctionality(String expectedAddCandidateUrl, String resumePath, String documentAttachmentPath,String candidateUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            String documentAttachmentAbsolutePath = new File(documentAttachmentPath).getAbsolutePath();
            // Click on the 'Add Candidate' button
            Utilities.Click(driver, addCandidateBtn);
            DynamicWait.smallWait();

            // Verify the URL change to the Add Candidate page
            if (!driver.getCurrentUrl().equals(expectedAddCandidateUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("URL Verification", Status.WARNING,
                        "URL did not change as expected to 'Add Candidate'", true);
                return;
            }

            // Verify 'Save Add candidate' button
            if (!addCandidateSaveBtn.isDisplayed() || !addCandidateSaveBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Save Add Candidate Button Verification", Status.WARNING,
                        "Add Candidate button is not displayed or not clickable", true);
                return;
            }

            // Check if the specific input field on the 'Add Candidate' page is displayed
            if (!firstNameInput.isDisplayed() ||!lastNameInput.isDisplayed() ||!emailInput.isDisplayed() ||!profileSummaryInput.isDisplayed()
                    ||!currentPositionInput.isDisplayed() ||!totalExpInput.isDisplayed() ||!annualSalaryInput.isDisplayed()
                    ||!noticePeriodInput.isDisplayed() ||!keySkillsInput.isDisplayed() ||!employmentDetailsInput.isDisplayed()
                    ||!workPermitRadio.isDisplayed() ||!industryInput.isDisplayed() ||!phoneNumberInput.isDisplayed() ||!address1.isDisplayed()
                    ||!address2.isDisplayed() ||!chooseCountryDropdown.isDisplayed() ||!chooseStateDropdown.isDisplayed() ||!cityInput.isDisplayed()
                    ||!zipInput.isDisplayed() ||!genderDropdown.isDisplayed() ||!notesInput.isDisplayed() ||!referralInput.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Input Field Verification", Status.WARNING,
                        "Input fields on 'Candidate' first page are not displayed", true);
                return;
            }
//
//            if (!chooseResumeFileInput.isDisplayed() ||!documentsAttachmentFileInput.isDisplayed()) {
//                ExtentTestManager.createAssertTestStepWithScreenshot("File attachment verification", Status.WARNING,
//                        "Choose file attachment is not displayed", true);
//                return;
//            }

            // Input data to fields
            Utilities.SendKeysForFileUpload(driver, chooseResumeFileInput, resumeAbsolutePath);
            DynamicWait.mediumWait();

            Utilities.SendKeys(driver, firstNameInput, "Ankit");
            Utilities.SendKeys(driver, lastNameInput, "Raj");

            Random random = new Random();
            // Generate a random number up to 100000
            int randomNumber = random.nextInt(100000);

            // Append the random number to the email address
            String uniqueEmail = "test" + randomNumber + "@yopmail.com";
            System.out.println("Email address: " + uniqueEmail);
            Utilities.SendKeys(driver, emailInput, uniqueEmail);
            DynamicWait.smallWait();
            Utilities.SendKeys(driver, phoneNumberInput, "6666667666");

            Select select = new Select(chooseCountryDropdown);
            select.selectByVisibleText(" INDIA ");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver, notesInput, "Test");
            DynamicWait.smallWait();

            Utilities.SendKeysForFileUpload(driver, documentsAttachmentFileInput, documentAttachmentAbsolutePath);
            DynamicWait.smallWait();

            Utilities.Click(driver,addCandidateSaveBtn);
            DynamicWait.smallWait();

            if (driver.getCurrentUrl().equals(candidateUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddCandidateFunctionality", Status.PASS,
                        "'Add Candidate functionality is working as expected", true);
                //verify new candidate is added to the table.
                VerifyCandidateOnTable(uniqueEmail);

            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyAddCandidateFunctionality", Status.WARNING,
                        "'Add Candidate' functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Toast message not found for Add candidate",
                    Status.FAIL, "Exception found in Method - Toast message not found for Add candidate", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the newly added Candidate is shown at the table
     * @Method_Name : VerifyCandidateOnTable
     * @Input_Parameters : String emailAddress
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 18/04/24
     **/
    public void VerifyCandidateOnTable(String emailAddress) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.WaitTillElementDisplayed(driver,emailField);
            Utilities.SendKeys(driver,emailField,emailAddress);
            Utilities.Click(driver,searchBtn);
            DynamicWait.smallWait();
            WebElement emailRow = firstTableRow.findElement(By.xpath("td[7]/div/a"));

            String actualEmailAddress = emailRow.getText().trim();

            if (actualEmailAddress.equals(emailAddress)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCandidateOnTable", Status.PASS,
                        "Newly added Candidate is shown at the top of the table", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCandidateOnTable", Status.WARNING,
                        "Newly added Candidate is not shown at the top of the table", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyCandidateOnTable",
                    Status.FAIL, "Exception found in Method - VerifyCandidateOnTable", true, e);
        }
    }

    /**
     * @Method_Description : Verify if the update Candidate functionality is working as expected
     * @Method_Name : VerifyUpdateCandidateFunctionality
     * @Input_Parameters : None
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 18/04/24
     **/
    public void VerifyUpdateCandidateFunctionality() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,candidateFromDashboard);
            Utilities.Click(driver, firstCandidateUpdateIcon);
            Utilities.WaitForPageLoad(driver);

            Utilities.WaitTillElementDisplayed(driver, updateCandidateGenderSelect);
            Select select1 = new Select(updateCandidateGenderSelect);
            select1.selectByVisibleText("Male");
            DynamicWait.smallWait();

            Utilities.SendKeys(driver,updateCandidateCityInput,"Delhi");
            Utilities.SendKeys(driver,updateCandidateCurrentPositionInput,"Junior developer");

            Utilities.Click(driver, updateCandidateSaveBtn);

            String resultText = toastMessage.getText().trim();

            if (resultText.equals("Success")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateCandidateFunctionality", Status.PASS,
                        "'Update Candidate' functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateCandidateFunctionality", Status.WARNING,
                        "'Update Candidate' functionality is not working", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyUpdateCandidateFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyUpdateCandidateFunctionality", true, e);
        }
    }

    /**
     * @Method_Description : Send welcome email to candidate email.
     * @Method_Name : sendEmailToCandidate
     * @Input_Parameters : String option ,String message
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 19/04/24
     **/

    public String sendEmailToCandidate(String option) {
        WebDriver driver = BaseTest.getDriver();
        try {
            DynamicWait.smallWait();

            String emailAddress = firstCandidateEmailAddress.getText().trim();
            Utilities.Click(driver,selectCandidateCheckbox);
            Utilities.Click(driver,sendEmailBtn);


            Select select2 = new Select(selectEmailType);
            select2.selectByVisibleText(option);

            Utilities.Click(driver,yesSendItBtn);
            DynamicWait.smallWait();

            Utilities.WaitTillElementDisplayed(driver, toastMessage);
            String resultText = toastMessage.getText().trim();

            if (resultText.equals("Success")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("sendEmailToCandidate", Status.PASS,
                        "Send email functionality is working as expected ", true);
                return emailAddress;
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("sendEmailToCandidate", Status.WARNING,
                        "Send email functionality is not working.", true);
                return null;
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Toast message not found for sent email.",
                    Status.FAIL, "Exception found in Method - Toast message not found for sent email", true, e);
            return null;
        }
    }

    /**
     * @Method_Description : Check the sections of candidate detail page and verify everything in sections is working.
     * @Method_Name : checkCandidateDetails
     * @Input_Parameters : ResumePath
     * @Output_Parameters : None
     * @Modified_By : Ankit Raj
     * @Modified_Date : 25/04/24
     **/

    public void checkCandidateDetails(String resumePath) {
        WebDriver driver = BaseTest.getDriver();
        try {
            String resumeAbsolutePath = new File(resumePath).getAbsolutePath();
            Utilities.Click(driver,firstCandidateNameOnTable);
            DynamicWait.smallWait();

            if(!detailsInDetailSection.isDisplayed() ||!jobsInDetailsPage.isDisplayed() ||!resumeInDetailPage.isDisplayed()
                    ||!docsInDetailPage.isDisplayed() ||!notesAndAttachmentInDetailPage.isDisplayed() ||! interviewInDetailPage.isDisplayed()
                    ||!interviewInDetailPage.isDisplayed() ||!candidateQAInDetailPage.isDisplayed() ||!jobQAInDetailPage.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Check the presence of details page elements",Status.WARNING,
                        "Elements inside detail page is not visible.", true);
                return;
            }

            DynamicWait.smallWait();
            if (!BasicInformationHeading.isDisplayed() ||!summaryDetailsHeading.isDisplayed() ||!addressHeading.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Observe Basic Detail in Candidate Detail page", Status.WARNING,
                        "Elements inside job in detail page is not visible.", true);
                return;
            }

            Utilities.Click(driver,jobsInDetailsPage);
            DynamicWait.smallWait();
            if(!tableForJobs.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to 'Jobs' section in Candidate Page and Observe",Status.WARNING,
                        "Elements Inside jobs section is not visible.",true);
            }
            String urlBeforeNavigation = driver.getCurrentUrl();
            Utilities.Click(driver,assignJobBtn);
            DynamicWait.smallWait();
            //Select the first row in job table
            Utilities.Click(driver,selectFirstJobCheckbox);
            Utilities.Click(driver,assignJobBtn2);
            DynamicWait.smallWait();
            if(!driver.getCurrentUrl().equalsIgnoreCase(urlBeforeNavigation)){
                ExtentTestManager.createAssertTestStepWithScreenshot("Assign a job to the candidate",Status.WARNING,
                        "Job is not assigned to the candidate",true);
            }

            Utilities.Click(driver,resumeInDetailPage);
            Utilities.Click(driver,toggleViewOfResumeSectionBtn);
            DynamicWait.smallWait();
            if (!addResumeInCandidateDetailBtn.isDisplayed() && !addResumeInCandidateDetailBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to 'resume' in detail page and observe", Status.WARNING,
                        "Elements inside resume in detail page is not visible.", true);
                return;
            }

            Utilities.Click(driver,addResumeInCandidateDetailBtn);
            DynamicWait.smallWait();
            Utilities.SendKeys(driver,resumeNameInput,"Test");
            Utilities.SendKeys(driver,resumeDescInput,"Test");
            DynamicWait.smallWait();
            Utilities.SendKeysForFileUpload(driver,attachResumeInCandidateDetailInput,resumeAbsolutePath);
            DynamicWait.smallWait();
            Utilities.Click(driver,saveResumeInCandidateDetailBtn);


            if(!toastMessage.isDisplayed()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check Add Resume attachement and verify in Resume Table",Status.WARNING,
                        "New Resume is not Added",true);
                Utilities.Click(driver,cancelInCandidateDetailBtn);
            }

            //Navigate to docs section.
            DynamicWait.smallWait();
            Utilities.Click(driver,docsInDetailPage);
            if(!addDocInCandidateDetailBtn.isDisplayed() && !toggleViewInDocsInDetailBtn.isDisplayed() && !addDocInCandidateDetailBtn.isEnabled()
                    && !toggleViewInDocsInDetailBtn.isEnabled()){
                ExtentTestManager.createAssertTestStepWithScreenshot("Check all button in section docs is visible and enabled",Status.WARNING,
                        "Button is not visible or enabled for docs section in Detail page.",true);
            }

//             Navigate to notes and attachment in detail page
            Utilities.Click(driver,notesAndAttachmentInDetailPage);
            DynamicWait.smallWait();

            if (!addNoteInNotesAttachmentBtn.isDisplayed() && !addNoteInNotesAttachmentBtn.isEnabled()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to 'docs' in detail page and observe", Status.WARNING,
                        "Elements inside 'docs' in detail page is not visible.", true);
                return;
            }
            Utilities.Click(driver,addNoteInNotesAttachmentBtn);
            Utilities.SendKeys(driver,textAreaForNotesAndAttachmentInCandidateDetail,"Test Notes");
            Utilities.SendKeysForFileUpload(driver,addAttachmentInputInCandidateDetail,resumeAbsolutePath);
            DynamicWait.smallWait();
            Utilities.Click(driver,addNoteInNotesAttachmentBtn2);

            if(!toastMsgForNotesAndAttachment.getText().equalsIgnoreCase("Success")){
                ExtentTestManager.createAssertTestStepWithScreenshot("Add note functionality in notes and Attachement in Detail page"
                        ,Status.WARNING,"Add note functionality is not working",true);
            }


            //Navigate to interview in detail page.
            Utilities.Click(driver,interviewInDetailPage);
            DynamicWait.smallWait();

            if (!tableForInterviews.isDisplayed() || !searchInputInCandidateDetail.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to 'Interview' section in detail page and observe", Status.WARNING,
                        "Elements inside interview is not visible", true);
                return;
            }

            //Navigate to Candidate Q&A Section
            Utilities.Click(driver,candidateQAInDetailPage);
            DynamicWait.smallWait();

            if (!addQuestionBtn.isDisplayed()) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to 'Candidate QA' section in detail page and observe", Status.WARNING,
                        "Elements inside Candidate QA is not visible.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("checkCandidateDetails", Status.PASS,
                        "Everything in candidate detail page is working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("checkCandidateDetails",
                    Status.FAIL, "Exception found in Method - checkCandidateDetails", true, e);
        }
    }
}
