
package com.example.aye.parsingdata.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("provinsi")
    @Expose
    private String provinsi;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("sumber")
    @Expose
    private String sumber;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * 
     * @param provinsi
     *     The provinsi
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The sumber
     */
    public String getSumber() {
        return sumber;
    }

    /**
     * 
     * @param sumber
     *     The sumber
     */
    public void setSumber(String sumber) {
        this.sumber = sumber;
    }

}
