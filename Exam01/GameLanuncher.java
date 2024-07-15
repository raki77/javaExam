//import java.math.*;
// play the game collecting correct numbers 

class GuessGame
{
 Player p1;
 Player p2;
 Player p3;

 public void startGame() {
  p1 = new Player();
  p2 = new Player();
  p3 = new Player();
 
  int guessp1=0;
  int guessp2=0;
  int guessp3=0;

  boolean p1isRight = false;
  boolean p2isRight = false;
  boolean p3isRight = false;
  

  int targetNumber = (int)(Math.random() * 10); 
  System.out.println("0 이상 9 이하의 숫자를 맞춰보세요.");
  
  while(true) {
   System.out.println("맞춰야 할 숫자는 " + targetNumber + "입니다.");

   p1.guess();
   p2.guess();
   p3.guess();

   guessp1 = p1.number;
   System.out.println("1번 선수가 찍은 숫자: " + guessp1);
  
   guessp2 = p2.number;
   System.out.println("2번 선수가 찍은 숫자: " + guessp2);

   guessp3 = p3.number;
   System.out.println("3번 선수가 찍은 숫자: " + guessp3);

   if(guessp1 == targetNumber) {
    p1isRight = true;
   }

   if(guessp2 == targetNumber) {
    p2isRight = true;
   }

   if(guessp3 == targetNumber) {
    p3isRight = true;
   }

   if (p1isRight || p2isRight || p3isRight) {
    System.out.println("맞춘 선수가 있습니다.");
    System.out.println("1번 선수: " + p1isRight);
    System.out.println("2번 선수: " + p2isRight);
    System.out.println("3번 선수: " + p3isRight);
    System.out.println("게임 끝.");
    break; //겜 끝났으므로 break문으로 순환문 이탈

   } else {
    // 아직 아무도 못 맞췄기 때문에 계속 진행.
    System.out.println("다시 시도해야 합니다");
   }
  } //while
 }// start

} //class

 


class Player {
 int number=0; // 찍은 숫자를 저장할 변수

 public void guess() {
  number = (int)(Math.random() *10);
  System.out.println("찍은 숫자: " + number);
 }
}

 

 

public class GameLanuncher {
 public static void main(String[] args)
 {
  GuessGame game = new GuessGame();
  game.startGame();
 }
}
