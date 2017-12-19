package lee.frank.myhotfixtest.mvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lee.frank.myhotfixtest.R;
import lee.frank.myhotfixtest.mvp.Presenter.IUserPresenter;
import lee.frank.myhotfixtest.mvp.Presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements IUserView {

    @BindView(R.id.editText_id)
    EditText editTextId;
    @BindView(R.id.editText_name)
    EditText editTextName;
    @BindView(R.id.editText_password)
    EditText editTextPassword;
    @BindView(R.id.button_load)
    Button buttonLoad;
    @BindView(R.id.button_save)
    Button buttonSave;

    IUserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
        //获取p层的接口实例，并且传入此v层,为了调用p层里的实现业务逻辑的方法
        presenter = new UserPresenter(this);
    }

    @Override
    public int getID() {
        if(editTextId.getText().toString().equals("")){
            return 0;
        }
        return Integer.parseInt(editTextId.getText().toString());
    }

    @Override
    public String getUserName() {
        return editTextName.getText().toString();
    }

    @Override
    public String getUserPassWord() {
        return editTextPassword.getText().toString();
    }

    @Override
    public void setUserName(String userName) {
        editTextName.setText(userName);
    }

    @Override
    public void setUserPassWord(String userPassWord) {
        editTextPassword.setText(userPassWord);
    }

    @OnClick({R.id.button_load, R.id.button_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_load:
                presenter.loadUser();
                break;
            case R.id.button_save:
                presenter.saveUser();
                break;
        }
    }
}
