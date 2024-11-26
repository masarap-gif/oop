/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;
import DSA.NodeTransac;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class arryList {
  
   public static ArrayList<String> UserID = new ArrayList<>();
     public static ArrayList<String> Status = new ArrayList<>();
   public  static ArrayList<Integer> ISBN = new ArrayList<>();
   public static ArrayList<Date> DueDate = new ArrayList<>();
   public static ArrayList<Date> BrrwDate = new ArrayList<>();
   public  static ArrayList<String> TransacId = new ArrayList<>();
  public  static ArrayList<Double> Payment = new ArrayList<>();
    
    
           
       public static String [] Header ={"Transaction ID", "ISBN", " UserID", "BorrowDate","DueDate","Amount", "Status"};
     public static String [] choices ={"Select Option", "Overdue","Paid"};
     public static String [] sotring ={"Select Option", "Weekly","Monthly", "Yearly"};
        
     
      private static ArrayList<NodeTransac> transactions = new ArrayList<>();

    public static void addTransaction(String userId, int isbn, String transacId, Date dueDate, Date borrowDate) {
        NodeTransac transaction = new NodeTransac(userId, isbn, transacId, dueDate, borrowDate);
         TransacId.add(transacId.trim());  // Ensure transaction ID is added and trimmed
    ISBN.add(isbn);
    BrrwDate.add(borrowDate);
    DueDate.add(dueDate);
        transactions.add(transaction);
    }
      public static void addTransaction(String transactionID, int code , String id, Date bbrw, Date dueDate, double Amount, String status) {
        NodeTransac transaction = new NodeTransac(transactionID, code, id, dueDate, bbrw, Amount,status);
         TransacId.add(transactionID.trim());  // Ensure transaction ID is added and trimmed
    ISBN.add(code);
    BrrwDate.add(bbrw);
    DueDate.add(dueDate);
        
        Payment.add(Amount);
        Status.add(status);
        transactions.add(transaction);
    }
//
//    public static ArrayList<NodeTransac> getTransactions() {
//        return transactions;
//    }

    public static ArrayList<NodeTransac> getTransactions() {
      return transactions;
    }

    public static boolean isTransactionIdExists(String transacs) {
          return arryList.TransacId.contains(transacs);
    }
    public static  void updateTransaction(int row, NodeTransac updatedTransaction) {
    // Update the transaction in the ArrayList at the specified row (index)
    transactions.set(row, updatedTransaction);
        System.out.println(DueDate);
        System.out.println(BrrwDate);
}
    
}

