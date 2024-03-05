import java.util.*;
import java.text.NumberFormat;
public class Election {
    public static void main(String[]args){
        double NY_Awbrey;
        double NY_Martinez;
        double NJ_Awbrey;
        double NJ_Martinez;
        double CT_Awbrey;
        double CT_Martinez;
        double AwbreyVotes;
        double MartinezVotes;
        double TotalVotes;
        double AwbreyPercent;
        double MartinezPercent;
        Scanner input = new Scanner(System.in);
        System.out.print("How many people voted for Awbrey in New York? ");
        NY_Awbrey = input.nextInt();
        System.out.print("How many people voted for Martinez in New York? ");
        NY_Martinez = input.nextInt();
        System.out.print("How many people voted for Awbrey in New Jersey? ");
        NJ_Awbrey = input.nextInt();
        System.out.print("How many people voted for Martinez in New Jersey? ");
        NJ_Martinez = input.nextInt();
        System.out.print("How many people voted for Awbrey in Connecticut? ");
        CT_Awbrey = input.nextInt();
        System.out.print("How many people voted for Martinez in Connecticut? ");
        CT_Martinez = input.nextInt();
        input.close();
        AwbreyVotes = (NY_Awbrey + NJ_Awbrey + CT_Awbrey);
        MartinezVotes = (NY_Martinez + NJ_Martinez + CT_Martinez);
        TotalVotes = (AwbreyVotes + MartinezVotes);
        AwbreyPercent = ((1.00 * AwbreyVotes) / TotalVotes);
        System.out.println("Awbrey Percent " + AwbreyPercent);
        MartinezPercent = ((1.00 * MartinezVotes) / TotalVotes);
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Candidate \t \t Votes \t Percentage");
        System.out.print("Awbrey \t \t  " + AwbreyVotes);
        System.out.print("\t \t");
        System.out.print(percent.format(AwbreyPercent));
        System.out.print("\n");
        System.out.print("Martinez \t  " + MartinezVotes);
        System.out.print("\t \t");
        System.out.print(percent.format(MartinezPercent));
        System.out.print("\n");
    }
}

