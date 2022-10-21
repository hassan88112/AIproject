package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class center_gui extends JFrame {
    
    private center_agent myagent ;
    private JTextField name , email;
     JButton b2=new JButton("2");
    b2.setPreferredSize(new Dimension(85, 50));  
    
    center_gui(center_agent a){
        super(a.getLocalName());
        myagent =a;
        JFrame frame = new JFrame("16");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(8,2));
        frame.setBackground(Color.black);
        
        
        JPanel panel1 =new JPanel();
        panel1.setBounds(40,80,200,200);
        panel1.setSize(200,200);
        panel1.setLayout(new GridLayout(8,2));
        
                    frame.add(b2) ; 
	frame.add(b2);
	frame.add(b2);
        frame.add(b2) ; 
	frame.add(b2);
	frame.add(b2);
        frame.add(b2) ; 
	frame.add(b2);
	frame.add(b2);
        frame.add(b2) ; 
	frame.add(b2);
	frame.add(b2);
        frame.add(b2) ; 
	frame.add(b2);
	frame.add(b2);
        frame.add(b2) ; 
        
        JFrame frame2 = new JFrame("8");
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);
        frame2.setSize(600,600);
        frame2.setLayout(new BorderLayout());
        frame2.setBackground(Color.black);
        
        
        JPanel panel2 =new JPanel();
        panel2.setBounds(40,80,200,200);
        panel2.setSize(200,200);
        panel2.setLayout(new FlowLayout());
        
        JFrame frame3 = new JFrame("4");
        frame3.setVisible(true);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        frame3.setSize(600,600);
        frame3.setLayout(new BorderLayout());
        frame3.setBackground(Color.black);
        
        
        JPanel panel3 =new JPanel();
        panel3.setBounds(40,80,200,200);
        panel3.setSize(200,200);
        panel3.setLayout(new FlowLayout());
        
        
        
		frame.add(panel1 ) ;
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		 
    }
    /*
    center_gui(center_agent a) {
		super(a.getLocalName());
		
		myagent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Book title:"));
		name = new JTextField(15);
		p.add(name);
		p.add(new JLabel("Price:"));
		email = new JTextField(15);
		p.add(email);
		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					String title = name.getText().trim();
					String price = email.getText().trim();
					//myagent.updateCatalogue(title, Integer.parseInt(price));
					name.setText("");
					email.setText("");
				}
				catch (Exception e) {
					//JOptionPane.showMessageDialog(BookSellerGui.this, "Invalid values. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} );
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myagent.doDelete();
			}
		} );
		
		setResizable(false);
	}*/
    
    
    /*public void showgui(){
        pack();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        screensize.height = 500;
        screensize.width = 500;
        int centerx= (int)screensize.getWidth()/2;
        int centery= (int)screensize.getHeight()/2;
        setLocation(centerx-getWidth()/2 , centery-getHeight()/2);
        super.setVisible(true);
    }*/
    
}
