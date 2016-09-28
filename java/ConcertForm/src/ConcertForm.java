/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name ConcertForm v1
 * @date Jan 25, 2016
 * @comment 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConcertForm extends JFrame implements ActionListener
{
	private JTextField nameField = new JTextField(30);
	private JCheckBox cdCheck = new JCheckBox("Souvenir CD");
        private JCheckBox tShirtCheck = new JCheckBox("Souvenir t-Shirt");
	ButtonGroup choices = new ButtonGroup();
	private JRadioButton choice1 = new JRadioButton("Stadium",true);
	private JRadioButton choice2 = new JRadioButton("Pit");
        private JRadioButton choice3 = new JRadioButton("Backstage Passes");
	private JButton submitButton = new JButton("-Sumbit-");
	
	public ConcertForm()
	{
		createWindow();
	}
		
	private void createWindow()
	{
		setTitle("Concert Master");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		addNamePanel();
		addSeatingPanel();
		addExtrasPanel();
		addButton();
		pack();
		setVisible(true);
	}
	
	private void addNamePanel()
	{
		JPanel panel = new JPanel();
		panel.add(new JLabel("Name on ticket: "));
		panel.add(nameField);
		add(panel,BorderLayout.NORTH);
	}
	
	private void addSeatingPanel()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		
		choices.add(choice1);
		choices.add(choice2);
                choices.add(choice3);
		
		panel.add(choice1);
		panel.add(choice2);
                panel.add(choice3);
		add(panel,BorderLayout.WEST);		
	}

	private void addExtrasPanel()
	{
		JPanel panel = new JPanel();		
		panel.add(cdCheck);
                panel.add(tShirtCheck);
		add(panel,BorderLayout.EAST);		
	}
		
	private void addButton()
	{
		add(submitButton,BorderLayout.SOUTH);
		submitButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submitButton)
		{
			printTicket();
		}
	}
	
	private void printTicket()
	{
		// name on ticket
		System.out.println(nameField.getText());
		
		// seating preference
		if(choice1.isSelected()) System.out.println("Stadium Seating");
		if(choice2.isSelected()) System.out.println("Pit Seating");
                if(choice3.isSelected()) System.out.println("Backstage Passes");
		
		// optional choices
		if(cdCheck.isSelected()) System.out.println("CD purchased");
                if(tShirtCheck.isSelected()) System.out.println("T-Shirt purchased");
	}
	
	public static void main(String[] args)
	{
		new ConcertForm();
	}
}