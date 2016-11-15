public class User implements IUser {

    protected String name;
    protected String password;
    protected int type;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        if(name != null && !name.contains(" ")){
            this.name = name;
            return this.name;
        }
        return null;

    }

    @Override
    public String setPassword(String password) {
        if(password != null && password.length()>=4 && !name.contains(" ")){
            this.password=password;
            return password;
        }
        return null;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(this.password == password){

            return true;
        }

        return false;
    }

    @Override
    public int getType() {

        return type;
    }
}
