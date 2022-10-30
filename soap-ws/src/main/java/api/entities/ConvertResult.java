package api.entities;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "ConvertResult")
public class ConvertResult {

    private String date;
    @XmlTransient
    private String historical;
    private boolean success;
    private Double result;
    private Map<String, String> query = new HashMap<>();
    @XmlTransient
    private Map<String, String> info = new HashMap<>();


    public ConvertResult(String date, boolean success, Double result, Map<String, String> info) {
        this.date = date;
        this.success = success;
        this.result = result;
        this.info = info;
    }

    public ConvertResult() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }
}

