package plusplus.lesson31;

public class User {
    public String name="Dung";
    public String email="vandung030701@gmail,com";
     String mssv="1507964";

    public User() {
    }

    public User(String name, String email, String mssv) {
        this.name = name;
        this.email = email;
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}
