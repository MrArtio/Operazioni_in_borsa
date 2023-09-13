import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;

        do {
            System.out.print("\n1) Leggi Dati");
            System.out.print("\n2) Esci");
            System.out.print("\n");
            System.out.print("\nScelta: ");

            scelta = in.nextInt();

            switch (scelta) {
                case 1 -> {
                    String nomeFile = "src/operazioni.txt";
                    try {
                        List<String> operazioni = leggiFileOperazioni(nomeFile);
                        for (String operazione : operazioni) {
                            System.out.print(operazione);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } while (scelta == 4);
    }
    private static List<String> leggiFileOperazioni(String nomeFile) throws IOException {
        List<String> operazioni = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                operazioni.add(linea);
            }
        }

        return operazioni;
    }
}