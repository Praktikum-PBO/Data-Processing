public class MVCLogin {
    ViewLogin viewLogin = new ViewLogin();
    ModelLogin modelLogin = new ModelLogin();
    DAOLogin daoLogin = new DAOLogin();
    ControllerLogin controllerLogin = new ControllerLogin(modelLogin, viewLogin, daoLogin);
}
