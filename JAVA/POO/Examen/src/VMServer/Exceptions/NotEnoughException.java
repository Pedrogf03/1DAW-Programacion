package VMServer.Exceptions;

public abstract class NotEnoughException extends Exception{

    private String msg;

    public NotEnoughException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "NotEnough{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
