package record;

public class Main {

    public static void main(String[] args) {

        // Initialize manager
        StudentManager sm = new StudentManager();

        // Adding students
        sm.addStudent(new Student(1, "shivu", 19));
        sm.addStudent(new Student(2, "karan", 26));
        sm.addStudent(new Student(3, "aujla", 28));

        System.out.println("---- Student List ----");
        sm.viewStudents();

        // Deleting a student
        System.out.println("---- After Deletion ----");
        sm.deleteStudent(3);
        sm.viewStudents();

        // Adding results
        sm.addResultToStudent(1, new Result(1, "Maths", 90));
        sm.addResultToStudent(1, new Result(1, "Science", 85));

        System.out.println("---- After Adding Results ----");
        sm.viewStudents();

        // Sorting students
        System.out.println("---- Sorted by Marks ----");
        sm.sortStudentsByMarks();
        sm.viewStudents();

        // Topper
        System.out.println("---- Topper ----");
        sm.getTopper();

        // File operations
        sm.loadFromFile();

        StudentManager tempManager = new StudentManager();
        tempManager.loadFromFile();

        System.out.println("---- Loaded Data ----");
        tempManager.viewStudents();

        tempManager.saveToFile();
    }
}