import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankTeller extends JFrame implements ActionListener
{
	//declaring necessary variable names for JLabel, JTextField, JButton, JLabel
	private JLabel labelFirstName, labelFirstNameB, labelLastName, labelLastNameB, labelAccountNumber, labelAccountNumberB, labelTransaction, labelCurrentBalance;
	private JTextField textFirstName, textLastName, textAccountNumber, textTransaction;
	private JButton buttonSubmit;
	private JLabel postedlabelFirstName, postedlabelLastName, postedlabelAccountNumber, postedlabelCurrentBalance;
	
	//globally declaring BankAccount instance name to give access to ActionListener
	BankAccount myBank;
	//creating Container
	private Container content = getContentPane();
	
	public BankTeller() 
	{
		myBank = new BankAccount(); //creating an instance of the BankAccount Class
		
		//frame customization
		this.setTitle("Bank of Marconi");
		this.setSize(500,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Welcome Message
		JOptionPane.showMessageDialog(null, "Welcome to Bank of Marconi!");
		
		
		//Label Customization(First Half)
		labelFirstName = new JLabel("Client First Name: ");
		labelFirstName.setBounds(20, 20, 120, 25);
		labelFirstName.setHorizontalAlignment(JLabel.LEFT);
		labelFirstName.setBackground(null);
		labelFirstName.setOpaque(true);
		
		labelLastName = new JLabel("Client Last Name: ");
		labelLastName.setBounds(20, 60, 120, 25);
		labelLastName.setHorizontalAlignment(JLabel.LEFT);
		labelLastName.setOpaque(true);
		
		labelAccountNumber = new JLabel("Client Account Number: ");
		labelAccountNumber.setBounds(20, 100, 160, 25);
		labelAccountNumber.setHorizontalAlignment(JLabel.LEFT);
		labelAccountNumber.setOpaque(true);
		
		labelTransaction = new JLabel("Transaction Amount (Deposit): ");
		labelTransaction.setBounds(20, 140, 200, 25);
		labelTransaction.setHorizontalAlignment(JLabel.LEFT);
		labelTransaction.setOpaque(true);
		
		//Label Customization(Second Half)
		labelFirstNameB = new JLabel("Client First Name: ");
		labelFirstNameB.setBounds(20, 240, 120, 25);
		labelFirstNameB.setHorizontalAlignment(JLabel.LEFT);
		labelFirstNameB.setOpaque(true);
		
		labelLastNameB = new JLabel("Client Last Name: ");
		labelLastNameB.setBounds(20, 280, 120, 25);
		labelLastNameB.setHorizontalAlignment(JLabel.LEFT);
		labelLastNameB.setOpaque(true);
		
		labelAccountNumberB = new JLabel("Client's Account Number: ");
		labelAccountNumberB.setBounds(20, 320, 180, 25);
		labelAccountNumberB.setHorizontalAlignment(JLabel.LEFT);
		labelAccountNumberB.setOpaque(true);
		
		labelCurrentBalance = new JLabel("Client's Current Balance: ");
		labelCurrentBalance.setBounds(20, 360, 200, 25);
		labelCurrentBalance.setHorizontalAlignment(JLabel.LEFT);
		labelCurrentBalance.setOpaque(true);
		
		//TextFields
		textFirstName = new JTextField();
		textFirstName.setBounds(180, 20, 150, 25);
		textFirstName.setHorizontalAlignment(JTextField.LEFT);
		textFirstName.setBackground(Color.LIGHT_GRAY);
		textFirstName.setFont(new Font("", Font.PLAIN, 15));
		textFirstName.setOpaque(true);
		textFirstName.addActionListener(this);
		
		textLastName = new JTextField();
		textLastName.setBounds(180, 60, 150, 25);
		textLastName.setHorizontalAlignment(JTextField.LEFT);
		textLastName.setBackground(Color.LIGHT_GRAY);
		textLastName.setFont(new Font("", Font.PLAIN, 15));
		textLastName.setOpaque(true);
		
		textAccountNumber = new JTextField();
		textAccountNumber.setBounds(180, 100, 150, 25);
		textAccountNumber.setHorizontalAlignment(JTextField.LEFT);
		textAccountNumber.setBackground(Color.LIGHT_GRAY);
		textAccountNumber.setFont(new Font("", Font.PLAIN, 15));
		textAccountNumber.setOpaque(true);
		
		textTransaction = new JTextField();
		textTransaction.setBounds(205, 140, 150, 25);
		textTransaction.setHorizontalAlignment(JTextField.LEFT);
		textTransaction.setBackground(Color.LIGHT_GRAY);
		textTransaction.setFont(new Font("", Font.PLAIN, 15));
		textTransaction.setOpaque(true);
		
		//Submit Button
		buttonSubmit = new JButton("Submit");
		buttonSubmit.setBounds(20, 180, 100, 20);
		buttonSubmit.setHorizontalAlignment(JButton.CENTER);
		buttonSubmit.setFont(new Font("", Font.BOLD,15));
		buttonSubmit.addActionListener(this);
		
		//Final Labels
		postedlabelFirstName = new JLabel();
		postedlabelFirstName.setBounds(200, 240, 200, 25);
		postedlabelFirstName.setHorizontalAlignment(JLabel.CENTER);
		postedlabelFirstName.setFont(new Font("Calibri", Font.BOLD,15));
		postedlabelFirstName.setOpaque(true);
		
		postedlabelLastName = new JLabel();
		postedlabelLastName.setBounds(200, 280, 200, 25);
		postedlabelLastName.setHorizontalAlignment(JLabel.CENTER);
		postedlabelLastName.setFont(new Font("Calibri", Font.BOLD,15));
		postedlabelLastName.setOpaque(true);
		
		postedlabelAccountNumber = new JLabel();
		postedlabelAccountNumber.setBounds(200, 320, 200, 25);
		postedlabelAccountNumber.setHorizontalAlignment(JLabel.CENTER);
		postedlabelAccountNumber.setFont(new Font("Calibri", Font.BOLD,15));
		postedlabelAccountNumber.setOpaque(true);
		
		postedlabelCurrentBalance = new JLabel();
		postedlabelCurrentBalance.setBounds(200, 360, 200, 25);
		postedlabelCurrentBalance.setHorizontalAlignment(JLabel.CENTER);
		postedlabelCurrentBalance.setFont(new Font("Calibri", Font.BOLD,15));
		postedlabelCurrentBalance.setOpaque(true);
		
		//adding componenets to GUI
		content.add(labelFirstName);
		content.add(labelFirstNameB);
		content.add(labelLastName);
		content.add(labelLastNameB);
		content.add(labelAccountNumber);
		content.add(labelAccountNumberB);
		content.add(labelTransaction);
		content.add(labelCurrentBalance);
		content.add(textFirstName);
		content.add(textLastName);
		content.add(textAccountNumber);
		content.add(textTransaction);
		content.add(buttonSubmit);
		content.add(postedlabelFirstName);
		content.add(postedlabelLastName);
		content.add(postedlabelAccountNumber);
		content.add(postedlabelCurrentBalance);
		this.setVisible(true);
		
		
	}
//ActionPerformed Method adding functionality to GUI
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==buttonSubmit) //actions initated after hitting submit
		{
			myBank.setFirstName(textFirstName.getText());
			myBank.setLastName(textLastName.getText());
			myBank.setAccountNumber(textAccountNumber.getText()); //accessing values of text fields and passing them onto BankAccount mutators
			
			try 
			{		//converting string value of transaction to double
				double amount = Double.parseDouble(textTransaction.getText().trim());
	            amount += myBank.getCurrentBalance();//calculation for deposit
	            myBank.setCurrentBalance(amount); //setting current balance with updated transaction
				
				
			}catch (NumberFormatException nfe) {
				System.out.println("You have entered an incorrect value."); //input validation
			}
			//displaying the values
			postedlabelFirstName.setText(myBank.getFirstName());
			postedlabelLastName.setText(myBank.getLastName());
			postedlabelAccountNumber.setText(myBank.getAccountNumber());
			postedlabelCurrentBalance.setText(new String(""+myBank.getCurrentBalance()));
			
		}
		
	}
	
	public static void main(String[] args) {
		new BankTeller(); //creating an instance of BankTeller GUI

	}

}
