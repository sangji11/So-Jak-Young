package com.cbnu.sjy_.core.controller;

import com.cbnu.sjy_.R;
import com.cbnu.sjy_.base.controller.BaseController;
import com.cbnu.sjy_.core.logic.SignUpLogic;
import com.cbnu.sjy_.core.model.entity.User;
import com.cbnu.sjy_.core.viewmodel.SignUpViewModel;
import com.cbnu.sjy_.databinding.SignUpView;
import com.cbnu.sjy_.di.Factory;
import com.cbnu.sjy_.util.OnXML;

/**
 * @author : Sangji Lee
 * @when : 2019-11-17 오후 7:16
 * @homepage : https://github.com/sangji11
 */
public class SignUpController extends BaseController<SignUpView, SignUpViewModel> {

    private SignUpLogic signUpLogic = Factory.createTask(this, SignUpLogic.class);

    @Override protected int injectView() {
        return R.layout.view_signup;
    }

    @OnXML(resid = R.layout.view_signup)
    public void onSignUpFinish() {
        User user = new User();
        user.setId(viewModel.getId().getValue());
        user.setPw(viewModel.getPw().getValue());
        user.setName(viewModel.getName().getValue());
        user.setStudent_num(viewModel.getStudent_num().getValue());
        signUpLogic.signUp(user);
    }
}
