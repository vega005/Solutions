package pl.daniel.hanoi;

public class HanoiTowers {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        moveHanoiDiscs(numberOfDisks, 'A', 'B', 'C');
    }

    public static void moveHanoiDiscs(int numberOfDiscs, char fromRod, char tempRod, char toRod) {
        if (numberOfDiscs > 0) {
            String messege = String.format("Disc %d from %s to %s", numberOfDiscs, fromRod, toRod);
            if (numberOfDiscs == 1) {
                System.out.println(messege);
                return;
            }
            moveHanoiDiscs(numberOfDiscs - 1, fromRod, toRod, tempRod);
            System.out.println(messege);
            moveHanoiDiscs(numberOfDiscs - 1, tempRod, fromRod, toRod);
        }
    }
}
