package co.uk.bankcorp.port.api;

@javax.annotation.Generated(value = "co.uk.bankcorp.codegen.v3.generators.java.SpringCodegen", date = "2020-08-02T01:45:10.643Z[GMT]")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
