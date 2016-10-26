
package com.example.aye.parsingdata.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("nopol")
    @Expose
    private String nopol;
    @SerializedName("kendaraan")
    @Expose
    private Kendaraan kendaraan;
    @SerializedName("nilai_jual")
    @Expose
    private String nilaiJual;
    @SerializedName("dasar_pengenaan_pajak")
    @Expose
    private String dasarPengenaanPajak;
    @SerializedName("pajak")
    @Expose
    private Pajak pajak;
    @SerializedName("jatuh_tempo")
    @Expose
    private JatuhTempo jatuhTempo;

    /**
     * 
     * @return
     *     The nopol
     */
    public String getNopol() {
        return nopol;
    }

    /**
     *
     * @param nopol
     *     The nopol
     */
//    public void setNopol(String nopol) {
//        this.nopol = nopol;
//    }

    /**
     * 
     * @return
     *     The kendaraan
     */
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /**
     * 
     * @param kendaraan
     *     The kendaraan
     */
//    public void setKendaraan(Kendaraan kendaraan) {
//        this.kendaraan = kendaraan;
//    }

    /**
     * 
     * @return
     *     The nilaiJual
     */
    public String getNilaiJual() {
        return nilaiJual;
    }

    /**
     * 
     * @param nilaiJual
     *     The nilai_jual
     */
//    public void setNilaiJual(String nilaiJual) {
//        this.nilaiJual = nilaiJual;
//    }

    /**
     * 
     * @return
     *     The dasarPengenaanPajak
     */
    public String getDasarPengenaanPajak() {
        return dasarPengenaanPajak;
    }

    /**
     * 
     * @param dasarPengenaanPajak
     *     The dasar_pengenaan_pajak
     */
//    public void setDasarPengenaanPajak(String dasarPengenaanPajak) {
//        this.dasarPengenaanPajak = dasarPengenaanPajak;
//    }

    /**
     * 
     * @return
     *     The pajak
     */
    public Pajak getPajak() {
        return pajak;
    }

    /**
     * 
     * @param pajak
     *     The pajak
     */
//    public void setPajak(Pajak pajak) {
//        this.pajak = pajak;
//    }

    /**
     * 
     * @return
     *     The jatuhTempo
     */
    public JatuhTempo getJatuhTempo() {
        return jatuhTempo;
    }

    /**
     * 
     * @param jatuhTempo
     *     The jatuh_tempo
     */
//    public void setJatuhTempo(JatuhTempo jatuhTempo) {
//        this.jatuhTempo = jatuhTempo;
//    }

}
