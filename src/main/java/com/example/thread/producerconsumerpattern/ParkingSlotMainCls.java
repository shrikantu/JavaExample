package com.example.thread.producerconsumerpattern;

import java.util.ArrayList;

public class ParkingSlotMainCls {

	public static void main(String[] args) {
        ArrayList<ParkingSlot> parking = new ArrayList<ParkingSlot>();

        for (int i = 0; i < 15; i++) {
            parking.add(new ParkingSlot(String.valueOf(i + 1)));
        }
        for (ParkingSlot i: parking) {
            i.start();
        }
    }

}
