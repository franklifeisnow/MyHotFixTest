package lee.frank.myhotfixtest.mvp.Presenter;

import android.util.Log;

import lee.frank.myhotfixtest.mvp.Bean.UserBean;
import lee.frank.myhotfixtest.mvp.Model.IUserModel;
import lee.frank.myhotfixtest.mvp.Model.UserModel;
import lee.frank.myhotfixtest.mvp.View.IUserView;

/**
 * Created by Administrator on 2017/12/15.
 */

public class UserPresenter implements IUserPresenter {
    private IUserView userView;
    private IUserModel userModel;

    public UserPresenter(IUserView userView) {
        this.userView = userView;
        userModel = new UserModel();
    }

    @Override
    public void saveUser() {
        if(userView.getUserName() == null || userView.getUserPassWord() == null){
            Log.w("test", "saveUser: 账号密码不能未空");
        }else{
            userModel.saveUser(userView.getID(), userView.getUserName(), userView.getUserPassWord());
            Log.w("test", "saveUser: success!");
        }
    }

    @Override
    public void loadUser() {

        UserBean userBean = userModel.loadUser(userView.getID());
        if(userBean != null){
            userView.setUserName(userBean.getUser());
            userView.setUserPassWord(userBean.getPassword());
        }else {
            Log.w("test","loadUser: 编号"+ userView.getID() +"的用户数据不存在!");
        }
    }
}
