import java.util.Locale;

public class Main {

//    String politicalParty
//    output “What is your party affiliation [D, R, or I]? ”
//    input politicalParty
//    if politicalParty = = D then
//       output “You get a Democratic Donkey!”
//    else if politicalParty = = R then
//       output “You get an Elephant!”
//    else
//       output “You get a Man!”
//    endIf

    public static void main(String[] args)
    {
	String politicalAffiliation = "";
    String menu = "D - democratic R - Republican I - Independent";

    System.out.println("What is your political party affiliation? ");
    System.out.println(menu);
    politicalAffiliation = "O";
//    politicalAffiliation = politicalAffiliation.toUpperCase()
//    couldn't figure it out ^
    System.out.println("The simulated user input is " + politicalAffiliation);

    if (politicalAffiliation == "D")
    {
        System.out.println("You get a Democratic Donkey!");
    }
    else if (politicalAffiliation == "R")
    {
        System.out.println("You get a Republican Elephant!");
    }
    else if (politicalAffiliation == "I")
    {
        System.out.println("You get an Independent Man");
    }
    else
    {
        System.out.println("You chose Other: " + politicalAffiliation);
    }
    }
}
