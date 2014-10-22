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
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 77, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 112, SpringLayout.WEST, this);
		
		
		
		
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
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		

	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 0, SpringLayout.EAST, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 328, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + ":O i like apples.");
			}
		});
	}
}
