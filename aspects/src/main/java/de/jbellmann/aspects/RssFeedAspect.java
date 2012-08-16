package de.jbellmann.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;

import de.jbellmann.domain.Person;

@Aspect
public class RssFeedAspect {

    @DeclareMixin("de.jbellmann.domain.Person")
    public RssFeed rssFeedMixin(final Person person) {
        return new RssFeed() {

            @Override
            public String getChannelType() {
                return person.getName();
            }

            @Override
            public String getText() {
                return person.getPassword();
            }
        };
    }
}
