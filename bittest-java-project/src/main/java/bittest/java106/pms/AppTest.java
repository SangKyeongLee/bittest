package bittest.java106.pms;

public class AppTest{
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String Team;
        String expl;
        int mem;
        String start;
        String end;

        System.out.print("팀명> ");
        Team = keyScan.nextLine();
        System.out.print("설명> ");
        expl = keyScan.nextLine();
        System.out.print("최대인원> ");
        mem = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일> ");
        start = keyScan.nextLine();
        System.out.print("종료일> ");
        end = keyScan.nextLine();

        System.out.println("------------");
        System.out.println("팀명: " + Team);
        System.out.println("설명: \n" + expl);
        System.out.println("최대인원: " + mem + "명");
        System.out.println("일정: " + start + " ~ " + end);

    }
}