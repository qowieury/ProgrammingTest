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
        if (isBlank(name)) {
            this.name = name;
            return this.name;
        } else {

            System.out.println(" Your name isn't correct! ");
            return null;
        }


    }

    @Override
    public String setPassword(String password) {
        if (isBlank(password) && password.length() >= 4) {
            this.password = password;
            return password;
        } else {
            System.out.println(" Your password isn't correct! ");
            return null;
        }

    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public int getType() {

        return type;
    }

    private boolean isBlank(String string) {

        if (string == null || string == "" || string.contains(" ")) {
            return false;
        } else {
            return true;
        }

    }
}
