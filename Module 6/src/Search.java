// This class will index an item in an array no matter it's data type since it is using generics
// Generics allows more flexibility for data types since it doesn't have to be hard coded and can change per object



public class Search {

    //Method
    public static <T> int findIndex(T[] array, T value){
    for (int i = 0; i < array.length; i++) { // for loop to loop through the array of items.
            if (array[i].equals(value)) {// if statement to return the index value once selected
                return i;// returns whatever i is
            }
        }
        return -1; // When value is not found
    }
}
