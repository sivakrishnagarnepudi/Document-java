package gmail;

public class SendMessage {
    String fromEmailAccount;
    String toEmailAccount;
    boolean login(Gmail gmail){
        int loginId=1234;
        String passWord="1234";
        if(loginId==(gmail.loginId) && passWord.equals(gmail.passWord)){
            return true;
        }else{
            return false;
        }

    }


}
