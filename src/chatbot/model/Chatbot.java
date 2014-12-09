package chatbot.model;

import java.util.ArrayList;

public class Chatbot {
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private ArrayList<String> userInputList;
	private User myUser;
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0. Creates and fills the memeList.
	 * @param name The name of the chatbot
	 */
	public Chatbot(String name) {
		this.name = name;
		numberOfChats = 0;
		userInputList = new ArrayList<String>();
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
			memeList.add("you what mate");
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
		Math.random();
		if(userText != null)
		{
		if (numberOfChats < 5)	
		{
			if(numberOfChats == 0)
			{
				myUser.getName(userText);
				processedText = "Hello" + myUser.getName() + "What is your age?";
			}
			else if(numberOfChats == 1)
			{
				int age = Integer.parseInt(userText);
				myUser.setAge(age);
				processedText = "Hello" + myUser.getName() + ", you are really" + myUser.getAge() + "years old?";
				processedText += "/n Where do you go to school";
			}
			else if(numberOfChats == 2)
			{
				
			}
			else if(numberOfChats == 3)
			{
				
			}
			else
			{
				
			}
			return processedText;
		}}
		return processedText;
		
		}
		/*else if (randomChoice == 1)
		{
			if(contentChecker(userInput))
			{
				randomChatTopic = " i like" +userInput;
			}
			else
			{
				randomChatTopic = "";
			}
		}
		else if (randomChoice == 2)
		{
		
		if(memeChecker(userInput))
		{
			randomChatTopic = "hey, you found a meme:" + userInput;
			randomChatTopic += "isn't that cool.";
		}
		else
		{
			randomChatTopic = "Boring, that wasn't a meme";
		}
	
		
		}
		else if (randomChoice == 3)
		{
			//user based talking
			//should store a string in proccessedText from another method say chooseRandomUserInfo(String)
		}
		else if (randomChoice == 4)
		{
			userInputList.add(0, userInput);
			randomChatTopic = "Thanks for the info," + myUser.getName();
		}
		else
		{
			if(userInputChecker(userInput))
			{
				 
			}
		}
		String randomTopic;
		if (randomChoice == 5)
		{
			if(userInputChecker(userInput))
			{
				randomTopic = "I love you. <3";
			}
			else
			{
				randomTopic ="I really really really really dislike you.";
			}
		}
		else
		{
			if (chatbotNameChecker(userInput));
			String userInput;
			{
				randomTopic = chatbotNameConversation(userInput);
			}
			{
				randomTopic = noNameConversation(userInput);
			}
		
		}
	
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
				
		return matchesInput;		
	}
	/**
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
	 * tells how long the user input is
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
}

