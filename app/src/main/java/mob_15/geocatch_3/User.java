package mob_15.geocatch_3;

/**
 * Created by mob_15 on 4/8/16.
 */
public class User {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;
    private String Name;

    public String getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(String coordinates) {
        Coordinates = coordinates;
    }

    private String Coordinates;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
