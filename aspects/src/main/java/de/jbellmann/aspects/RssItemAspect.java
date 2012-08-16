package de.jbellmann.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;

import de.jbellmann.domain.Person;

@Aspect
public class RssItemAspect {

    @DeclareMixin("de.jbellmann.domain.Person")
    public RssItem rssItemMixin(Person person) {
        return new RssItemImpl(person);
    }

    static final class RssItemImpl implements RssItem {

        private Person delegate;

        public RssItemImpl(Person person) {
            delegate = person;
        }

        @Override
        public String getTitle() {
            return delegate.getName();
        }

        @Override
        public String getText() {
            return delegate.getPassword();
        }

    }

}