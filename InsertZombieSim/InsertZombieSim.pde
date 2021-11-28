People[] human = new People[50];
public int screenSize = 500;


void setup()
{
  size(500,500);
  for (int i = 0; i < 50; i++)
  {
    human[i] = new People(random(500), random(500), random(1,3), random(1,3));
    if (human[i].collide(human[i])){
      
    }
  }
  
}

void draw() 
{
  background(255);
  for (int i = 0; i < 50; i++)
  {
    human[i].update();
  }
}
