package ru.rxnnct.GraphQLGuestbook.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rxnnct.GraphQLGuestbook.model.Message;
import ru.rxnnct.GraphQLGuestbook.repo.MessageRepo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {
    private final String DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";

    private final MessageRepo messageRepo;

    public MessageService(final MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @Transactional
    public Message createMessage(final String author, final String text) {
        final Message message = new Message();
        message.setAuthor(author);
        message.setText(text);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        message.setCreationDate(LocalDateTime.now().format(formatter));
        return this.messageRepo.save(message);
    }

    @Transactional(readOnly = true)
    public List<Message> getAllMessages(final int count) {
        return this.messageRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }
}
