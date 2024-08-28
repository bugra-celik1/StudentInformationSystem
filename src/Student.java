public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double totalAvarage;
    boolean isPass;
    double avarage1;
    double avarage2;
    double avarage3;
    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.totalAvarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int note2,int note3){
        if(note1 >= 0 && note1 <=100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <=100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <=100){
            this.c3.note = note3;
        }
    }
    void calcAvarage(){
       this.avarage1= (this.c1.note * 0.8 ) + (this.c1.quiz * 0.2);
       this.avarage2 =(this.c2.note * 0.8 ) + (this.c2.quiz * 0.2);
       this.avarage3 = (this.c3.note * 0.8 ) + (this.c3.quiz * 0.2);
       this.totalAvarage = (this.avarage1 + this.avarage2 + this.avarage3) / 3.0;
    }
    void isPass(){

        System.out.println("=================");
       calcAvarage();
        if(this.totalAvarage > 55 ){
            System.out.println("Sınıfı geçtiniz..");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız...");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){

        System.out.println(this.c1.name +"Notu\t:" +this.c1.note);
        System.out.println(this.c2.name +"Notu\t:" +this.c2.note);
        System.out.println(this.c3.name +"Notu\t:" +this.c3.note);
        System.out.println("Ortalamanız \t:" +this.totalAvarage);
    }

}
