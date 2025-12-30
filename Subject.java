/**
 * Class Name: Subject
 * Description: Represents a course in the Year 2 program.
 * Author: Seng Setha
 * Version: 1.0
 * Date: 25-12-2025
 */
public class Subject {

    // ===== Constants (allowed global variables) =====
    public static final int MAX_CREDITS = 5;

    // ===== Instance variables (private, best practice) =====
    private String subjectCode;
    //change from name to subjectName 
    private String subjectName;
    private int credits;
    private String lecturerName;

    //  Default constructor (no parameters)
    public Subject() {
        this.subjectCode = "UNKNOWN";
        this.subjectName = "Untitled Subject";
        this.lecturerName = "TBA";
    }

    // ===== Constructor =====
    public Subject(String subjectCode, String name, int credits) {
        this.subjectCode = subjectCode;
        setName(name); // reuse validation
        this.credits = credits;
    }

    // ===== Getters =====
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    // ===== Setter with Exception (Task 3) =====
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.subjectName = subjectName;
    }
        // Add setLecturername method with null/empty exception
    public void setLecturerName (String lecturerName){
        if(lecturerName == null || lecturerName.trim().isEmpty()){
            throw new IllegalArgumentException ("Lecturer name cannot be null or empty.");
        }
        // encapsulate name input in else so as to not input empty string into name
        else {
            this.lecturerName = lecturerName ;
        }
    } 
}
