package clubmembership;

public class SingleClubMembership extends Member {

    private int club;

    public SingleClubMembership(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);
        club = pClub;
    }

    public void setClub(int pClub){
        club = pClub;
    }
    public int getClub(){
        return club;
    }

    @Override
    public String toString(){
        return super.toString() + "," + club;
    }
}
