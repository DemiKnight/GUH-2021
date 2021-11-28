public class Infection {
  public Infection() {}
 People people;
 Zombie zombie;
 public ArrayList<People> humans = new ArrayList<People>();
 public ArrayList<Zombie> zombies = new ArrayList<Zombie>();
    
   

 public void createHumans() {
for (int i = 0; i < 10; i++)
   {
    humans.add(new People(random(500), random(500), random(1,3), random(1,3)));
   }
  }

  void addZombie() {
 if(mousePressed) {
   while(zombies.size() < 4) {
  zombies.add(new Zombie(mouseX,mouseY,random(1,3), random(1,3))); 
 }
 }
  }
  void zombiesUpdate() {
   for( Zombie zombie: zombies) { //<>//
    zombie.update(); 
   }
  }
    void humansUpdate() { //<>//
   for( People human: humans) { //<>//
    human.update();  //<>//
    if (zombies.size() > 0) {
      print(zombies);
    }
   }
  }
  void collide() {
    if(zombies.size() > 3) {
    for (People people : humans)  {
      for (Zombie zombie : zombies) {
        if(abs(people.x - zombie.x) < 20) {
          if(abs(people.y - zombie.y) < 20) {
            print(people.col);
            people.setCol(color(255,0,0));
     }
    }
  }
     }
    }
  }
  public void play() { //<>//
    //createHumans(); //<>//
        addZombie();

    humansUpdate();
    
    if (zombies.size() > 0) {
    collide(); //<>//
  }
    
    if (zombies.size() > 0) {
    zombiesUpdate();
  }
    
  }
  
}
