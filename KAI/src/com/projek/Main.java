package com.projek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Key Kereta
        Map<String, KelasKereta> keyKelasKereta = new HashMap<>();
        keyKelasKereta.put("A", new KelasKereta("Ekonomi"));
        keyKelasKereta.put("B", new KelasKereta("Bisnis"));
        // Kelas Kereta
        ArrayList<KelasKereta> kelasKereta = new ArrayList<KelasKereta>();
        kelasKereta.add(keyKelasKereta.get("A"));
        kelasKereta.add(keyKelasKereta.get("B"));

        // key & names Stasiun
        Map<String, Stasiun> stasiun = new HashMap<>();
        stasiun.put("Pwk", new Stasiun("Purwakarta"));
        stasiun.put("Pdr", new Stasiun("Padalarang"));
        stasiun.put("Bdg", new Stasiun("Bandung Kota"));
        stasiun.put("Cmk", new Stasiun("Cimekar"));
        stasiun.put("Grt", new Stasiun("Garut"));
        // Rute Kereta Lokal
        ArrayList<Stasiun> rute1 = new ArrayList<Stasiun>();
        rute1.add(stasiun.get("Cmk"));
        rute1.add(stasiun.get("Grt"));
        rute1.add(stasiun.get("Pwk"));
        ArrayList<Stasiun> rute2 = new ArrayList<Stasiun>();
        rute2.add(stasiun.get("Grt"));
        rute2.add(stasiun.get("Cmk"));
        rute2.add(stasiun.get("Bdg"));

        // // List Rute
        // ArrayList<ArrayList<Stasiun>> listRute = new ArrayList<ArrayList<Stasiun>>();
        // listRute.add(rute1);
        // listRute.add(rute2);

        // List kereta Lokal
        ArrayList<KeretaLokal> listKeretaLokal = new ArrayList<KeretaLokal>();
        listKeretaLokal.add(new KeretaLokal("Garut Cibatuan", kelasKereta, rute1));

        // Objek Pencarian jadwal kereta
        Scanner input = new Scanner(System.in);

        System.out.println("=== Jadwal Kereta ===");
        System.out.print("Asal\t: ");
        String asal = input.nextLine();
        System.out.print("Tujuan\t: ");
        String tujuan = input.nextLine();
        System.out.println("=====================");
        System.out.println();

        InputUser inputUser = new InputUser(asal, tujuan);

        listKeretaLokal.get(0).equipInputUser(inputUser);

        listKeretaLokal.get(0).display();
    }
}
