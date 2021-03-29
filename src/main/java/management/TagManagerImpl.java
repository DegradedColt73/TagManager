package management;


import java.util.Set;
import java.util.TreeSet;

public class TagManager {
    private Set<Key> keys;
    private Set<Tag> tags;

    public void setKeys(Set<Key> keys) {
        this.keys = keys;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public TagManager(){
        keys = new TreeSet<Key>();
        tags = new TreeSet<Tag>();
    }

    public void addKey(String name){
        keys.add(new Key(name));
    }

    public void addTag(String name){
        tags.add(new Tag(name));
    }

    public Key findKey(String name){
        for(Key element : keys){
            if (element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }

    public Tag findTag(String name){
        for(Tag element : tags){
            if(element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }

    public Set<Key> getKeys() {
        return keys;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void removeKey(String name){
        Key key = this.findKey(name);
        if (key != null){
            for(Tag element : key.getTags()){
                element.removeKey(key);
            }
            keys.remove(key);
        }
    }

    public void removeTag(String name){
        Tag tag = this.findTag(name);
        if(tag != null){
            for(Key element : tag.getKeys()){
                element.removeTag(tag);
            }
            tags.remove(tag);
        }
    }

    public void connectTag(Key newKey, Tag newTag){
        if(newTag != null && newKey != null){
            Tag tag = this.findTag(newTag.getName());
            Key key = this.findKey(newKey.getName());
            key.addTag(tag);
            tag.addKey(key);
        }
    }
}
