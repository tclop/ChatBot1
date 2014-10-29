package chatbot.model;

import java.util.ArrayList;

public class Chatbot {
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private String contentArea;
	

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0. Creates and fills the memeList.
	 * @param name The name of the chatbot
	 */
	public Chatbot(String name) {
		this.name = name;
		numberOfChats = 0;
		contentArea = "";
		memeList = new ArrayList<String>();
		fillTheMemeList();
		
		/**
		 * Creats a Chatbot object with a specified name. Initialized the total chats to 0.
		 * @param name THe name of the chatbot.
		 */
	}
	/**
	 *  Gets the Chatbot name
	 * @return The name of the chatbot
	 */
	public String getName() {
		return name;
	}
	/**
	 * total number of messages chatbot sends
	 * @return The number of chats
	 */

	public int getNumberOfChats() 
	{
		return numberOfChats;
	}
	/**
	 * Sets the name of the chatbot.
	 * @param name The new name of the Chatbot
	 */

	public void setName(String name) 
	{
		this.name = name;
	}
	/**
	 * tells how many times the user has input.
	 */
	public void incrementChats() 
	{
		numberOfChats++;
	}
	/**
	 * fills the meme array list
	 */
	private void fillTheMemeList()
	{
			memeList.add("y u madBro?");
			memeList.add("Not sure if ");
			memeList.add("buy and iPhone 5 they say");
			memeList.add("Real Life? I've never hear of that server before");
			memeList.add("Aint nobody got time for dat");
	}
	
	
	/**
	 * Processed the supplied text from the user to provide a message from the Chatbot.
	 * @param userText userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		int randomChoice = (int) (Math.random() * 3);
		if(userText != null)
		if(randomChoice == 0)
		{
			if(stringLengthChecker(userText))
			{
				processedText = "that is waaaaaay too long to read :P";
			}
			else
			{
				processedText = "why not type something longer?";
			}
		}
		else if (randomChoice == 1)
		{
			if(contentChecker(userText))
			{
				processedText = " i like" +userText;
			}
			else
			{
				processedText = "";
			}
		}
		else
		{
		
		if(memeChecker(userText))
		{
			processedText = "hey, you found a meme:" + userText;
			processedText += "isn't that cool.";
		}
		else
		{
			processedText = "Boring, that wasn't a meme";
		}
		
		}
		return processedText;
	}
	/*
	 * Checks to see user's input. See's if its okay to quit
	 * b
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("goodbye"))
		{
			okToQuit=true;
		}
		
		return okToQuit;
	}
	/**
	 * tells how lon the user input is
	 * @param input
	 * @return tells if the string is too long
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		
		if(input.length() >= 50)
		{
			isTooLong = true;
		}
		
		return isTooLong;
	}
	
	/**
	 * see's if the user input a meme
	 * @param currentText
	 * @return true or false
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		 
	for(int loopCounter = 0; loopCounter< memeList.size(); loopCounter++)
	{
		if(memeList.get(loopCounter).equalsIgnoreCase(currentText))
		{
			isAMeme = true;
		}
	}
	
		return isAMeme;
	}
	/**
	 * see's if the user put in content 
	 * @param input
	 * @return output
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
		
		if(input.contains(contentArea))
		{
	
			{
				hasMyContent = true;
			}
		}
		return hasMyContent;
	}

}		


