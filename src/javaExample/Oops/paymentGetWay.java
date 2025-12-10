package Oops;

public interface paymentGetWay
{
    void makePayment(double amount);
}
class Paytm implements paymentGetWay
{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Paytm");
    }
}
class Phonepe implements paymentGetWay
{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Phonepe");
    }
}
class main{
    public static void main(String[] args) {

        paymentGetWay payment;
        payment = new Paytm();
        payment.makePayment(20000);

        payment = new Phonepe();
        payment.makePayment(5000);
    }
}
