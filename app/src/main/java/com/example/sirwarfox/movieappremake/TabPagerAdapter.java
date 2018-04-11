package com.example.sirwarfox.movieappremake;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[]{"One", "Two", "Three"};

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new PopularFragment();
            case 1:
                return new TopRatedFragment();
            case 2:
                return new UpComingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
