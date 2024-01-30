package gmail;

public class Receive {
    public static void main (String[]args){
        Gmail gmail=new Gmail();
        gmail.loginId=1234;
        gmail.passWord="1234";
        SendMessage message=new SendMessage();
        message.fromEmailAccount="gsivakrishna007@gmail.com";
        message.toEmailAccount="chandan007@gmail.com";
        boolean loginStatus= message.login(gmail);
        SendMessageProcessing messageProcessing=new SendMessageProcessing();
        if (loginStatus){

         System.out.println( messageProcessing.sendMessage("gsivakrishna007@gmil.com","chandan007@gmail.com"));
        }
    }
}
