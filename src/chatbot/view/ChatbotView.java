package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView 
{

	private ChatbotAppController baseController;

	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	/**
	 * Displays the supplied String parameter to the uswe via popup and returents the users respnese to the controller.
	 * @param input
	 * @return
	 */
	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says " +input);
		
		return output;
	}
	/**
	 * Displays the supplied input via a popup window.
	 * @param input The text to be displayed
	 */
		public void displayInformation(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}

		

}
