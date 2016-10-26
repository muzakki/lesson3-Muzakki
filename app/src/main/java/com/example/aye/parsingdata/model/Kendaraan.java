
package com.example.aye.parsingdata.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Kendaraan {

    @SerializedName("jenis")
    @Expose
    private String jenis;
    @SerializedName("merk")
    @Expose
    private String merk;
    @SerializedName("tahun_pembuatan")
    @Expose
    private String tahunPembuatan;

    /**
     * 
     * @return
     *     The jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * 
     * @param jenis
     *     The jenis
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * 
     * @return
     *     The merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * 
     * @param merk
     *     The merk
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * 
     * @return
     *     The tahunPembuatan
     */
    public String getTahunPembuatan() {
        return tahunPembuatan;
    }

    /**
     * 
     * @param tahunPembuatan
     *     The tahun_pembuatan
     */
    public void setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

}
