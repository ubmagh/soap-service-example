from zeep import Client

soapClient = Client('http://localhost:9191/?wsdl')

print("\nπ Liste des comptes : ")
accounts = soapClient.service.AccountsList()
for account in accounts:
    print("\n\t - id : "+ str(account.id)+ " - montant: " + str(account.balance))


print("\n\nππ RΓ©cupΓ©rer un compte (11): ")
account = soapClient.service.GetAccount(11)
print("\n\t - id : "+ str(account.id)+ " - montant: " + str(account.balance))


usd_to_mad = soapClient.service.Convert(1, "USD", "MAD")
euro_to_mad = soapClient.service.Convert(1, "EUR", "MAD")
euro_to_mad = soapClient.service.Convert(1, "GBP", "MAD")
print("\n\nπππ Conversion de capital : ")
print("\n\t - 1 USD = " + str(usd_to_mad) + " MAD")
print("\n\t - 1 EUR = " + str(euro_to_mad) + " MAD")
print("\n\t - 1 GBP = " + str(euro_to_mad) + " MAD")

print("\n\nππππ Liste des devises : ")


result = soapClient.service.Convert( 1, 'USD', 'MAD')
symbolsRsponse = soapClient.service.GetSymbols( )

print(symbolsRsponse)

print("\n\n > end.<")