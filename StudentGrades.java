import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class StudentGrades {
    public static void main(String[] args) {
        // Get student information
        String name = JOptionPane.showInputDialog(null, "Enter student name:");
        String course = JOptionPane.showInputDialog(null, "Enter course:");
        String subject = JOptionPane.showInputDialog(null, "Enter subject:");

        // Get exam grades
        double grade1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for first exam:"));
        double grade2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for second exam:"));
        double grade3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for third exam:"));
        double grade4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for fourth exam:"));

        // Calculate average grade
        double average = (grade1 + grade2 + grade3 + grade4) / 4;

        // Evaluate student
        String result;
        if (average >= 75) {
            result = "PASSED";
        } else {
            result = "FAILED";
        }

        // Display results
        String message = "Student Name: " + name + "\nCourse: " + course + "\nSubject: " + subject
                + "\n\nAverage Grade: " + average + "\nResult: " + result;
        JOptionPane.showMessageDialog(null, message);

        // Save student information to file
        try {
            FileWriter writer = new FileWriter("Student.txt");
            writer.write("Student Name: " + name + "\nCourse: " + course + "\nSubject: " + subject
                    + "\nFirst:" + grade1 + "\nSecond:" + grade2 + "\nThird:" + grade3 +"\nFourth:" + grade4 + "\nAverage: " + average + "\nRemarks: " + result);
            writer.close();
            JOptionPane.showMessageDialog(null, "Student information saved to file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving file.");
        }
    }
}


// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ