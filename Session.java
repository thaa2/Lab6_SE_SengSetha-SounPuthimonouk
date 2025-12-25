/**
 * Class Name: Session
 * Description: Represents a study session during the day.
 * Author: Seng Setha
 * Version: 1.0
 * Date: 25-12-2025
 */
public class Session {

    // ===== Instance variables =====
    private int startTime;
    private int endTime;

    // ===== Constructor =====
    public Session(int startTime, int endTime) {
        setDuration(startTime, endTime);
    }

    // ===== Getters =====
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    // ===== Setter with Exception (Task 8) =====
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time."
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
