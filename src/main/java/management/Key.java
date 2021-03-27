package management;

import java.util.Set;
import java.util.TreeSet;

public class Key implements Comparable<Key>{
    private String name;
    private Set<Tag> tags;

    public Key(String name) {
        this.name = name;
        this.tags = new TreeSet<Tag>();
    }

    public String getName() {
        return name;
    }

    public void addTag(Tag newTag){
        tags.add(newTag);
    }

    public void removeTag(Tag tagToRemove){
        tags.remove(tagToRemove);
    }

    public Set<Tag> getTags(){
        TreeSet treeSet = new TreeSet();
        for(Tag element : this.tags){
            treeSet.add(element);
        }
        return treeSet;
    }

    @Override
    public int compareTo(Key key) {
        return this.name.compareTo(key.getName());
    }

    public int compareTo(String keyName){
        return this.name.compareTo(keyName);
    }

    @Override
    public String toString() {
        String tags = "[";
        for (Tag element : this.tags){
            tags += element.getName() + ", ";
        }
        if(tags.length() >= 2){
            tags = tags.substring(0, tags.length() - 2);
        }
        tags += "]\n";
        return "Key: " + this.name + "\nTags: " + tags;
    }
}