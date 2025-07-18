/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author NANRC
 */
public class customButton extends JButton {
    private boolean over;
    private Color fill;
    private Icon icon;
    
    private Color fillOriginal;
    private Color fillOver;
    private Color fillClick;
    private int strokeWidth;
    private int roundedCorner;


    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        repaint();
    }

    public Color getFillOriginal() {
        return fillOriginal;
    }

    public void setFillOriginal(Color fillOriginal) {
        this.fillOriginal = fillOriginal;
        if(!over){
            fill = fillOriginal;
            repaint();
        }
    }

    public Color getFillOver() {
        return fillOver;
    }

    public void setFillOver(Color fillOver) {
        this.fillOver = fillOver;
        if(!over){
            fill = fillOver;
            repaint();
        }
    }

    public Color getFillClick() {
        return fillClick;
    }

    public void setFillClick(Color fillClick) {
        this.fillClick = fillClick;
        if(!over){
            fill = fillClick;
            repaint();
        }
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
        repaint();
    }

    public int getRoundedCorner() {
        return roundedCorner;
    }

    public void setRoundedCorner(int roundedCorner) {
        this.roundedCorner = roundedCorner;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int s = strokeWidth;
        int w = getWidth() - (2 * s);
        int h = getHeight() - (2 * s);

        g2d.setColor(fill);
        g2d.fillRoundRect(s, s, w, h, roundedCorner, roundedCorner);
        g2d.dispose();

        super.paintComponent(g); // Ini harus tetap dipanggil
}

    
    
    public customButton() {
        fillOriginal = new Color(8,44,37);
        fillOver = new Color (0,102,102);
        fillClick = new Color (4,34,27);
        strokeWidth = 2;
        roundedCorner = 10;
        fill = fillOriginal;
        icon = null;
        
        setOpaque(false);
        setBorder(null);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBackground(fillOriginal);
        setForeground(Color.WHITE);
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me) {
                fill = fillOver;
                over = true;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                fill = fillClick;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if(over){
                    fill = fillOver;
                } else {
                    fill = fillOriginal;
                }
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                fill = fillOriginal;
                over = false;
                repaint();
            }
        
        });
    }
    
}
