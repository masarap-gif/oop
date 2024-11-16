/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan
 */
public class Return extends JFrame implements ActionListener,BookBase{
    private JLabel userLbl,isbnLbl,BrrwLbl,dueDate,fineams,image,a,title;
    private JTextField user,isbn,date,dueDFate,fineamount;
    private JButton prcd, cancel;
    private JPanel panel1, panel2,pnl3;
    DefaultTableModel tb = new DefaultTableModel(BookBase.date,BookBase.header1);
    JTable table = new JTable(tb);
    JScrollPane sp = new JScrollPane(table);
    
    Return(){
       Design();
    }
    
    public void Design(){
          this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
        this.setLayout(null);
        this.setTitle("Returning");

        
           // panels
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0xD9D9D9));
        panel1.setBounds(0, 0, 1530, 86);
        
           
         panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(0x6F1D1B));
        panel2.setBounds(718, 86, 758, 810);
        
         pnl3 = new JPanel();
        pnl3.setLayout(null);
            pnl3.setBackground(new Color(0x99582A));
        pnl3.setBounds(0, 86, 725, 840);
        
        
        // labels
        a = new JLabel("Pangalan mo");
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);
        
         title=new JLabel("Returning");
        title.setForeground(Color.white);
        title.setFont(new Font("Bebas Neue", Font.BOLD, 70));
        title.setBounds(349, 37, 500, 115);
        
           userLbl=new JLabel("UserID");
        userLbl.setForeground(new Color(0xBB9457));
        userLbl.setFont(new Font("Plus Jakarta Sans ", Font.PLAIN, 36));
        userLbl.setBounds(83, 276, 250, 43);
        
        isbnLbl=new JLabel("ISBN");
        isbnLbl.setForeground(new Color(0xBB9457));
        isbnLbl.setFont(new Font("Plus Jakarta Sans ", Font.PLAIN, 36));
        isbnLbl.setBounds(83, 136   ,100, 45);
        
        BrrwLbl=new JLabel("Borrow Date");
        BrrwLbl.setForeground(new Color(0xBB9457));
        BrrwLbl.setFont(new Font("Plus Jakarta Sans ", Font.PLAIN, 36));
        BrrwLbl.setBounds(83, 399,250, 43);
        
         dueDate=new JLabel("Due Date");
        dueDate.setForeground(new Color(0xBB9457));
        dueDate.setFont(new Font("Plus Jakarta Sans ", Font.PLAIN, 36));
        dueDate .setBounds(510, 399,250, 43);
        
          fineams=new JLabel("Fine Amount");
        fineams.setForeground(new Color(0xBB9457));
        fineams.setFont(new Font("Plus Jakarta Sans ", Font.PLAIN, 36));
        fineams .setBounds(83, 523,250, 43);
        
        //textField
        user = new JTextField();
        user.setBounds(83, 323, 613, 76);
        user.setBackground(Color.white);
        
         isbn = new JTextField();
        isbn.setBounds(83, 195, 613, 76);
        isbn.setBackground(Color.white);
        
           date = new JTextField();
        date.setBounds(83, 439, 302, 76);
        date.setBackground(Color.white);
        
            dueDFate = new JTextField();
        dueDFate.setBounds(407, 439, 289  , 76);
        dueDFate.setBackground(Color.white);
        
             fineamount = new JTextField();
        fineamount.setBounds(83, 566   , 614  , 76);
        fineamount.setBackground(Color.white);
        
        //buttons
        prcd = new JButton("Return");
         cancel = new JButton("Cancel");
         
         prcd.setFont(new Font("Bebas Neue", Font.BOLD, 48));
         prcd.setForeground(new Color(0x6F1D1B));
         prcd.setBackground(Color.white);
         
        cancel.setFont(new Font("Bebas Neue", Font.BOLD, 48));
          cancel.setForeground(new Color(0x6F1D1B));
          cancel.setBackground(new Color(0xBB9457));
        
        prcd.setBounds(83, 660, 310, 88);
        cancel.setBounds(435, 660, 261, 88);
        // table
        sp.setBounds(40, 49, 646, 700);
        pnl3.add(sp);
        
        //adding items
        panel1.add(a);
        panel2.add(title);
         panel2.add(userLbl);
          panel2.add(isbnLbl);
           panel2.add(BrrwLbl);
            panel2.add(dueDate);
             panel2.add(fineams);
             panel2.add(isbn);
           panel2.add(user);
          panel2.add(date);
          panel2.add(dueDFate);
           panel2.add(fineamount);
           panel2.add(prcd);
            panel2.add(cancel);
        
        this.add(panel1);
        this.add(panel2);
        this.add(pnl3);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main (String [] args){
        new Return();
    }
    
}
