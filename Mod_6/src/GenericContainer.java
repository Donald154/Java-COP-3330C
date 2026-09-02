import java.util.ArrayList;
import java.util.List;

//This class will store generic data of any data type
public class GenericContainer<T> {

    //Attribute
    private List<T> items;

    //This creates an empty box to put items in
    public GenericContainer(){
        items = new ArrayList<>();
    }

    //This creates a add method to put items into a container
    public void add(T item){
        items.add(item);
    }

    //This method will remove items
    public boolean remove(T item){
        return items.remove(item);
    }

    //This method will retrieve items
    public T retrieve(int index){
        return items.get(index);
    }

    //This will return the number of items in the container
    public int size(){
        return items.size();
    }

    //this willl sort data using an comparator
    //A comparator defines custom sorting logic in objects
    public void sort(java.util.Comparator<T> comparator){
        items.sort(comparator);
    }
    //Custom method that will loop through item and print them out
    public void printInfo(){
        for (T item : items){//Enhance for loop
            System.out.println(item);
        }
    }

}
