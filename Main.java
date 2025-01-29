public class Main {
    public static void main(String[] args) {
        //TODO PLAYER1
        Character player = new Character(100, 50);
        for (int i = 0; i < 6; i++) {
            player.swingSword();
        }
        player.takeDamage(30);
        player.takeDamage(50);
        player.takeDamage(20);
        player.rest();
        player.status();

        System.out.println();
        System.out.println();
        System.out.println();

        //TODO PLAYER2
        Character player2 = new Character(-100, -50);
        for (int i = 0; i < 6; i++) {
            player2.swingSword();
        }
        player2.takeDamage(30);
        player2.takeDamage(50);
        player2.takeDamage(20);
        player2.rest();
        player2.status();

        System.out.println();
        System.out.println();
        System.out.println();

        //TODO PLAYER3 เลือด+stamina เยอะ
        Character player3 = new Character(200, 200);
        int n = player3.getStamina()/10+1;
        for (int i = 0; i < n; i++) {
            player3.swingSword();
        }
        player3.takeDamage(100);
        player3.takeDamage(50);
        player3.takeDamage(20);
        player3.takeDamage(30);
        player3.rest();
        player3.status();


    }
}
