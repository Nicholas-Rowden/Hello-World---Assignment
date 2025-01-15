public class Main {
    public static void main(String[] args) {
        String[] helloWorldGraphic = {
                "  _   _      _ _         __        __         _     _ ",
                " | | | | ___| | | ___    \\ \\      / /__  _ __| | __| |",
                " | |_| |/ _ \\ | |/ _ \\    \\ \\ /\\ / / _ \\| '__| |/ _` |",
                " |  _  |  __/ | | (_) |    \\ V  V / (_) | |  | | (_| |",
                " |_| |_|\\___|_|_|\\___( )    \\_/\\_/ \\___/|_|  |_|\\__,_|",
                "                   |/"
        };

        for (String line : helloWorldGraphic) {
            System.out.println(line);
            try {
                Thread.sleep(500); // Pause to create a typewriter effect
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
