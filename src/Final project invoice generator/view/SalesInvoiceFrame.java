/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicet3july.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import salesinvoicet3july.controller.SalesInvoiceListener;
import salesinvoicet3july.model.HeaderTableModel;
import salesinvoicet3july.model.Invoice;


public class SalesInvoiceFrame extends javax.swing.JFrame {

    public SalesInvoiceFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(listener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        invNumLabel = new javax.swing.JLabel();
        invDateLabel = new javax.swing.JLabel();
        invTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        linesTable = new javax.swing.JTable();
        newInvButton = new javax.swing.JButton();
        newInvButton.addActionListener(listener);
        delInvButton = new javax.swing.JButton();
        delInvButton.addActionListener(listener);
        newLineButton = new javax.swing.JButton();
        newLineButton.addActionListener(listener);
        delLineButton = new javax.swing.JButton();
        delLineButton.addActionListener(listener);
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(listener);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(listener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoicesTable);

        jLabel1.setText("Invoice Num");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Invoice Total");

        custNameLabel.setText("jLabel5");

        invNumLabel.setText("jLabel6");

        invDateLabel.setText("jLabel7");

        invTotalLabel.setText("jLabel8");

        linesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(linesTable);

        newInvButton.setText("New Invoice");

        delInvButton.setText("Delete Invoice");

        newLineButton.setText("New Line");

        delLineButton.setText("Delete Line");

        jMenu3.setText("File");

        loadMenuItem.setText("Load Files");
        jMenu3.add(loadMenuItem);

        saveMenuItem.setText("Save Data");
        jMenu3.add(saveMenuItem);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(invNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(newInvButton)
                .addGap(39, 39, 39)
                .addComponent(delInvButton)
                .addGap(100, 100, 100)
                .addComponent(newLineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delLineButton)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invNumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(custNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(invDateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invTotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInvButton)
                    .addComponent(delInvButton)
                    .addComponent(newLineButton)
                    .addComponent(delLineButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesInvoiceFrame frame = new SalesInvoiceFrame();
                frame.setVisible(true);
                frame.listener.loadFiles("InvoiceHeader.csv", "InvoiceLine.csv");
            }
        });
    }

    private javax.swing.JLabel custNameLabel;
    private javax.swing.JButton delInvButton;
    private javax.swing.JButton delLineButton;
    private javax.swing.JLabel invDateLabel;
    private javax.swing.JLabel invNumLabel;
    private javax.swing.JLabel invTotalLabel;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable linesTable;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JButton newInvButton;
    private javax.swing.JButton newLineButton;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    private SalesInvoiceListener listener = new SalesInvoiceListener(this);
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private ArrayList<Invoice> invoices;
    private HeaderTableModel headerTableModel;

    public ArrayList<Invoice> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<>();
        }
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public HeaderTableModel getHeaderTableModel() {
        return headerTableModel;
    }

    public void setHeaderTableModel(HeaderTableModel headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public JTable getLinesTable() {
        return linesTable;
    }

    public JLabel getCustNameLabel() {
        return custNameLabel;
    }

    public JLabel getInvDateLabel() {
        return invDateLabel;
    }

    public JLabel getInvNumLabel() {
        return invNumLabel;
    }

    public JLabel getInvTotalLabel() {
        return invTotalLabel;
    }

    public SalesInvoiceListener getListener() {
        return listener;
    }
    
    
    
    
}
