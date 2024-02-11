
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class MessagingService {

    public MessagingService() {
        messages=new ArrayList<>();
    }
    
    private ArrayList<Message> messages;

    /**
     * Get the value of messages
     *
     * @return the value of messages
     */
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public void add(Message message){
        if(message.getContent().length()<=280)
            this.messages.add(message);
    }
    
    
}
