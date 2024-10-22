package com.example.mideng_election_data;

/**
 * Mithilfe dieser Klasse werde ich die Vorzugsstimmen als Objekt darstellen
 * @author Sebastian Profous
 * @version 22-10-2024
 */
public class VorzugsstimmenSim {
    private int listennummer;
    private String vorzugNamen;
    private int anzahlStimmen;
    private String partei;
    public VorzugsstimmenSim(int einLiNum, String einVorZuNa, int einAnzSti, String einPartei){
        this.anzahlStimmen = einAnzSti;
        this.listennummer = einLiNum;
        this.vorzugNamen = einVorZuNa;
        this.partei = einPartei;
    }
    public int getListennummer() {
        return listennummer;
    }

    public String getVorzugNamen() {
        return vorzugNamen;
    }

    public int getAnzahlStimmen() {
        return anzahlStimmen;
    }

    public String getPartei() {
        return partei;
    }
}
