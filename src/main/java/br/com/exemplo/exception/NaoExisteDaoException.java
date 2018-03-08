package br.com.exemplo.exception;

public class NaoExisteDaoException extends RuntimeException {
	
	private static final long serialVersionUID = 6946999004637926006L;

	public NaoExisteDaoException(String message) {
        super(message);
    }
}
