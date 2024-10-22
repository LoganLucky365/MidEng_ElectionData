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
    // private String Später noch Klasse überlegen
    private VorzugsstimmenSim[][] vorzugsstimmen;
}
