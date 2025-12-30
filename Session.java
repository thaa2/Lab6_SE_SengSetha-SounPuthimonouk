/**
 * Class Name: Session
 * Description: Represents a study session during the day.
 * Author: Soun Puthimonouk
 * Version: 1.0
 * Date: 30-12-2025
 */
public class Session {
    //instance variable
    private String session_topic;
    private String date;
    private String description;
    private int duration;

    //Constructor
    Session(){
    }
    Session(String session_topic,String date,String description,int duration){
        this.session_topic = session_topic;
        this.date = date;
        this.description = description;
        this.duration = duration;
    }

    //getter
    String getSession_Topic(){
        return session_topic;
    }
    String getDate(){
        return date;
    }
    String getDescription(){
        return description;
    }
    String getDuration(){
        return duration;
    }
    
    //setter
    public void setTopic(String session_topic) {
        if (session_topic == null || sessoin_topic.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }else{
            this.session_topic = session_topic;
        }
    }
    public void setDuration(int duration) {
        if (duration != 0 && duration >0) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }else{
            this.session_topic = session_topic;
        }
    }
}
