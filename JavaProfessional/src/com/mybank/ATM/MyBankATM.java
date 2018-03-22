package com.mybank.ATM;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager.LookAndFeelInfo;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.awt.event.ActionEvent;

import com.mybank.domain.*;

public class MyBankATM extends JFrame {

	Bank myBank;
	Customer currentCustomer;
	Account	currentAccount;
	
	private JPanel panel_2;
	private JPanel contentPane;
	private JTextField amountField;
	private JTextField statusField;
	private JTextArea historyArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try { 
			for (LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { 
			if ("Nimbus".equals(info.getName())) { 
			javax.swing.UIManager.setLookAndFeel(info.getClassName()); 
			break; 
			} 
			} 
			} catch (ClassNotFoundException ex) { 
			java.util.logging.Logger.getLogger(MyBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
			} catch (InstantiationException ex) { 
			java.util.logging.Logger.getLogger(MyBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
			} catch (IllegalAccessException ex) { 
			java.util.logging.Logger.getLogger(MyBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
			} catch (javax.swing.UnsupportedLookAndFeelException ex) { 
			java.util.logging.Logger.getLogger(MyBankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
			}
		
			
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBankATM frame = new MyBankATM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//End main

	
	public MyBankATM() {
		myBank = Bank.getBank();
		
		Customer firstCustomer = new Customer("John"," Doe");
		Customer secondCustomer = new Customer("Jane"," Doe");
		
		SavingsAccount johnSavings 	= new SavingsAccount(1000, 5);
		CheckingAccount johnAccount = new CheckingAccount(5000,1000);
		CheckingAccount janeAccount = new CheckingAccount(500,100);
		
		firstCustomer.addAccount(johnSavings);
		firstCustomer.addAccount(johnAccount);
		secondCustomer.addAccount(janeAccount);
		
		myBank.addCustomer(firstCustomer);
		myBank.addCustomer(secondCustomer);
		
			this.setLocationRelativeTo(null);
		
		
		
		initFrame();
		
	for(Component c : panel_2.getComponents()) {
		if(c.getClass().equals(JButton.class) &&  ((JButton) c).getText()!="Enter")   {
			JButton currentButton = (JButton) c;
			currentButton.addActionListener((ActionEvent e) -> {
			addDigit(e);							
			});
		}
	}
	} 

	/**
	 * Create the frame.
	 */
	private void initFrame() {
		setAlwaysOnTop(true);
		setTitle("my bank ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2,1));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		JButton balanceButton = new JButton("Check account balance");
		balanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(balanceButton);
		
		JButton depositButton = new JButton("Make a deposit");
		panel_1.add(depositButton);
		
		JButton withdrawButton = new JButton("Make a withdrawal");
		panel_1.add(withdrawButton);
		
		amountField = new JTextField();
		panel_1.add(amountField);
		amountField.setColumns(10);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton oneButton = new JButton("1");
		panel_2.add(oneButton);
		
		JButton twoButton = new JButton("2");
		panel_2.add(twoButton);
		
		JButton threeButton = new JButton("3");
		panel_2.add(threeButton);
		
		JButton fourButton = new JButton("4");
		panel_2.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		panel_2.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		panel_2.add(sixButton);
		
		JButton sevenButton = new JButton("7");
		panel_2.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		panel_2.add(eightButton);
		
		JButton nineButton = new JButton("9");
		panel_2.add(nineButton);
		
		JButton zeroButton = new JButton("0");
		panel_2.add(zeroButton);
		
		JButton pointButton = new JButton(".");
//		dummyButton.setEnabled(false);
		panel_2.add(pointButton);
		
		JButton enterButton = new JButton("Enter");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int customerID = 0;
				
				try {
					customerID = Integer.parseInt(amountField.getText());
				currentCustomer = myBank.getCustomer(customerID);
				historyArea.append("Customer with ID = "+ customerID+ " is "+ currentCustomer.getLastName()
				+ " "+ currentCustomer.getFirstName()+ "\n");
				}
				catch(Exception ex) {
					historyArea.append("ERROR: Customer not found! or wrong Customer ID \n");	
				}
				
				
				amountField.setText("");
			}
		});
		panel_2.add(enterButton);
		
		historyArea = new JTextArea();
		historyArea.setEditable(false);
		contentPane.add(historyArea, BorderLayout.CENTER);
		
		statusField = new JTextField();
		statusField.setEditable(false);
		statusField.setText("Welcom to myBank! Enter client ID end press Enter...");
		contentPane.add(statusField, BorderLayout.SOUTH);
		statusField.setColumns(10);
	}

	private void addDigit(ActionEvent e) {
		amountField.setText(amountField.getText() + ((JButton) e.getSource()).getText());
	}
	
}
