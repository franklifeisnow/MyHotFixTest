package lee.frank.myhotfixtest.mvp.Model;

import lee.frank.myhotfixtest.mvp.Bean.UserBean;

/**
 * Created by Administrator on 2017/12/14.
 */

public interface IUserModel {
    void saveUser(int id, String name, String password);
    UserBean loadUser(int id);
}
