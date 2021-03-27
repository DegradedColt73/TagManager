package serialization;

import management.Key;
import management.Tag;

import java.util.ArrayList;
import java.util.List;

public class KeyMapper {
    private String name;
    private List<String> tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public KeyMapper(Key key){
        this.tags = new ArrayList<String>();
        this.name = key.getName();
        for(Tag element : key.getTags()){
            tags.add(element.getName());
        }
    }

    public KeyMapper(){};

    @Override
    public String toString() {
        String text = "Key: " + this.name + " Tags: [";
        for(String element : this.tags){
            text += element;
            text += ", ";
        }
        if(text.length() >= 2){
            text = text.substring(0, text.length() - 2);
        }
        text += "]\n";
        return text;
    }
}
