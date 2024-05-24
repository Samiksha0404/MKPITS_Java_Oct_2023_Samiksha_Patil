package com.mkpits.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallGame extends JFrame {

    private static final int BOX_SIZE = 400;
    private static final int BALL_SIZE = 20;

    private int ballX = 50;
    private int ballY = 50;
    private int ballSpeedX = 2;
    private int ballSpeedY = 3;

    public BallGame() {
        setTitle("Ball Game");
        setSize(BOX_SIZE, BOX_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
        timer.start();

        add(new GamePanel());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void update() {
        // Update ball position
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Bounce off the walls
        if (ballX - BALL_SIZE / 2 <= 0 || ballX + BALL_SIZE / 2 >= BOX_SIZE) {
            ballSpeedX = -ballSpeedX;
        }
        if (ballY - BALL_SIZE / 2 <= 0 || ballY + BALL_SIZE / 2 >= BOX_SIZE) {
            ballSpeedY = -ballSpeedY;
        }
    }

    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBox(g);
            drawBall(g);
        }

        private void drawBox(Graphics g) {
            g.drawRect(0, 0, BOX_SIZE, BOX_SIZE);
        }

        private void drawBall(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(ballX - BALL_SIZE / 2, ballY - BALL_SIZE / 2, BALL_SIZE, BALL_SIZE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BallGame();
            }
        });
    }
}
