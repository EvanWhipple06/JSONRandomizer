import java.util.*;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JSONCommander {

    static final String[] Classes = {"Scout", "Soldier", "Pyro", "Demoman", "Heavy", "Engineer", "Medic", "Sniper", "Spy"};
    static final String[] Slots = {"Primary", "Secondary", "Melee", "Building"};

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        JSONObject weaponsJSON = new JSONObject();

        boolean balls = true;

        System.out.println("Enter a command here \"help\" if you need a list of commands): ");

        while(balls == true) {
            String input = sc.next();

            String[] arguments;
            try {
                String[] temp = sc.nextLine().toLowerCase().split(" ");

                arguments = new String[temp.length - 1];
                for(int i = 1; i < temp.length; i++) {
                    arguments[i-1] = temp[i];
                }

                arguments[0] = arguments[0];        //why does this work??? i dont know, but "random" breaks without it so NO TOUCHY!!!
            } catch (Exception e) {
                arguments = new String[] {""};
            }

            switch (input.toLowerCase()) {
                case "random":
                    randomize(arguments[0]);
                    break;
                case "read":
                    Weapons.read();
                    break;
                case "write":
                    Weapons.write();
                    break;
                case "test":
                    System.out.println(Weapons.heavyMelees);
                    break;
				/*case "help":
					System.out.println("Commands:\nhelp\nadd class slot weapon\nremove class slot weapon\nview class slot\nsave\nexit");
					break;
				case "add":
					break;
				case "remove":

					break;
				case "view":

					break;
				case "save":

					break;
				case "exit":
					balls = false;
					break;*/
                default:
                    System.out.println("Please enter a valid command or type \"help\" to view the commands.");
                    break;
            }
        }
    }
    //help: lists commands
    //edit: edit the json
    //add(list): add an item to list
    //remove(list): remove an item from list
    //view(list): view list
    //save: save all changes to the json
    public static void randomize(String Class) {
        if(Class.equals("")) {
            String[] temp = randRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("scout")) {
            String[] temp = scoutRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("soldier")) {
            String[] temp = soldierRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("pyro")) {
            String[] temp = pyroRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("demoman")) {
            String[] temp = demomanRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("heavy")) {
            String[] temp = heavyRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("engineer")) {
            String[] temp = engineerRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("medic")) {
            String[] temp = medicRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("sniper")) {
            String[] temp = sniperRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        } else if(Class.equals("spy")) {
            String[] temp = spyRand();
            for(int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        }
    }

    public static String[] randRand() {
        Random rand = new Random();
        String[][] methodArr = {scoutRand(), soldierRand(), pyroRand(), demomanRand(), heavyRand(), engineerRand(), medicRand(), sniperRand(), spyRand()};
        String[] temp = methodArr[rand.nextInt(methodArr.length)];
        return temp;
    }

    public static String[] scoutRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.scoutPrimaries.get(rand.nextInt(Weapons.scoutPrimaries.size())), Weapons.scoutSecondaries.get(rand.nextInt(Weapons.scoutSecondaries.size())), Weapons.scoutMelees.get(rand.nextInt(Weapons.scoutMelees.size()))};
        return returnArr;
    }

    public static String[] soldierRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.soldierPrimaries.get(rand.nextInt(Weapons.soldierPrimaries.size())), Weapons.soldierSecondaries.get(rand.nextInt(Weapons.soldierSecondaries.size())), Weapons.soldierMelees.get(rand.nextInt(Weapons.soldierMelees.size()))};
        return returnArr;
    }

    public static String[] pyroRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.pyroPrimaries.get(rand.nextInt(Weapons.pyroPrimaries.size())), Weapons.pyroSecondaries.get(rand.nextInt(Weapons.pyroSecondaries.size())), Weapons.pyroMelees.get(rand.nextInt(Weapons.pyroMelees.size()))};
        return returnArr;
    }

    public static String[] demomanRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.demomanPrimaries.get(rand.nextInt(Weapons.demomanPrimaries.size())), Weapons.demomanSecondaries.get(rand.nextInt(Weapons.demomanSecondaries.size())), Weapons.demomanMelees.get(rand.nextInt(Weapons.demomanMelees.size()))};
        return returnArr;
    }

    public static String[] heavyRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.heavyPrimaries.get(rand.nextInt(Weapons.heavyPrimaries.size())), Weapons.heavySecondaries.get(rand.nextInt(Weapons.heavySecondaries.size())), Weapons.heavyMelees.get(rand.nextInt(Weapons.heavyMelees.size()))};
        return returnArr;
    }

    public static String[] engineerRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.engineerPrimaries.get(rand.nextInt(Weapons.engineerPrimaries.size())), Weapons.engineerSecondaries.get(rand.nextInt(Weapons.engineerSecondaries.size())), Weapons.engineerMelees.get(rand.nextInt(Weapons.engineerMelees.size()))};
        return returnArr;
    }

    public static String[] medicRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.medicPrimaries.get(rand.nextInt(Weapons.medicPrimaries.size())), Weapons.medicSecondaries.get(rand.nextInt(Weapons.medicSecondaries.size())), Weapons.medicMelees.get(rand.nextInt(Weapons.medicMelees.size()))};
        return returnArr;
    }

    public static String[] sniperRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.sniperPrimaries.get(rand.nextInt(Weapons.sniperPrimaries.size())), Weapons.sniperSecondaries.get(rand.nextInt(Weapons.sniperSecondaries.size())), Weapons.sniperMelees.get(rand.nextInt(Weapons.sniperMelees.size()))};
        return returnArr;
    }

    public static String[] spyRand() {
        Random rand = new Random();
        String[] returnArr = {Weapons.spyPrimaries.get(rand.nextInt(Weapons.spyPrimaries.size())), Weapons.spyWatches.get(rand.nextInt(Weapons.spyWatches.size())), Weapons.spyMelees.get(rand.nextInt(Weapons.spyMelees.size())), Weapons.spyBuildings.get(rand.nextInt(Weapons.spyBuildings.size()))};
        return returnArr;
    }

    public static void parseArgs(String Class, String Slot, String Weapon) { //parse the arguments passed into add/remove

    }

    public static void autofill(String Class, String Slot) { //autofill the stuff i put in so i dont have to manually type it all

    }
}

