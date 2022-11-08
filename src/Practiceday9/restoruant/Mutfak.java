package Practiceday9.restoruant;

public class Mutfak {

    public String yemekler = "adanakebab, urfaciger, kusbasi, kusleme";
    public String araSicak = "yaylacorba, mercimekcorba, duguncorba, corba";
    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, salgam, kola";


    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
        this.yemekler = yemekler;
        this.araSicak = araSicak;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;
    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Siparis listesi" +
                "\nyemekler     : " + yemekler +
                "\naraSicak     : " + araSicak +
                "\ntatlilar     : " + tatlilar +
                "\nicecekler    : " + icecekler;
    }
}
