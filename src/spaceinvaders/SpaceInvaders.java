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
    private int breedte;
    private int hoogte;
    private int punten;

    public SpaceInvaders(int breedte, int hoogte, int punten) {
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.punten = punten;
    }

    /**
     * @return the breedte
     */
    public int getBreedte() {
        return breedte;
    }

    /**
     * @param breedte the breedte to set
     */
    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    /**
     * @return the hoogte
     */
    public int getHoogte() {
        return hoogte;
    }

    /**
     * @param hoogte the hoogte to set
     */
    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    /**
     * @return the punten
     */
    public int getPunten() {
        return punten;
    }

    /**
     * @param punten the punten to set
     */
    public void setPunten(int punten) {
        this.punten = punten;
    }

   
    
}
