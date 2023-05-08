package com.projek;

import java.util.ArrayList;

public class KeretaKota extends Kereta {
    KeretaKota(String namaKeretaLokal, ArrayList<KelasKereta> kelasKereta, ArrayList<Stasiun> rute) {
        super(namaKeretaLokal, kelasKereta, rute);
    }

    @Override
    void display() {
        super.display();
    }
}
