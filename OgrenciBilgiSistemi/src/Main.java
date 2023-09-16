
public class Main {
    public static void main(String[] args) {
        Teacher x1 = new Teacher("Halil", "0543", "TRH");
        Teacher x2 = new Teacher("Veli", "0000", "FZK");
        Teacher x3 = new Teacher("Ahmet","0212","MAT");
        Course tarih = new Course("Tarih", 101, "TRH");
        Course mat =  new Course("Matematik",101,"MAT");
        Course fizik = new Course("Fizik",101,"FZK");

        Student ogrenci1 = new Student("Abbas",155,"6", tarih, mat, fizik);
        ogrenci1.addBulkExamNote(50,50,50);
        ogrenci1.addVerbalNote(50,50,41);
        ogrenci1.printNote();
        ogrenci1.calcAvarage();
        ogrenci1.isPass();
    }
}