public class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    public Member(int MemberID, String LastNAme, String FirstName,
                  char Gender, String MemberType, long Phone,
                  Date JoinDate){

        this.MemberID = MemberID;
        this.LastName = LastNAme;
        this.FirstName = FirstName;
        this.Gender = Gender;
        this.MemberType = MemberType;
        this.Phone = Phone;
        this.JoinDate = JoinDate;

    }

    public Member(int MemberID, String LastName, String FirstName,
                  int Handicap, char Gender, String MemberType,
                  long Phone, Date JoinDate){

        this(MemberID,LastName,FirstName,Gender,MemberType,Phone,JoinDate);
        this.Handicap = Handicap;

    }

    public Member(int MemberID, String LastName, String FirstName,
                  int Handicap, char Gender, String Team, String MemberType,
                  long Phone, Date JoinDate){

        this(MemberID,LastName,FirstName,Handicap,Gender,MemberType,Phone,JoinDate);
        this.Team = Team;

    }

    public Member(int MemberID, String LastName, String FirstName,
                  int Handicap, char Gender, String MemberType, int Coach,
                  long Phone, Date JoinDate){

        this(MemberID,LastName,FirstName,Handicap,Gender,MemberType,Phone,JoinDate);
        this.Coach = Coach;

    }

    public Member(int MemberID, String LastName, String FirstName,
                  int Handicap, char Gender, String Team,
                  String MemberType, int Coach, long Phone,
                  Date JoinDate) {
        this(MemberID,LastName,FirstName,Gender,MemberType,Phone,JoinDate);
        this.Handicap = Handicap;
        this.Team = Team;
        this.Coach = Coach;
    }

    public void display(){
        System.out.println("\nMemberID:" + MemberID);
        System.out.println("LastName:" + LastName);
        System.out.println("FirstName:" + FirstName);
        System.out.println("Handicap:" + Handicap);
        System.out.println("Gender:" + Gender);
        System.out.println("Team:" + Team);
        System.out.println("MemberType:" + MemberType);
        System.out.println("Coach:" + Coach);
        System.out.println("Phone:" + Phone);
        System.out.println("JoinDate:" + JoinDate);
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public String getMemberType(){
        return MemberType;
    }

    public int getHandicapScore(){
       return Handicap;
    }

    public char getGender(){
        return Gender;
    }

    public String getTeam(){
        if(Team == null){
            return "";
        }
        return Team;
    }
}
