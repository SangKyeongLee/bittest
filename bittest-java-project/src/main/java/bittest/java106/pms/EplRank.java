package bittest.java106.pms;

import bittest.java106.pms.domain.RankGraph;

public class EplRank {
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        int count = 0;
        RankGraph[] rankTable = new RankGraph[4];

        for(int i = 0; i < rankTable.length; i++ ) {
            count++;
            rankTable[i] = new RankGraph();

            System.out.print("순위? ");
            rankTable[i].rank = keyScan.nextInt();
            keyScan.nextLine();
            System.out.print("팀명? ");
            rankTable[i].name = keyScan.nextLine();
            System.out.print("승? ");
            rankTable[i].win = keyScan.nextInt();
            System.out.print("무? ");
            rankTable[i].draw = keyScan.nextInt();
            System.out.print("패? ");
            rankTable[i].lose = keyScan.nextInt();

            rankTable[i].play = rankTable[i].win + rankTable[i].draw + rankTable[i].lose;
            rankTable[i].points = (rankTable[i].win * 3) + rankTable[i].draw;

            if(count == rankTable.length) {
                break;
            }
            
            System.out.println("계속 입력하시겠습니까?(Y/n)");
            
        }

        System.out.printf("2017/2018시즌 EPL 순위표\n");
        System.out.printf("-----------------------------------------------------------------------\n");
        
        for(int i = 0; i < count; i++){
            System.out.printf("| %2d위 | %10s | %2d경기 | %3d점 | %2d승 | %2d무 | %2d패 |\n", 
            rankTable[i].rank, rankTable[i].name, rankTable[i].play, 
            rankTable[i].points, rankTable[i].win, rankTable[i].draw, 
            rankTable[i].lose);
        }
        System.out.printf("-----------------------------------------------------------------------\n");
    }
}