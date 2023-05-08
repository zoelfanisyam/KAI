package com.projek;

import java.util.ArrayList;

public abstract class Kereta {
    private String namaKereta;
    private ArrayList<KelasKereta> kelasKereta;
    private ArrayList<Stasiun> rute;
    private static int kodeKereta;
    InputUser inputUser;

    Kereta(String namaKereta, ArrayList<KelasKereta> kelasKereta, ArrayList<Stasiun> rute) {
        Kereta.kodeKereta++;
        this.namaKereta = namaKereta;
        this.kelasKereta = kelasKereta;
        this.rute = rute;
    }

    public void equipInputUser(InputUser inputUser) {
        this.inputUser = inputUser;
    }

    String asalKereta;
    String tujuanKereta;

    public String getAsalStasiun() {
        asalKereta = rute.get(0).getNamaStasiun();
        return asalKereta;
    }

    public String getTujuanStasiun() {
        if (inputUser.asal == rute.get(0).getNamaStasiun()) {
            tujuanKereta = rute.get(0).getNamaStasiun();
        }
        return tujuanKereta;
    }

    public String getKelasKereta() {
        return kelasKereta.get(0).getKelas();
    }

    void display() {
        System.out.println(this.namaKereta);
        System.out.println("kelas\t: " + getKelasKereta());
        System.out.println("Asal\t: " + getAsalStasiun());
        System.out.println("Tujuan\t: " + getTujuanStasiun());
        System.out.println(asalKereta);
    }
}
