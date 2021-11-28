public class People {
  float x, y, velocityX, velocityY;
  int ballSize = 20;
  color col = (0);

  
  People(float x, float y, float dX, float dY)
  {
    this.x = x;
    this.y = y;
    this.velocityX = dX;
    this.velocityY = dY;
  }
  
  public void setCol(color col) {
   this.col = col; 
  }
  /*boolean collide(People other)
   {
     return (abs(this.x-other.x) < 5  &&  abs(this.y-other.y) < 5);
   }*/
   
 //<>// //<>// //<>// //<>// //<>//

  void move()
  {
    x = x + velocityX;
    y = y + velocityY;
    if (x < (ballSize/2) || x > (displayWidth - ballSize/2)) {
      velocityX = -velocityX;
    }
    if (y < (ballSize/2) || y > (displayHeight - ballSize/2)) {
      velocityY = -velocityY;
    }
  }
  
  void render()
  {
    fill(col);
    ellipse(x, y, ballSize, ballSize);
  }
  
  void update()
  {
    //collide();
    move();
    render();
}
}
