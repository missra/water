package base;

public class PaymentFourm extends BaseTest{
    public PaymentFourm() throws InterruptedException { }
    public static void FillPaymentField() throws InterruptedException {
        enterForActive(user.getCardNumber());
        enterForActive(user.getExpDate());
        enterForActive(user.getCvv());
    }
}
