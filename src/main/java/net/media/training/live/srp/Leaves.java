package net.media.training.live.srp;

public class Leaves {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private int[] leavesLeftPreviously;

    public Leaves(){

    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }
}
