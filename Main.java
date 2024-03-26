public class Main {
    public static void main(String[] args) {
    // Create four instances of Student
    Student student1 = new Student(10, "Natnael", "Maths", 86.0);
    Student student2 = new Student(20, "Mark", "English", 95.5);
    Student student3 = new Student(30, "Son", "Science", 40.5);
    Student student4 = new Student(40, "Jhon", "History", 98.0);
    // Display information of student with rollNo = 10
    if (student1.getRollNo() == 10) {
    student1.displayInfo();
    }
    // Carve 2 marks for students with mark < 50
    if (student2.getMark() < 50.0) {
    student2.setMark(student2.getMark() + 2);
    }
    if (student3.getMark() < 50.0) {
    student3.setMark(student3.getMark() + 2);
    }
    if (student4.getMark() < 50.0) {
    student4.setMark(student4.getMark() + 2);
    }
    // Display updated information of student3
    student3.displayInfo();
    }
   }
   