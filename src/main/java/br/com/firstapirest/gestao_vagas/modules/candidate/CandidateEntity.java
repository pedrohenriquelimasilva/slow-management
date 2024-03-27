package br.com.firstapirest.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
  private String name;

  // essa é a alto validalção por regex utilizando Pattern
  @Pattern(regexp = "\\S+", message = "o campo [username] não deve conter espaços")
  private String username;

  // validação numerica entre letras e numeros mesmo
  @Length(min = 6, max = 20)
  private String password;

  @Email(message = "O campo [email] deve conter um e-mail válido")
  private String email;

  private String description;
  private String curriculum;
  private UUID id;
}
