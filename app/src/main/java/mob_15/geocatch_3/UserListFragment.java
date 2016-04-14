package mob_15.geocatch_3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mob_15 on 4/8/16.
 */
public class UserListFragment extends ListFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_user_list,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        List<User> users = UserController.getInstance().getUsers();
        UserListAdapter userListAdapter = new UserListAdapter(users, getActivity());
        setListAdapter(userListAdapter);
    }
}
