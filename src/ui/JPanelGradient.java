/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author aries
 */
public class JPanelGradient extends JPanel {

    public JPanelGradient() {
        super();
        setLayout(null);
    }

    public void paintComponent(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        GradientPaint paint = new GradientPaint(width, 0, Color.decode("#30DD6B"), 0, height, Color.decode("#A4FFC3"));
        g.setPaint(paint);
        g.fillRect(0, 0, width, height);
    }
}
