package lee.frank.myhotfixtest.mvp.Model;

import android.util.SparseArray;

import lee.frank.myhotfixtest.mvp.Bean.UserBean;

/**
 * Created by Administrator on 2017/12/15.
 */

public class UserModel implements IUserModel {
    //android的优化版hashmap，数据千条以下的时候效率高
    private SparseArray<UserBean> array = new SparseArray<>();


    @Override
    public void saveUser(int id, String name, String password) {
        array.append(id, new UserBean(name, password));
    }

    @Override
    public UserBean loadUser(int id) {
        if(array.indexOfKey(id) >= 0){
            return array.get(id);
        }else return null;
    }
}
