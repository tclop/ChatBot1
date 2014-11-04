package chatbot.controller;

/**
 * Aplication Controller for the Chatbot String mainpulation project.
 * @author Tyler Clophus
 * @versian 1.2 10/1/14
 */

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{

	private ChatbotView appView;
	private Chatbot notSoCleverBot;
	/**
	 * The startup message for the chatbot application
	 */
	private String startMessage;

	private String endMessage;

	private ChatbotFrame baseFrame;

	/**
	 * Creates a ChatbotAppController and initializes the associated View and
	 * Model Objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
		startMessage = "Welcome to the " + notSoCleverBot.getName() + " Chatbot, type in your name.";
	}

	/**
	 * Allows other objects access to the notSoClerver bot
	 * 
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}

	/**
	 * Starts the Chatbot Application.
	 */
	public void start()
	{
		/**
		 * Makes a pop up window and ask a question.
		 */
		
		
		ChatbotPanel myAppPanel = (ChatbotPanel) baseFrame.getContentPane();
	myAppPanel.displayTextToUser(startMessage);
		
		//((ChatbotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);

	}
	
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		return respondText;
	}

	/**
	 * Quits the Chatbot Application with a message to the user that the
	 * application is closing.
	 */
	private void quit()
	{
		/**
		 * This message is given out if the answer is goodbye.
		 */
		appView.displayInformation("goodbye cruel user :'(");
		System.exit(0);
	}
}
