import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Weapons {
    static ArrayList<String> scoutPrimaries = new ArrayList<>(List.of("Scattergun", "Back Scatter", "Force-A-Nature ", "Soda Popper", "Shortstop", "Baby Face Blaster"));
    static ArrayList<String> scoutSecondaries = new ArrayList<>(List.of("Pistol", "Mad Milk", "Pretty Boy's Pocket Pistol", "Winger", "Flying Guillotine", "Bonk! Atomic Punch", "Crit-a-Cola"));
    static ArrayList<String> scoutMelees= new ArrayList<>(List.of("Bat", "Sandman", "Atomizer", "Wrap Assassin", "Candy Cane", "Boston Basher", "Sun-on-a-Stick", "Fan O'War"));

    static ArrayList<String> soldierPrimaries = new ArrayList<>(List.of("Rocket Launcher", "Direct Hit", "Beggars Bazooka", "Cow Mangler 5000", "Black Box", "Rocket Jumper", "Liberty Launcher", "Air Strike"));
    static ArrayList<String> soldierSecondaries = new ArrayList<>(List.of("Shotgun", "Righteous Bison", "Gunboats", "Battalion's Backup", "Buff Banner", "Concheror", "Reserve Shooter", "Manntreads", "B.A.S.E. Jumper", "Panic Attack"));
    static ArrayList<String> soldierMelees = new ArrayList<>(List.of("Shovel", "Market Gardener", "Escape Plan", "Equalizer", "Pain Train", "Half-Zatoichi", "Disciplinary Action"));

    static ArrayList<String> pyroPrimaries = new ArrayList<>(List.of("Flame Thrower", "Backburner", "Degreaser", "Pholgistinator", "Dragon's Fury"));
    static ArrayList<String> pyroSecondaries = new ArrayList<>(List.of("Shotgun", "Reserve Shooter", "Flare Gun", "Detonator", "Manmelter", "Scorch Shot", "Panic Attack", "Thermal Thruster", "Gas Passer"));
    static ArrayList<String> pyroMelees = new ArrayList<>(List.of("Fire Ax", "Axtinguisher", "Homewrecker", "Powerjack", "Back Scratcher", "Sharpened Volcano Fragment", "Third Degree", "Neon Annihilator", "Hot Hand"));

    static ArrayList<String> demomanPrimaries = new ArrayList<>(List.of("Grenade Launcher", "Iron Bomber", "Loch-n-Load", "Ali Baba's Wee Booties", "Bootlegger", "Loose Cannon", "B.A.S.E. Jumper"));
    static ArrayList<String> demomanSecondaries = new ArrayList<>(List.of("Stickybomb Launcher", "Scottish Resistance", "Chargin' Targe", "Sticky Jumper", "Splendid Screen", "Tide Turner", "Quickiebomb Launcher"));
    static ArrayList<String> demomanMelees = new ArrayList<>(List.of("Bottle", "Eyelander", "Scotsman's Skullcutter", "Pain Train", "Ullapool Caber", "Claidheamh Mor", "Half-Zatoichi", "Persian Persuader"));

    static ArrayList<String> heavyPrimaries = new ArrayList<>(List.of("Minigun", "Natascha", "Brass Beast", "Tomislav", "Huo-Long Heater"));
    static ArrayList<String> heavySecondaries = new ArrayList<>(List.of("Shotgun", "Family Business", "Sandvich", "Dalokohs Bar", "Buffalo Steak Sandvich", "Panic Attack", "Second Banana"));
    static ArrayList<String> heavyMelees = new ArrayList<>(List.of("Fists", "Killing Gloves of Boxing", "Gloves of Running Urgently", "Warrior's Spirit", "Fists of Steel", "Eviction Notice", "Holiday Punch"));

    static ArrayList<String> engineerPrimaries = new ArrayList<>(List.of("Shotgun", "Frontier Justice", "Widowmaker", "Pomson 6000", "Rescue Ranger", "Panic Attack"));
    static ArrayList<String> engineerSecondaries = new ArrayList<>(List.of("Pistol", "Wrangler", "Short Circuit"));
    static ArrayList<String> engineerMelees = new ArrayList<>(List.of("Wrench", "Gunslinger", "Southern Hospitality", "Jag", "Eureka Effect"));

    static ArrayList<String> medicPrimaries = new ArrayList<>(List.of("Syringe Gun", "Blutsauger", "Crusader's Crossbow", "Overdose"));
    static ArrayList<String> medicSecondaries = new ArrayList<>(List.of("Medi Gun", "Kritzkrieg", "Quick-Fix", "Vaccinator"));
    static ArrayList<String> medicMelees = new ArrayList<>(List.of("Bonesaw", "Ubersaw", "Vita-Saw", "Amputator", "Solemn Vow"));

    static ArrayList<String> sniperPrimaries = new ArrayList<>(List.of("Sniper Rifle", "Huntsman", "Sydney Sleeper", "Bazaar Bargain", "Machina", "Hitman's Heatmaker", "Classic"));
    static ArrayList<String> sniperSecondaries = new ArrayList<>(List.of("SMG", "Cleaner's Carbine", "Jarate", "Razorback", "Darwin's Danger Shield", "Cozy Camper"));
    static ArrayList<String> sniperMelees = new ArrayList<>(List.of("Kukri", "Tribalman's Shiv", "Bushwacka", "Shahanshah"));

    static ArrayList<String> spyPrimaries = new ArrayList<>(List.of("Revolver", "Ambassador", "L'Etranger", "Enforcer", "Diamondback"));
    static ArrayList<String> spyWatches= new ArrayList<>(List.of("Invis Watch", "Cloak and Dagger", "Dead Ringer"));
    static ArrayList<String> spyMelees = new ArrayList<>(List.of("Knife", "Your Eternal Reward", "Conniver's Kunai", "Big Earner", "Spy-cicle"));
    static ArrayList<String> spyBuildings = new ArrayList<>(List.of("Sapper", "Red-Tape Recorder"));

    @SuppressWarnings("deprecation")
    public static void read() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\CTEWhippleE25\\Documents\\javaProjects\\intellij\\JSONRandomizer\\Weapons.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray scoutPrimaries = (JSONArray)jsonObject.get("Scout Primaries");
            JSONArray scoutSecondaries = (JSONArray)jsonObject.get("Scout Secondaries");
            JSONArray scoutMelees = (JSONArray)jsonObject.get("Scout Melees");

            JSONArray soldierPrimaries = (JSONArray)jsonObject.get("Soldier Primaries");
            JSONArray soldierSecondaries = (JSONArray)jsonObject.get("Soldier Secondaries");
            JSONArray soldierMelees = (JSONArray)jsonObject.get("Soldier Melees");

            JSONArray pyroPrimaries = (JSONArray)jsonObject.get("Pyro Primaries");
            JSONArray pyroSecondaries = (JSONArray)jsonObject.get("Pyro Secondaries");
            JSONArray pyroMelees = (JSONArray)jsonObject.get("Pyro Melees");

            JSONArray demomanPrimaries = (JSONArray)jsonObject.get("Demoman Primaries");
            JSONArray demomanSecondaries = (JSONArray)jsonObject.get("Demoman Secondaries");
            JSONArray demomanMelees = (JSONArray)jsonObject.get("Demoman Melees");

            JSONArray heavyPrimaries = (JSONArray)jsonObject.get("Heavy Primaries");
            JSONArray heavySecondaries = (JSONArray)jsonObject.get("Heavy Secondaries");
            JSONArray heavyMelees = (JSONArray)jsonObject.get("Heavy Melees");

            JSONArray engineerPrimaries = (JSONArray)jsonObject.get("Engineer Primaries");
            JSONArray engineerSecondaries = (JSONArray)jsonObject.get("Engineer Secondaries");
            JSONArray engineerMelees = (JSONArray)jsonObject.get("Engineer Melees");

            JSONArray medicPrimaries = (JSONArray)jsonObject.get("Medic Primaries");
            JSONArray medicSecondaries = (JSONArray)jsonObject.get("Medic Secondaries");
            JSONArray medicMelees = (JSONArray)jsonObject.get("Medic Melees");

            JSONArray sniperPrimaries = (JSONArray)jsonObject.get("Sniper Primaries");
            JSONArray sniperSecondaries = (JSONArray)jsonObject.get("Sniper Secondaries");
            JSONArray sniperMelees = (JSONArray)jsonObject.get("Sniper Melees");

            JSONArray spyPrimaries = (JSONArray)jsonObject.get("Spy Primaries");
            JSONArray spyWatches = (JSONArray)jsonObject.get("Spy Watches");
            JSONArray spyMelees = (JSONArray)jsonObject.get("Spy Melees");
            JSONArray spyBuildings = (JSONArray)jsonObject.get("Spy Buildings");


            Weapons.scoutPrimaries.clear();
            Weapons.scoutSecondaries.clear();
            Weapons.scoutMelees.clear();

            Weapons.soldierPrimaries.clear();
            Weapons.soldierSecondaries.clear();
            Weapons.soldierMelees.clear();

            Weapons.pyroPrimaries.clear();
            Weapons.pyroSecondaries.clear();
            Weapons.pyroMelees.clear();

            Weapons.demomanPrimaries.clear();
            Weapons.demomanSecondaries.clear();
            Weapons.demomanMelees.clear();

            Weapons.heavyPrimaries.clear();
            Weapons.heavySecondaries.clear();
            Weapons.heavyMelees.clear();

            Weapons.engineerPrimaries.clear();
            Weapons.engineerSecondaries.clear();
            Weapons.engineerMelees.clear();

            Weapons.medicPrimaries.clear();
            Weapons.medicSecondaries.clear();
            Weapons.medicMelees.clear();

            Weapons.sniperPrimaries.clear();
            Weapons.sniperSecondaries.clear();
            Weapons.sniperMelees.clear();

            Weapons.spyPrimaries.clear();
            Weapons.spyWatches.clear();
            Weapons.spyMelees.clear();
            Weapons.spyBuildings.clear();


            Weapons.scoutPrimaries = scoutPrimaries;
            Weapons.scoutSecondaries = scoutSecondaries;
            Weapons.scoutMelees = scoutMelees;

            Weapons.soldierPrimaries = soldierPrimaries;
            Weapons.soldierSecondaries = soldierSecondaries;
            Weapons.soldierMelees = soldierMelees;

            Weapons.pyroPrimaries = pyroPrimaries;
            Weapons.pyroSecondaries = pyroSecondaries;
            Weapons.pyroMelees = pyroMelees;

            Weapons.demomanPrimaries = demomanPrimaries;
            Weapons.demomanSecondaries = demomanSecondaries;
            Weapons.demomanMelees = demomanMelees;

            Weapons.heavyPrimaries = heavyPrimaries;
            Weapons.heavySecondaries = heavySecondaries;
            Weapons.heavyMelees = heavyMelees;

            Weapons.engineerPrimaries = engineerPrimaries;
            Weapons.engineerSecondaries = engineerSecondaries;
            Weapons.engineerMelees = engineerMelees;

            Weapons.medicPrimaries = medicPrimaries;
            Weapons.medicSecondaries = medicSecondaries;
            Weapons.medicMelees = medicMelees;

            Weapons.sniperPrimaries = sniperPrimaries;
            Weapons.sniperSecondaries = sniperSecondaries;
            Weapons.sniperMelees = sniperMelees;

            Weapons.spyPrimaries = spyPrimaries;
            Weapons.spyWatches = spyWatches;
            Weapons.spyMelees = spyMelees;
            Weapons.spyBuildings = spyBuildings;
        }	catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        JSONObject weaponsJSON = new JSONObject();

        weaponsJSON.put("Scout Primaries", Weapons.scoutPrimaries.toArray());
        weaponsJSON.put("Scout Secondaries", Weapons.scoutSecondaries);
        weaponsJSON.put("Scout Melees", Weapons.scoutMelees);

        weaponsJSON.put("Soldier Primaries", Weapons.soldierPrimaries.toArray());
        weaponsJSON.put("Soldier Secondaries", Weapons.soldierSecondaries.toArray());
        weaponsJSON.put("Soldier Melees", Weapons.soldierMelees);

        weaponsJSON.put("Pyro Primaries", Weapons.pyroPrimaries);
        weaponsJSON.put("Pyro Secondaries", Weapons.pyroSecondaries);
        weaponsJSON.put("Pyro Melees", Weapons.pyroMelees);

        weaponsJSON.put("Demoman Primaries", Weapons.soldierPrimaries);
        weaponsJSON.put("Demoman Secondaries", Weapons.demomanSecondaries);
        weaponsJSON.put("Demoman Melees", Weapons.demomanMelees);

        weaponsJSON.put("Heavy Primaries", Weapons.heavyPrimaries);
        weaponsJSON.put("Heavy Secondaries", Weapons.heavySecondaries);
        weaponsJSON.put("Heavy Melees", Weapons.heavyMelees);

        weaponsJSON.put("Engineer Primaries", Weapons.engineerPrimaries);
        weaponsJSON.put("Engineer Secondaries", Weapons.engineerSecondaries);
        weaponsJSON.put("Engineer Melees", Weapons.engineerMelees);

        weaponsJSON.put("Medic Primaries", Weapons.medicPrimaries);
        weaponsJSON.put("Medic Secondaries", Weapons.medicSecondaries);
        weaponsJSON.put("Medic Melees", Weapons.medicMelees);

        weaponsJSON.put("Sniper Primaries", Weapons.sniperPrimaries);
        weaponsJSON.put("Sniper Secondaries", Weapons.sniperSecondaries);
        weaponsJSON.put("Sniper Melees", Weapons.sniperMelees);

        weaponsJSON.put("Spy Primaries", Weapons.spyPrimaries);
        weaponsJSON.put("Spy Watches", Weapons.spyWatches);
        weaponsJSON.put("Spy Melees", Weapons.spyMelees);
        weaponsJSON.put("Spy Buildings", Weapons.spyBuildings);

        try {
            FileWriter file = new FileWriter("C:\\Users\\CTEWhippleE25\\Documents\\javaProjects\\intellij\\JSONRandomizer\\Weapons.json");
            file.write(weaponsJSON.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: " + weaponsJSON);
    }
}