package Form;

import java.awt.*;
import javax.swing.*;

public class Panel_custom1 extends JPanel {
    private String text = "Data Jenis Barang";

    public void setText(String text) {
        this.text = text;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar panel dengan sudut membulat
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        // Gambar teks di tengah panel
        g2.setColor(getForeground());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(text)) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - 4;
        g2.drawString(text, x, y);
    }
}