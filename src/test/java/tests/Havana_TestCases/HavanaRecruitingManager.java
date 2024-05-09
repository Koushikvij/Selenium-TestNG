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

public class HavanaRecruitingManager extends BaseTest
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
     *@Test_Method_Description : Testcases of Havana Recruiting Manager
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 01/04/2024
     */
    @Parameters({"client"})
    @Test
    public void HavanaRecruitingManager(Method m, String client)
    {
        ExtentTestManager.startTest(this.getClass().getSimpleName() + " :: " + m.getName(),
                "Testcases of Havana Login");

        // Recruiting Manager

        String url3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "PlatformUrl");
        String dashboardURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "DashboardUrl");
        String username3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "Username");
        String password3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "Password");

        String forgotPasswordURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","ForgotPasswordUrl");
        String incorrectEmail3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "IncorrectEmail");
        String organizationURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "OrganizationURL");
        String jobsListURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "JobListURL");
        String jobsInterviewURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "JobInterviewsURL");
        String candidateURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "CandidateURL");
        String interviewersURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","InterviewerURL");
        String actionsURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","ActionsURL");
        String referralURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","ReferralUrl");
        String vendorURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","VendorURL");
        String addVendorURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddVendorURL");
        String auditLoginURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AuditLoginURL");
        String nameData3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","NameData");
        String emailData3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","EmailData");
        String phoneData3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","PhoneData");
        String skillData3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","SkillData");
        String addInterviewerURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddInterviewerURL");
        String addCandidatePageURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddCandidatePageURL");
        String resumePath3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "ResumeAttachment");
        String notesAttachmentPath3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "NotesAttachment");
        String yopMailUrl3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox", "YopMailUrl");
        String addClientURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddClientURL");
        String clientPageUrl3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","ClientPageURL");
        String employeePageURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","EmployeeURL");
        String addEmployeePageURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddEmployeeURL");
        String addJobPageURL3 = XMLHandler.readXMLData("Havana_Recruiting_Manager_Sandbox","AddJobURL");

        // Test steps for Recruiting Manager Role
        launchSite.get().LaunchPortal(url3);
        havanaLoginPage.get().verifyLoginWithCorrectCredentials(username3, password3, dashboardURL3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenu(username3, password3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenuSubMenu();
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckOrganizationPage(organizationURL3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobListPage(jobsListURL3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobInterviewsPage(jobsInterviewURL3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckCandidatePage(candidateURL3);
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
        havanaCandidatePage.get().searchByName(nameData3);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByEmail(emailData3);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByPhone(phoneData3);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchBySkill(skillData3);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().VerifyAddCandidateFunctionality(addCandidatePageURL3, resumePath3, notesAttachmentPath3, candidateURL3);
        BaseTest.getDriver().navigate().refresh();
        String emailAddress3 = havanaCandidatePage.get().sendEmailToCandidate("Welcome Email");
        String currentURL3 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl3);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress3);
        BaseTest.getDriver().navigate().to(currentURL3);
        havanaCandidatePage.get().checkCandidateDetails(resumePath3);
        havanaClientPage.get().navigateToClientPage(clientPageUrl3);
        havanaClientPage.get().checkAllElementInClientPage();
        havanaClientPage.get().getClientByStatus();
        havanaClientPage.get().VerifyAddClientFunctionality(notesAttachmentPath3);
        havanaClientPage.get().VerifyUpdateClientFunctionality(clientPageUrl3);
        havanaClientPage.get().checkClientDetails();
        havanaJobsPage.get().navigateToJobsListPage(jobsListURL3);
        havanaJobsPage.get().checkAllElementInJobListPage();
        havanaJobsPage.get().VerifyCreateNewJobFunctionality(addJobPageURL3, jobsListURL3);
        havanaJobsPage.get().verifyUpdateJobFunctionality(jobsListURL3);
        havanaJobsPage.get().checkJobListDetails(notesAttachmentPath3);
        havanaJobsPage.get().checkAllElementInJobInterviewPage();
        havanaJobsPage.get().checkInterviewSummaryPage(resumePath3);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckInterviewersPage(interviewersURL3);
        havanaInterviewersPage.get().verifyInterviewersPageElementsAndTable();
        havanaInterviewersPage.get().VerifyAddInterviewerFunctionality(addInterviewerURL3, resumePath3, notesAttachmentPath3, interviewersURL3);
        havanaInterviewersPage.get().VerifyUpdateInterviewerFunctionality(interviewersURL3);
        havanaInterviewersPage.get().VerifySearchInterviewerFunctionality();
        String emailAddress003 = havanaInterviewersPage.get().VerifyInterviewerSendEmailFunctionality("Welcome Email", "Welcome Email Sent Successfully!");
        String currentURL003 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl3);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress003);
        BaseTest.getDriver().navigate().to(currentURL003);
        havanaVendorPage.get().TC_CheckVendorsPage(vendorURL3, "Recruiting Manager");
        havanaVendorPage.get().verifyVendorsPageElementsAndTable();
        havanaVendorPage.get().VerifyAddVendorsFunctionality(notesAttachmentPath3);
        havanaVendorPage.get().VerifyUpdateVendorFunctionality(vendorURL3);
        havanaVendorPage.get().VerifySearchVendorFunctionality();
        BaseTest.getDriver().navigate().to(vendorURL3);
        havanaVendorPage.get().VerifyVendorDetailsFunctionality(resumePath3);
        havanaDashBoardPage.get().TC_CheckActionsPage(actionsURL3);
        havanaOrganizationPage.get().TC_CheckEmployeesPage(employeePageURL3);
        havanaOrganizationPage.get().verifyEmployeesPageElementsAndTable();
        havanaOrganizationPage.get().VerifyAddEmployeeFunctionality(addEmployeePageURL3, resumePath3, notesAttachmentPath3, employeePageURL3);
        havanaOrganizationPage.get().VerifyUpdateEmployeeFunctionality(employeePageURL3);
        havanaOrganizationPage.get().VerifySearchEmployeeFunctionality();
        String emailAddress33 = havanaOrganizationPage.get().VerifyEmployeeSendEmailFunctionality("Welcome Email", "Welcome Email Sent Successfully!");
        String currentURL33 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl3);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress33);
        BaseTest.getDriver().navigate().to(employeePageURL3);
        havanaOrganizationPage.get().VerifyEmployeeDetailsFunctionality(resumePath3);
        BaseTest.getDriver().navigate().to(currentURL33);
        havanaDashBoardPage.get().VerifyChangePassword(password3, password3);
        havanaDashBoardPage.get().VerifyLogoutFunctionality(url3);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        launchSite.remove();
        closeBrowser();
    }

}
