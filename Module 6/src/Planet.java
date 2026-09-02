//This class will store planet data

public class Planet {

    private String name;
    private String dimension;
    private boolean isSafe;

    //Constructor
    public Planet(String name, String dimension, boolean isSafe){
        this.name = name;
        this.dimension = dimension;
        this.isSafe = isSafe;
    }


    //Gettors and Settors

    public String getName(){
        return name;
    }
    public String getDimension(){
        return dimension;
    }
    public boolean getisSafe(){
        return isSafe;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDimension(String dimension){
        this.dimension = dimension;
    }

    public void setisSafe(boolean isSafe){
        this.isSafe = isSafe;
    }

    //ToString method
    @Override
    public String toString(){
        return "Planet Information {name='" + name + "', dimension='" + dimension + "', is safe=" + isSafe + "}";
    }



}

