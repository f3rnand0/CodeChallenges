package technical.challenges;

import java.io.*;

public class WalletHubCodeChallenge {
    public static int count(String needle, InputStream haystack) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(haystack));
        String line;
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if (line.indexOf(needle) > -1)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";
        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(WalletHubCodeChallenge.count("there", inStream));
        }
    }
}