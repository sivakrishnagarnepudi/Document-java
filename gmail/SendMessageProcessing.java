package gmail;

public class SendMessageProcessing {
    public String sendMessage(String fromEmailId,String toEmailId){
        String FromEmailId="gsivakrishna007@gmil.com";
        String ToEmailId="chandan007@gmail.com";
        if (FromEmailId.equals(fromEmailId) && (ToEmailId.equals(toEmailId))){
            return "sendmessage success";
        }
        else {
            return "you are email address is wrong";
        }
    }
}
