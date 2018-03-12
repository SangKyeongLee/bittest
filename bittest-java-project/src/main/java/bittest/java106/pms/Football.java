package bittest.java106.pms;

public class Football {
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        class TeamInfo{
        String fcName;
        String manager;
        int rank;
        int win;
        int draw;
        int lose;
        String chams;
        int play;
        int points;
        }

        TeamInfo[] teams = new TeamInfo[20];
        int teamIndex = 0;

        System.out.println("[ 프리미어리그 팀 등록 ]");
        while(true){

            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().split(" ");
            String command = arr[0];
            String option = null;
            if(arr.length == 2) {
                option = arr[1];
            }

            if(command.toLowerCase().equals("quit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else if(command.toLowerCase().equals("help")){
                System.out.println("[ 도움말 ]");
                System.out.println("팀 등록: team/add");
                System.out.println("팀 목록: team/list");
                System.out.println("팀 검색: team/view 팀명");
                System.out.println("종료: quit");

            }else if(command.toLowerCase().equals("team/add")) {

                TeamInfo team = new TeamInfo();

                System.out.println("[ 팀 등록하기 ]");
                System.out.print("팀명 : ");
                team.fcName = keyScan.nextLine();

                System.out.print("감독 : ");
                team.manager = keyScan.nextLine();

                System.out.print("순위 : ");
                team.rank = keyScan.nextInt();
                
                System.out.print("승리 : ");
                team.win = keyScan.nextInt();

                System.out.print("무승부 : ");
                team.draw = keyScan.nextInt();

                System.out.print("패배 : ");
                team.lose = keyScan.nextInt();
                keyScan.nextLine();

                System.out.print("챔스 : ");
                team.chams = keyScan.nextLine();

                team.play = team.win + team.draw + team.lose;
                team.points = (team.win*3) + team.draw;

                teams[teamIndex++] = team;

            } else if(command.toLowerCase().equals("team/list")){
                for(int i = 0; i < teamIndex; i++ ){
                    System.out.println("-----------------------------------------");
                    System.out.printf("[팀명] %s\n[순위] %d\n[기록] 리그 %d경기 승점 %d점 %d승 %d무 %d패\n", teams[i].fcName, 
                    teams[i].rank, teams[i].play, teams[i].points, teams[i].win, 
                    teams[i].draw, teams[i].lose);
                    System.out.println("-----------------------------------------");
                }
                
            } else if(command.toLowerCase().equals("team/view")) {
                
                if(option == null) {
                    System.out.println("팀 이름을 입력해주세요.");

                    continue;
                }
                
                TeamInfo team = null;
                for(int i = 0; i < teamIndex; i++){
                    if(option.equals(teams[i].fcName)){
                        team = teams[i];
                        break;
                    }
                    
                }
                
                if(team == null){
                    System.out.println("해당 이름의 팀이 없습니다.");
                } else {
                    System.out.println("[ 팀 정보 상세보기 ]");
                    System.out.printf("[팀명] %s\n[감독] %s\n[순위] %d\n[기록] 리그 %d경기 승점 %d점 %d승 %d무 %d패\n[챔스] %s\n", team.fcName, 
                    team.manager, team.rank, team.play, team.points, team.win, 
                    team.draw, team.lose, team.chams);
                }
                
            } else {
                System.out.println("명령어를 확인해주세요.");
            }

            System.out.println();
        }
        
    }
}