package madvirus.guestbook;

/**
 * GuestBookManager의 각 메소드가 처리 과정에서
 * 문제가 있을 때 발생시키는 예외
 */
public class GuestBookException extends Exception {

    public GuestBookException(String message) {
        super(message);
    }
    
    public GuestBookException(String message, Throwable cause) {
        super(message, cause);
    }
}