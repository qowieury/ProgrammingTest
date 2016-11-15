public class Student extends User {
    public Student(String name,String password){

        this.type = USER_STUDENT;
        this.name = name;
        this.password = password;
    }
}
