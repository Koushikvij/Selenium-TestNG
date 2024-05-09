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

public class HavanaRecruiter extends BaseTest
{
    private final ThreadLocal<LaunchSite> launchSite = new ThreadLocal<>();
    private final ThreadLocal<Faker> faker = new ThreadLocal<>();
    private final ThreadLocal<HavanaLoginPage> havanaLoginPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaDashBoardPage> havanaDashBoardPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaCandidatePage> havanaCandidatePage = new ThreadLocal<>();
    private final ThreadLocal<HavanaInterviewersPage> havanaInterviewersPage = new ThreadLocal<>();
    private final ThreadLocal<HavanaVendorPage> havanaVendorPage = new ThreadLocal<>();
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
        yopMailPage.set(new YopmailPage(getDriver()));
    }

    /**
     *@Test_Method_Description : Testcases of Havana Recruiter
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 01/04/2024
     */
    @Parameters({"client"})
    @Test
    public void HavanaRecruiter(Method m, String client)
    {
        ExtentTestManager.startTest(this.getClass().getSimpleName() + " :: " + m.getName(),
                "Testcases of Havana Login");

        // Recruiter

        // String url = ConfigProperties.getURL(environment, client, "admin");
        String url = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "PlatformUrl");
        String dashboardURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "DashboardUrl");
        String username = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "Username");
        String password = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "Password");

        String forgotPasswordURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","ForgotPasswordUrl");
        String incorrectEmail = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "IncorrectEmail");
        String organizationURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "OrganizationURL");
        String jobsListURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "JobListURL");
        String jobsInterviewURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "JobInterviewsURL");
        String candidateURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "CandidateURL");
        String interviewersURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","InterviewerURL");
        String actionsURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","ActionsURL");
        String referralURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","ReferralUrl");
        String vendorURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","VendorURL");
        String addVendorURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","AddVendorURL");
        String auditLoginURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","AuditLoginURL");
        String nameData = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","NameData");
        String emailData = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","EmailData");
        String phoneData = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","PhoneData");
        String skillData = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","SkillData");
        String addInterviewerURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","AddInterviewerURL");
        String addCandidatePageURL = XMLHandler.readXMLData("Havana_Recruiter_Sandbox","AddCandidatePageURL");
        String resumePath = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "ResumeAttachment");
        String notesAttachmentPath = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "NotesAttachment");
        String yopMailUrl = XMLHandler.readXMLData("Havana_Recruiter_Sandbox", "YopMailUrl");

        // Test steps for Recruiter Role
        launchSite.get().LaunchPortal(url);
//        havanaLoginPage.get().TC_Login_07(username,password);
//        BaseTest.getDriver().navigate().refresh();
//        havanaLoginPage.get().TC_Login_08(username,password);
//        BaseTest.getDriver().navigate().refresh();
//        havanaLoginPage.get().TC_Login_09(forgotPasswordURL,username);
//        BaseTest.getDriver().navigate().back();
//        havanaLoginPage.get().TC_Login_13(username);
//        BaseTest.getDriver().navigate().back();
//        havanaLoginPage.get().TC_Login_14(username);
//        BaseTest.getDriver().navigate().back();
//        havanaLoginPage.get().TC_Login_15(username, url);
//        BaseTest.getDriver().navigate().refresh();
//        havanaLoginPage.get().TC_Login_16(username, incorrectEmail);
//        BaseTest.getDriver().navigate().back();
        havanaLoginPage.get().verifyLoginWithCorrectCredentials(username, password, dashboardURL);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenu(username, password);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckSideMenuSubMenu();
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckOrganizationPage(organizationURL);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobListPage(jobsListURL);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckJobInterviewsPage(jobsInterviewURL);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckCandidatePage(candidateURL);
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
        havanaCandidatePage.get().searchByName(nameData);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByEmail(emailData);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchByPhone(phoneData);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().searchBySkill(skillData);
        BaseTest.getDriver().navigate().refresh();
        havanaCandidatePage.get().VerifyAddCandidateFunctionality(addCandidatePageURL, resumePath, notesAttachmentPath, candidateURL);
        BaseTest.getDriver().navigate().refresh();
        String emailAddress001 = havanaCandidatePage.get().sendEmailToCandidate("Welcome Email");
        String currentURL001 = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl);
        System.out.println(emailAddress001);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress001);
        BaseTest.getDriver().navigate().to(currentURL001);
        havanaCandidatePage.get().checkCandidateDetails(resumePath);
        BaseTest.getDriver().navigate().refresh();
        havanaDashBoardPage.get().TC_CheckInterviewersPage(interviewersURL);
        havanaInterviewersPage.get().verifyInterviewersPageElementsAndTable();
        havanaInterviewersPage.get().VerifyAddInterviewerFunctionality(addInterviewerURL, resumePath, notesAttachmentPath, interviewersURL);
        havanaInterviewersPage.get().VerifyUpdateInterviewerFunctionality(interviewersURL);
        havanaInterviewersPage.get().VerifySearchInterviewerFunctionality();
        String emailAddress = havanaInterviewersPage.get().VerifyInterviewerSendEmailFunctionality("Welcome Email", "Welcome Email Sent Successfully!");
        String currentURL = BaseTest.getDriver().getCurrentUrl();
        BaseTest.getDriver().navigate().to(yopMailUrl);
        yopMailPage.get().VerificationofResetLinkAvailableinMail(emailAddress);
        BaseTest.getDriver().navigate().to(currentURL);
        havanaVendorPage.get().TC_CheckVendorsPage(vendorURL, "Recruiter");
        havanaVendorPage.get().verifyVendorsPageElementsAndTable();
        havanaVendorPage.get().VerifyAddVendorsFunctionality(notesAttachmentPath);
        havanaVendorPage.get().VerifyUpdateVendorFunctionality(vendorURL);
        havanaVendorPage.get().VerifySearchVendorFunctionality();
        BaseTest.getDriver().navigate().to(vendorURL);
        havanaVendorPage.get().VerifyVendorDetailsFunctionality(resumePath);
        havanaDashBoardPage.get().TC_CheckActionsPage(actionsURL);
        havanaDashBoardPage.get().VerifyChangePassword(password, password);
        havanaDashBoardPage.get().VerifyLogoutFunctionality(url);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        launchSite.remove();
        closeBrowser();
    }
}
