/* Donald Pughsley, COP-3330C-25407
   Program Objective: This program will showcase Generics by using a generics method that will find
   the index of a value in an array. The next part will contain generic data to store and maintain the various data
   Brief Explanation:The program prints index results
 */

public class GenericDemoApp {

    public static void main(String[] args){

        //This will instantiate 3 objects of different data types
        Integer[] nums = {3,6,9,12};
        String[] names = {"Rick", "Morty", "Mr. Meeseek"};
        Double[] ratings = {8.5, 9.7, 6.4};

        System.out.println("Index of 6: " + Search.findIndex(nums, 6));
        System.out.println("Index of Rick: " + Search.findIndex(names, "Rick") );
        System.out.println("Index of 8.5" + Search.findIndex(ratings, 6.4));

        //Creating characters
        Character character1 = new Character("Rick", "Human", 70);
        Character character2 = new Character("Unity", "Hive Mind", 2000);
        Character character3 = new Character("Birdperson", "Bird-Human", 40);

        //Creating planets
        Planet planet1 = new Planet("Earth", "C-137",true);
        Planet planet2 = new Planet("Gazorpazorp", "Andromeda", false);
        Planet planet3 = new Planet("Bizarre Earth", "35-C", false);

        //Showing episodes
        Episode ep1 = new Episode("Pickle Rick", 3, 9.3);
        Episode ep2 = new Episode("Hot Rick", 8, 7.6);
        Episode ep3 = new Episode("Summer of all fears ", 8, 8);

        //This shows characters containers
        GenericContainer<Character> characters = new GenericContainer<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);

        //Print statement
        System.out.println("\nCharacters:");
        characters.printInfo();//calling the printInfo method
        System.out.println("Size: " + characters.size());
        System.out.println("Retrieved: " + characters.retrieve(1));

        //This will sort characters name
        characters.sort(new java.util.Comparator<Character>() {
            public int compare(Character a, Character b) {
                return a.getName().compareTo(b.getName());
            }
        });
        //Printing the sorted characters
        System.out.println("Characters Sorted:");
        characters.printInfo();

        //Removing 1 character
        characters.remove(character3);
        System.out.println("1 Character was removed:");
        characters.printInfo();

        //Adding to the container of planets
        GenericContainer<Planet> planets = new GenericContainer<>();
        planets.add(planet1);
        planets.add(planet2);

        //Printing them out
        System.out.println("Planets:");
        planets.printInfo();
        System.out.println("Planets size: " + planets.size());
        System.out.println("Retrieved Planets: " + planets.retrieve(0));

        //sorting planets
        planets.sort(new java.util.Comparator<Planet>() {
            public int compare(Planet a, Planet b) {
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("Sorted Planets:");
        planets.printInfo();

        //Container of fav episodes
        GenericContainer<Episode> episodes = new GenericContainer<>();
        episodes.add(ep1);
        episodes.add(ep2);
        episodes.add(ep3);

        //print statements
        System.out.println("\nEpisodes:");
        episodes.printInfo();
        System.out.println("Episode Size " + episodes.size());
        System.out.println("Retrieved Episodes: " + episodes.retrieve(2));

        //sorted episodes
        episodes.sort(new java.util.Comparator<Episode>() {
            public int compare(Episode a, Episode b) {
                if (a.getRating() < b.getRating()) {
                    return -1;
                } else if (a.getRating() > b.getRating()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("Sorted Episodes by ratings:");
        episodes.printInfo();

        //removing 1 episode
        episodes.remove(ep3);
        //episodes after removing 1
        episodes.printInfo();



    }
}
