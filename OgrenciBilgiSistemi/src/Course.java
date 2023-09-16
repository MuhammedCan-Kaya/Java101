public class Course {

    Teacher teacher;
    String name;
    int code;
    String prefix;
    int verbalNote;
    int quizNote;

    Course(String name, int code, String prefix) {

        this.verbalNote = 0;
        this.quizNote = 0;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {

        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        }else {
            System.out.print("Öğretmen ve ders değerleri uyuşmuyor.");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}