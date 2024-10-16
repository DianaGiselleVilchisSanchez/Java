import javax.swing.*;
import java.awt.*;

public class BolaRebote extends JPanel {

    private int x = 0, y = 0;      // Posición inicial de la bola
    private int velX = 2, velY = 3; // Velocidad de la bola

    public BolaRebote() {
        Timer timer = new Timer(10, e -> moverBola()); // Temporizador para la animación
        timer.start(); // Iniciar el temporizador
    }

    // Método para mover la bola y gestionar el rebote
    private void moverBola() {
        x += velX;
        y += velY;
        if (x < 0 || x > getWidth() - 30) velX = -velX; // Rebotar en los bordes horizontales
        if (y < 0 || y > getHeight() - 30) velY = -velY; // Rebotar en los bordes verticales
        repaint(); // Redibujar la bola en la nueva posición
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30); // Dibujar la bola
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bola Rebotando");
        BolaRebote bola = new BolaRebote();
        frame.add(bola);
        frame.setSize(400, 400);  // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
