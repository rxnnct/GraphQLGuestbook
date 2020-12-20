package ru.rxnnct.GraphQLGuestbook.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rxnnct.GraphQLGuestbook.model.Message;
import ru.rxnnct.GraphQLGuestbook.service.MessageService;

import java.util.List;

@Component
public class MessageQuery implements GraphQLQueryResolver {
    @Autowired
    private MessageService messageService;
    public List<Message> getMessages(final int count) {
        return this.messageService.getAllMessages(count);
    }
}
