package pages;

import com.aventstack.extentreports.Status;
import org.checkerframework.checker.signature.qual.FullyQualifiedName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;
import utils.extentreports.ExtentTestManager;
import utils.utilities.DynamicWait;
import utils.utilities.Utilities;

import java.util.List;

public class HavanaDashBoardPage {

    /**
     * Constructor
     */
    public HavanaDashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */

    @FindBy(xpath = "//*[@id='username']")
    private WebElement userName;

    @FindBy(xpath = "/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/form/div[2]/div/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/app-root/app-loginnew/div/section/div/div/div[2]/div/div/div[1]/form/div[3]/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/app-header/header/nav/div[1]/div/i")
    private WebElement hamburger;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul")
    private WebElement sideMenu;

    @FindBy(xpath = "//*[@id='main-container']/app-sidebar/div/div/div[1]/ul/li[2]")
    private WebElement jobs;

    @FindBy(xpath="//*[@id='main-container']/app-sidebar/div/div/div[1]/ul/li[2]/ul")
    private WebElement jobsSubMenu;

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[1]")
    private WebElement organization;

    @FindBy(xpath ="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[2]/ul/li[1]")
    private WebElement jobsList;

    @FindBy(xpath ="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[2]/ul/li[2]")
    private WebElement jobsInterviews;

    @FindBy(xpath = "/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[3]")
    private WebElement candidate;

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[4]")
    private WebElement interviewers;

    @FindBy(xpath="/html/body/app-root/app-pagelayout/section/div/app-sidebar/div/div/div[1]/ul/li[5]")
    private WebElement actions;

    @FindBy(xpath = "//*[@id='mainApp']/app-header/header/nav/div[2]/div/ul/li")
    private WebElement profileDropdownMenu;

    @FindBy(xpath = "//*[@id='options-container']")
    private WebElement profileDialog;

    @FindBy(xpath = "//*[@id='options-container']/div/div[2]/a[1]")
    private WebElement changePasswordLink;

    @FindBy(xpath = "//*[@id='options-container']/div/div[2]/a[2]")
    private WebElement signOutLink;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div[1]/div[2]/div/input")
    private WebElement oldPasswordInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div[2]/div[2]/div/input")
    private WebElement newPasswordInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div[3]/div[2]/div/input")
    private WebElement repeatPasswordInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div[4]/button")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//*[@id='toast-container']/div/div")
    private WebElement toastMessage;

    @FindBy(xpath = "//*[@id='toast-container']/div/button")
    private WebElement toastCloseButton;

    /**
     * @Method_Description: Check Side Menu is visible in DashBoard.
     * @Method_Name: TC_CheckSideMenu
     * @Input_Parameters: String correctUname, String correctPwd
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 03/04/2024
     */
    public void TC_CheckSideMenu(String correctUname, String correctPwd) {
        WebDriver driver = BaseTest.getDriver();
        try {

            DynamicWait.smallWait();

            if (sideMenu.isDisplayed()) {
                List<WebElement> menuItems = sideMenu.findElements(By.tagName("li"));
                String[] expectedMenuItems = {"Organization", "Jobs", "Candidates", "Interviewers", "Actions", "Referral", "Vendor", "Audit"};

                for (String expectedMenuItem : expectedMenuItems) {
                    boolean menuItemFound = menuItems.stream()
                            .anyMatch(item -> item.getText().contains(expectedMenuItem));
                    if (!menuItemFound) {
                        ExtentTestManager.createAssertTestStepWithScreenshot("Menu Items Not Visible", Status.WARNING,
                                "Menu item not found: " + expectedMenuItem, true);
                        return;
                    }
                }

                ExtentTestManager.createAssertTestStepWithScreenshot("Menu Items Visible", Status.PASS,
                        "All menu items are getting displayed", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Menu Items Not Visible", Status.WARNING,
                        "Menu items are not getting displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("CheckMenuItems",
                    Status.FAIL, "Exception found in Method - CheckMenuItems", true, e);
        }
    }

    /**
     * @Method_Description: Check jobs Sub Menu is visible in DashBoard.
     * @Method_Name: TC_CheckSideMenuSubMenu
     * @Input_Parameters: String correctUname, String correctPwd
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 03/04/2024
     */
    public void TC_CheckSideMenuSubMenu() {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,jobs);
            DynamicWait.smallWait();

            if (jobsSubMenu.isDisplayed()) {
                List<WebElement> menuItems = jobsSubMenu.findElements(By.tagName("li"));
                String[] expectedSubMenuItems = {"List", "Interviews"};

                for (String expectedSubMenuItem : expectedSubMenuItems) {
                    boolean subMenuItemFound = menuItems.stream()
                            .anyMatch(item -> item.getText().contains(expectedSubMenuItem));
                    if (!subMenuItemFound) {
                        ExtentTestManager.createAssertTestStepWithScreenshot("Sub Menu Items Not Visible", Status.WARNING,
                                "Sub Menu item not found: " + expectedSubMenuItem, true);
                        return;
                    }
                }

                ExtentTestManager.createAssertTestStepWithScreenshot("Sub Menu Items Visible", Status.PASS,
                        "All Sub menu items are getting displayed", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Sub Menu Items Not Visible", Status.WARNING,
                        "Sub Menu items are not getting displayed", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("CheckSubMenuItems",
                    Status.FAIL, "Exception found in Method - CheckSubMenuItems", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Organization page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckOrganizationPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckOrganizationPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,organization);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Organization Page from side Menu",
                        Status.WARNING, "User is not navigated to Organization page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Organization Page from side Menu",
                        Status.PASS, "User is navigated to Organization page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Organization Page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Organization Page from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Jobs List page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckJobListPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckJobListPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,jobs);
            Utilities.Click(driver,jobsList);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs List Page from side Menu",
                        Status.WARNING, "User is not navigated to Jobs list page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs List from side Menu",
                        Status.PASS, "User is navigated to Jobs List page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs List page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Jobs List from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Jobs Interview page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckJobListPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckJobInterviewsPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,jobs);
            Utilities.Click(driver,jobsInterviews);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs Interview Page from side Menu",
                        Status.WARNING, "User is not navigated to Jobs Interview page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs Interview from side Menu",
                        Status.PASS, "User is navigated to Jobs Interview page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Jobs Interview page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Jobs Interview from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Candidate page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckCandidatePage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckCandidatePage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver, candidate);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Candidate Page from side Menu",
                        Status.WARNING, "User is not navigated to Candidate page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Candidate from side Menu",
                        Status.PASS, "User is navigated to Candidate page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Candidate page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Candidate from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Interviewer page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckInterviewersPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckInterviewersPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,interviewers);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Interviewers Page from side Menu",
                        Status.WARNING, "User is not navigated to Interviewers page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Interviewers from side Menu",
                        Status.PASS, "User is navigated to Interviewers page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Interviewers page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Interviewer from side Menu", true, e);
        }
    }

    /**
     * @Method_Description: Navigate to Action page from Side Menu in Dashboard.
     * @Method_Name: TC_CheckActionPage
     * @Input_Parameters: String expectedUrl
     * @Output_Parameters: None
     * @Modified_By: Ankit Raj
     * @Modified_Date: 04/04/2024
     */
    public void TC_CheckActionsPage(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver,actions);
            DynamicWait.smallWait();

            if (!driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Actions Page from side Menu",
                        Status.WARNING, "User is not navigated to Actions page.", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Actions from side Menu",
                        Status.PASS, "User is navigated to Actions page.", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("Navigate to Actions page from side Menu",
                    Status.FAIL, "Exception found in Method - Navigate to Actions from side Menu", true, e);
        }
    }

    /**
     * @Method_Description : Verify whether the change password is working or not
     * @Method_Name : VerifyChangePassword
     * @Input_Parameters : String oldPassword, String newPassword
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 22/04/24
     **/
    public void VerifyChangePassword(String oldPassword, String newPassword) {
        WebDriver driver = BaseTest.getDriver();
        try {
            Utilities.Click(driver, profileDropdownMenu);
            Utilities.WaitTillElementDisplayed(driver, profileDialog);
            if (profileDialog.isDisplayed()) {
                Utilities.Click(driver, changePasswordLink);
                DynamicWait.smallWait();
            }
            Utilities.WaitTillElementDisplayed(driver, oldPasswordInput);
            Utilities.SendKeys(driver, oldPasswordInput, oldPassword);
            Utilities.SendKeys(driver, newPasswordInput, newPassword);
            Utilities.SendKeys(driver, repeatPasswordInput, newPassword);
            Utilities.Click(driver, changePasswordButton);
            DynamicWait.smallWait();

            WebElement toastMessage = driver.findElement(By.xpath("//*[@id='mainApp']/app-header/p-toast/div/p-toastitem/div/div/div/div[2]"));

            String resultText = toastMessage.getText().trim();
            if (resultText.equals("Password updated successfully!")) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Change Password Results", Status.PASS,
                        "Change Password is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Change Password Results", Status.WARNING,
                        "Change Password is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyChangePassword",
                    Status.WARNING, "Exception found in Method - VerifyChangePassword", true, e);
        }
    }

    /**
     * @Method_Description : Verify whether the logout is working or not
     * @Method_Name : VerifyLogoutFunctionality
     * @Input_Parameters : String expectedUrl
     * @Output_Parameters : None
     * @Modified_By : Jerish Balakrishnan
     * @Modified_Date : 22/04/24
     **/
    public void VerifyLogoutFunctionality(String expectedUrl) {
        WebDriver driver = BaseTest.getDriver();
        try {
//            if (toastMessage.isDisplayed()) {
//                Utilities.Click(driver, toastCloseButton);
//                DynamicWait.smallWait();
//            }
            DynamicWait.smallWait();
            Utilities.WaitTillElementDisplayed(driver, profileDropdownMenu);
            Utilities.Click(driver, profileDropdownMenu);
            Utilities.WaitTillElementDisplayed(driver, profileDialog);
            if (profileDialog.isDisplayed()) {
                DynamicWait.smallWait();
                Utilities.Click(driver, signOutLink);
                DynamicWait.mediumWait();
            }

            System.out.println(driver.getCurrentUrl());
            System.out.println(expectedUrl);

            if (driver.getCurrentUrl().equals(expectedUrl)) {
                ExtentTestManager.createAssertTestStepWithScreenshot("Logout Results", Status.PASS,
                        "Logout functionality is working as expected", true);
            } else {
                ExtentTestManager.createAssertTestStepWithScreenshot("Logout Results", Status.WARNING,
                        "Logout functionality is not working as expected", true);
            }
        } catch (Exception e) {
            ExtentTestManager.createAssertTestStepWithScreenshot("VerifyLogoutFunctionality",
                    Status.FAIL, "Exception found in Method - VerifyLogoutFunctionality", true, e);
        }
    }
}

