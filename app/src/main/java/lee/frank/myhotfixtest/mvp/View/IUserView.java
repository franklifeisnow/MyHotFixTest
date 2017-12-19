package lee.frank.myhotfixtest.mvp.View;

/**
 * Created by Administrator on 2017/12/14.
 */

public interface IUserView {
    int getID();
    String getUserName();
    String getUserPassWord();

    void setUserName(String userName);
    void setUserPassWord(String userPassWord);
}
