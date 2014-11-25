package chatbot.model;

public class User
{
private String name;	
private String School;
private int age;
private String FavoritePokemon;

public String getName()
{
	return name;
}

public void getName(String name)
{
	this.name = "";
	
}

public int getAge()
{
	return age;
}

public void setAge(int age)
{
	this.age = 0;
}



public User(String name){
	
	this.name=name;
	
}

public String getFavoritePokemon()
{
	return FavoritePokemon;
}

public void setFavoritePokemon(String favoritePokemon)
{
	FavoritePokemon = favoritePokemon;
}

public String getSchool()
{
	return School;
}

public void setSchool(String school)
{
	School = school;
}

public void setName(String userText)
{
	// TODO Auto-generated method stub
	
}
}
