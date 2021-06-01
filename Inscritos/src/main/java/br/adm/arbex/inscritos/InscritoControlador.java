package br.adm.arbex.inscritos;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class InscritoControlador {
  @Autowired 
  private InscritoRepositorio userRepository;

  @PostMapping(path="/inscritos")
  public @ResponseBody ResponseEntity<Object> addNewUser (@RequestParam String name, @RequestParam String email) {

    Inscrito n = new Inscrito();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return ResponseEntity.status(HttpStatus.OK).build();
  }
  
  @PutMapping(path="/inscritos/{id}")
  public @ResponseBody ResponseEntity<Object> addVideo (@PathVariable Integer id, @RequestParam String nomeDoVideo) {
	if (id != null) {
	  Optional<Inscrito> n = userRepository.findById(id);
		if (n.isPresent()) {
			n.get().setVideo(nomeDoVideo);
			userRepository.save(n.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  }

  @GetMapping(path="/inscritos")
  public @ResponseBody ResponseEntity<Iterable<Inscrito>> getAllUsers() {
    return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
  }
}