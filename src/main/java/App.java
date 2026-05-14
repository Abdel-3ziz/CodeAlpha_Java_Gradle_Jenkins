public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Downloading...");

        for (int i = 0; i <= 100; i++) {

            System.out.print("\r[");

            int progress = i / 2;

            for (int j = 0; j < 50; j++) {
                if (j < progress)
                    System.out.print("=");
                else
                    System.out.print(" ");
            }

            System.out.print("] " + i + "%");

            Thread.sleep(50);
        }

        System.out.println("\nDownload Complete!");
    }
}