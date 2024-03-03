package io.codeforall.bootcamp.filhosdaMain;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private LinkedList<Socket> players;
    private LinkedList<PlayerConnection> playerConnections;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;
    private PrintWriter out;
    private int port = 8080;
    private Socket playerSocket;
    private Game game;
    private int numOfPlayers = 0;
    public static int maxRounds = 0;
    public int i = 0;

    public Server() {
        players = new LinkedList<>();
        playerConnections = new LinkedList<>();
        this.game = new Game(playerConnections);

    }

    public void start() {

        Prompt host = new Prompt(System.in, System.out);
        IntegerInputScanner var = new IntegerInputScanner();
        var.setMessage("How many players do you want ?");
        numOfPlayers = host.getUserInput(var);

        Prompt host2 = new Prompt(System.in, System.out);
        IntegerInputScanner var2 = new IntegerInputScanner();
        var2.setMessage("How many rounds do you want ?");
        maxRounds = host2.getUserInput(var2);



        ExecutorService cachedPool = Executors.newCachedThreadPool();
        try {
            serverSocket = new ServerSocket(port);
            System.out.println(serverSocket);
            String letter = game.getRandomLetter();

            while (i < numOfPlayers) {

                playerSocket = serverSocket.accept();
                this.inputBufferedReader = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
                this.out = new PrintWriter(playerSocket.getOutputStream());
                System.out.println("connection accepted" + playerSocket);
                players.add(playerSocket);

                PlayerConnection currentConnection = new PlayerConnection(playerSocket,game);
                cachedPool.submit(currentConnection);
                playerConnections.add(currentConnection);
                i++;



            }
                game.gameLogic();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
