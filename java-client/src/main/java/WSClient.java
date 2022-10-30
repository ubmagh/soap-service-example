import proxy.Account;
import proxy.BankServiceService;
import proxy.BankWS;
import proxy.SymbolsWrapper;

import java.util.List;

public class WSClient {

    public static void main(String[] args) {

        BankWS stub = new BankServiceService().getBankWSPort(); // => middleware
        // programmation orientée objet distribuée

        System.out.println("\n\n💡 Récupérer la liste des comptes  : \n[");
        List<Account> list = stub.accountsList();
        list.forEach( account -> {
            System.out.println( "{\n\t id : " + account.getId() );
            System.out.println( "\t montant : " + account.getBalance() );
            System.out.println("},");
        } );
        System.out.println("]");


        System.out.println("\n\n💡 Récupérer un compte  (id=11) : ");
        Account account = stub.getAccount(11);
        System.out.println( "{ id : " + account.getId()+", montant: " + account.getBalance() +" }" );


        Double mad_1 = Double.valueOf(1.0);
        Double enDollar = stub.convert(  mad_1, "MAD", "USD");
        Double enEuro = stub.convert(  mad_1, "MAD", "EUR");
        Double enGBP = stub.convert(  mad_1, "MAD", "GBP");

        System.out.println("\n\n💡 Conversion de capital : ");
        System.out.println("👉 1MAD = "+ enDollar.toString() +" USD $");
        System.out.println("👉 1MAD = "+ enEuro.toString() +" Euro ");
        System.out.println("👉 1MAD = "+ enGBP.toString() +" GBP (British Pound Sterling)");


        System.out.println("\n\n💡 récupérer la liste des capitaux  : ");
        List<SymbolsWrapper.Symbols.Entry> entries = stub.getSymbols().getSymbols().getEntry();
        entries.forEach(entry -> {
            System.out.println("{ key : '"+entry.getKey()+"', value: '"+entry.getValue()+"'}");
        });

    }

}
