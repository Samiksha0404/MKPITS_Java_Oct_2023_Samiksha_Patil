package com.mkpits.practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CarRacingGame extends JFrame implements ActionListener, KeyListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int CAR_WIDTH = 50;
    private static final int CAR_HEIGHT = 30;
    private static final int CAR_SPEED = 5;

    private int carX;
    private int carY;
    private int points;
    private int speed;

    public CarRacingGame() {
        setTitle("Car Racing Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addKeyListener(this);

        Timer timer = new Timer(20, this);
        timer.start();

        initializeGame();
    }

    private void initializeGame() {
        carX = WIDTH / 2 - CAR_WIDTH / 2;
        carY = HEIGHT - CAR_HEIGHT - 30;
        points = 0;
        speed = 0;
    }

    private void moveCar() {
        carX += speed;

        // Ensure the car stays within the screen boundaries
        if (carX < 0) {
            carX = 0;
        }
        if (carX > WIDTH - CAR_WIDTH) {
            carX = WIDTH - CAR_WIDTH;
        }
    }

    private void updateGame() {
        points++;
        speed += 1;

        // Move the car
        moveCar();

        // Check for collision (for example, with obstacles)
        // For simplicity, collision is not implemented in this example

        repaint();
    }

    private void draw(Graphics g) {
        // Draw the car
        g.setColor(Color.BLUE);
        g.fillRect(carX, carY, CAR_WIDTH, CAR_HEIGHT);

        // Draw points and speed
        g.setColor(Color.BLACK);
        g.drawString("Points: " + points, 20, 20);
        g.drawString("Speed: " + speed, 20, 40);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateGame();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                speed = -CAR_SPEED;
                break;
            case KeyEvent.VK_RIGHT:
                speed = CAR_SPEED;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
                speed = 0;
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CarRacingGame racingGame = new CarRacingGame();
            racingGame.setVisible(true);
        });
    }
}
