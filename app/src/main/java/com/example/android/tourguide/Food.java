package com.example.android.tourguide;

import android.content.Context;

import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add( new Location(
                context.getString( R.string.food_kake_da_hotel ),
                context.getString( R.string.food_kake_da_hotel_description ),
                context.getString( R.string.food_kake_da_hotel_address ),
                context.getString( R.string.food_kake_da_hotel_phone ),
                context.getString( R.string.food_kake_da_hotel_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.kake_da_hotel
        ) );

        list.add( new Location(
                context.getString( R.string.food_rajinder_da_dhaba_name ),
                context.getString( R.string.food_rajinder_da_dhaba_description ),
                context.getString( R.string.food_rajinder_da_dhaba_address ),
                context.getString( R.string.food_rajinder_da_dhaba_phone ),
                context.getString( R.string.food_rajinder_da_dhaba_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.rajinder_da_dhaba
        ) );

        list.add( new Location(
                context.getString( R.string.food_moti_mahal_name ),
                context.getString( R.string.food_moti_mahal_description ),
                context.getString( R.string.food_moti_mahal_address ),
                context.getString( R.string.food_moti_mahal_phone ),
                context.getString( R.string.food_moti_mahal_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.moti_mahal
        ) );

        list.add( new Location(
                context.getString( R.string.food_burger_factory_name ),
                context.getString( R.string.food_burger_factory_description ),
                context.getString( R.string.food_burger_factory_address ),
                context.getString( R.string.food_burger_factory_phone ),
                context.getString( R.string.food_burger_factory_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.burger_factory
        ) );

        list.add( new Location(
                context.getString( R.string.food_blind_name ),
                context.getString( R.string.food_blind_description ),
                context.getString( R.string.food_blind_address ),
                context.getString( R.string.food_blind_phone ),
                context.getString( R.string.food_blind_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.blind_ch3mistry
        ) );

        list.add( new Location(
                context.getString( R.string.food_auntys_kitchen_name ),
                context.getString( R.string.food_auntys_kitchen_description ),
                context.getString( R.string.food_auntys_kitchen_address ),
                context.getString( R.string.food_auntys_kitchen_phone ),
                context.getString( R.string.food_auntys_kitchen_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.auntys_kitchen
        ) );

        list.add( new Location(
                context.getString( R.string.food_casa_bella_vista_name ),
                context.getString( R.string.food_casa_bella_vista_description ),
                context.getString( R.string.food_casa_bella_vista_address ),
                context.getString( R.string.food_casa_bella_vista_phone ),
                context.getString( R.string.food_casa_bella_vista_schedule ),
                context.getString( R.string.food_price_kake_da_hotel ),
                R.drawable.casa_bella_vista
        ) );
    }
}