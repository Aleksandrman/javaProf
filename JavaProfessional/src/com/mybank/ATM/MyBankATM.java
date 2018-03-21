package com.mybank.ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.TextArea;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyBankATM extends JFrame {

	private JPanel contentPane;
	private JTextField amountField;
	private JTextField statusField;

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
	}

	/**
	 * Create the frame.
	 */
	public MyBankATM() {
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
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton oneButton = new JButton("1");
		oneButton.setBorderPainted(false);
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
		
		JButton dummyButton = new JButton((String) null);
		dummyButton.setEnabled(false);
		panel_2.add(dummyButton);
		
		JButton enterButton = new JButton("Enter");
		panel_2.add(enterButton);
		
		JTextArea historyArea = new JTextArea();
		historyArea.setEditable(false);
		contentPane.add(historyArea, BorderLayout.CENTER);
		
		statusField = new JTextField();
		statusField.setEditable(false);
		statusField.setText("Welcom to myBank!");
		contentPane.add(statusField, BorderLayout.SOUTH);
		statusField.setColumns(10);
	}

}
