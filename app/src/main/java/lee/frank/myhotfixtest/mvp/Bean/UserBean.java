package lee.frank.myhotfixtest.mvp.Bean;

/**
 * Created by Administrator on 2017/12/14.
 */

public class UserBean {
    private String user;
    private String password;

    public UserBean(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
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
