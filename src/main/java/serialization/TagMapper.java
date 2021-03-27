package serialization;

import management.Key;
import management.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagMapper {
    private String name;
    private List<String> keys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public TagMapper(Tag tag){
        this.keys = new ArrayList<String>();
        this.name = tag.getName();
        for(Key element : tag.getKeys()){
            keys.add(element.getName());
        }
    }

    public TagMapper(){};

    public String toString() {
        String text = "Tag: " + this.name + " Keys: [";
        for (String element : this.keys) {
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
