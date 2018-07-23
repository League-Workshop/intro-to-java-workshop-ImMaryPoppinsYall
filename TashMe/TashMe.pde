PImage mustache;
PImage friend;


void setup() {
   friend = loadImage("trump.jpeg");
 mustache = loadImage("english-mustache.png"); 
size(800, 600);

friend.resize(width,height);
mustache.resize(200,200);

}

void draw() {
  
  background(friend);  
  if (mousePressed) {
  image(mustache, mouseX, mouseY);
  } 
}  