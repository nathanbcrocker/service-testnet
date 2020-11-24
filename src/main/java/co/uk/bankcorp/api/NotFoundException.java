package co.uk.bankcorp.api;

@javax.annotation.Generated(value = "co.uk.bankcorp.codegen.v3.generators.java.SpringCodegen", date = "2020-08-02T01:45:10.643Z[GMT]")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
