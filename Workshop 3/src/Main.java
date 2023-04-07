public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oğuzhan","Peker",3,"123456789",5);
        Student student2 = new Student("Şura","Kara",4,"1234567810",5);
        Student student3 = new Student("Ahmet","Pehlivan",2,"0023456789",5);
        Student student4 = new Student("Süleyman","Sarı",1,"123456788",5);

        StudentManager studentManager = new StudentManager();

        studentManager.create(student1);
        studentManager.create(student2);
        studentManager.create(student3);
        studentManager.create(student4);
        studentManager.studentList();

        studentManager.remove(student1);
        studentManager.studentList();

        studentManager.create(student3);
        studentManager.studentList();

    }
}