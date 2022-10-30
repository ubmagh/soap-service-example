package api.entities;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "SymbolsWrapper")
public class SymbolsWrapper {
    private boolean success;
    private Map<String, String> symbols = new HashMap<>();

    public SymbolsWrapper() {
    }

    public SymbolsWrapper(boolean success, Map<String, String> symbols) {
        this.success = success;
        this.symbols = symbols;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getSymbols() {
        return symbols;
    }

    public void setSymbols(Map<String, String> symbols) {
        this.symbols = symbols;
    }
}
