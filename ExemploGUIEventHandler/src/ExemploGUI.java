import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploGUI extends JFrame implements ActionListener { 
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public ExemploGUI() {
        setTitle("Formulário de Login");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        textField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        add(new JLabel("Nome do Usuário: "));
        add(textField);
        add(new JLabel("Senha: "));
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String usuario = textField.getText();
            String senha = new String(passwordField.getPassword());

            if (usuario.equals("admin") && senha.equals("admin123")) {
                JOptionPane.showMessageDialog(this, "Login Realizado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos. Tente Novamente");
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExemploGUI exemplo = new ExemploGUI();
            exemplo.setVisible(true);
        });
    }
    
}
