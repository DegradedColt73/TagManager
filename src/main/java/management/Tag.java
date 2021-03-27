package management;

import java.util.Set;
import java.util.TreeSet;

public class Tag implements Comparable<Tag>{
    private String name;
    private Set<Key> keys;

    public Tag(String name) {
        this.name = name;
        this.keys = new TreeSet<Key>();
    }

    public String getName() {
        return name;
    }

    public void addKey(Key newKey){
        keys.add(newKey);
    }

    public void removeKey(Key keyToRemove){
        keys.remove(keyToRemove);
    }

    public Set<Key> getKeys(){
        TreeSet treeSet = new TreeSet();
        for(Key element : this.keys){
            treeSet.add(element);
        }
        return treeSet;
    }

    @Override
    public int compareTo(Tag tag) {
        return this.name.compareTo(tag.getName());
    }

    public int compareTo(String tagName){
        return this.name.compareTo(tagName);
    }

    @Override
    public String toString() {
        String keys = "[";
        for (Key element : this.keys){
            keys += element.getName() + ", ";
        }
        if(keys.length() >= 2){
            keys = keys.substring(0, keys.length() - 2);
        }
        keys += "]\n";
        return "Tag: " + this.name + "\nKeys: " + keys;
    }
}