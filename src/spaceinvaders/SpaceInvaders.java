/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author vantichelen
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
     * wat is de breedte van het veld waar het spel in wordt gespeeld?
     * @return de breedte
     */
    public int getBreedte() {
        return breedte;
    }

    /**
     * verander de breedte 
     * @param breedte de nieuwe breedte
     */
    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    /**
     * wat is de hoogte van het veld waar het spel in wordt gespeeld?
     * @return de hoogte
     */
    public int getHoogte() {
        return hoogte;
    }

    /**
     * verander de hoogte
     * @param hoogte de nieuwe hoogte
     */
    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    /**
     * wat is het aantal behaalde punten
     * @return de punten
     */
    public int getPunten() {
        return punten;
    }

    /** verander de punten
     * @param punten de nieuwe punten
     */
    public void setPunten(int punten) {
        this.punten = punten;
    }

   
    
}
