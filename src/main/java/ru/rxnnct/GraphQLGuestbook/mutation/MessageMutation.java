package ru.rxnnct.GraphQLGuestbook.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rxnnct.GraphQLGuestbook.model.Message;
import ru.rxnnct.GraphQLGuestbook.service.MessageService;

@Component
public class MessageMutation implements GraphQLMutationResolver {
    @Autowired
    private MessageService messageService;
    public Message createMessage(final String author, final String text) {
        return this.messageService.createMessage(author, text);
    }
}
