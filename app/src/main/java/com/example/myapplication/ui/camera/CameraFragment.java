package com.example.myapplication.ui.camera;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.ui.plate.PlateViewModel;

public class CameraFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Context context = getActivity().getApplicationContext();
        PlateViewModel plateViewModel = ViewModelProviders.of(this).get(PlateViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_camera, container, false);
        return root;
    }
}