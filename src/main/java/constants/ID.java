package constants;

public class ID {

    private static String SIGNUP_FULL_NAME = "__BVID__19";
    private static String SIGNUP_EMAIL = "__BVID__21";
    private static String SIGNUP_PASSWORD = "__BVID__23";
    private static String SIGNUP_CONFIRM_PASSWORD = "__BVID__25";

    public static String getSignupFullName() {
        return SIGNUP_FULL_NAME;
    }

    public static void setSignupFullName(String signupFullName) {
        SIGNUP_FULL_NAME = signupFullName;
    }

    public static String getSignupEmail() {
        return SIGNUP_EMAIL;
    }

    public static void setSignupEmail(String signupEmail) {
        SIGNUP_EMAIL = signupEmail;
    }

    public static String getSignupPassword() {
        return SIGNUP_PASSWORD;
    }

    public static void setSignupPassword(String signupPassword) {
        SIGNUP_PASSWORD = signupPassword;
    }

    public static String getSignupConfirmPassword() {
        return SIGNUP_CONFIRM_PASSWORD;
    }

    public static void setSignupConfirmPassword(String signupConfirmPassword) {
        SIGNUP_CONFIRM_PASSWORD = signupConfirmPassword;
    }
}
