package com.example.mideng_election_data;

/**
 * Mithilfe dieser Klasse wird die letzte Nationalratswahl Simuliert
 * @author Sebastian Profous
 * @version 22-10-2024
 */
public class WahlSimulator {
    public static WahlergebnisSim wahSimRechnen() {
        WahlErgSim[] hilfeErstParteien = new WahlErgSim[7];
        hilfeErstParteien[0] = new WahlErgSim((11111 + (int) (Math.random() * 1111111)),"ÖVP");
        hilfeErstParteien[1] = new WahlErgSim((11111 + (int) (Math.random() * 1111111)),"SPö");
        hilfeErstParteien[2] = new WahlErgSim((11111 + (int) (Math.random() * 1111111)),"FPÖ");
        hilfeErstParteien[3] = new WahlErgSim((5555 + (int) (Math.random() * 555555)),"GRÜNE");
        hilfeErstParteien[4] = new WahlErgSim((5555 + (int) (Math.random() * 555555)),"NEOS");
        hilfeErstParteien[5] = new WahlErgSim((11111 + (int) (Math.random() * 1111111)),"ÖVP");

        VorzugsstimmenSim[][] hilfeVorzugStimmen = new VorzugsstimmenSim[6][2];
        String[] nameListe = new String[12];
        nameListe[0] = "Werner Kogler";
        nameListe[1] = "Sebastain Kurz";
        nameListe[2] = "Rainer Zufall";
        nameListe[3] = "Daa Daa";
        nameListe[4] = "TheOneWhoRemains";
        nameListe[5] = "Darth Sidius";
        nameListe[6] = "Dagobert Duck";
        nameListe[7] = "Mister Krabs";
        nameListe[8] = "Homelander";
        nameListe[9] = "ProofThatYouCanAchiveNothing";
        nameListe[10] = "IntelliJ";
        nameListe[11] = "FireFox";
        for(int i = 0; i < 6; i++){
            for(int i2 = 0; i2 < 2; i2++){
                hilfeVorzugStimmen[i][i2] = new VorzugsstimmenSim((1 + (int) (Math.random() * 100)), nameListe[i], (100 + (int) (Math.random() * 100000)));
            }
        }

        WahlergebnisSim hilfeErg = new WahlergebnisSim(234,"Entenhausen", "Haushofgasse 49", "EntenhausenCo", "UnitedMarsForces", "23-09-2024-09:35", hilfeVorzugStimmen, hilfeErstParteien);
        return hilfeErg;
    }
}
