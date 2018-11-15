package com.example.android.tourguide;

import android.content.Context;


import java.util.List;

public class Sights {
    public static void initSightsList(List<Location> list, Context context) {

        // linked Text and images to sights list
        list.add( new Location(
                context.getString( R.string.sight_taj_mahal_name ),
                context.getString( R.string.sight_taj_mahal_description ),
                context.getString( R.string.sight_taj_mahal_address ),
                context.getString( R.string.sight_taj_mahal_phone ),
                context.getString( R.string.sight_taj_mahal_schedule ),
                context.getString( R.string.sight_taj_mahal_price ),
                R.drawable.taj_mahal
        ) );

        list.add( new Location(
                context.getString( R.string.sight_red_fort_name ),
                context.getString( R.string.sight_red_fort_description ),
                context.getString( R.string.sight_red_fort_address ),
                context.getString( R.string.sight_red_fort_address ),
                context.getString( R.string.sight_red_fort_schedule ),
                context.getString( R.string.sight_red_fort_free ),
                R.drawable.red_fort
        ) );

        list.add( new Location(
                context.getString( R.string.sight_manali_name ),
                context.getString( R.string.sight_manali_description ),
                context.getString( R.string.sight_manali_address ),
                context.getString( R.string.sight_manali_phone ),
                context.getString( R.string.sight_manali_schedule ),
                context.getString( R.string.sight_manali_price ),
                R.drawable.manali
        ) );

        list.add( new Location(
                context.getString( R.string.sight_the_golden_temple_name ),
                context.getString( R.string.sight_the_golden_temple_description ),
                context.getString( R.string.sight_the_golden_temple_address ),
                context.getString( R.string.sight_the_golden_temple_phone ),
                context.getString( R.string.sight_the_golden_temple_schedule ),
                context.getString( R.string.sight_the_golden_temple_price ),
                R.drawable.golden_temple
        ) );

        list.add( new Location(
                context.getString( R.string.sight_shimla_name ),
                context.getString( R.string.sight_shimla_description ),
                context.getString( R.string.sight_shimla_address ),
                context.getString( R.string.sight_shimla_phone ),
                context.getString( R.string.sight_shimla_schedule ),
                context.getString( R.string.sight_shimla_price ),
                R.drawable.shimla
        ) );

        list.add( new Location(
                context.getString( R.string.sight_goa_name ),
                context.getString( R.string.sight_goa_description ),
                context.getString( R.string.sight_goa_address ),
                context.getString( R.string.sight_goa_phone ),
                context.getString( R.string.sight_goa_schedule ),
                context.getString( R.string.sight_goa_free ),
                R.drawable.dudhsagar_falls
        ) );

        list.add( new Location(
                context.getString( R.string.sight_marina_name ),
                context.getString( R.string.sight_marina_description ),
                context.getString( R.string.sight_marina_address ),
                context.getString( R.string.sight_marina_phone ),
                context.getString( R.string.sight_marina_schedule ),
                context.getString( R.string.sight_marina_price ),
                R.drawable.marina_beach
        ) );
    }
}
