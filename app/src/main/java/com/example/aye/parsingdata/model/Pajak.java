
package com.example.aye.parsingdata.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Pajak {

    @SerializedName("pkb")
    @Expose
    private String pkb;
    @SerializedName("swdkllj")
    @Expose
    private String swdkllj;

    /**
     * 
     * @return
     *     The pkb
     */
    public String getPkb() {
        return pkb;
    }

    /**
     * 
     * @param pkb
     *     The pkb
     */
    public void setPkb(String pkb) {
        this.pkb = pkb;
    }

    /**
     * 
     * @return
     *     The swdkllj
     */
    public String getSwdkllj() {
        return swdkllj;
    }

    /**
     * 
     * @param swdkllj
     *     The swdkllj
     */
    public void setSwdkllj(String swdkllj) {
        this.swdkllj = swdkllj;
    }

}
