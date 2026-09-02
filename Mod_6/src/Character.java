//This class will store characters for the show Rick and Morty

public class Character {

    //Attributes
    private String name;
    private String species;
    private int age;

    //Constructor
    public Character(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    //Gettors and Settors

    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    public void setAge(int age){
        this.age = age;
    }

    //ToString method
    @Override
    public String toString(){
        return "Character {name='" + name + "', species='" + species + "', age=" + age + "}";
    }


}
