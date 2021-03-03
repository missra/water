package base;


import scenario.donation.DonationItemScenario;
import scenario.forgotpassword.ForgotPasswordScenarioItem;
import scenario.login.LoginScenario;
import scenario.registefourm.RegisterFormScenarioItem;

public class ScenarioItemFactory {

    static RegisterFormScenarioItem registerFormScenarioItem;
    static LoginScenario loginScenarioItems;
    static ForgotPasswordScenarioItem forgotPasswordScenarioItem;
    static DonationItemScenario donationItemScenario;

    public static RegisterFormScenarioItem buildRegisterItem() throws InterruptedException {
        if (registerFormScenarioItem == null)
            registerFormScenarioItem = new RegisterFormScenarioItem();
        return registerFormScenarioItem;
    }

    public static LoginScenario buildLoginItems() throws InterruptedException {
        if (loginScenarioItems == null)
            loginScenarioItems = new LoginScenario();
        return loginScenarioItems;
    }

    public static ForgotPasswordScenarioItem buildForgotPass() throws InterruptedException{
        if(forgotPasswordScenarioItem==null)
            forgotPasswordScenarioItem = new ForgotPasswordScenarioItem();
        return forgotPasswordScenarioItem;
    }
    public static DonationItemScenario buildDonationItemScenario() throws InterruptedException{
        if(donationItemScenario==null)
            donationItemScenario = new DonationItemScenario();
        return donationItemScenario;
    }

}
