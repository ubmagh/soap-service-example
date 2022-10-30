package ws;

import api.ApiService;
import api.entities.ConvertResult;
import api.entities.SymbolsWrapper;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


// POJO
@WebService(name = "BankWS")
public class BankService {

    private static SymbolsWrapper symbols;
    private ApiService apiService;

    public BankService(){
        this.apiService = new ApiService();
        this.getSymbols();
    }

    @WebMethod(operationName = "GetSymbols")
    public SymbolsWrapper getSymbols(){
        SymbolsWrapper symbols=null;
        try{
            symbols = this.apiService.getSymbols();
        } catch ( Exception exc ){
            return null;
        }
        BankService.symbols = symbols;
        return symbols;
    }

    @WebMethod(operationName = "Convert")
    public Double convert(  @WebParam(name = "amount") Double amt, @WebParam(name = "from") String from, @WebParam(name = "to") String to){
        if( symbols.getSymbols().get(from)==null )
            return Double.valueOf("-2");
        if( symbols.getSymbols().get(to)==null )
            return Double.valueOf("-3");

        ConvertResult cr;
        try{
            cr = this.apiService.convert( from, to, amt.toString() );
        } catch(Exception exc){
            return Double.valueOf("-1");
        }
        return cr.getResult();
    }

    @WebMethod(operationName = "GetAccount")
    public Account getAccount( @WebParam(name = "accountId") int id){
        return new Account( 11, Math.random()*7733, new Date());
    }

    @WebMethod(operationName = "AccountsList")
    public List<Account> accountsList( ){
        return List.of(
                new Account( 11, Math.random()*7733, new Date()),
                new Account( 22, Math.random()*9933, new Date()),
                new Account( 33, Math.random()*5533, new Date())
        );
    }


}
