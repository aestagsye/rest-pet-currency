package ru.mentee.power.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(CurrencyNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleNotFound(CurrencyNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse(ex.getMessage()));
  }

  @ExceptionHandler(CurrencyAlreadyExistsException.class)
  public ResponseEntity<ErrorResponse> handleConflict(CurrencyAlreadyExistsException ex) {
    return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(ex.getMessage()));
  }
}