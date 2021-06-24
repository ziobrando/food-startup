package it.avanscoperta.foodstartup.progettazione.query;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CenaSummaryRepository extends MongoRepository<CenaSummaryView, String> {

}
