public class Zombie {
  float x, y, velocityX, velocityY;
  int ballSize = 20;

  
  Zombie(int x, int y, float dX, float dY)
  {
    this.x = x;
    this.y = y;
    this.velocityX = dX;
    this.velocityY = dY;
  }
  float getY() {
    return y;
  }
  float getX() {
    return x;
  }
  
  void move()
  {
    x = x + velocityX;
    y = y + velocityY;
    if (x < (0 + ballSize/2) || x > (displayWidth - ballSize/2)) {
      velocityX = -velocityX;
    }
    if (y < (0 + ballSize/2) || y > (displayHeight - ballSize/2)) {
      velocityY = -velocityY;
    }
  }
  
  void render()
  {
    fill(255,0,0);
    ellipse(x, y, ballSize, ballSize);
  }
  
  void update()
  {
    //collide();
    move();
    render();
  }
}
