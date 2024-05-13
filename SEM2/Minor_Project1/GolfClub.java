public class GolfClub {
    public static void main(String[] args) {
        Member[] member = new Member[20];
        member[0] = new Member(118,"McKenzie","Mellisa",30,'F',"Junior",153,2369,new Date(28,"May",05));
        member[1] = new Member(138, "Stone", "Michael", 30, 'M', "Senior", 983223, new Date(31, "May", 9));
        member[2] = new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 442649, new Date(12, "Aug", 06));
        member[3] = new Member(176, "Branch", "Helen", 'F', "Social", 589419, new Date(6, "Dec", 11));
        member[4] = new Member(178, "Beck", "Sarah", 'F', "Social", 226596, new Date(24, "Jan", 10));
        member[5] = new Member(228, "Burton", "Sandra", 26, 'F', "Junior", 153, 244493, new Date(9, "Jul", 13));
        member[6] = new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "Mar", 8));
        member[7] = new Member(239, "Spence", "Thomas", 10, 'M', "Senior", 697720, new Date(22, "Jun", 06));
        member[8] = new Member(258, "Olson", "Barbara", 16, 'F', "Senior", 370186, new Date(29, "Jul", 13));
        member[9] = new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235617681, new Date(13, "Aug", 13));
        member[10] = new Member(290, "Sexton", "Thomas", 26, 'M', "Senior", 235, 268936, new Date(28, "Jul", 8));
        member[11] = new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 665393, new Date(18, "May", 9));
        member[12] = new Member(331, "Schmidt", "Thomas", 25, 'M', "Senior", 153, 867492, new Date(7, "Apr", 9));
        member[13] = new Member(332, "Bridges", "Deborah", 12, 'F', "Senior", 235, 279087, new Date(23, "Mar", 7));
        member[14] = new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 507813, new Date(17, "Apr", 9));
        member[15] = new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 07));
        member[16] = new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "Nov", 07));
        member[17] = new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "Aug", 05));
        member[18] = new Member(469, "Willis", "Carolyn", 29, 'F', "Junior", 688378, new Date(14, "Jan", 11));
        member[19] = new Member(487, "Kent", "Susan", 'F', "Social", 707217, new Date(7, "Oct", 10));

        System.out.println("\nMembers joined before 07-Apr-09 are ---");
        for(Member m : member){
            if(m.getJoinDate().getYear() < 9  || (m.getJoinDate().getYear() == 9
                    && (m.getJoinDate().getMonth().equals("Jan")
                    || m.getJoinDate().getMonth().equals("Feb")
                    || m.getJoinDate().getMonth().equals("Mar")))
                    || (m.getJoinDate().getYear() == 9
                    && m.getJoinDate().getMonth().equals("Apr")
                    && m.getJoinDate().getDay() < 7) ){

                m.display();
            }
        }

        System.out.println("\nSenior Members whose Handicap Score is less than 12 ---");
        for(Member m : member){
            if(m.getMemberType().equals("Senior") && m.getHandicapScore() < 12){
                m.display();
            }
        }

        System.out.println("\nFemale Senior Members who are part of TeamB --");
        for(Member m : member){
            if(m.getGender() == 'F' && m.getTeam().equals("TeamB")){
                m.display();
            }
        }
    }
}
