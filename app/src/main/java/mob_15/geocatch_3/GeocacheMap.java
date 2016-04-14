package mob_15.geocatch_3;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by mob_15 on 4/8/16.
 */
public class GeocacheMap extends ListActivity {
    Geocache[] geo = new Geocache[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Geocache r1 = new Geocache();
        r1.setgeoName("Big Belly Burger");
        geo[0] = r1;

        Geocache r2 = new Geocache();
        r2.setgeoName("End of the World");
        geo[1] = r2;

        Geocache r3 = new Geocache();
        r3.setgeoName("Mount Ebbot");
        geo[2] = r3;

        Geocache r4 = new Geocache();
        r4.setgeoName("Sans");
        geo[3] = r4;

        Geocache r5 = new Geocache();
        r5.setgeoName("Bergentrucken");
        geo[4] = r5;

        Geocache r6 = new Geocache();
        r6.setgeoName("Its snowing on Mount Fuji");
        geo[5] = r6;

        setListAdapter(new ArrayAdapter<Geocache>(this, R.layout.content_main,
                R.id.GeoCacheimg, geo));


    }
}