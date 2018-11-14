package com.example.android.tourguide;

import android.content.Context;


import java.util.List;

public class CheckList {

    public static void initInfoList(List<Location> list, Context context) {

        list.add( new Location(
                context.getString( R.string.checklist_healthcare_name ),
                context.getString( R.string.healthcare_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_money_name ),
                context.getString( R.string.money_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_taxi_name ),
                context.getString( R.string.taxi_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_safety_name ),
                context.getString( R.string.safety_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_transport_name ),
                context.getString( R.string.transport_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_culture_name ),
                context.getString( R.string.culture_description ),
                null,
                null,
                null,
                null,
                -1
        ) );

        list.add( new Location(
                context.getString( R.string.checklist_last_words_name ),
                context.getString( R.string.last_words_description ),
                null,
                null,
                null,
                null,
                -1
        ) );


    }
}
