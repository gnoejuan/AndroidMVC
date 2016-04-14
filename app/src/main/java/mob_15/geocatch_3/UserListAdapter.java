package mob_15.geocatch_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by mob_15 on 4/8/16.
 */
public class UserListAdapter extends BaseAdapter {
    private List<User> mUsers;
    private Context mContext;
    public UserListAdapter(List<User> users, Context context){
        mUsers = users;
        mContext = context;
    }
    private static class ViewHolder{
        TextView tvName;
        TextView tvCoordinates;
    }
    @Override
    public int getCount() {
        return mUsers.size();
    }

    @Override
    public Object getItem(int position) {
        return mUsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mUsers.get(position).getID();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if(row == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.fragment_user,parent,false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.tvCoordinates = (TextView) row.findViewById(R.id.tv_coordinate);
            viewHolder.tvName = (TextView) row.findViewById(R.id.tv_name);
            row.setTag(viewHolder);
        }
        User user = mUsers.get(position);
        ViewHolder viewHolder = (ViewHolder) row.getTag();

        viewHolder.tvName.setText(user.getName());
        viewHolder.tvCoordinates.setText(user.getCoordinates());
        return row;
    }
}
