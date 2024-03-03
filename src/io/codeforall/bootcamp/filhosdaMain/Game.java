package io.codeforall.bootcamp.filhosdaMain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Game {

    private String letter;
    LinkedList<PlayerConnection> playerConnections;


    public Game(LinkedList<PlayerConnection> playerConnections) {
        animalsContainer();
        cityNamesContainer();
        peopleNamesContainer();
        this.playerConnections = playerConnections;

    }


    ArrayList<String> alphabetContainer = new ArrayList<>(alphabet());

    public List<String> alphabet() {
        LinkedList<String> out = new LinkedList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            out.add(String.valueOf(ch));
        }
        return out;
    }

    public String getRandomLetter() {
        Random random = new Random();
        int randomIndex = random.nextInt(alphabetContainer.size());
        letter = alphabetContainer.get(randomIndex);
        return letter;
    }

    public void setAlphabetContainer(ArrayList<String> alphabetContainer) {
        this.alphabetContainer = alphabetContainer;
    }


    //=========================================//


    ArrayList<ArrayList<String>> animalNamesList = new ArrayList<>();

    public void animalsContainer() {
        for (int i = 0; i < 26; i++) {
            animalNamesList.add(new ArrayList<>());
        }


        addAnimalNames(animalNamesList, 'a', "antelope", "alligator", "armadillo", "ape");
        addAnimalNames(animalNamesList, 'b', "bear", "buffalo", "bat", "bison");
        addAnimalNames(animalNamesList, 'c', "cat", "camel", "crocodile", "cheetah");
        addAnimalNames(animalNamesList, 'd', "dog", "dolphin", "deer", "duck");
        addAnimalNames(animalNamesList, 'e', "elephant", "eagle", "elk", "echidna");
        addAnimalNames(animalNamesList, 'f', "fox", "frog", "flamingo", "falcon");
        addAnimalNames(animalNamesList, 'g', "giraffe", "gorilla", "goat", "grizzly bear");
        addAnimalNames(animalNamesList, 'h', "horse", "hippo", "hedgehog", "hawk");
        addAnimalNames(animalNamesList, 'i', "iguana", "impala", "insect", "ibis");
        addAnimalNames(animalNamesList, 'j', "jackal", "jaguar", "jay", "jellyfish");
        addAnimalNames(animalNamesList, 'k', "kangaroo", "koala", "kookaburra", "kingfisher");
        addAnimalNames(animalNamesList, 'l', "lion", "leopard", "llama", "lynx");
        addAnimalNames(animalNamesList, 'm', "monkey", "moose", "mongoose", "manatee");
        addAnimalNames(animalNamesList, 'n', "nightingale", "newt", "narwhal", "numbat");
        addAnimalNames(animalNamesList, 'o', "owl", "octopus", "opossum", "otter");
        addAnimalNames(animalNamesList, 'p', "panda", "penguin", "parrot", "puma");
        addAnimalNames(animalNamesList, 'q', "quail", "quokka", "quoll", "quelea");
        addAnimalNames(animalNamesList, 'r', "rabbit", "raccoon", "rhinoceros", "reindeer");
        addAnimalNames(animalNamesList, 's', "snake", "squirrel", "seal", "shark");
        addAnimalNames(animalNamesList, 't', "tiger", "turtle", "toucan", "turkey");
        addAnimalNames(animalNamesList, 'u', "uakari", "umbrellabird", "urial", "umbrellabird");
        addAnimalNames(animalNamesList, 'v', "vulture", "viper", "vole", "vicuña");
        addAnimalNames(animalNamesList, 'w', "wolf", "walrus", "weasel", "wombat");
        addAnimalNames(animalNamesList, 'x', "xerus", "xenopus", "xenarthra", "xantus");
        addAnimalNames(animalNamesList, 'y', "yak", "yabby", "yapok", "yakow");
        addAnimalNames(animalNamesList, 'z', "zebra", "zebu", "zorilla", "zonkey");


        for (char letter = 'a'; letter <= 'z'; letter++) {
            ArrayList<String> names = animalNamesList.get(letter - 'a');
        }
    }


    private static void addAnimalNames(ArrayList<ArrayList<String>> list, char letter, String... names) {
        for (String name : names) {
            list.get(Character.toLowerCase(letter) - 'a').add(name.toLowerCase());
        }
    }


    //=================================================//


    ArrayList<ArrayList<String>> peopleNamesList = new ArrayList<>();

    public void peopleNamesContainer() {
        for (int i = 0; i < 26; i++) {
            peopleNamesList.add(new ArrayList<>());
        }

        addPeopleNames(peopleNamesList, 'a', "Alice", "Adam", "Anna", "Alex");
        addPeopleNames(peopleNamesList, 'b', "Bob", "Beth", "Ben", "Barbara");
        addPeopleNames(peopleNamesList, 'c', "Chris", "Catherine", "Carl", "Caroline");
        addPeopleNames(peopleNamesList, 'd', "David", "Deborah", "Daniel", "Diana");
        addPeopleNames(peopleNamesList, 'e', "Edward", "Elizabeth", "Eric", "Emily");
        addPeopleNames(peopleNamesList, 'f', "Frank", "Fiona", "Fred", "Faith");
        addPeopleNames(peopleNamesList, 'g', "George", "Grace", "Gary", "Gina");
        addPeopleNames(peopleNamesList, 'h', "Henry", "Hannah", "Harold", "Holly");
        addPeopleNames(peopleNamesList, 'i', "Ian", "Isabel", "Ivan", "Irene");
        addPeopleNames(peopleNamesList, 'j', "John", "Jane", "James", "Jennifer");
        addPeopleNames(peopleNamesList, 'k', "Kevin", "Kate", "Kyle", "Karen");
        addPeopleNames(peopleNamesList, 'l', "Luke", "Lucy", "Leo", "Laura");
        addPeopleNames(peopleNamesList, 'm', "Michael", "Mary", "Mark", "Michelle");
        addPeopleNames(peopleNamesList, 'n', "Nicholas", "Natalie", "Nathan", "Nicole");
        addPeopleNames(peopleNamesList, 'o', "Oliver", "Olivia", "Oscar", "Octavia");
        addPeopleNames(peopleNamesList, 'p', "Peter", "Paula", "Philip", "Paige");
        addPeopleNames(peopleNamesList, 'q', "Quentin", "Quinn", "Quincy", "Queenie");
        addPeopleNames(peopleNamesList, 'r', "Robert", "Rebecca", "Richard", "Rachel");
        addPeopleNames(peopleNamesList, 's', "Steven", "Sarah", "Samuel", "Samantha");
        addPeopleNames(peopleNamesList, 't', "Thomas", "Tiffany", "Timothy", "Tracy");
        addPeopleNames(peopleNamesList, 'u', "Ulysses", "Ursula", "Uriel", "Uma");
        addPeopleNames(peopleNamesList, 'v', "Vincent", "Victoria", "Victor", "Valerie");
        addPeopleNames(peopleNamesList, 'w', "William", "Wendy", "Walter", "Wendell");
        addPeopleNames(peopleNamesList, 'x', "Xavier", "Xena", "Xander", "Ximena");
        addPeopleNames(peopleNamesList, 'y', "Yannick", "Yvette", "Yuri", "Yolanda");
        addPeopleNames(peopleNamesList, 'z', "Zachary", "Zoe", "Zane", "Zara");


        for (char letter = 'a'; letter <= 'z'; letter++) {
            ArrayList<String> names = peopleNamesList.get(letter - 'a');
        }
    }


    private static void addPeopleNames(ArrayList<ArrayList<String>> list, char letter, String... names) {
        for (String name : names) {
            list.get(Character.toLowerCase(letter) - 'a').add(name.toLowerCase());
        }
    }

    //================================================//


    ArrayList<ArrayList<String>> cityNamesList = new ArrayList<>();

    public void cityNamesContainer() {
        for (int i = 0; i < 26; i++) {
            cityNamesList.add(new ArrayList<>());
        }

        addCityNames(cityNamesList, 'a', "Amsterdam", "Athens", "Ankara", "Austin");
        addCityNames(cityNamesList, 'b', "Berlin", "Beijing", "Bangkok", "Barcelona");
        addCityNames(cityNamesList, 'c', "Cairo", "Cape Town", "Chicago", "Copenhagen");
        addCityNames(cityNamesList, 'd', "Delhi", "Dubai", "Dallas", "Dhaka");
        addCityNames(cityNamesList, 'e', "Edinburgh", "Edmonton", "El Paso", "Eindhoven");
        addCityNames(cityNamesList, 'f', "Frankfurt", "Florence", "Fukuoka", "Fortaleza");
        addCityNames(cityNamesList, 'g', "Geneva", "Guangzhou", "Gothenburg", "Galway");
        addCityNames(cityNamesList, 'h', "Helsinki", "Hamburg", "Houston", "Hanoi");
        addCityNames(cityNamesList, 'i', "Istanbul", "Islamabad", "Incheon", "Indianapolis");
        addCityNames(cityNamesList, 'j', "Jakarta", "Johannesburg", "Jerusalem", "Jaipur");
        addCityNames(cityNamesList, 'k', "Kyoto", "Kolkata", "Kiev", "Kansas City");
        addCityNames(cityNamesList, 'l', "London", "Los Angeles", "Lisbon", "Lima");
        addCityNames(cityNamesList, 'm', "Madrid", "Moscow", "Mumbai", "Montreal");
        addCityNames(cityNamesList, 'n', "New York", "Nairobi", "Nanjing", "Naples");
        addCityNames(cityNamesList, 'o', "Oslo", "Ottawa", "Orlando", "Omsk");
        addCityNames(cityNamesList, 'p', "Paris", "Prague", "Perth", "Portland");
        addCityNames(cityNamesList, 'q', "Quebec City", "Qom", "Quito", "Quanzhou");
        addCityNames(cityNamesList, 'r', "Rome", "Rio de Janeiro", "Rotterdam", "Riyadh");
        addCityNames(cityNamesList, 's', "Sydney", "Shanghai", "Stockholm", "Seoul");
        addCityNames(cityNamesList, 't', "Tokyo", "Toronto", "Tehran", "Toulouse");
        addCityNames(cityNamesList, 'u', "Utrecht", "Ulan Bator", "Uppsala", "Ufa");
        addCityNames(cityNamesList, 'v', "Vienna", "Vancouver", "Venice", "Valencia");
        addCityNames(cityNamesList, 'w', "Warsaw", "Wellington", "Washington", "Wuhan");
        addCityNames(cityNamesList, 'x', "Xian", "Xiamen", "Xi'an", "Xuzhou");
        addCityNames(cityNamesList, 'y', "Yerevan", "Yokohama", "Yekaterinburg", "Yiwu");
        addCityNames(cityNamesList, 'z', "Zurich", "Zagreb", "Zhengzhou", "Zanzibar");


        for (char letter = 'a'; letter <= 'z'; letter++) {
            ArrayList<String> names = cityNamesList.get(letter - 'a');
        }
    }


    private static void addCityNames(ArrayList<ArrayList<String>> list, char letter, String... names) {
        for (String name : names) {
            list.get(Character.toLowerCase(letter) - 'a').add(name.toLowerCase());
        }
    }


    //================================================//


    public void comparePlayerAnimalWord(String string, PlayerConnection player) {
        boolean foundMatch = false;
        for (ArrayList<String> animalNames : animalNamesList) {
            for (String animalName : animalNames) {
                if (string.equalsIgnoreCase(animalName)) {
                    foundMatch = true;
                    player.setPlayerScore(player.getPlayerScore() + 5);
                    System.out.println("Current score: " + player.getPlayerScore());
                    System.out.println("Correct answer! You gained 5 points.");
                    break;
                }
            }

            if (foundMatch) {
                break;
            }
            if (!foundMatch) {
                System.out.print("");
            }
        }
    }

    public void comparePlayerNameWord(String string, PlayerConnection player) {
        boolean foundMatch = false;
        for (ArrayList<String> peopleNames : peopleNamesList) {
            for (String peopleName : peopleNames) {
                if (string.equalsIgnoreCase(peopleName)) {

                    player.setPlayerScore(player.getPlayerScore() + 5);
                    System.out.println("Current score: " + player.getPlayerScore());

                    System.out.println("Correct answer! You gained 5 points.");
                    break;
                }

            }
            if (foundMatch) {
                break;
            }
            if (!foundMatch) {
                System.out.print("");
            }
        }
    }

    public void comparePlayerCityWord(String string, PlayerConnection player) {
        boolean foundMatch = false;
        for (ArrayList<String> cityNames : cityNamesList) {
            for (String cityName : cityNames) {
                if (string.equalsIgnoreCase(cityName)) {

                    player.setPlayerScore(player.getPlayerScore() + 5);
                    System.out.println("Current score: " + player.getPlayerScore());

                    System.out.println("Correct answer! You gained 5 points.");
                    break;
                }
            }
            if (foundMatch) {
                break;
            }
            if (!foundMatch) {
                System.out.print("");

            }
        }
    }


    //==============================================//


    private void askEveryoneNames(LinkedList<PlayerConnection> playerConnections, String messageName) throws IOException {
        for (PlayerConnection playerConnection : playerConnections) {
            Thread t = new Thread(() -> {
                playerConnection.getName(messageName);
            });
            t.start();
        }
        while (!checkPlayerIsReady()) {
            System.out.print("");
        }
    }

    private void askEveryone(LinkedList<PlayerConnection> playerConnections, String message) throws IOException {
        for (PlayerConnection playerConnection : playerConnections) {
            Thread t = new Thread(() -> {
                playerConnection.getAnswer(message);
            });
            t.start();
        }
        while (!checkPlayerIsReady()) {
            System.out.print("");
        }
    }

    private boolean checkPlayerIsReady() {
        for (PlayerConnection playerConnection : playerConnections) {
            if (!playerConnection.isReady()) {
                return false;
            }
        }
        return true;
    }

    private void sendFinalScores() {
        StringBuilder message = new StringBuilder("Final Scores:\n");
        for (PlayerConnection playerConnection : playerConnections) {
            message.append(playerConnection.getPlayerName()).append(": ").append(playerConnection.getPlayerScore()).append("\n");
        }
        for (PlayerConnection playerConnection : playerConnections) {
            playerConnection.getOutputStream().print(message);
        }

        System.exit(1);
    }

    public void gameLogic() {
        try {
            int round = 1;
            askEveryoneNames(playerConnections, "--Type your name?-- \n");


            while (round <= Server.maxRounds) {

                letter = getRandomLetter();


                askEveryone(playerConnections, "Write the name of an animal 🦄 that starts with the letter '" + letter + "': \n");
                for (PlayerConnection playerConnection : playerConnections) {
                    comparePlayerAnimalWord(playerConnection.getCurrentAnswer(), playerConnection);
                    System.out.println(playerConnection.getPlayerScore());
                }


                //==========================//


                askEveryone(playerConnections, "Write the name of a city 🏙️ that starts with the letter '" + letter + "': \n");
                for (PlayerConnection playerConnection : playerConnections) {
                    comparePlayerCityWord(playerConnection.getCurrentAnswer(), playerConnection);
                    System.out.println(playerConnection.getPlayerScore());
                }


                //=========================//


                askEveryone(playerConnections, "Write the name of a person 🤴🫅 that starts with the letter '" + letter + "': \n");
                for (PlayerConnection playerConnection : playerConnections) {
                    comparePlayerNameWord(playerConnection.getCurrentAnswer(), playerConnection);
                    System.out.println(playerConnection.getPlayerScore());
                }



                if (round == Server.maxRounds) {
                    sendFinalScores();
                    }
                round++;
                }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

}


