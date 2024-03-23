class StudentImpl {
    public static void main(String[]args){
        Student s = new Student("Mujtaba","7077");
        s.display();
    }
}

class Student{
    String name,rollno;
    Student (String nam,String rono){
    name=nam;
    rollno=rono;
}
public void display(){
    System.out.printf("\nWelcome %s\nYour Roll Number is : %s\n",name,rollno);
}
}