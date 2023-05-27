package com.example.WasteWise.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.WasteWise.R

private const val ARG_TITLE = "arg_title"
private const val ARG_BG_COLOR = "arg_bg_color"

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class ScreenSlidePageFragment extends Fragment {

    private String title = "Default title.";
    private int bgColorResId = R.color.blue_inactive;

    private View inflatedView;

    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE, "Default title.");
            bgColorResId = getArguments().getInt(ARG_BG_COLOR, R.color.blue_inactive);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflatedView = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        return inflatedView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        inflatedView.setBackgroundColor(ContextCompat.getColor(requireContext(), bgColorResId));
    }

    public static ScreenSlidePageFragment newInstance(int bgColorId) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_BG_COLOR, bgColorId);
        fragment.setArguments(args);
        return fragment;
    }
}
