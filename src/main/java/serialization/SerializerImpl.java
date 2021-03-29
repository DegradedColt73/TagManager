package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import management.TagManager;

import java.io.File;
import java.io.IOException;

public class Serializator {
    private final String fileName = "db.json";
    private TagManager tagManager;
    private DataMapper dataMapper;
    private ObjectMapper objectMapper;

    public Serializator(TagManager tagManager) {
        this.tagManager = tagManager;
        this.dataMapper = new DataMapper(tagManager.getKeys(), tagManager.getTags());
        this.objectMapper = new ObjectMapper();
    }

    public Serializator() {
        this.objectMapper = new ObjectMapper();
        this.dataMapper = null;
        this.tagManager = null;
    }

    public void serialize() {
        try {
            objectMapper.writeValue(new File(fileName), this.dataMapper);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TagManager deserialize() {
        try {
            //NOT YET TESTED
            File file = new File(this.fileName);
            if (!file.exists()) {
                return new TagManager();
            }
            this.dataMapper = this.objectMapper.readValue(new File(this.fileName), DataMapper.class);
            this.tagManager = new TagManager();
            dataMapper.loadToCurrentRun(this.tagManager);
            return tagManager;
        } catch (IOException e) {
            e.printStackTrace();
            return new TagManager();
        }
    }
}
