Dokumentation MidEng_Election_Rest

Autor: **Sebastian Profous**

Version: **12-11-2024**

## Aufgabenstellung:

Die Aufgabe zielt darauf ab ein kleines Election_Data Interface anzubieten und darüber die gespeicherten Daten entweder über XML oder JSON auszugeben. Die Daten werden über einen kleinen "Wahlsimulator" generiert. Umgesetzt wurde diese Aufgabe mit einer Java Spring Boot Applikation umgesetzt.

## Ausarbeitung der Aufgabe:

### Umsetzung des Wahlsimulators:

Nachdem ich ein neues Spring Boot Applikation erstellt habe geht es als erstes darum, die Logik für die Erstellung der Wahlergebnisse zu programmieren. Dafür habe ich zuerst eine Klasse WahlergebnisSim.java geschrieben die als Ausgangsobjekt für die weiterführende Logik gilt. Im Konstruktor werden nur schnell alle Attribute einen Wert zugewiesen.

```java
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
```

Die weitere Klasse WahlErgSim Dient wiederum als das Ausgangsobjekt für die Logik hinter den Stimmen der eigenen Parteien. Auch hier wird im Konsturkor einfach die Attribute gesetzt.

```java
public WahlErgSim(int einWahlErgSti, String einPartNam){
        this.wahlErgStimmen = einWahlErgSti;
        this.parteiName = einPartNam;
    }
```

Da ich im Vorhinein bereits wusste das ich zumindest die Aufgaben für ein GKv benötige habe ich auch gleich die Klasse VorzugsstimmenSim.java geschrieben die als Ausgangsobjekt für die Logik für die Vorzugsstimmen fungiert. Auch hier wird im Konsturkor einfach die Attribute gesetzt.

```java
public VorzugsstimmenSim(int einLiNum, String einVorZuNa, int einAnzSti, String einPartei){
        this.anzahlStimmen = einAnzSti;
        this.listennummer = einLiNum;
        this.vorzugNamen = einVorZuNa;
        this.partei = einPartei;
    }
```

Kommen wir nun zu der Logik hinter den Wahlsimulator. Zu aller erst habe ich mithilfe von Math.Random eine zufällige Anzahl an Stimmen an verschiedene Parteien zugewiesen und diese als Objekte erstellt.

```java
public static WahlergebnisSim wahSimRechnen() {
        WahlErgSim[] hilfeErstParteien = new WahlErgSim[7];
        hilfeErstParteien[0] = new WahlErgSim((11111 + (int) (Math.random() * 1111111)),"ÖVP");
```

Um dazu noch die Vorzugsstimmen einzubauen werden die Ebenfalls erstellt und einer zufälligen Anzahl an Stimmen zugewiesen.

```java
nameListe[11] = "FireFox";
        for(int i = 0; i < 6; i++){
            for(int i2 = 0; i2 < 2; i2++){
                hilfeVorzugStimmen[i][i2] = new VorzugsstimmenSim((1 + (int) (Math.random() * 100)), nameListe[i], (100 + (int) (Math.random() * 100000)), hilfeErstParteien[i].getParteiName());
            }
        }
```

Die ganzen Teile werden nun zusammengesetzt in dem ich Aus den verschiedenen Objekten ein einzelnes WahlergebnisSim Objekt erstelle. Mit diesem arbeite ich dann auf meiner "Seite".

```java
WahlergebnisSim hilfeErg = new WahlergebnisSim(234,"Entenhausen", "Haushofgasse 49", "EntenhausenCo", "UnitedMarsForces", "23-09-2024-09:35", hilfeVorzugStimmen, hilfeErstParteien);
        return hilfeErg;
```

### Umsetzung der SpringBoot Applikation:

Um nun die SpringBoot Aplikation ausführen zu können brauchen wir die Topics unter denen ich meine Ergebnise bereitstelle. Das wären in diesen Fall einmal /xml und /jason unter denen ich die jeweiligen Ausgaben finde. Um das Objekt als XML oder JSON auszugeben muss der entsprechende Media Type gesetzt werden.

```java
@RestController
public class RestControllerTest {
    @GetMapping("/")
    public String mainPage(){
        return "Willkommen zu dieser Tollen SpringBoot Applikation!";
    }
    @RequestMapping(value="/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public WahlergebnisSim electionDataJSON() {
        return WahlSimulator.wahSimRechnen();
    }
    @RequestMapping(value="/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WahlergebnisSim electionDataXML() {
        return WahlSimulator.wahSimRechnen();
    }
}
```

Um das System auch ausführen zu können wurden noch diese Klassen geschrieben.

```java
@SpringBootApplication
public class MidEngElectionDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidEngElectionDataApplication.class, args);
	}

}
```
