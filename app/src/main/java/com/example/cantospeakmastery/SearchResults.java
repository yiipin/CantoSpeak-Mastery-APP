package com.example.cantospeakmastery;


public class SearchResults {
    private String vocabulary = "";
    private String Chinese = "";
    private String spelling = "";

    public void setvocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getvocabulary() {
        return vocabulary;
    }

    public void setChinese(String Chinese) {
        this.Chinese = Chinese;
    }

    public String getChinese() {
        return Chinese;
    }

    public void setspelling(String spelling) {
        this.spelling = spelling;
    }

    public String getspelling() {
        return spelling;
    }
}
