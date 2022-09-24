package day37staticvariablesandmethod.applephon;

import my_utils.ArrayUtil;

public class ‡‡ {
    public static void main(String[] args) {
        Iphone iphon3 = new Iphone("Iphon X", "Pink", 1000, 256);
        System.out.println(iphon3);

        System.out.println("======================");
        Iphone iphon4 = new Iphone("Iphon PRO", "BLACK-WHITE", 1400, 256);
        System.out.println(iphon4);

        Iphone android;
        android = new Iphone("Galaxi", "Silver", 1200, 128);

Iphone huawai;
huawai = new Iphone("crammy", "white", 1435, 64);
//huawai.model = "gold";

        System.out.println(huawai);

        int[]num = {1,2,3,4,5};

        System.out.println(ArrayUtil.isNumInArr(num, 7));



        }

    }




