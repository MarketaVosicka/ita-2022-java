package cz.vosickamarketa.ita.eshopbackend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class ItaException extends RuntimeException {
    private final String code;
    private final HttpStatus status;

    protected ItaException(String message, String code, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
    }
}
