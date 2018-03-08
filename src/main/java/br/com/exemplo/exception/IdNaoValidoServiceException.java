package br.com.exemplo.exception;

public class IdNaoValidoServiceException extends RuntimeException {
	
	private static final long serialVersionUID = 5404245854298617965L;

	public IdNaoValidoServiceException(String message) {
        super(message);
    }
}
