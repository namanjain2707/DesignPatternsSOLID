package net.media.training.live.dip;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 4:47:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyDatabase {
    private static Map<Integer, String> data;
    private static int count;

    MyDatabase(Map data,int count){
        this.data = data;
        this.count = count;
    }

    public int write(String inputString) {
        data.put(++count, inputString);
        return count;
    }
}
