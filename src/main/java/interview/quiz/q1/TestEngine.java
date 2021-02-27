package interview.quiz.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEngine {

    public static void readBashScript() {
        try {
            String[] cmd = {"sh", "src/main/resources/engine.sh"};
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            int counter = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("StartCycle: " + counter + " Duration: " + line);
                counter++;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        readBashScript();
    }
}
