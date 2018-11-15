package com.example.android.tourguide;

import android.content.Context;

import java.util.List;

public class Adventure {


    public static void initShopsList(List<Location> list, Context context) {

        // linked Text and images to Adventure list
        list.add( new Location(
                context.getString( R.string.siang_name ),
                context.getString( R.string.siang_description ),
                context.getString( R.string.siang_address ),
                context.getString( R.string.siang_phone ),
                context.getString( R.string.siang_schedule ),
                null,
                R.drawable.siang_valley
        ) );

        list.add( new Location(
                context.getString( R.string.kaziranga_name ),
                context.getString( R.string.kaziranga_description ),
                context.getString( R.string.kaziranga_address ),
                context.getString( R.string.kaziranga_phone ),
                context.getString( R.string.kaziranga_schedule ),
                null,
                R.drawable.kaziranga_national_park
        ) );

        list.add( new Location(
                context.getString( R.string.under_water_name ),
                context.getString( R.string.under_water_description ),
                context.getString( R.string.under_water_address ),
                context.getString( R.string.under_water_phone ),
                context.getString( R.string.under_water_schedule ),
                null,
                R.drawable.underwater_walk
        ) );

        list.add( new Location(
                context.getString( R.string.motorcycle_trip_name ),
                context.getString( R.string.motorcycle_trip_description ),
                context.getString( R.string.motorcycle_trip_address ),
                context.getString( R.string.motorcycle_trip_phone ),
                context.getString( R.string.motorcycle_trip_schedule ),
                null,
                R.drawable.motorcycle_trip
        ) );

        list.add( new Location(
                context.getString( R.string.paragliding_name ),
                context.getString( R.string.paragliding_description ),
                context.getString( R.string.paragliding_address ),
                context.getString( R.string.paragliding_phone ),
                context.getString( R.string.paragliding_schedule ),
                null,
                R.drawable.paragliding
        ) );

        list.add( new Location(
                context.getString( R.string.deotibba_name ),
                context.getString( R.string.deotibba_description ),
                context.getString( R.string.deotibba_address ),
                context.getString( R.string.deotibba_phone ),
                context.getString( R.string.deotibba_schedule ),
                null,
                R.drawable.hampta_pass
        ) );

        list.add( new Location(
                context.getString( R.string.bara_name ),
                context.getString( R.string.bara_description ),
                context.getString( R.string.bara_address ),
                context.getString( R.string.bara_phone ),
                context.getString( R.string.bara_schedule ),
                null,
                R.drawable.bara
        ) );

        list.add( new Location(
                context.getString( R.string.rafting_name ),
                context.getString( R.string.rafting_description ),
                context.getString( R.string.rafting_address ),
                context.getString( R.string.rafting_phone ),
                context.getString( R.string.rafting_schedule ),
                null,
                R.drawable.rafting
        ) );

        list.add( new Location(
                context.getString( R.string.camping_name ),
                context.getString( R.string.camping_description ),
                context.getString( R.string.camping_address ),
                context.getString( R.string.camping_phone ),
                context.getString( R.string.camping_schedule ),
                null,
                R.drawable.coorg_camping
        ) );
    }
}
