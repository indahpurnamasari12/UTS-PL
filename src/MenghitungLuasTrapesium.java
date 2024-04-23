import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MenghitungLuasTrapesium {
    public static void main(String[] args) {
        List<Trapesium> trapesiumList = bacaFileTrapesium("luasTrapesium.txt");
        if (trapesiumList != null) {
            System.out.println("Trapesium:");
            tampilkanHasil(trapesiumList);
        }
    }

    private static List<Trapesium> bacaFileTrapesium(String namaFile) {
        List<Trapesium> trapesiumList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                double sisiAtas = Double.parseDouble(data[0]);
                double sisiBawah = Double.parseDouble(data[1]);
                double tinggi = Double.parseDouble(data[2]);
                Trapesium trapesium = new Trapesium(sisiAtas, sisiBawah, tinggi);
                trapesiumList.add(trapesium);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return trapesiumList;
    }

    private static void tampilkanHasil(List<Trapesium> trapesiumList) {
        for (int i = 0; i < trapesiumList.size(); i++) {
            Trapesium trapesium = trapesiumList.get(i);
            double luas = trapesium.hitungLuas();
            double keliling = trapesium.hitungKeliling();
            System.out.println("Trapesium ke-" + (i + 1));
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
            System.out.println();
        }
    }
}