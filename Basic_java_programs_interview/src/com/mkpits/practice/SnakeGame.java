package com.mkpits.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame extends JFrame implements ActionListener, KeyListener {

    private static final int GRID_SIZE = 20;
    private static final int CELL_SIZE = 20;
    private static final int GAME_SPEED = 150;

    private LinkedList<Point> snake;
    private Point food;
    private char direction;
    private boolean running;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);

        snake = new LinkedList<>();
        direction = 'R'; // Start moving to the right
        running = false;

        Timer timer = new Timer(GAME_SPEED, this);
        timer.start();

        initializeGame();
    }

    private void initializeGame() {
        snake.clear();
        snake.add(new Point(2, 0));
        snake.add(new Point(1, 0));
        snake.add(new Point(0, 0));

        placeFood();

        running = true;
    }

    private void placeFood() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(GRID_SIZE);
            y = random.nextInt(GRID_SIZE);
        } while (snake.contains(new Point(x, y)));

        food = new Point(x, y);
    }

    private void move() {
        Point head = snake.getFirst();
        Point newHead;

        switch (direction) {
            case 'U':
                newHead = new Point(head.x, (head.y - 1 + GRID_SIZE) % GRID_SIZE);
                break;
            case 'D':
                newHead = new Point(head.x, (head.y + 1) % GRID_SIZE);
                break;
            case 'L':
                newHead = new Point((head.x - 1 + GRID_SIZE) % GRID_SIZE, head.y);
                break;
            case 'R':
                newHead = new Point((head.x + 1) % GRID_SIZE, head.y);
                break;
            default:
                newHead = head;
        }

        if (newHead.equals(food)) {
            snake.addFirst(food);
            placeFood();
        } else {
            snake.addFirst(newHead);
            snake.removeLast();
        }

        checkCollision();
    }

    private void checkCollision() {
        Point head = snake.getFirst();

        if (snake.size() > 1 && snake.subList(1, snake.size()).contains(head)) {
            running = false;
        }

        if (head.equals(food)) {
            placeFood();
        }

        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            running = false;
        }

        if (!running) {
            gameOver();
        }
    }

    private void gameOver() {
        running = false;
        JOptionPane.showMessageDialog(this, "Game Over!");
        initializeGame();
    }

    private void draw(Graphics g) {
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * CELL_SIZE, p.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }

        g.setColor(Color.RED);
        g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    direction = 'U';
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    direction = 'D';
                }
                break;
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    direction = 'R';
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame snakeGame = new SnakeGame();
            snakeGame.setVisible(true);
        });
    }
}
