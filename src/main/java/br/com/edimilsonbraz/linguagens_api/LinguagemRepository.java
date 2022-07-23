package br.com.edimilsonbraz.linguagens_api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{
  
}
