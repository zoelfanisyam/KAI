package com.projek;

import java.util.ArrayList;

public class KeretaLokal extends Kereta {
    KeretaLokal(String namaKeretaLokal, ArrayList<KelasKereta> kelasKereta, ArrayList<Stasiun> rute) {
        super(namaKeretaLokal, kelasKereta, rute);
    }

    @Override
    void display() {
        super.display();
    }
}
