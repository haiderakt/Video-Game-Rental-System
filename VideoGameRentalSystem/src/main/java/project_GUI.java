//FA22-BCS-114 Saad Shahzad
//FA22-BCS-134 Haider Ali
//FA22-BCS-135 Mohammad Faizan
//Project Title: Video Game Rental System

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
    
    JMenuBar menuBar = new JMenuBar();
    JMenu mainMenu = new JMenu("Main");
    JMenu gameMenu = new JMenu("Game");
    JMenu staffMenu = new JMenu("Staff");
    JMenu customerMenu = new JMenu("Customer");
    JMenu transactionMenu = new JMenu("Transaction");
    
    JMenuItem itemAddGame = new JMenuItem("Add Game");
    JMenuItem itemUpdateGame = new JMenuItem("Update Game");
    
    JPanel container = new JPanel();
    JPanel pnl1 = new JPanel();
    JPanel pnlAddGame = new JPanel();
    
    
    
    JButton b1 = new JButton("Video Game menu");
    JButton b2 = new JButton("Customer menu");
    JButton b3 = new JButton("Staff menu");
    JButton b4 = new JButton("Record a transaction");
    JButton bExit = new JButton("Exit the program");
    
    
    public project_GUI(){
        super.setTitle("Video Game Rental");
        super.setDefaultCloseOperation(3);
        super.setSize(500, 480);
        super.setResizable(false);
        super.setLayout(null);
       
       
       
        pnl1.setLayout(null);
        pnl1.setSize(500, 400);
        pnlAddGame.setLayout(null);
        pnlAddGame.setSize(500,400);
        container.setLayout(null);
        container.setSize(500,400);
        container.setVisible(true);
       
        
        
        
        
        
        itemAddGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            
            
        
           }
       });
       
       
       
       
       gameMenu.add(itemAddGame);
       gameMenu.add(itemUpdateGame);
       
       
       menuBar.add(mainMenu);
       menuBar.add(gameMenu);
       menuBar.add(staffMenu);
       menuBar.add(customerMenu);
       menuBar.add(transactionMenu);
       super.setJMenuBar(menuBar);
       
       
       
       
       JLabel lbl1 = new JLabel("Main Menu:\n");
       lbl1.setBounds(199, 20, 280, 45);
       
       
       b1.setBounds(90, 80, 280, 45);
       b2.setBounds(90, 140, 280, 45);
       b3.setBounds(90, 200, 280, 45);
       b4.setBounds(90, 260, 280, 45);
       bExit.setBounds(90, 320, 280, 45);       
       
       
       pnl1.add(lbl1);
       pnl1.add(b1);
       pnl1.add(b2);
       pnl1.add(b3);
       pnl1.add(b4);
       pnl1.add(bExit);
        
       
       
       
       
//       super.add(pnl1);
//       pnl1.setVisible(true);
//       super.add(pnlAddGame);
//       pnlAddGame.setVisible(true);


        container.add(pnl1);
        super.add(container);
        super.setVisible(true);

        
        
       // Video Game Menu call action.
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               
           
           }
       });
        
        
        // Program exit action.
        bExit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               System.exit(0);
           }
       });
        
        
        
    }
        
}
   
      
     
    
    
    
//    public static void main(String[] args) {
//         project_GUI p = new project_GUI();
//         p.main_GUI();
//    }}


    


