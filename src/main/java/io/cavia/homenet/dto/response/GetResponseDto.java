package io.cavia.homenet.dto.response;

import java.util.List;

public class GetResponseDto {

    private String message;
    private List<?> output;

    public GetResponseDto() {
    }

    public GetResponseDto(String message, List<?> output) {
        this.message = message;
        this.output = output;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<?> getOutput() {
        return output;
    }

    public void setOutput(List<?> output) {
        this.output = output;
    }
}
