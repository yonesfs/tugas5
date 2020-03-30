/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
class Formulir extends JFrame {
String nama, jenkel, agama, hobi;

    JLabel lborder = new JLabel(" FORMULIR ");
    JTextField fnama = new JTextField(20);
    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljenkel = new JLabel(" Jenis Kelamin ");
    JRadioButton rbPria = new JRadioButton("Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");
    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama =
        {"Islam", "Katolik", "Kristen", "Budha", "Hindu"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    JLabel lhobi = new JLabel(" Hobi ");
    JCheckBox cbBola = new JCheckBox("Sepakbola ");
    JCheckBox cbBasket = new JCheckBox("Basket ");
    JButton btnSave = new JButton("Save");

    JLabel hasilnama = new JLabel();
    JLabel hasiljenkel = new JLabel();
    JLabel hasilagama = new JLabel();
    JLabel hasilhobi = new JLabel();

        public Formulir(){
            setTitle ("FORMULIR");
            setDefaultCloseOperation(3);
            setSize(350,400);
            setLocation(750,250);

            ButtonGroup group = new ButtonGroup();
            group.add(rbPria);
            group.add(rbWanita);

            setLayout (null);
            add(lborder);
            add(lnama);
            add(fnama);
            add(ljenkel);
            add(rbPria);
            add(rbWanita);
            add(lagama);
            add(cmbAgama);
            add(lhobi);
            add(cbBola);
            add(cbBasket);
            add(btnSave);
         
            add(hasilnama);
            add(hasiljenkel);
            add(hasilagama);
            add(hasilhobi);

            lborder.setBounds(150,15,120,20);
            lnama.setBounds(10,45,120,20);
            fnama.setBounds(130,35,150,20);
            ljenkel.setBounds(10,60,120,20);
            rbPria.setBounds(125,60,100,20);
            rbWanita.setBounds(225,60,100,20);
            lagama.setBounds(10,80,150,20);
            cmbAgama.setBounds(130,80,150,20);
            lhobi.setBounds(10,105,120,20);
            cbBola.setBounds(125,105,100,20);
            cbBasket.setBounds(225,105,150,20);
            btnSave.setBounds(110,125,120,20);
            
            btnSave.addActionListener((ActionEvent e) -> {
                if(fnama.getText().length() == 0){
                    JOptionPane.showMessageDialog(null, "DATA KOSONG!");
                } else{
                    nama = fnama.getText();
                    
                    if(rbPria.isSelected()){
                        jenkel = rbPria.getText();
                    } else if(rbWanita.isSelected()){
                        jenkel = rbWanita.getText();
                    }
                    agama = (String) cmbAgama.getSelectedItem();
                    
                    if(cbBola.isSelected() && cbBasket.isSelected())
                    {
                        hobi = cbBola.getText() + " & " +cbBasket.getText();
                    } else if(cbBola.isSelected()){
                        hobi = cbBola.getText();
                    } else if(cbBasket.isSelected()){
                        hobi = cbBasket.getText();
                    }
                    new Simpan(nama, jenkel, agama, hobi);
                } dispose();
            });
           setVisible(true);
        }
}
