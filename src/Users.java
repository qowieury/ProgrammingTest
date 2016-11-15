import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    public Users(){
        userList = new ArrayList<IUser>();
    }

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {

                if (type == 1) {
                    Student s = new Student(name, password);
                    add(s);
                    return s;
                } else {
                    Teacher t = new Teacher(name, password);
                    add(t);
                    return t;
                }
            }


    // Add new user to repository
    public void add(IUser user) {
        if(isNotHaveSameUser(user.getName())) {
            this.userList.add(user);
        }
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(user !=null) {
            if (!exists(user)) {
                System.out.println("cannot find" + user.getName());
                throw new RuntimeException();
            } else {
                userList.remove(user);
            }
        }
    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {
        return userList.contains(user);
    }

    // Return number of user in the list
    public int count() {
        return userList.size();
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        int count =0;
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getType() == type){
                count++;
            }
        }
        return count;
    }
    private boolean isNotHaveSameUser(String username){
        for (int i=0;i<userList.size();i++){
            if(username == userList.get(i).getName()){
                System.out.println("Cant add , found same username");
                return false;
            }
        }
        return true;
    }


}
