/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tick.tack.toe;

/**
 *
 * @author Max
 */
public interface Draw {
    void draw();
    void clear();
    void wincondX();
    void wincondO();
    void aiattack();
    void aidefence();
    void aifindempty();
}
