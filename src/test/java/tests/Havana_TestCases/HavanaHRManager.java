package tests.Havana_TestCases;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import utils.datahandlers.XMLHandler;
import utils.extentreports.ExtentTestManager;

import java.lang.reflect.Method;

public class HavanaHRManager extends BaseTest
{
    private final ThreadLocal<LaunchSite> launchSite = new ThreadLocal<>();
    private final ThreadLocal<Faker> faker = new ThreadLocal<>();
    private final ThreadLocal<HavanaLoginPage> havanaLoginPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaDashBoardPage> havanaDashBoardPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaCandidatePage> havanaCandidatePage = new ThreadLocal<>();
    private final ThreadLocal<HavanaInterviewersPage> havanaInterviewersPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaVendorPage> havanaVendorPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaClientPage> havanaClientPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaOrganizationPage> havanaOrganizationPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaJobsPage> havanaJobsPage = new ThreadLocal<>();
    private final ThreadLocal<YopmailPage> yopMailPage = new ThreadLocal<>();

    @BeforeMethod(alwaysRun = true)
    public void setUpBrowser()
    {
        setDriver();
        launchSite.set(new LaunchSite(getDriver()));
        faker.set(new Faker());
        havanaLoginPage.set(new HavanaLoginPage(getDriver()));
        havanaDashBoardPage.set(new HavanaDashBoardPage(getDriver()));
        havanaCandidatePage.set(new HavanaCandidatePage(getDriver()));
        havanaInterviewersPage.set(new HavanaInterviewersPage(getDriver()));
        havanaVendorPage.set(new HavanaVendorPage(getDriver()));
        havanaClientPage.set(new HavanaClientPage(getDriver()));
        havanaOrganizationPage.set(new HavanaOrganizationPage(getDriver()));
        havanaJobsPage.set(new HavanaJobsPage(getDriver()));
        yopMailPage.set(new YopmailPage(getDriver()));
    }

    /**
     *@Test_Method_Description : Testcases of Havana HR Manager
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 01/04/2024
     */
    @Parameters({"client"})
    @Test
    public void HavanaHRManager(Method m, String client)
    {
        ExtentTestManager.startTest(this.getClass().getSimpleName() + " :: " + m.getName(),
                "Testcases of Havana Login");

        // HR Manager

        String url2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "PlatformUrl");
        String dashboardURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "DashboardUrl");
        String username2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "Username");
        String password2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "Password");

        String forgotPasswordURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","ForgotPasswordUrl");
        String incorrectEmail2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "IncorrectEmail");
        String organizationURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "OrganizationURL");
        String jobsListURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "JobListURL");
        String jobsInterviewURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "JobInterviewsURL");
        String candidateURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "CandidateURL");
        String interviewersURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","InterviewerURL");
        String actionsURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","ActionsURL");
        String referralURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","ReferralUrl");
        String vendorURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","VendorURL");
        String addVendorURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddVendorURL");
        String auditLoginURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AuditLoginURL");
        String nameData2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","NameData");
        String emailData2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","EmailData");
        String phoneData2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","PhoneData");
        String skillData2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","SkillData");
        String addInterviewerURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddInterviewerURL");
        String addCandidatePageURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddCandidatePageURL");
        String resumePath2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "ResumeAttachment");
        String notesAttachmentPath2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "NotesAttachment");
        String yopMailUrl2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox", "YopMailUrl");
        String addClientURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddClientURL");
        String clientPageUrl2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","ClientPageURL");
        String employeePageURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","EmployeeURL");
        String addEmployeePageURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddEmployeeURL");
        String addJobPageURL2 = XMLHandler.readXMLData("Havana_HR_Manager_Sandbox","AddJobURL");

        // Test steps for HR Manager Role
        launchSite.get().LaunchPortal(url2);
        havanaLoginPage.get().verifyLoginWithCorrectCredentials(username2, password2, dashboardURL2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenu(username2, password2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenuSubMenu();
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckOrganizationPage(organizationURL2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobListPage(jobsListURL2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobInterviewsPage(jobsInterviewURL2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckCandidatePage(candidateURL2);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().verifyNameField();
        havanaCandidatePage.get().verifyEmailField();
        havanaCandidatePage.get().verifyPhoneField();
        havanaCandidatePage.get().verifySelectStatusDropDown();
        havanaCandidatePage.get().verifyChooseClientDropDown();
        havanaCandidatePage.get().verifySkillField();
        havanaCandidatePage.get().verifyTimeStampDropDown();
        havanaCandidatePage.get().verifyChooseCountryDropDown();
        havanaCandidatePage.get().verifyChooseRecruiterDropDown();
        havanaCandidatePage.get().checkVisibilityOfAddCandidateBtn();
        havanaCandidatePage.get().checkAddCandidateBtnIsEnabled();
        havanaCandidatePage.get().checkVisibilityOfAddCandidateBtn();
        havanaCandidatePage.get().checkSearchBtnIsVisible();
        havanaCandidatePage.get().checkSearchBtnIsEnabled();
        havanaCandidatePage.get().verifySearchBtn();
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByName(nameData2);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByEmail(emailData2);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByPhone(phoneData2);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchBySkill(skillData2);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().VerifyAddCandidateFunctionality(addCandidatePageURL2, resumePath2, notesAttachmentPath2, candidateURL2);
        BaseTest.getDriver().navigate().refresh();
        String emailAddress002 = havanaCandidatePage.get().sendEmailToCandidate("Welcome Email");
        String currentURL002 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl2);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress002);
        BaseTest.getDriver().navigate().to(currentURL002);
        havanaCandidatePage.get().checkCandidateDetails(resumePath2);
        havanaClientPage.get().navigateToClientPage(clientPageUrl2);
        havanaClientPage.get().checkAllElementInClientPage();
        havanaClientPage.get().getClientByStatus();
        havanaClientPage.get().VerifyAddClientFunctionality(notesAttachmentPath2);
        havanaClientPage.get().VerifyUpdateClientFunctionality(clientPageUrl2);
        havanaClientPage.get().checkClientDetails();
        havanaJobsPage.get().navigateToJobsListPage(jobsListURL2);
        havanaJobsPage.get().checkAllElementInJobListPage();
        havanaJobsPage.get().VerifyCreateNewJobFunctionality(addJobPageURL2, jobsListURL2);
        havanaJobsPage.get().verifyUpdateJobFunctionality(jobsListURL2);
        havanaJobsPage.get().checkJobListDetails(resumePath2);
        havanaJobsPage.get().checkAllElementInJobInterviewPage();
        havanaJobsPage.get().checkInterviewSummaryPage(resumePath2);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckInterviewersPage(interviewersURL2);
        havanaInterviewersPage.get().verifyInterviewersPageElementsAndTable();
        havanaInterviewersPage.get().VerifyAddInterviewerFunctionality(addInterviewerURL2, resumePath2, notesAttachmentPath2, interviewersURL2);
        havanaInterviewersPage.get().VerifyUpdateInterviewerFunctionality(interviewersURL2);
        havanaInterviewersPage.get().VerifySearchInterviewerFunctionality();
        String emailAddress2 = havanaInterviewersPage.get().VerifyInterviewerSendEmailFunctionality("Welcome Email", "Welcome Email Sent Successfully!");
        String currentURL2 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl2);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress2);
        BaseTest.getDriver().navigate().to(currentURL2);
        havanaVendorPage.get().TC_CheckVendorsPage(vendorURL2, "HR Manager");
        havanaVendorPage.get().verifyVendorsPageElementsAndTable();
        havanaVendorPage.get().VerifyAddVendorsFunctionality(notesAttachmentPath2);
        havanaVendorPage.get().VerifyUpdateVendorFunctionality(vendorURL2);
        havanaVendorPage.get().VerifySearchVendorFunctionality();
        BaseTest.getDriver().navigate().to(vendorURL2);
        havanaVendorPage.get().VerifyVendorDetailsFunctionality(resumePath2);
        havanaDashBoardPage.get().TC_CheckActionsPage(actionsURL2);
        havanaOrganizationPage.get().TC_CheckEmployeesPage(employeePageURL2);
        havanaOrganizationPage.get().verifyEmployeesPageElementsAndTable();
        havanaOrganizationPage.get().VerifyAddEmployeeFunctionality(addEmployeePageURL2, resumePath2, notesAttachmentPath2, employeePageURL2);
        havanaOrganizationPage.get().VerifyUpdateEmployeeFunctionality(employeePageURL2);
        havanaOrganizationPage.get().VerifySearchEmployeeFunctionality();
        String emailAddress23 = havanaOrganizationPage.get().VerifyEmployeeSendEmailFunctionality("Welcome Email", "Welcome Email Sent Successfully!");
        String currentURL23 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl2);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress23);
        BaseTest.getDriver().navigate().to(employeePageURL2);
        havanaOrganizationPage.get().VerifyEmployeeDetailsFunctionality(resumePath2);
        BaseTest.getDriver().navigate().to(currentURL23);
        havanaDashBoardPage.get().VerifyChangePassword(password2, password2);
        havanaDashBoardPage.get().VerifyLogoutFunctionality(url2);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        launchSite.remove();
        closeBrowser();
    }
}
