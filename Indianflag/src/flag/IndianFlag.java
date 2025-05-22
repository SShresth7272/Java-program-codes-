package flag;
import javax.swing.*;
import java.awt.*;

public class IndianFlag extends JFrame {

    public IndianFlag() {
        setTitle("Indian Flag");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new FlagPanel());
    }

    static class FlagPanel extends JPanel {
        private static final Color SAFFRON = new Color(255, 153, 51);
        private static final Color GREEN = new Color(19, 136, 8);
        private static final Color BLUE = new Color(0, 0, 128);

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            
            int width = getWidth();
            int height = getHeight();
            int stripeHeight = height / 3;

            // Draw saffron stripe
            g2d.setColor(SAFFRON);
            g2d.fillRect(0, 0, width, stripeHeight);

            // Draw white stripe
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, stripeHeight, width, stripeHeight);

            // Draw green stripe
            g2d.setColor(GREEN);
            g2d.fillRect(0, stripeHeight * 2, width, stripeHeight);

            // Draw Ashoka Chakra
            int centerX = width / 2;
            int centerY = stripeHeight * 3 / 2; // Center of white stripe
            int radius = Math.min(width, stripeHeight) / 3;

            // Draw blue circle
            g2d.setColor(BLUE);
            g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

            // Draw 24 spokes
            for (int i = 0; i < 360; i += 15) {
                double angle = Math.toRadians(i);
                int x2 = (int) (centerX + radius * Math.cos(angle));
                int y2 = (int) (centerY + radius * Math.sin(angle));
                g2d.drawLine(centerX, centerY, x2, y2);
            }

            // Draw small center circle
            g2d.fillOval(centerX - 5, centerY - 5, 10, 10);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IndianFlag().setVisible(true);
        });
    }
}
  