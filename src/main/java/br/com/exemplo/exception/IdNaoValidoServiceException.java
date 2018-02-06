package br.com.exemplo.exception;

public class IdNaoValidoServiceException extends RuntimeException {

    public IdNaoValidoServiceException(String message) {
        super(message);
    }
}
