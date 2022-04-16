package com.xdavide9.services;

import com.xdavide9.gui.Gui;

import javax.swing.*;

public class HelpService {

    private final Gui gui;

    public HelpService(Gui gui) {
        this.gui = gui;
    }

    public void contact() {
        JOptionPane.showMessageDialog(gui.getFrame(), "Message me on Discord at xDavide9#1490");
    }

}