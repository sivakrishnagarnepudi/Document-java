public class CreditDetailsTest {
    public static void main(String[] args){
        Cardprocess processService =new Cardprocess();
        Carddetails cardDetails =new Carddetails();
        cardDetails.cardNumber = "1234 1234 1234";
        cardDetails.pinNumber="1234";
        System.out.println(cardDetails.hashCode());
        boolean loginStatus = processService.login(cardDetails);
        Creditservice creditService = new Creditservice();
        if (loginStatus){
            int balance = creditService.credit("1234 1234 1234",100);
            System.out.println(balance);
            int balance2 = creditService.credit( "1234 1234 1234",100);
            System.out.println(balance2);
        }

    }


}
