public int screenSize = 500;
Infection infection = new Infection();
Zombie zombie;

 void setup()

{
  infection.createHumans();

  size(displayWidth, displayHeight);
}


void draw() 
{
  background(200);
    infection.play();
    infection.addZombie();


}
