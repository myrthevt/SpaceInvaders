/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author Van Tichelen Myrthe, Schreurs Femke, Maes Marie-Julie
 */

public class SpaceInvaders {
    //datamembers
    private int breedte;
    private int hoogte;
    private int punten;
    
    
    //constructor
    public SpaceInvaders(int breedte, int hoogte, int punten) {
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.punten = punten;
    }

    /**
     * Wat is de breedte van het veld waar het spel in wordt gespeeld? (getter)
     * @return de breedte
     */
    public int getBreedte() {
        return breedte;
    }


    /**
     * Wat is de hoogte van het veld waar het spel in wordt gespeeld? (getter)
     * @return de hoogte
     */
    public int getHoogte() {
        return hoogte;
    }

    
    /**
     * Wat is het aantal behaalde punten? (getter)
     * @return de punten
     */
    public int getPunten() {
        return punten;
    }

    
    /** Verander de punten (setter)
     * @param punten de nieuwe punten
     */
    public void setPunten(int punten) {
        this.punten = punten;
    }    
}
