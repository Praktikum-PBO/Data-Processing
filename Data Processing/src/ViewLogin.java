import javax.swing.*;

public class ViewLogin extends JFrame {
    JLabel lJudul, lUsername, lPassword;
    JTextField tfUser;
    JPasswordField tfPassword;
    JButton bLogin;

    public ViewLogin() {
        setTitle("LOGIN");
        lJudul = new JLabel("LOGIN ADMIN");
        lUsername = new JLabel("Username : ");
        lPassword = new JLabel("Password : ");

        tfUser = new JTextField();
        tfPassword = new JPasswordField();

        bLogin = new JButton("Login");

        setLayout(null);
        add(lJudul);
        add(lUsername);
        add(lPassword);
        add(tfUser);
        add(tfPassword);
        add(bLogin);

        lJudul.setBounds(160, 30, 100, 20);
        lUsername.setBounds(70, 70, 80, 25);
        tfUser.setBounds(160, 70, 145, 25);
        lPassword.setBounds(70, 110, 80, 25);
        tfPassword.setBounds(160, 110, 145, 25);
        bLogin.setBounds(160, 150, 80, 25);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUser() {
        return tfUser.getText();
    }

    public String getPassword() {
        return tfPassword.getText();
    }
}
