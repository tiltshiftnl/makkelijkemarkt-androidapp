/*
 * Copyright (C) 2016 Gemeente Amsterdam, Marktbureau
 */
package com.amsterdam.marktbureau.makkelijkemarkt.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcolangebeeke
 */
public class ApiMarkt {

    private int id;
    private String afkorting;
    private String naam;
    private Object geoArea;
    private String soort;
    private List<String> marktDagen = new ArrayList<String>();
    private int standaardKraamAfmeting;
    private boolean extraMetersMogelijk;
    private List<String> aanwezigeOpties = new ArrayList<String>();
    private int perfectViewNummer;

    /**
     * No args constructor for use in serialization
     */
    public ApiMarkt() {
    }

    /**
     *
     * @param marktDagen
     * @param id
     * @param afkorting
     * @param geoArea
     * @param standaardKraamAfmeting
     * @param aanwezigeOpties
     * @param extraMetersMogelijk
     * @param perfectViewNummer
     * @param naam
     * @param soort
     */
    public ApiMarkt(int id, String afkorting, String naam, Object geoArea, String soort, List<String> marktDagen, int standaardKraamAfmeting, boolean extraMetersMogelijk, List<String> aanwezigeOpties, int perfectViewNummer) {
        this.id = id;
        this.afkorting = afkorting;
        this.naam = naam;
        this.geoArea = geoArea;
        this.soort = soort;
        this.marktDagen = marktDagen;
        this.standaardKraamAfmeting = standaardKraamAfmeting;
        this.extraMetersMogelijk = extraMetersMogelijk;
        this.aanwezigeOpties = aanwezigeOpties;
        this.perfectViewNummer = perfectViewNummer;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getAfkorting() {
        return afkorting;
    }

    /**
     *
     * @param afkorting
     */
    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    /**
     *
     * @return
     */
    public String getNaam() {
        return naam;
    }

    /**
     *
     * @param naam
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     *
     * @return
     */
    public Object getGeoArea() {
        return geoArea;
    }

    /**
     *
     * @param geoArea
     */
    public void setGeoArea(Object geoArea) {
        this.geoArea = geoArea;
    }

    /**
     *
     * @return
     */
    public String getSoort() {
        return soort;
    }

    /**
     *
     * @param soort
     */
    public void setSoort(String soort) {
        this.soort = soort;
    }

    /**
     *
     * @return
     */
    public List<String> getMarktDagen() {
        return marktDagen;
    }

    /**
     *
     * @param marktDagen
     */
    public void setMarktDagen(List<String> marktDagen) {
        this.marktDagen = marktDagen;
    }

    /**
     *
     * @return
     */
    public int getStandaardKraamAfmeting() {
        return standaardKraamAfmeting;
    }

    /**
     *
     * @param standaardKraamAfmeting
     */
    public void setStandaardKraamAfmeting(int standaardKraamAfmeting) {
        this.standaardKraamAfmeting = standaardKraamAfmeting;
    }

    /**
     *
     * @return
     */
    public boolean isExtraMetersMogelijk() {
        return extraMetersMogelijk;
    }

    /**
     *
     * @param extraMetersMogelijk
     */
    public void setExtraMetersMogelijk(boolean extraMetersMogelijk) {
        this.extraMetersMogelijk = extraMetersMogelijk;
    }

    /**
     *
     * @return
     */
    public List<String> getAanwezigeOpties() {
        return aanwezigeOpties;
    }

    /**
     *
     * @param aanwezigeOpties
     */
    public void setAanwezigeOpties(List<String> aanwezigeOpties) {
        this.aanwezigeOpties = aanwezigeOpties;
    }

    /**
     *
     * @return
     */
    public int getPerfectViewNummer() {
        return perfectViewNummer;
    }

    /**
     *
     * @param perfectViewNummer
     */
    public void setPerfectViewNummer(int perfectViewNummer) {
        this.perfectViewNummer = perfectViewNummer;
    }
}