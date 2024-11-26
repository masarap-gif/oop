/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRONTEND;
import BACKEND.BookBase;
import DSA.LinkedlistBook;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan
 */
public class VIEWLISTUI extends JFrame implements BookBase{
    

   public   static LinkedlistBook bookList = new LinkedlistBook();
   String[] columnNames = {"Title", "Author", "ISBN", "Genre", "Availability"};
    DefaultTableModel tableModel;
    JTable bookTable;
    JScrollPane sp;
     JLabel title = new JLabel("List of books");
     JPanel panel = new JPanel();
       JPanel pnl2 = new JPanel();
     JLabel a = new JLabel();
     JButton add, delete,update;   
     JLabel isbn,booktitle,author,form,genere,Images;
     JTextField ttFld, codfld, authfld,isbnfld;
     JButton adds,cancel,remove,cancels,updabbt;
      private JComboBox<String> genreComboBox;
      ImageIcon search = new ImageIcon("search.png");

  
    

    // Constructor
  public  VIEWLISTUI() {
     // VIEWLISTUI.bookList = book;
        // Add default books to the bookList
      
               designFrame();
    }

    // Method to add default books
  

    
   
    public void designFrame(){
           tableModel = new DefaultTableModel(columnNames, 0); 
           bookTable  = new JTable(tableModel);
           sp = new JScrollPane(bookTable);
           
        this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("View List");
        
        panel.setBounds(0, 86, 1483, 810);
        panel.setBackground(new Color(0x6F1D1B));
        panel.setLayout(null);
        
          pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);

        a = new JLabel("Pangalan mo");
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);
        
        add = new JButton("Add");
        add.setBounds(984, 80, 187, 56);
        add.setFont(new Font ("Bebas Neue", Font.BOLD, 23));
        add.setBackground(new Color(0xBB9457));
        add.setForeground(Color.white);
       add.addActionListener(e ->addFrame());
       
        update = new JButton("Update");
        update.setBounds(761, 80, 187, 56);
        update.setFont(new Font ("Bebas Neue", Font.BOLD, 23));
        update.setBackground(new Color(0xBB9457));
        update.setForeground(Color.white);
       update.addActionListener(e ->updateFrame());
        
          delete = new JButton("Delete");
        delete.setBounds(1207, 80, 187, 56);
        delete.setFont(new Font ("Bebas Neue", Font.BOLD, 23));
        delete.setBackground(new Color(0x99582A));
        delete.setForeground(Color.white);
        delete.addActionListener(e->deleteFrame());

        
        title.setBounds(61, 60, 500, 77);
        title.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 64));
        title.setForeground(Color.white);
        
        sp.setBounds(61, 140, 1340, 618);
        bookTable.setFont(new Font("Plus Jakarta Sans",Font.PLAIN,12));
        bookTable.setForeground(new Color(0x6F1D1B));
        

        panel.add(title);
        panel.add(update);
        panel.add(sp);
        panel.add(add);
        panel.add(delete);
        
        pnl2.add(a);
        
        
        this.add(panel);
        this.add(pnl2);
        
        populateTable();
           this.setVisible(true);
        
     
    }
    public  void  populateTable() {
        // Get the current books from the linked list
        Object[][] bookData = bookList.getBookData();

        // Clear any existing rows in the table
        tableModel.setRowCount(0);

        // Add each book's data to the table
        for (Object[] book : bookData) {
            tableModel.addRow(book);
        }
    }
    
    public void addFrame(){
        JFrame frame1 = new JFrame ("Add Book");
        frame1.setSize(719, 676);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        
        form = new JLabel("Book Form");
        form.setFont(new Font("Bebas Neue", Font.BOLD,50));
        form.setForeground(new Color(0x6F1D1B));
        form.setBounds(400, 65, 275, 37);
        
        isbn = new JLabel("ISBN");
        isbn.setBounds(45, 258, 165, 37);
        isbn.setFont(new Font("Bebas Neue", Font.BOLD,40));
        isbn.setForeground(new Color(0x6F1D1B));
        
        booktitle = new JLabel("Title");
        booktitle.setBounds(45, 182, 165, 37);
         booktitle.setFont(new Font("Bebas Neue", Font.BOLD,40));
         booktitle.setForeground(new Color(0x6F1D1B));
         
         author = new JLabel ("Author");
         author.setBounds(45, 335, 145, 37);
         author.setFont(new Font("Bebas Neue", Font.BOLD,40));
             author.setForeground(new Color(0x6F1D1B));
             
              
         genere = new JLabel ("Genre");
         genere.setBounds(45, 419, 145, 37);
         genere.setFont(new Font("Bebas Neue", Font.BOLD,40));
          genere.setForeground(new Color(0x6F1D1B));
          
          // textField
          ttFld = new JTextField();
          ttFld.setBounds(203, 187, 493, 48);
          ttFld.setBackground(new Color(0xD9D9D9));
         
            codfld = new JTextField();
          codfld.setBounds(203, 263, 493, 48);
          codfld.setBackground(new Color(0xD9D9D9));
          
            authfld = new JTextField();
          authfld.setBounds(203, 335, 493, 48);
          authfld.setBackground(new Color(0xD9D9D9));
          
          genreComboBox = new JComboBox<>(BookBase.genre);
        genreComboBox.setSelectedIndex(0);
        genreComboBox.setBounds(203, 414, 493, 48);
        genreComboBox.setBackground(new Color(0xD9D9D9));
        genreComboBox.setFont(new Font("Plus Jakarta Sans", Font.ITALIC,24));
        
        //Buttons
        adds= new JButton("Add");
        adds.setBounds(203, 578, 234, 48);
        adds.setBackground(new Color(0xD9D9D9));
        adds.setForeground(new Color(0x6F1D1B));
        adds.setFont(new Font("Bebas Neue", Font.BOLD, 40));
      adds.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String title = ttFld.getText();
        String author = authfld.getText();
        String isbnText = codfld.getText();

        int ISBN = 0;
        try {
            ISBN = Integer.parseInt(isbnText);  // Convert ISBN to int
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid ISBN number.");
            return;
        }

        String genre = genreComboBox.getSelectedItem().toString();

        // Add the book to the bookList
        bookList.addBook(title, author, ISBN, genre, true);

        // Get the updated book data from the LinkedList
       populateTable();

        // Optionally, clear fields after adding the book
        
        ttFld.setText("");
        authfld.setText("");
        codfld.setText("");
        genreComboBox.setSelectedIndex(0);
       // Reset the genre dropdown
    }
});
        
          cancel= new JButton("Cancel");
        cancel.setBounds(460, 578, 234, 48);
        cancel.setBackground(new Color(0xD9D9D9));
        cancel.setForeground(new Color(0x6F1D1B));
         cancel.setFont(new Font("Bebas Neue", Font.BOLD, 40));
         cancel.addActionListener(e->{
               JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(cancel);
    if (currentFrame != null) {
        currentFrame.dispose();
    }
    this.setVisible(true);
        });
    
        
        
         
        
        frame1.add(form);
         frame1.add(isbn);
          frame1.add(booktitle);
           frame1.add(author);
           frame1.add(genere);
           
           frame1.add(ttFld);
            frame1.add(codfld);
             frame1.add(authfld);
              frame1.add(genreComboBox);
              frame1.add(adds);
              frame1.add(cancel);
              
        frame1.setVisible(true);
    }
    
    public void deleteFrame(){
        JFrame frm = new JFrame("Remove book");
         frm.setSize(719,358);
        frm.setResizable(false);
        frm.setLayout(null);
        frm.setLocationRelativeTo(null);
        
        JLabel title = new JLabel("Remove Book");
        title.setFont(new Font ("Bebas Neue",Font.BOLD, 40));
        title.setForeground(new Color(0x6F1D1B));
        title.setBounds(287, 53, 500, 37);
        
        
        JLabel isbn = new JLabel("ISBN");
        isbn.setFont(new Font ("Bebas Neue",Font.BOLD, 40));
        isbn.setForeground(new Color(0x6F1D1B));
        isbn.setBounds(70, 140, 165, 37);
        
        Images = new JLabel();
        Images.setIcon(search);
        Images.setBounds(300, 12, 24, 24);
        
        
        isbnfld = new JTextField(){
            protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image inside the text field
        g.drawImage(((ImageIcon) search).getImage(), 450, 12, 24, 24, null); // Adjust icon size and position as needed
    }

    @Override
    public Insets getInsets() {
        // Add padding so the text doesn't overlap the image
        Insets original = super.getInsets();
        return new Insets(original.top, original.left + 35, original.bottom, original.right); // Add padding to the left
    }
};
        
        isbnfld.setBounds(197, 135, 493, 48);
        isbnfld.setLayout(null);
        isbnfld.add(Images);
    
        
        remove = new JButton("Remove");
        remove.setFont(new Font ("Bebas Neue",Font.BOLD, 40));
        remove.setBounds(197, 250, 234, 48);
        remove.setForeground(new Color(0x6F1D1B));
           remove.setBackground(new Color(0xD9D9D9));
     remove.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String isbnText = isbnfld.getText(); // Get ISBN from the correct field (isbnfld)

        int ISBN = 0;
        try {
            ISBN = Integer.parseInt(isbnText);  // Convert ISBN to int
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid ISBN number.");
            return;
        }

        // Remove the book from the bookList
        bookList.removeBook(ISBN);

        // Get the updated book data from the LinkedList
   populateTable();
        }
    
});
                
        cancels = new JButton("Cancel");
        cancels.setFont(new Font ("Bebas Neue",Font.BOLD, 40));
        cancels.setBounds(456, 250, 234, 48);
        cancels.setForeground(new Color(0x6F1D1B));
        cancels.setBackground(new Color(0xD9D9D9));
        cancels.addActionListener(e->{
             JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(cancels);
    if (currentFrame != null) {
        currentFrame.dispose();
    }
    this.setVisible(true);
        });
        
        
        frm.add(title);
         frm.add(isbn);
        frm.add(isbnfld);
        frm.add(remove);
        frm.add(cancels);
     
        
        frm.setVisible(true);
    }
    public void updateFrame(){
        int row = bookTable.getSelectedRow();
    
    if (row != -1) { // Ensure a row is selected
        // Assuming 'bookTable' has data like ISBN, Title, Author, Genre in columns 0, 1, 2, 3 respectively
        String isbnData =  bookTable.getValueAt(row, 2).toString();  // ISBN
        String titleData = bookTable.getValueAt(row, 0).toString();  // Title
        String authorData =  bookTable.getValueAt(row,1 ).toString();  // Author
        String genreData =  bookTable.getValueAt(row, 3).toString();  // Genre

        JFrame update = new JFrame("Update Book");
        update.setSize(719, 676);
        update.setLayout(null);
        update.setResizable(false);
        update.setLocationRelativeTo(null);
        
        form = new JLabel("Update Form");
        form.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        form.setForeground(new Color(0x6F1D1B));
        form.setBounds(380, 65, 400, 50);
        
        isbn = new JLabel("ISBN");
        isbn.setBounds(45, 258, 165, 37);
        isbn.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        isbn.setForeground(new Color(0x6F1D1B));
        
        booktitle = new JLabel("Title");
        booktitle.setBounds(45, 182, 165, 37);
        booktitle.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        booktitle.setForeground(new Color(0x6F1D1B));
         
        author = new JLabel("Author");
        author.setBounds(45, 335, 145, 37);
        author.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        author.setForeground(new Color(0x6F1D1B));
             
        genere = new JLabel("Genre");
        genere.setBounds(45, 419, 145, 37);
        genere.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        genere.setForeground(new Color(0x6F1D1B));
        
        // textField
        ttFld = new JTextField();
        ttFld.setBounds(203, 187, 493, 48);
        ttFld.setBackground(new Color(0xD9D9D9));
        ttFld.setText(titleData); // Set title

        codfld = new JTextField();
        codfld.setBounds(203, 263, 493, 48);
        codfld.setBackground(new Color(0xD9D9D9));
        codfld.setText(isbnData); // Set ISBN

        authfld = new JTextField();
        authfld.setBounds(203, 335, 493, 48);
        authfld.setBackground(new Color(0xD9D9D9));
        authfld.setText(authorData); // Set Author
        
        genreComboBox = new JComboBox<>(BookBase.genre);
        genreComboBox.setSelectedItem(genreData); // Set Genre
        genreComboBox.setBounds(203, 414, 493, 48);
        genreComboBox.setBackground(new Color(0xD9D9D9));
        genreComboBox.setFont(new Font("Plus Jakarta Sans", Font.ITALIC, 24));
        
        // Buttons
        updabbt = new JButton("Update");
        updabbt.setBounds(203, 578, 234, 48);
        updabbt.setBackground(new Color(0xD9D9D9));
        updabbt.setForeground(new Color(0x6F1D1B));
        updabbt.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        updabbt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = ttFld.getText();
        String author = authfld.getText();
        String isbnText = codfld.getText();

        int ISBN = 0;
        try {
            ISBN = Integer.parseInt(isbnText);  // Convert ISBN to integer
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid ISBN number.");
            return;
        }

        String genre = genreComboBox.getSelectedItem().toString();

        // Check if the book exists in the LinkedList and update it
        boolean bookUpdated = bookList.updateBook(ISBN, title, author, genre);

        if (bookUpdated) {
            // Refresh the table to reflect updated data
            populateTable();

            // Clear the fields after update
            update.dispose();
            ttFld.setText("");
            authfld.setText("");
            codfld.setText("");
            genreComboBox.setSelectedIndex(0);  // Reset the genre selection
        } else {
            JOptionPane.showMessageDialog(null, "Book not found, please check the ISBN.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});

            
            
        cancel = new JButton("Cancel");
        cancel.setBounds(460, 578, 234, 48);
        cancel.setBackground(new Color(0xD9D9D9));
        cancel.setForeground(new Color(0x6F1D1B));
        cancel.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        cancel.addActionListener(e -> {
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(cancel);
            if (currentFrame != null) {
                currentFrame.dispose();
            }
            this.setVisible(true);
        });
        
        // Add components to the frame
        update.add(form);
        update.add(isbn);
        update.add(booktitle);
        update.add(author);
        update.add(genere);
        update.add(ttFld);
        update.add(codfld);
        update.add(authfld);
        update.add(genreComboBox);
        update.add(updabbt);
        update.add(cancel);
        
        // Set frame visibility
        update.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Please select a book to update.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}    

    
   
    public static void main (String[] args){
        LinkedlistBook books = new LinkedlistBook();
       new VIEWLISTUI();
    }

    
      
   }

