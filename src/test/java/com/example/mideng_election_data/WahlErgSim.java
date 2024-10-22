package com.example.mideng_election_data;

/**
 * Mithilfe dieser Klasse wird ein Objekt erzeugt was das Wahlergebnis simmuliert
 * @author Sebastian Profous
 * @version 22-10-2024
 */
public class WahlErgSim {
    private int wahlErgStimmen;
    private String parteiName;
    public WahlErgSim(int einWahlErgSti, String einPartNam){
        this.wahlErgStimmen = einWahlErgSti;
        this.parteiName = einPartNam;
    }
}
