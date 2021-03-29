package gui;

import javafx.event.Event;
import javafx.event.EventHandler;
import management.TagManager;

public class ShowDataHandler implements EventHandler {
    private TagManager tagManager;

    public ShowDataHandler(TagManager tagManager){
        this.tagManager = tagManager;
    }

    @Override
    public void handle(Event event) {
        System.out.println(tagManager.getKeys());
        System.out.println(tagManager.getTags());
    }
}
