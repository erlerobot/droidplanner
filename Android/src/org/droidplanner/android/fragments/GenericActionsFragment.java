package org.droidplanner.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.o3dr.android.client.Drone;

import org.droidplanner.android.R;
import org.droidplanner.android.activities.helpers.SuperUI;

/**
 * Provides action buttons functionality for generic drone type.
 */
public class GenericActionsFragment extends Fragment implements View.OnClickListener,
        FlightActionsFragment.SlidingUpHeader {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_generic_mission_control, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button connectBtn = (Button) view.findViewById(R.id.mc_connectBtn);
        connectBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.mc_connectBtn:
                ((SuperUI) getActivity()).toggleDroneConnection();
                break;
        }
    }

    @Override
    public boolean isSlidingUpPanelEnabled(Drone drone) {
        return false;
    }
}
