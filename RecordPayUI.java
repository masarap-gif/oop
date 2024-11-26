/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRONTEND;

import BACKEND.BookBase;
import BACKEND.arryList;
import DSA.NodeTransac;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan
 */
public class RecordPayUI extends JFrame implements BookBase  {
    JPanel panel = new JPanel();
    JPanel pnl2 = new JPanel();
    JLabel a;
    JLabel title = new JLabel("Record Payment");
      DefaultTableModel tb;
    static JTable table;
    JScrollPane sp;
    private JComboBox<String> option;

    public RecordPayUI() {
        // Initialize the table with headers
        tb = new DefaultTableModel(
            new String[]{"Transaction ID", "Code", "User ID", "Due Date", "Borrow Date", "Fine", "Status"},
            0
        );
        table = new JTable(tb);
        sp = new JScrollPane(table);

        design();
    }

    public void design() {
        this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Record Payment");

        panel.setBounds(0, 86, 1483, 810);
        panel.setBackground(new Color(0x6F1D1B));
        panel.setLayout(null);

        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);

        a = new JLabel("Pangalan mo");
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);
        pnl2.add(a);

        title.setBounds(61, 60, 500, 77);
        title.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 54));
        title.setForeground(Color.white);

        sp.setBounds(61, 150, 1340, 618);

        option = new JComboBox<>(new String[]{"Option1", "Option2"}); // Replace with real options
        option.setBounds(1161, 70, 233, 56);
        option.setFont(new Font("Plus Jakarta Sans", Font.ITALIC, 16));
        option.setBackground(new Color(0x99582A));
        option.setForeground(Color.white);

        panel.add(title);
        panel.add(sp);
        panel.add(option);

        this.add(panel);
        this.add(pnl2);

        // Populate with default values
        populateTable();

        this.setVisible(true);
    }

    private void populateTable() {
        tb.setRowCount(0); // Clear table
        Object[][] defaultData = DefaultValues();
        for (Object[] row : defaultData) {
            tb.addRow(row);
        }
    }

    private static Object[][] DefaultValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date returnDate = calendar.getTime();

        return new Object[][]{
            {"1001", 101, "1", sdf.format(currentDate), sdf.format(returnDate), 350, "Paid"},
            {"1002", 102, "2", sdf.format(currentDate), sdf.format(returnDate), 360, "Paid"},
            {"1002", 102, "2", sdf.format(currentDate), sdf.format(returnDate), 360, "OverDue"}
        };
    }

    public   void addRecord(String userId, int code, String id, Date dueDate, Date borrowDate, double fine, String status) {
        tb.addRow(new Object[]{userId, code, id, dueDate, borrowDate, fine, status});
        populateTable();
    }

    public static void main(String[] args) {
        new RecordPayUI();
    }
}



