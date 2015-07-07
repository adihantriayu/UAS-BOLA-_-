/**
 * Created by netbook on 7/7/2015.
 */
public class Main {
    public static void main(String[] args) {
        //construct League
        League inggris = new League("Inggris");
        League italy = new League("Italy");

        //construct division
        Division EPL = new Division("English Premiere League",inggris);
        Division CD = new Division("Championship Division",inggris);
        Division serieA = new Division("Serie A",italy);
        Division serieB = new Division("Serie B",italy);

        //construct club
        Club arsenal = new Club("Arsenal",EPL,inggris);
        Club chelsea = new Club("Chelsea",EPL,inggris);
        Club fulham = new Club("Fulham",CD,inggris);
        Club wigan = new Club("Wigan",CD,inggris);
        Club juventus = new Club("Juventus",serieA,italy);
        Club acmilan = new Club("AC Milan",serieA,italy);
        Club vicenza = new Club("Vicenza",serieB,italy);
        Club modena =new Club("Modena", serieB,italy);

        inggris.setDaftarDivisi(EPL);
        inggris.setDaftarDivisi(CD);
        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        EPL.setDaftarClub(arsenal);
        EPL.setDaftarClub(chelsea);
        CD.setDaftarClub(fulham);
        CD.setDaftarClub(wigan);
        serieA.setDaftarClub(juventus);
        serieA.setDaftarClub(acmilan);
        serieB.setDaftarClub(vicenza);
        serieB.setDaftarClub(modena);

        //1 Get daftar divisi by nama liga
        System.out.println("1. Daftar nama divisi dengan nama Liga");
        System.out.println("Daftar divisi Liga Inggris");
        inggris.getDaftarDivisi("Inggris");
        System.out.println();

        //2 Get Daftar Klub by nama liga
        System.out.println("2. Daftar Klub dengan nama Liga" );
        System.out.println("~~~Daftar nama Klub Liga Inggris~~~");
        EPL.getDaftarClubLeague("Inggris");

        System.out.println("~~~Daftar nama Klub Liga Italy~~~");
        serieA.getDaftarClubLeague("Italy");
        System.out.println();


        //3 Get Daftar Klub by nama Divisi
        System.out.println("3. Daftar Klub dengan nama Divisi");
        System.out.println("Daftar nama Klub Divisi Championship Division");
        CD.getDaftarClubDivision("Championship Division");
        System.out.println("Daftar nama Klub Divisi Serie B");
        serieB.getDaftarClubDivision("Serie B");
        System.out.println();

        //4  Get Klub ini berada di divisi mana by nama Klub
        System.out.println("4. Nama Divisi berdasarkan nama Klub");
        System.out.print("Klub Chelsea berada di divisi :");
        chelsea.getDivision("Chelsea");
        System.out.print("Klub Vicenza berada di divisi :");
        vicenza.getDivision("Vicenza");
        System.out.println();

        //5 Get Klub ini berada di liga apa by nama Klub
        System.out.println("5. Nama Liga berdasarkan nama Klub");
        System.out.print("Klub Wigan berada di Liga ");
        wigan.getLeague("Wigan");
        System.out.print("Klub Modena berada di Liga ");
        modena.getLeague("Modena");




    }

}
