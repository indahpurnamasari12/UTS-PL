class Trapesium {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow((sisiBawah - sisiAtas) / 2, 2) + Math.pow(tinggi, 2));
        return sisiAtas + sisiBawah + (2 * sisiMiring);
    }
}