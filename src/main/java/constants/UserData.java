package constants;

public class UserData {
    private String emailId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String cardNumber;
    private String expDate;
    private String cvv;

    private String loggedInUserEmail;
    private String loggedInPassword;

    private String WrongEmail;
    private String ForgotPassEmail;
    private String ForgotPassEmailId;

    public UserData(){
        setFirstName("missra");
        setEmailId("mil"+System.currentTimeMillis());
        setEmail(getEmailId()+"@mailinator.com");
        setLastName("mansour");
        setPassword("123456789q");
        setPhone("01003754330");
        setExpDate("11 / 21");
        setCardNumber("5100000010001004");
        setCvv("123");
        setLoggedInUserEmail("missramansour@gmail.com");
        setLoggedInPassword("123456");
        setWrongEmail(getEmailId()+".com");
        setForgotPassEmail("mil1614270204464@mailinator.com");
        setForgotPassEmailId("mil1614270204464");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getLoggedInUserEmail() {
        return loggedInUserEmail;
    }

    public void setLoggedInUserEmail(String loggedInUserEmail) {
        this.loggedInUserEmail = loggedInUserEmail;
    }

    public String getLoggedInPassword() {
        return loggedInPassword;
    }

    public void setLoggedInPassword(String loggedInPassword) {
        this.loggedInPassword = loggedInPassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getWrongEmail() {
        return WrongEmail;
    }

    public void setWrongEmail(String wrongEmail) {
        WrongEmail = wrongEmail;
    }

    public String getForgotPassEmail() {
        return ForgotPassEmail;
    }

    public void setForgotPassEmail(String forgotPassEmail) {
        ForgotPassEmail = forgotPassEmail;
    }

    public String getForgotPassEmailId() {
        return ForgotPassEmailId;
    }

    public void setForgotPassEmailId(String forgotPassEmailId) {
        ForgotPassEmailId = forgotPassEmailId;
    }
}
