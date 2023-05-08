package com.projek;

public class Stasiun {
    private static int kodeStasiun;
    private String namaStasiun;

    Stasiun(String namaStasiun) {
        Stasiun.kodeStasiun++;
        this.namaStasiun = namaStasiun;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }
}
