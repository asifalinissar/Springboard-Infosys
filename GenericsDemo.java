// Generic class Record
class Record<E> {
    private E record;

    public void display(E item) {
        System.out.println(item);
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student: Id = " + studentId + " Name = " + studentName;
    }
}

// Main class to run the demo
public class GenericsDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Robert");

            Record<Integer> integerRecord = new Record<>();
            integerRecord.display(12);

            Record<Student> studentRecord = new Record<>();
            studentRecord.display(s1);

            // Uncommenting these lines will cause compile-time errors (type mismatch)
            // integerRecord.display(s1);     // ❌ Not allowed
            // studentRecord.display(15);     // ❌ Not allowed

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());

            // Safe access to stack trace
            StackTraceElement[] trace = e.getStackTrace();
            if (trace.length > 0) {
                System.out.println("Error at: " + trace[0]);
            }
        }
    }
}
