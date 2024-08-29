
public class Main {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("A","555","TRH");
    Teacher t2 = new Teacher("B","0000","FZK");
    Teacher t3 = new Teacher("C","222","BIO");

    Course tarih = new Course("Tarih","101","TRH");
    tarih.addTeacher(t1);
    Course fizik = new Course("Fizik","102","FZK");
    fizik.addTeacher(t2);
    Course biyo = new Course("Biyoloji","101","BIO");
    biyo.addTeacher(t3);

    Student s1 = new Student("X","123","4",tarih,fizik,biyo);
    s1.addBulkExamNote(100,70,50);
    s1.addBulkQuizNote(30,50,60);
  s1.isPass();

  Student s2 = new Student("Y","234","4",tarih,fizik,biyo);
  s2.addBulkExamNote(20,80,88);
  s2.addBulkQuizNote(48,45,84);
  s2.isPass();




    }
}