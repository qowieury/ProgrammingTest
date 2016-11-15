public class Teacher extends User {
    public Teacher(String name,String password){

        this.type = USER_TEACHER;
        setName(name);
        setPassword(password);

    }

}
