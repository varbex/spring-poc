package br.adm.arbex.inscritos;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InscritosExceptionAdvice extends ResponseEntityExceptionHandler {

  @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
  public ResponseEntity<Object> handleConstrantException(java.sql.SQLIntegrityConstraintViolationException exc) {
    return ResponseEntity.status(HttpStatus.CONFLICT).body(new String("Inscrito já cadastrado"));
  }
  
}
