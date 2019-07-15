package net.media.training.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.Hashtable;

public class NetworkAndDatabaseEncodingModule implements EncodingModule {
    String protocol;
    String host;
    String file;

    NetworkAndDatabaseEncodingModule(String protocol, String host,String file){
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    public void encode() {
        URL url = null;
        try {
            url = new URL(protocol, host, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase(new Hashtable(),0);
        database.write(encodedString);
    }
}
