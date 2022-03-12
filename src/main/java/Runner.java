import com.fizzed.bigmap.leveldb.LevelBigMap;
import com.fizzed.bigmap.leveldb.LevelBigMapBuilder;

import java.io.Serializable;
import java.nio.file.Paths;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Works");
        LevelBigMap<String, Item> map = (new LevelBigMapBuilder()).setScratchDirectory(Paths.get("target")).setKeyType(String.class).setValueType(Item.class).build();
    }
    static public class Item implements Serializable {
        Long a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        Integer h;
    }

}
