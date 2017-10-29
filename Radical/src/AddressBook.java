import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
* <h1>AddressBook</h1>
* The AddressBook program implements an application that
*  displays a GUI Address Book were you can enter contacts details and save them.
* <p>
* 
* AddressBook extends JFrame for the use of the GUI and implements
* ActionListener for the Buttons and reacts when buttons are pressed.
* 
* @author  Paul Lloyd
* @version 1.0
* @since   26/01/2017 
*/

public class AddressBook extends JFrame
	implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 250;

	
	private JTextField 	nameTextField, addressTextField, cityTextField,
						stateTextField, zipTextField, phoneTextField, emailTextField;

	
	
	public AddressBook(){
		/**
	     *The method sets the Title of the Address Book app and the Name, 
	     *Address, City, State, Zip, Phone Number and Email Labels on the Front End
	     *of the GUI. It has SetSize for the width and Height of the app's GUI, and 
	     *Color. Also GridLayout. 
	     *
	     * @param enterButton displays 'Enter Record' button
	     * 
	     * @see AddressBook
	     * 
	     * @since version 1.00
	     */
		
		setSize(WIDTH,HEIGHT);
		
			setTitle("Address Book");
			Container contentPane = getContentPane();
			contentPane.setBackground(Color.YELLOW);
			contentPane.setLayout(new GridLayout(8,2));

			JLabel nameLabel = new JLabel("Name: ");
			contentPane.add(nameLabel);
			nameTextField = new JTextField(25);
			contentPane.add(nameTextField);

			JLabel addressLabel = new JLabel("Address:  ");
			contentPane.add(addressLabel);
			addressTextField = new JTextField(25);
			contentPane.add(addressTextField);

			JLabel cityLabel = new JLabel("City: ");
			contentPane.add(cityLabel);
			cityTextField = new JTextField(25);
			contentPane.add(cityTextField);

			JLabel stateLabel = new JLabel("State: ");
			contentPane.add(stateLabel);
			stateTextField = new JTextField(25);
			contentPane.add(stateTextField);

			JLabel zipLabel = new JLabel("Zip code: ");
			contentPane.add(zipLabel);
			zipTextField = new JTextField(25);
			contentPane.add(zipTextField);

			JLabel phoneLabel = new JLabel("Phone number: ");
			contentPane.add(phoneLabel);
			phoneTextField = new JTextField(25);
			contentPane.add(phoneTextField);

			JLabel emailLabel = new JLabel("Email: ");
			contentPane.add(emailLabel);
			emailTextField = new JTextField(25);
			contentPane.add(emailTextField);

			JButton enterButton = new JButton("Enter Record");
			enterButton.addActionListener(this);
			contentPane.add(enterButton);

			JButton exitButton = new JButton("Exit");
			exitButton.addActionListener(this);
			contentPane.add(exitButton);
	}

	
	public void actionPerformed(ActionEvent e)
	{
		/**
	     *
	     * The method invokes the ActionListner using ActionEvent
	     * 
	     *
	     * @param "Enter Record" button is pressed it displays TextField details
	     * @see Addressbook
	     * 
	     * @since version 1.00
	     */
		
		String actionCommand = e.getActionCommand();

		
		if(actionCommand.equals("Enter Record"))
		{
			String display = nameTextField.getText() + "\n";
					display += addressTextField.getText() + "\n";
					display += cityTextField.getText() + "\n";
					display += stateTextField.getText() + "\n";
					display += zipTextField.getText() + "\n";
					display += phoneTextField.getText() + "\n";
					display += emailTextField.getText();

					nameTextField.setText("");
					addressTextField.setText("");
					cityTextField.setText("");
					stateTextField.setText("");
					zipTextField.setText("");
					phoneTextField.setText("");
					emailTextField.setText("");

			JOptionPane.showMessageDialog(null, display);
		}
		else
			System.exit(0);
	}}

