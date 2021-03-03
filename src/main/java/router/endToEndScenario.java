package router;

import scenario.login.LoginImplementation;
import scenario.pledgeFourm.PledgeScenarioItem;
import scenario.registefourm.RegisterFormImplementation;

public class endToEndScenario {

    public void initEndToEnd() throws InterruptedException {
//        new water4HerDonate().donate();
        new PledgeScenarioItem();
        new RegisterFormImplementation();
        new LoginImplementation();
    }

}