package x33StringFunctions;
public class StringFunctions {
    static String team = "AFCWimbledon";
    public static void main(String[] args) {
        System.out.println(team.length());
        System.out.println(team.toLowerCase());
        System.out.println(team.toUpperCase());
        System.out.println(team.charAt(4));
        extension();
    }
/*  Task
    Turn AFC Wimbledon into a Cheerleader chant i.e.
    Gimme an A, Gimme an F, Gimme..... All letters
    should be capitalised
*/









    private static void extension(){
        team = team.toUpperCase();
        for(int x = 0;x<team.length();x++){
            System.out.println("Gimme a "+team.charAt(x));
        }
        System.out.println("What have ya got : " + team);
    }
}
