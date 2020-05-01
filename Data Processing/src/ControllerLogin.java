import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLogin {
    ModelLogin modelLogin;
    ViewLogin viewLogin;
    DAOLogin daoLogin;

    public ControllerLogin(ModelLogin modelLogin, ViewLogin viewLogin, DAOLogin daoLogin) {
        this.modelLogin = modelLogin;
        this.viewLogin = viewLogin;
        this.daoLogin = daoLogin;

        viewLogin.bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewLogin.getUser();
                String password = viewLogin.getPassword();
                modelLogin.setModelLogin(username, password);
                daoLogin.login(modelLogin);
            }
        });
    }
}
