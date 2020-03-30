/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class FormLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Log log = new Log();
    }
    
}

class Log extends JFrame {
    
   JTextField funame = new JTextField(5);
   JTextField fpword = new JTextField(5);
   JLabel lborder = new JLabel(" LOGIN ");
   JLabel luname = new JLabel(" Username ");
   JLabel lpword = new JLabel(" Password ");
   JButton btnClose = new JButton("CLOSE");
   JButton btnLogin = new JButton("LOGIN");

    Log() {
    setTitle("LOGIN");
    setSize(300,300);
    setDefaultCloseOperation(3);
    setLayout(null);
        
    add(lborder);
    add(luname);
    add(funame);
    add(lpword);
    add(fpword);
    add(btnClose);
    add(btnLogin); 
    btnLogin.addActionListener((ActionEvent e) -> {
        String uname,pword;
        uname = funame.getText();
        pword = fpword.getText();
        
        if(uname.equals("yones") && pword.equals("qwerty")){
            new Formulir();
        }
        else if(uname.length()<0 && pword.length()<0){
            JOptionPane.showMessageDialog(null, "username/password tidak boleh kosong!");
        }
        else{
            JOptionPane.showMessageDialog(null, "login gagal !");
        }
    });
    
    lborder.setBounds(150,15,140,20);
    luname.setBounds(10,50,120,20);
    funame.setBounds(130,50,150,20);
    lpword.setBounds(10,75,120,20);
    fpword.setBounds(130,75,150,20);
    btnLogin.setBounds(20,110,100,20);
    btnClose.setBounds(150,110,100,20);
    
    setVisible(true);
    }
}
