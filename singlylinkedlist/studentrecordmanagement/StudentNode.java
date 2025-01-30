package singlylinkedlist.studentrecordmanagement;

public class StudentNode {
    private int rollNo;
    private String name;
    private int age;
    private String grade;
    private StudentNode next;

    public StudentNode(int rollNo,String name,int age,String grade){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+"\nStudent's roll number : "+rollNo+"\nStudent's age : "+age+"\nStudent's grade : "+grade;
    }
}
