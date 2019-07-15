package net.media.training.live.dip;

import java.io.*;
import java.util.Base64;

public class FileEncodingModule implements EncodingModule {
    String beforeEncryptionFilePath;
    String afterEncryptionFilePath;

    FileEncodingModule(String beforeEncryptionFilePath,String afterEncryptionFilePath){
        this.beforeEncryptionFilePath = beforeEncryptionFilePath;
        this.afterEncryptionFilePath = afterEncryptionFilePath;
    }

    public void encode() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.beforeEncryptionFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.afterEncryptionFilePath));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.write(encodedLine);
            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
