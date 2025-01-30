package singlylinkedlist.studentrecordmanagement;


public class StudentLinkedList {
    private StudentNode head;
    //add at end
    public void addStudentAtEnd(String name,int rollNo,String grade,int age){
        StudentNode student=new StudentNode(rollNo,name,age,grade);
        if(head==null){
            head=student;
            student.setNext(null);
            System.out.println(student.getName()+" : first student added!");
            return;
        }
        StudentNode temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(student);
        System.out.println(student.getName()+" : added at end");
    }
    //adding at beginning
    public void addStudentAtBeginning(String name,int rollNo,String grade,int age){
        StudentNode student=new StudentNode(rollNo,name,age,grade);
        student.setNext(head);
        head=student;
        System.out.println(student.getName()+" added at beginning!");
    }
    //add at position
    public void addStudentAtPosition(String name,int rollNo,String grade,int age,int position){
        int count=countNode();
        if(position<=0||position>count+1) {
            System.out.println("Invalid position!");
            return;
        }
        StudentNode student=new StudentNode(rollNo,name,age,grade);
        int pos=1;
        if(position==1){
            addStudentAtBeginning(name,rollNo,grade,age);
            return;
        }
        StudentNode temp=head;
        StudentNode prev=null;
        while (pos<position){
            pos++;
            prev=temp;
            temp=temp.getNext();
        }
        student.setNext(temp);
        prev.setNext(student);
        System.out.println(student.getName()+" added at "+pos+"!");
    }
    //count node for add at position
    public int countNode(){
        if(head==null) {
            return 0;
        }
        int count=0;
        StudentNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    //delete student by roll number
    public void deleteByRollNumber(int rollNo) {
        if (head == null) {
            System.out.println("Student record list is empty!");
            return;
        }
        if(head.getRollNo()==rollNo){
            head=head.getNext();
            return;
        }
        StudentNode temp = head;
        StudentNode prev=null;
        while(temp!=null&&rollNo!=temp.getRollNo()){
            prev=temp;
            temp=temp.getNext();
        }
       if(temp==null){
           System.out.println("Student with roll no "+rollNo+" does not exist!");

       }
      else{
          prev.setNext(temp.getNext());
       }
    }
    //search student by roll number
    public void searchStudentByRollNumber(int rollNumber){
            if(head==null)
            {
                System.out.println("Student record in empty!");
                return;
            }
            StudentNode temp=head;
            while(temp!=null&&temp.getRollNo()!=rollNumber){
                temp=temp.getNext();
            }
            if(temp==null){
                System.out.println("Student with roll number "+rollNumber+" is not present!");

            }
            else{
                System.out.println("Student found...");
                System.out.println("Student's name : "+temp.getName());
                System.out.println("Student's roll number : "+temp.getRollNo());
                System.out.println("Student's age : "+temp.getAge());
                System.out.println("Student's grade : "+temp.getGrade());
            }
    }
    //display student list
    public void display(){
        if(head==null){
            System.out.println("Student record list is empty!");
            return;
        }
        StudentNode temp=head;
        while(temp!=null){
            System.out.println("Student's name : "+temp.getName());
            System.out.println("Student's roll number : "+temp.getRollNo());
            System.out.println("Student's age : "+temp.getAge());
            System.out.println("Student's grade : "+temp.getGrade());
            System.out.println("================================");
            temp=temp.getNext();
        }
    }
    //updating student's grade based on roll number
    public void updateStudentGrade(String grade,int rollNumber){
        if(head==null){
            System.out.println("Student list is empty!");
            return;
        }
        StudentNode temp=head;
        while(temp!=null&&temp.getRollNo()!=rollNumber){
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println("Student with roll number "+rollNumber+" is not present!");
        }
        else{
            temp.setGrade(grade);
        }
    }
}
