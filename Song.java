package Playlist;

public class Song {
    public static void main(String[] args) {

        System.out.println("=== Yamuna Tatilo 🎵 ===");

        String[] lyric = {
                "Yamuna tatilo nallanayyakai yeduru choosene Radha",
                "Prema pongula pasidi vannele vadipoyenoo kada",
                "Reyi gadichenu pagalu gadichenu madhavundu ralede",
                "Raasaleelala raju ranide ragabandhame lede",
                "Yadukumarude leni velalo",
                "Vethalu ragilene Radha gundelo",
                "Yadukumarude leni velalo",
                "Vethalu ragilene Radha gundelo",
                "Papam Radha.........",
        };

        int[] delays = {
                1500, 1500, 2200, 2000,
                5000, 4500,
                1000, 500, 500, 1000
        };

        for (int i = 0; i < lyric.length; i++) {
            for (char c : lyric[i].toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            try {
                Thread.sleep(delays[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
