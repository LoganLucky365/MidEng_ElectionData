package com.example.mideng_election_data;

/**
 * Mithilfe dieser Klasse wird ein Objekt erzeugt was alle Infos über eine Partei bei der Wahl enthält
 * @author Sebastian Profous
 * @version 22-10-2024
 */
public class WahlergebnisSim {
    private int regionID;
    private String regionName;
    private String regionAdresse;
    private String postleitstelle;
    private String staat;
    private String zeitpunkt;
    private WahlErgSim[] wahlergebnisse;
    private VorzugsstimmenSim[][] vorzugsstimmen;
    public WahlergebnisSim(int einRegionID, String einRegNa, String einRegAd, String einPos, String einStaa, String einZeiPu, VorzugsstimmenSim[][] einVorSim, WahlErgSim[] einWahler){
        this.regionID = einRegionID;
        this.postleitstelle = einPos;
        this.regionAdresse = einRegAd;
        this.regionName = einRegNa;
        this.staat = einStaa;
        this.zeitpunkt = einZeiPu;
        this.vorzugsstimmen = einVorSim;
        this.wahlergebnisse = einWahler;
    }
}
