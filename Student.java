class Student {
    private int rollNo;
    private String name;
    private String subject;
    private double mark;
    // Constructor
    public Student(int rollNo, String name, String subject, double mark) {
    this.rollNo = rollNo;
    this.name = name;
    this.subject = subject;
    this.mark = mark;
    }
    // Getter methods
    public int getRollNo() {
    return rollNo;
    }
    public String getName() {
    return name;
    }
    public String getSubject() {
    return subject;
    }
    public double getMark() {
    return mark;
    }
    // Setter method
    public void setMark(double mark) {
    this.mark = mark;
    }
    // Display student information
    public void displayInfo() {
    System.out.println("Roll No: " + rollNo);
    System.out.println("Name: " + name);
    System.out.println("Subject: " + subject);
    System.out.println("Mark: " + mark);
    System.out.println();
    }
   }