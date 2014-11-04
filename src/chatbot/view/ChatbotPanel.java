package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("Enter");
		sampleButton.setForeground(Color.BLACK);
		sampleField = new JTextField(25);

		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, 141, SpringLayout.NORTH, this);
		
		
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void  setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}

	private void setupPanel()
	{
		this.setBackground(new Color(176, 196, 222));
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		
		JButton btnLaughButton = new JButton("Laugh button");
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, -6, SpringLayout.WEST, btnLaughButton);
		baseLayout.putConstraint(SpringLayout.WEST, btnLaughButton, 222, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, btnLaughButton, 10, SpringLayout.NORTH, this);
		add(btnLaughButton);
		
		JLabel lblSay = new JLabel("Say:");
		baseLayout.putConstraint(SpringLayout.WEST, lblSay, 0, SpringLayout.WEST, sampleField);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblSay, -6, SpringLayout.NORTH, sampleField);
		add(lblSay);
		

	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -154, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 6, SpringLayout.EAST, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -26, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -76, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 10, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent click)

			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}
		});
	}
	
		
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}
