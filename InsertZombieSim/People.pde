public class People {
  float x, y, velocityX, velocityY;
  int ballSize = 5;

  
  People(float x, float y, float dX, float dY)
  {
    this.x = x;
    this.y = y;
    this.velocityX = dX;
    this.velocityY = dY;
  }
  
  boolean collide(People other)
   {
     return (abs(this.x-other.x) < 5  &&  abs(this.y-other.y) < 5);
   }
  
  void move()
  {
    x = x + velocityX;
    y = y + velocityY;
    if (y < (0 + ballSize) || y > (screenSize - ballSize)) {
      velocityY = -velocityY;
    }
    if (x < (0 + ballSize) || x > (screenSize - ballSize)) {
      velocityX = -velocityX;
    }
    if(dist(mouseX, mouseY, width/2, height/2) < bigCircleRadius + smallCircleRadius){
  }
  
  void render()
  {
    fill(255);
    ellipse(x, y, ballSize, ballSize);
  }
  
  void update()
  {
  move();
  render();
  }
}
