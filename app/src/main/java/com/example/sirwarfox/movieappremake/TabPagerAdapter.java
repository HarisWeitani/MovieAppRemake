package com.example.sirwarfox.movieappremake;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sirwarfox.movieappremake.tabPagerFragment.NowPlayingFragment;
import com.example.sirwarfox.movieappremake.tabPagerFragment.PopularFragment;
import com.example.sirwarfox.movieappremake.tabPagerFragment.TopRatedFragment;
import com.example.sirwarfox.movieappremake.tabPagerFragment.UpComingFragment;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[]{"Popular", "Top Rated", "UpComing" , "Now Playing"};

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
            case 3:
                return new NowPlayingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
