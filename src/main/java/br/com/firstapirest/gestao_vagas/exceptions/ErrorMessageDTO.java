package br.com.firstapirest.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// criação do contrutor com argumentos get e set
@AllArgsConstructor
public class ErrorMessageDTO {
  private String message;
  private String field;
}
