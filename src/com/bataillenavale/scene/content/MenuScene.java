/*
 * Bataille Navale
 * http://code.google.com/p/bataille-navale/
 * Alexis Dörr - Mélissa Weissmuller - Laurent Sittler
 */
package com.bataillenavale.scene.content;

import com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table;
import com.bataillenavale.game.Singleton;
import com.bataillenavale.scene.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexis, Mélissa, Laurent
 */
public class MenuScene implements Scene {

    private boolean m_init;
    private boolean m_fps;    
    private Table table;

    public MenuScene(boolean _fps) {        
        m_fps = _fps;
        m_init = false;
    }

    @Override
    public void init() {
        if (!m_init) {
            System.out.println("Menu Scene (Init)");
            try {
                Singleton.getGraphic().loadSprites("config/menu.xml");
            } catch (Exception ex) {
                Logger.getLogger(MenuScene.class.getName()).log(Level.SEVERE, null, ex);
            }
            m_init = true;
        }

    }

    @Override
    public void update() {
        if (m_init) {            
            System.out.println("MenuScene update");
        }
    }

    @Override
    public void destroy() {
        Singleton.getGraphic().getGame().delAllActors();
    }

    @Override
    public boolean getFps() {
        return m_fps;
    }
}
