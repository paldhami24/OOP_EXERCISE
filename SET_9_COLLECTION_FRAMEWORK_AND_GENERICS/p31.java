import java.util.*;

public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.println("Enter 5 songs:");
        for(int i = 0; i < 5; i++) {
            playlist.add(sc.nextLine());
        }

        System.out.println("Playlist: " + playlist);

        if(!playlist.isEmpty()) {
            System.out.println("Playing first song: " + playlist.removeFirst());
            System.out.println("After playing: " + playlist);
        }

        if(!playlist.isEmpty()) {
            System.out.println("Skipping last song: " + playlist.removeLast());
            System.out.println("After skipping: " + playlist);
        }
    }
}
