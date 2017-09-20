package stadium.dto;

import stadium.utils.ReplyCodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseDTO {
    private int code;
    private String message;
    private Map<String, Object> data;

    public static ResponseDTO allIsOk(){
        ResponseDTO dto = new ResponseDTO();
        dto.setCode(ReplyCodes.ALL_IS_OK);
        dto.setMessage("OK");
        return dto;
    }

    public ResponseDTO(){ data = new LinkedHashMap<>(); }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setInfo(int code, String message){
        this.code=code;
        this.message=message;
    }
}
