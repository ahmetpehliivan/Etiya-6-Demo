package Entity;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNo;
    private String nationalityId;
    private int group;

    public Student(String firstName, String lastName, int studentNo, String nationalityId, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNo = studentNo;
        this.nationalityId = nationalityId;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
