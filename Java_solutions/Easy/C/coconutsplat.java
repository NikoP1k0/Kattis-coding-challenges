package Easy.C;


import java.util.ArrayList;
import java.util.Scanner;

class Coconut {
    private int player;
    private int life;

    public Coconut(int player) {
        this.player = player;
        this.life = 2; // Starts as folded
    }

    public Coconut(Coconut another) {
        this.player = another.player;
        this.life = another.life;
    }

    public boolean isFolded() {
        return life == 2;
    }

    public boolean isFist() {
        return life == 1;
    }

    public void update() {
        life--;
    }

    public int getPlayer() {
        return player + 1; // Convert from 0-based to 1-based
    }
}

public class coconutsplat {
    public static int coconut(int s, int n) {
        ArrayList<Coconut> seats = new ArrayList<>();

        // Initialize players
        for (int i = 0; i < n; i++) {
            seats.add(new Coconut(i));
        }

        int next = 0;
        while (seats.size() > 1) {
            next = (next + s) % seats.size();
            Coconut current = seats.get(next);

            if (current.isFolded()) {
                current.update();
                seats.add(next, new Coconut(current)); // Add a new half-coconut
            } else if (current.isFist()) {
                current.update();
                next++; // Move to the next hand
            } else {
                seats.remove(next); // Remove a spilled coconut
            }
        }
        return seats.get(0).getPlayer();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(coconut(s - 1, n)); // Adjust for 0-based indexing
    }
}



