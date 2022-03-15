/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author Oscar Chyra
 * @version 15.2.2022
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte werden deklariert 
    private Etikett hatEtikettAuswertungAussagenlogik;
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    private Knopf hatKnopfAuswerungUnd;
    private Knopf hatKnopfAuswertungOder;
      private Knopf hatKnopfAuswerungImplikation;
        private Knopf hatKnopfAuswerungaequivalenz;
    private Etikett hatEtikettDieZusammengesetzteAussageIst;
    private Etikett hatEtikett4;
    private Etikett hatEtikettAussageA;
    private Etikett hatEtikettAussageB;

    // Attribute
    private int zAussageA;
    private int zAussageB;
    /**
       * Konstruktor
         */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1459, 949);

        hatEtikettAuswertungAussagenlogik = new Etikett(659, 143, 148, 25, "Auswertung Aussagenlogik ");
        // Ausrichtung
        hatEtikettAuswertungAussagenlogik.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatTextfeld1 = new Textfeld(652, 227, 100, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatTextfeld2 = new Textfeld(649, 191, 100, 25, "");
        // Ausrichtung
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatKnopfAuswerungUnd = new Knopf(770, 195, 123, 27, "Auswerung UND");
        hatKnopfAuswerungUnd.setzeBearbeiterGeklickt("hatKnopfAuswerungUndGeklickt");
        
        hatKnopfAuswertungOder = new Knopf(770, 226, 123, 27, "Auswertung ODER");
        hatKnopfAuswertungOder.setzeBearbeiterGeklickt("hatKnopfAuswertungOderGeklickt");
        
        hatKnopfAuswertungOder = new Knopf(900, 195, 123, 27, "Auswertung aequivalenz");
        hatKnopfAuswertungOder.setzeBearbeiterGeklickt("hatKnopfAuswertungAequivalenzGeklickt");
        
        hatKnopfAuswertungOder = new Knopf(900, 226, 123, 27, "Auswertung Implikation");
        hatKnopfAuswertungOder.setzeBearbeiterGeklickt("hatKnopfAuswertungImplikationGeklickt");
        
        hatEtikettDieZusammengesetzteAussageIst = new Etikett(558, 269, 184, 26, "die zusammengesetzte Aussage ist:");
        // Ausrichtung
        hatEtikettDieZusammengesetzteAussageIst.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikett4 = new Etikett(769, 269, 100, 25, "");
        // Ausrichtung
        hatEtikett4.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikettAussageA = new Etikett(548, 191, 100, 25, "Aussage a");
        // Ausrichtung
        hatEtikettAussageA.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatEtikettAussageB = new Etikett(551, 227, 100, 25, "Aussage b");
        // Ausrichtung
        hatEtikettAussageB.setzeAusrichtung(Ausrichtung.LINKS);
    }

    /**
       * Vorher: Ereignis GeklicktvonhatKnopfAuswerungUnd fand statt.
         * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
           */
    public void hatKnopfAuswerungUndGeklickt()
    {
        zAussageA = hatTextfeld1.inhaltAlsGanzeZahl();
        zAussageB = hatTextfeld2.inhaltAlsGanzeZahl();
        
        if(zAussageA == 1 && zAussageB == 1)
        {
            hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == 1 && zAussageB == 1));
        }
        else
        {
             hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == 1 && zAussageB == 1));
        }
    }

    /**
       * Vorher: Ereignis GeklicktvonhatKnopfAuswertungOder fand statt.
   * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAuswertungOderGeklickt()
    {
        zAussageA = hatTextfeld1.inhaltAlsGanzeZahl();
        zAussageB = hatTextfeld2.inhaltAlsGanzeZahl();
        
        if(zAussageA == 1 || zAussageB == 1)
        {
            hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == 1 || zAussageB == 1));
        }
        else
        {
             hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == 1 || zAussageB == 1));
        }//    Schreiben Sie hier den Text ihres Dienstes
    }
    
    /**
       * Vorher: Ereignis GeklicktvonhatKnopfAuswertungOder fand statt.
         * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
           */
    public void hatKnopfAuswertungAequivalenzGeklickt()
    {
        zAussageA = hatTextfeld1.inhaltAlsGanzeZahl();
        zAussageB = hatTextfeld2.inhaltAlsGanzeZahl();
        
        if(zAussageA == zAussageB)
        {
            hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == zAussageB));
        }
        else
        {
             hatEtikettDieZusammengesetzteAussageIst.setzeInhalt(""+ (zAussageA == zAussageB));
        }//    Schreiben Sie hier den Text ihres Dienstes
    }
    
    /**
       * Vorher: Ereignis GeklicktvonhatKnopfAuswertungOder fand statt.
         * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
           */
    public void hatKnopfAuswertungImplikationGeklickt()
    {
        zAussageA = hatTextfeld1.inhaltAlsGanzeZahl();
        zAussageB = hatTextfeld2.inhaltAlsGanzeZahl();
            
        if(zAussageA == 1 && zAussageB == 0)
        {
            hatEtikett4.setzeInhalt("false");
        }
        else
        {
            hatEtikett4.setzeInhalt("true");
        }
    }
}