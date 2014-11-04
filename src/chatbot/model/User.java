package chatbot.model;

public class User
{
private String School;	
private String name;
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
}
