package net.media.training.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        String beforeEncryptionPath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        String afterEncryptionPath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt";
        String protocol = "http";
        String host = "myfirstappwith.appspot.com";
        String file = "index.html";

        EncodingModule encodingModule  = new FileEncodingModule(beforeEncryptionPath,afterEncryptionPath);
        encodingModule.encode();

        encodingModule = new NetworkAndDatabaseEncodingModule(protocol,host,file);
        encodingModule.encode();
    }
}
