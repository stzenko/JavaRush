package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name = "a";
        zerg2.name = "b";
        zerg3.name = "c";
        zerg4.name = "d";
        zerg5.name = "e";
        zerg6.name = "f";
        zerg7.name = "g";
        zerg8.name = "h";
        zerg9.name = "j";
        zerg10.name = "k";
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();

        protos1.name = "l";
        protos2.name = "o";
        protos3.name = "i";
        protos4.name = "u";
        protos5.name = "y";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "qS";
        terran2.name = "wg";
        terran3.name = "rh";
        terran4.name = "tj";
        terran5.name = "eyu";
        terran6.name = "fi";
        terran7.name = "go";
        terran8.name = "hp";
        terran9.name = "jk";
        terran10.name = "kj";
        terran11.name = "jkw";
        terran12.name = "kjs";
    }

    public static class Zerg
    {

        public String name;

        {

        }

    }

    public static class Protos
    {
        public String name;{


    }
    }

    public static class Terran
    {


        public String name;{

    }
    }
}