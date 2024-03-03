package io.codeforall.bootcamp.filhosdaMain;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.io.*;
import java.net.Socket;


public class PlayerConnection implements Runnable {

    private InputStream in;
    private PrintStream out;
    private Socket playerSocket;
    private PrintWriter writer;
    private String playerName;
    private Game game;
    private boolean isReady;
    private String currentAnswer;
    private int playerScore;




    public PlayerConnection(Socket playerSocket, Game game) throws IOException {
        this.playerSocket = playerSocket;
        this.game = game;
        this.in = playerSocket.getInputStream();
        this.out = new PrintStream(playerSocket.getOutputStream());
        this.playerScore = 0;

    }
    public void getName(String messageName)  {
        isReady = false;
        Prompt promptName = new Prompt(getInputStream(), new PrintStream(getOutputStream()));
        StringInputScanner scanner = new StringInputScanner();
        scanner.setMessage(messageName);
        String answer = promptName.getUserInput(scanner);
        playerName = answer;
        isReady = true;
    }

    public void getAnswer(String message)  {
        isReady = false;
        Prompt promptName = new Prompt(getInputStream(), new PrintStream(getOutputStream()));
        StringInputScanner scanner = new StringInputScanner();
        scanner.setMessage(message);
        String answer = promptName.getUserInput(scanner);
        currentAnswer = answer;
        isReady = true;
    }

    public InputStream getInputStream() {
        return in;
    }

    public PrintStream getOutputStream() {
        return out;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getCurrentAnswer() {
        return currentAnswer;
    }

    public boolean isReady() {
        return isReady;
    }

    public String getPlayerName() {
        return playerName;
    }


    @Override
    public void run() {

      out.print(AsciiArt.stopGame);

    }
}
