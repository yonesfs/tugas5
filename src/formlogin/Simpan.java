/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
class Simpan extends JFrame {
String nama, jenkel, agama, hobi;

    JLabel lborder = new JLabel("VIEW");
    JLabel lnama = new JLabel(" Nama Lengkap  ");
    JLabel ljenkel = new JLabel(" Jenis Kelamin   ");
    JLabel lagama = new JLabel(" Agama        ");
    JLabel lhobi = new JLabel(" Hobi         ");
    JLabel simpanNama= new JLabel();
    JLabel simpanJenKel= new JLabel();
    JLabel simpanAgama= new JLabel();
    JLabel simpanHobi= new JLabel();
    public Simpan(String nama, String jenkel, String agama, String hobi) {
        
        setTitle("View");
	setDefaultCloseOperation(3);
	setSize(350,180);

        this.nama= nama;
        this.jenkel=jenkel;
        this.agama=agama;
        this.hobi=hobi;
        simpanNama.setText(nama);
        simpanJenKel.setText(jenkel);    
        simpanAgama.setText(agama); 
        simpanHobi.setText(hobi);
        
        setLayout(null);
        add(lborder);
        add(lnama);
        add(ljenkel);
        add(lagama);
        add(lhobi);
        add(simpanNama);
        add(simpanJenKel);
        add(simpanAgama);
        add(simpanHobi);

        lborder.setBounds(100,10,120,20);
        lnama.setBounds(10,25,120,20);
	ljenkel.setBounds(10,50,120,20);
        lagama.setBounds(10,75,120,20);
        lhobi.setBounds(10,100,120,20);
        simpanNama.setBounds(110,25,120,20);
	simpanJenKel.setBounds(110,50,120,20);
        simpanAgama.setBounds(110,75,120,20);
        simpanHobi.setBounds(110,100,150,20);

        setVisible(true);
        
    }
}
