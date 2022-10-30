<?php

namespace Src;

use Src\Type;
use Soap\ExtSoapEngine\Configuration\ClassMap\ClassMapCollection;
use Soap\ExtSoapEngine\Configuration\ClassMap\ClassMap;

class MySoapClassmap
{
    public static function getCollection() : \Soap\ExtSoapEngine\Configuration\ClassMap\ClassMapCollection
    {
        return new ClassMapCollection(
            new ClassMap('Convert', Type\Convert::class),
            new ClassMap('ConvertResponse', Type\ConvertResponse::class),
            new ClassMap('AccountsList', Type\AccountsList::class),
            new ClassMap('AccountsListResponse', Type\AccountsListResponse::class),
            new ClassMap('account', Type\Account::class),
            new ClassMap('GetAccount', Type\GetAccount::class),
            new ClassMap('GetAccountResponse', Type\GetAccountResponse::class),
            new ClassMap('GetSymbols', Type\GetSymbols::class),
            new ClassMap('GetSymbolsResponse', Type\GetSymbolsResponse::class),
            new ClassMap('symbolsWrapper', Type\SymbolsWrapper::class),
            new ClassMap('symbols', Type\Symbols::class),
            new ClassMap('entry', Type\Entry::class),
        );
    }
}

