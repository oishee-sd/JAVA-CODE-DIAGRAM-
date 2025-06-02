class Student {
    String name;
    String studentId;
    Account account;

    Student(String name, String studentId, Account account) {
        this.name = name;
        this.studentId = studentId;
        this.account = account;
    }
}

class Account {
    String username;
    String password;

    Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
}

class RegistrationManager {
    void registerStudent(Student student, Course course) {
        System.out.println(student.name + " registered for " + course.courseName);
    }
}