package com.example.kulinerr311910741;

import java.util.ArrayList;

public class DataKuliner {

    public static String[][] data = new String[][] {
            {"Ketoprak", "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprak dijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima.\n" +
            "\n" +
            "Bahan-bahan utamanya adalah tahu, bihun, mentimun,taoge, dan bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap manis, dan taburan bawang merah goreng. Dapat pula dihidangkan dengan tambahan kerupuk atau emping melinjo. Beberapa versi ada pula yang menyertakan tempe sebagai komponennya. Alat yang digunakan untuk mengolah ketoprak tidaklah sulit, yakni hanya butuh ulekan dan pisau.",
            "https://id.wikipedia.org/wiki/Berkas:Ketoprak_Boplo.JPG"},
    };

    public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModelKuliner model = new ModelKuliner();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);

            dataKuliner.add(model);
        }
        return dataKuliner;
    }
}
