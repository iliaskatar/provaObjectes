package ilias;

public class Usuaris {
    private String user, password;
    // private int edat;

    public Usuaris(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUsers() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}