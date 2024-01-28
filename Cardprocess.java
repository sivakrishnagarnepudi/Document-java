public class Cardprocess {
    boolean login(Carddetails card){
        String localcardNumber ="1234 1234 1234";
        String localpinNumber ="1234";
        if (localcardNumber.equals(card.cardNumber)  && localpinNumber.equals(card.pinNumber)){
            return true;
        }else {
            return false;
        }
    }
}
