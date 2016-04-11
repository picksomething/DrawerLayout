package cn.picksomething.drawlayouttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * @author caobin
 */
public class PlanetFragment extends Fragment {

    public static final String ARG_PLANET_NUMBER = "planet_number";


    private int[] mResourceIds = {
            R.drawable.planet_earth, R.drawable.planet_jupiter,
            R.drawable.planet_mars, R.drawable.planet_mercury,
            R.drawable.planet_saturn, R.drawable.planet_venus,
            R.drawable.planet_uranus, R.drawable.planet_neptune
    };

    public PlanetFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        int i = getArguments().getInt(ARG_PLANET_NUMBER);
        if (i == -1) {
            view = inflater.inflate(R.layout.fragment_default, container, false);
            return view;
        }
        view = inflater.inflate(R.layout.fragment_planet, container, false);
        int imageId = mResourceIds[i];
        ((ImageView) view.findViewById(R.id.image)).setImageResource(imageId);
        return view;
    }
}
