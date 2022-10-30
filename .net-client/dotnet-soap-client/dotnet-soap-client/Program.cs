// See https://aka.ms/new-console-template for more information

using BankService;

BankWSClient bankWSClient = new BankWSClient();

AccountsListResponse accountsListResponse = await bankWSClient.AccountsListAsync();
Console.WriteLine("\n👾 La liste des comptes : ");
account[] list = accountsListResponse.@return;
foreach( account acc in list)
{
  Console.WriteLine("\t - id : " + acc.id + " - montant: " + acc.balance);
}


Console.WriteLine("\n\n👾👾 Récupérer le compte ayant l'id (33) : ");
GetAccountResponse getAccountResponse = await bankWSClient.GetAccountAsync(33);
account account = getAccountResponse.@return;
Console.WriteLine("\t - id : " + account.id + " - montant: " + account.balance);


ConvertResponse usd_to_mad = await bankWSClient.ConvertAsync(1, "USD", "MAD");
ConvertResponse euro_to_mad = await bankWSClient.ConvertAsync(1, "EURO", "MAD");
ConvertResponse gbp_to_mad = await bankWSClient.ConvertAsync(1, "GBP", "MAD");


Console.WriteLine("\n\n👾👾👾 Conversion de capital: ");
Console.WriteLine("\t -> 1 USD to MAD = " + usd_to_mad.@return.ToString() );
Console.WriteLine("\t -> 1 GBP to MAD = " + usd_to_mad.@return.ToString() );
Console.WriteLine("\t -> 1 EURO to MAD = " + usd_to_mad.@return.ToString() );


Console.WriteLine("\n\n👾👾👾👾 Liste des capitaux supportées : ");
GetSymbolsResponse symbolsResponse = await bankWSClient.GetSymbolsAsync();
symbolsWrapper symbolsWrapper = symbolsResponse.@return;
symbolsWrapperEntry[] entries = symbolsWrapper.symbols;
foreach( symbolsWrapperEntry entry in entries){
  Console.WriteLine("\t - key : " + entry.key + " - value : " + entry.value); 
}

Console.WriteLine("\n\n\t> end .<\n");
