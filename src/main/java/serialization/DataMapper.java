package serialization;

import management.Key;
import management.Tag;
import management.TagManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DataMapper {
    private List<KeyMapper> mappedKeys;
    private List<TagMapper> mappedTags;

    public List<KeyMapper> getMappedKeys() {
        return mappedKeys;
    }

    public void setMappedKeys(List<KeyMapper> mappedKeys) {
        this.mappedKeys = mappedKeys;
    }

    public List<TagMapper> getMappedTags() {
        return mappedTags;
    }

    public void setMappedTags(List<TagMapper> mappedTags) {
        this.mappedTags = mappedTags;
    }

    public DataMapper(Set<Key> keys, Set<Tag> tags){
        mappedKeys = new ArrayList<KeyMapper>();
        mappedTags = new ArrayList<TagMapper>();
        for(Key element : keys){
            mappedKeys.add(new KeyMapper(element));
        }

        for(Tag element : tags){
            mappedTags.add(new TagMapper(element));
        }
    }

    public DataMapper(){};

    public void loadToCurrentRun(TagManager tagManager){
        for(KeyMapper element : this.mappedKeys){
            tagManager.addKey(element.getName());
        }
        for(TagMapper element : this.mappedTags){
            tagManager.addTag(element.getName());
        }
        for(KeyMapper element : this.mappedKeys){
            for(String tag : element.getTags()){
                tagManager.findKey(element.getName()).addTag(tagManager.findTag(tag));
            }
        }
        for(TagMapper element : this.mappedTags){
            for(String key : element.getKeys()){
                tagManager.findTag(element.getName()).addKey(tagManager.findKey(key));
            }
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (KeyMapper element : mappedKeys){
            text += element;
        }
        for (TagMapper element : mappedTags){
            text += element;
        }

        return text;
    }
}
