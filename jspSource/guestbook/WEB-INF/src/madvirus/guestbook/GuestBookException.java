package madvirus.guestbook;

/**
 * GuestBookManager�� �� �޼ҵ尡 ó�� ��������
 * ������ ���� �� �߻���Ű�� ����
 */
public class GuestBookException extends Exception {

    public GuestBookException(String message) {
        super(message);
    }
    
    public GuestBookException(String message, Throwable cause) {
        super(message, cause);
    }
}