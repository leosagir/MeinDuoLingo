package my.project.meinduolingo.card.repository;

import my.project.meinduolingo.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
