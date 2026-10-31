package com.example.sand_clock_application;

import java.util.Random;

public class Ball {
    public float x, y;
    public float radius;
    public float speedX, speedY;

    public Ball(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        resetRandomDirection(1.0f);
    }

    public void resetRandomDirection(float speed) {
        Random random = new Random();
        speedX = (random.nextBoolean() ? 1 : -1) * (6f + random.nextFloat() * 6f) * speed;
        speedY = -12f * speed;
    }

    public void move() {
        x += speedX;
        y += speedY;
    }
}
