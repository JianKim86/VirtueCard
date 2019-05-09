package com.jian86_android.p_virtuecard;

public class Vcard {
    private String title_K;
    private String title_E;
    private String desc_K;
    private String desc_E;

    public Vcard(String title_K, String title_E, String desc_K, String desc_E) {
        this.title_K = title_K;
        this.title_E = title_E;
        this.desc_K = desc_K;
        this.desc_E = desc_E;
    }

    public String getTitle_K() {
        return title_K;
    }

    public void setTitle_K(String title_K) {
        this.title_K = title_K;
    }

    public String getTitle_E() {
        return title_E;
    }

    public void setTitle_E(String title_E) {
        this.title_E = title_E;
    }

    public String getDesc_K() {
        return desc_K;
    }

    public void setDesc_K(String desc_K) {
        this.desc_K = desc_K;
    }

    public String getDesc_E() {
        return desc_E;
    }

    public void setDesc_E(String desc_E) {
        this.desc_E = desc_E;
    }
}//Vcard
