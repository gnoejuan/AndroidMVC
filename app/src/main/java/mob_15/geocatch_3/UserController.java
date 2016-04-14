package mob_15.geocatch_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mob_15 on 4/8/16.
 */
public class UserController {
    private static UserController mInstance;
    private List<User> mUsers;
    private UserController(){
        mUsers = new ArrayList<>();
    }
    public static UserController getInstance(){
        if (mInstance == null)
            mInstance = new UserController();
            return mInstance;
    }
    public List<User> getUsers(){
        User user1 = new User();
        user1.setCoordinates("");
        user1.setName("Joe");
        user1.setID(1);
        mUsers.add(user1);

        return  mUsers;
    }
}
