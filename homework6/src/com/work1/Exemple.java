package com.work1;

public class Exemple {
    public static void main(String[] args) {
        Chinese chinaPeople=new Chinese();
        American americanPeolpe=new American();
        Beijingman beijingman=new Beijingman();
        chinaPeople.speakHello();
        americanPeolpe.speakHello();
        beijingman.speakHello();
        chinaPeople.averageHeight();
        americanPeolpe.averageHeight();
        beijingman.averageHeight();
        chinaPeople.averageWeight();
        americanPeolpe.averageWeight();
        beijingman.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeolpe.americanBoxing();
        beijingman.beijingOpera();
        beijingman.chinaGongfu();
    }
}
