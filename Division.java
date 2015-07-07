import java.util.ArrayList;
/**
 * Created by netbook on 7/7/2015.
 */
public class Division {
    private String nameDivision;
    private League league;
    ArrayList<Club> daftarClub = new ArrayList<Club>();

    //Constructor


    public Division(String nameDivision, League league) {
        this.nameDivision = nameDivision;
        this.league = league;
    }

    //Setter Getter

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setDaftarClub(Club club) {
        this.daftarClub.add(club);
    }

    public ArrayList<Club> getDaftarClub() {
        return daftarClub;
    }
    //2
    public void getDaftarClubLeague (String findLeague){
        if (findLeague==league.getNameLeague()) {
           for (int b=0; b < league.daftarDivisi.size(); b++){
               Division d = league.daftarDivisi.get(b);
               System.out.println(d.getNameDivision());
                    for (int c=0; c < daftarClub.size(); c++){
                        System.out.println(d.daftarClub.get(c));
                    }
           }

        }
        else
            System.out.println("No Club in this League");

    }
    //3
    public void getDaftarClubDivision(String findDivision)
    {
        for (int b=0; b < league.daftarDivisi.size(); b++){
           Division d =league.daftarDivisi.get(b);
            if(findDivision == d.getNameDivision()){
                for (int g=0; g < daftarClub.size(); g++ ) {
                    System.out.println(d.daftarClub.get(g));
                }
            }
        }


        for (int b=0; b < league.daftarDivisi.size(); b++){
            Division d = league.daftarDivisi.get(0);
            Division e = league.daftarDivisi.get(1);
                if (findDivision != d.getNameDivision()){
                    if (findDivision != e.getNameDivision()) {
                        System.out.println("No Club");
                        break;
                    }
                }
        }
    }
    //toString
    @Override
    public String toString() {
        return "Division{" +
                "nameDivision='" + nameDivision + '\'' +
                '}';
    }
}
