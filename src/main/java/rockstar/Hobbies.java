package rockstar;

import java.util.*;

public class Hobbies {

    private final HashMap <String, String[]> hobbies = new HashMap <String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List <String> findHobbyists(String hobby) {
        List <String> hobbyists = new ArrayList <>();

        for (Map.Entry<String, String[]> hobbyEntry: hobbies.entrySet()) {
            for (String hobbyName : hobbyEntry.getValue()) {
                if (hobbyName.equalsIgnoreCase(hobby)) {
                    hobbyists.add(hobbyEntry.getKey());
                }
            }
        }

        return hobbyists;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");

        System.out.println(Arrays.toString(hobbies.findHobbyists("Yoga").toArray()));
    }
}