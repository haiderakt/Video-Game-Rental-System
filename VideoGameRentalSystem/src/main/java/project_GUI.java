//FA22-BCS-114 Saad Shahzad
//FA22-BCS-134 Haider Ali
//FA22-BCS-135 Mohammad Faizan
//Project Title: Video Game Rental System

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class project_GUI extends JFrame{

    JPanel pnlMainMenu = new JPanel();

    
    
    JMenuBar menuBar = new JMenuBar();
    JMenu mainMenu = new JMenu("Main");
    JMenu gameMenu = new JMenu("Game");
    JMenu staffMenu = new JMenu("Staff");
    JMenu customerMenu = new JMenu("Customer");
    JMenu transactionMenu = new JMenu("Transaction");    
    JMenuItem itemAddGame = new JMenuItem("Add Game");
    JMenuItem itemUpdateGame = new JMenuItem("Update Game");
    
    

    JLabel lblTotalGame = new JLabel("Total Video Games: " + (Main.gameCounter + 1));
    JLabel lblTotalStaff = new JLabel("Total Staff Members: " + (Main.staffCounter + 1));
    JLabel lblTotalCustomer = new JLabel("Total Registered Customers: " + (Main.customerCounter + 1));
    JLabel lblCompanyName = new JLabel("GameFlix");
    
    Color colorBlue = new Color(10,11,56);
    Color colorWhite = new Color(255,255,255);

    
    
    public project_GUI(){
        super.setTitle("Video Game Rental");
        super.setDefaultCloseOperation(3);
        super.setSize(500, 480);
        super.setResizable(false);
        super.setLayout(null);
        super.setVisible(true);
        
        
        
        gameMenu.add(itemAddGame);
        gameMenu.add(itemUpdateGame);
        menuBar.add(mainMenu);
        menuBar.add(gameMenu);
        menuBar.add(staffMenu);
        menuBar.add(customerMenu);
        menuBar.add(transactionMenu);
        
       
        
        lblTotalGame.setBounds(100,170,300,40);
        lblTotalGame.setForeground(colorWhite);
        lblTotalStaff.setBounds(100,220,300,40);
        lblTotalStaff.setForeground(colorWhite);
        lblTotalCustomer.setBounds(100,270,300,40);
        lblTotalCustomer.setForeground(colorWhite);
        lblCompanyName.setFont(new Font("Calibri", 0, 42));
        lblCompanyName.setBounds(165,40,300,50);
        lblCompanyName.setForeground(colorWhite);

        
        
    
        pnlMainMenu.setLayout(null);
        pnlMainMenu.setVisible(true);
        pnlMainMenu.setSize(500,480);
        pnlMainMenu.setBackground(colorBlue);
        pnlMainMenu.add(lblTotalGame);
        pnlMainMenu.add(lblTotalStaff);
        pnlMainMenu.add(lblTotalCustomer);
        pnlMainMenu.add(lblCompanyName);
        super.setJMenuBar(menuBar);
        super.add(pnlMainMenu);
        
        

        super.setVisible(true);
        
        
        
        itemAddGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // panel to add video game
           }
       });
       
       
       
       
       
        
        
        
    }
        
}
   
      
     
    
    
    


    


