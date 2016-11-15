public class Student extends User {
    public Student(String name,String password){

        this.type = USER_STUDENT;
        setName(name);
        setPassword(password);

    }
}
