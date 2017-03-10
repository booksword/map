package dong.lan.mapeye.presenter;

import android.util.Log;

import com.tencent.qcloud.tlslibrary.helper.Secure;
import dong.lan.mapeye.contracts.LoginAndSignContract;
import dong.lan.mapeye.views.LoginAndSignActivity;

/**
 * Created by 梁桂栋 on 16-11-9 ： 下午1:03.
 * Email:       760625325@qq.com
 * GitHub:      github.com/donlan
 * description: map
 */

public class LoginRegisterPresenter implements LoginAndSignContract.Presenter {

    private static final String TAG = "LoginRegisterPresenter";
    private LoginAndSignActivity view;

    public LoginRegisterPresenter(LoginAndSignActivity view) {
        this.view = view;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void register(final String username, final String password) {
        Log.d(TAG, "register: "+Secure.encode(password));

    }

    @Override
    public void login(String username, String password) {
        Log.d(TAG, "login: "+Secure.encode(password));

    }
}
