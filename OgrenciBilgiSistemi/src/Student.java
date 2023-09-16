public class Student {

    String name;
    int stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    int avarage;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course c1, Course c2, Course c3) {

        this.stuNo = stuNo;
        this.name = name;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
    }
    void addBulkExamNote(int note1, int note2, int note3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.quizNote = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.quizNote = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.quizNote = note3;
        }
    }

    void addVerbalNote(int v1, int v2, int v3) {

        if (v1 >= 0 && v1 <= 100) {
            this.c1.verbalNote = v1;
        }

        if (v2 >= 0 && v2 <= 100) {
            this.c2.verbalNote = v2;
        }

        if (v3 >= 0 && v3 <= 100) {
            this.c3.verbalNote = v3;
        }
    }

    void printNote() {

        System.out.println(this.c1.name + " Quiz Notu: " + this.c1.quizNote);
        System.out.println(this.c2.name + " Quiz Notu: " + this.c2.quizNote);
        System.out.println(this.c3.name + " Quiz Notu: " + this.c3.quizNote);
        System.out.println(this.c1.name + " Sözlü Notu: " + this.c1.verbalNote);
        System.out.println(this.c2.name + " Sözlü Notu: " + this.c2.verbalNote);
        System.out.println(this.c3.name + " Sözlü Notu: " + this.c3.verbalNote);
    }

    void calcAvarage() {

        this.avarage = (c1.quizNote + c2.quizNote + c3.quizNote) / 15 + (c1.verbalNote + c2.verbalNote + c3.verbalNote) * 4 / 15;
        System.out.println("Ortalama: " + this.avarage);
    }

    void isPass() {
        if (this.avarage >= 50) {
            this.isPass = true;
            if (this.isPass) {
                System.out.println("Sınıfı geçtiniz.");
            }
        }else {
            this.isPass = false;
            System.out.println("Sınıfı geçemediniz.");
        }
    }
}





