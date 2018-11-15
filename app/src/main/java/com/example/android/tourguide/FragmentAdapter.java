package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super( fm );
        this.context = context;
    }

    @Override
    //get the position of the item from the list
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new AdventureFragment();
        } else {
            return new CheckListFragment();
        }
    }

    @Override
    // The getCount method returns the number of items in the collection.
    public int getCount() {
        return 4;
    }

    @Override
    // Get the title of the page
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString( R.string.category_sights );
        } else if (position == 1) {
            return context.getString( R.string.category_food );
        } else if (position == 2) {
            return context.getString( R.string.category_shops );
        } else {
            return context.getString( R.string.category_info );
        }
    }
}
