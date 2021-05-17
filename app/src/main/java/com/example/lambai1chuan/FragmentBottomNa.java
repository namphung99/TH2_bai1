package com.example.lambai1chuan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentBottomNa extends FragmentStatePagerAdapter {

    private int numberPage = 3;


    public FragmentBottomNa(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragHCM();
            case 1:
                return new FragHN();
            case 2:
                return new FragHue();

            default:
                return new FragHCM();
        }
    }

    @Override
    public int getCount() {
        return numberPage;
    }
}
