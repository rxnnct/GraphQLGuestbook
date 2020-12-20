package ru.rxnnct.GraphQLGuestbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rxnnct.GraphQLGuestbook.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer> {
}
