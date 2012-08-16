package de.jbellmann.application;

import de.jbellmann.aspects.RssFeed;
import de.jbellmann.aspects.RssItem;
import de.jbellmann.domain.Person;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("A_PERSON_NAME");
        person.setPassword("A_PERSON_PASSWORD");
        //
        RssItem rssItem = (RssItem) person;
        System.out.println("RssItem.getText()" + rssItem.getText());
        System.out.println("RssItem.getTitle()" + rssItem.getTitle());
        // 
        RssFeed rssFeed = (RssFeed) person;
        System.out.println("RssFeed.getChannelType()" + rssFeed.getChannelType());
        System.out.println("RssFeed.getText()" + rssFeed.getText());
    }

}
