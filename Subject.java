    /**
 * Class Name: Subject
 * Description: Represents a course in the Year 2 program.
 * Author: Seng Setha
 * Version: 1.0
 * Date: 25-12-2025
 */
public class Subject {


    //  Constants (allowed global variables) 
    public static final int MAX_CREDITS = 5;

    //  Instance variables (private, best practice) 
    private String subjectCode;
    private String name;
    private int credits;

    //  Constructor 
    public Subject(String subjectCode, String name, int credits) {
        this.subjectCode = subjectCode;
        setName(name); // reuse validation
        this.credits = credits;
    }

    //  Getters 
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    //  Setter with Exception (Task 3) 
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.name = name;
    }
}

