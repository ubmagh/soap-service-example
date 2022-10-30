<?php
namespace Src;

use Src\Type\AccountsList;
use Src\Type\Convert;

require __DIR__ . '/../vendor/autoload.php';


$soapClient = MySoapClientFactory::factory('http://localhost:9191/?wsdl');


$clientsList = $soapClient->accountsList( new AccountsList() );
echo "\n 🦆 La liste des comptes : ";
$list = $clientsList->getReturn();
foreach( $list as $client ){
    echo "\n\t -id : " . $client->getId() . " -montant: " . $client->getBalance();
}


echo "\n\n 🦆🦆 Récupérer un compte (22): ";
$client = $soapClient->getAccount( new \Src\Type\GetAccount(22) );
$client = $client->getReturn(); 
echo "\n\t -id : " . $client->getId() . " -montant: " . $client->getBalance();


$usd_to_mad = $soapClient->convert(new Convert(1, "USD", "MAD"));
$euro_to_mad = $soapClient->convert(new Convert(1, "EUR", "MAD"));
$euro_to_mad = $soapClient->convert(new Convert(1, "GBP", "MAD"));
echo "\n\n 🦆🦆🦆 Conversion de capital : ";
echo "\n\t 1 USD = " . $usd_to_mad->getReturn() . " MAD";
echo "\n\t 1 EUR = " . $euro_to_mad->getReturn() . " MAD";
echo "\n\t 1 GBP = " . $euro_to_mad->getReturn() . " MAD";


echo "\n\n 🦆🦆🦆🦆 Récupérer la liste des devises : ";
$listResponse = $soapClient->getSymbols( new \Src\Type\GetSymbols() );
$list = $listResponse->getReturn();
$symbols = $list->getSymbols();
foreach( $symbols->getEntry() as $symbol ){
    echo "\n\t -> cle : " . $symbol->getKey() . " -> valeur : " . $symbol->getValue();
}

echo "\n>end<\n";