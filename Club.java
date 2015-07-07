/**
 * Created by netbook on 7/7/2015.
 */
public class Club {
    private String nameClub;
    private Division division;
    private League league;

    //Constructor

    public Club(String nameClub, Division division, League league) {
        this.nameClub = nameClub;
        this.division = division;
        this.league = league;
    }

    //Setter Getter

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
    //4
    public void getDivision (String club) {
        for (int b=0; b < league.daftarDivisi.size(); b++){
            Division f = league.daftarDivisi.get(b);
                for (int h=0; h < division.daftarClub.size(); h++){
                    f.daftarClub.get(h);
                    Club d = f.daftarClub.get(h);
                        if (club==d.getNameClub())
                        {
                            System.out.println(f.getNameDivision());
                        }
                }
        }
    }


    public void setDivision(Division division) {
        this.division = division;
    }

    //5
    public void  getLeague(String club) {
        for (int b=0; b < league.daftarDivisi.size(); b++){
            Division f = league.daftarDivisi.get(b);
                for (int h=0; h < division.daftarClub.size(); h++){
                    f.daftarClub.get(h);
                    Club d = f.daftarClub.get(h);
                    if (club == d.getNameClub()){
                        System.out.println(league.getNameLeague());
                    }

                }
        }


    }

    public void setLeague(League league) {
        this.league = league;
    }

    //toString


    @Override
    public String toString() {
        return "Club{" +
                "nameClub='" + nameClub + '\'' +
                '}';
    }
}
