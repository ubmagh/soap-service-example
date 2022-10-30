<?php

namespace Src;

use Phpro\SoapClient\Caller\Caller;
use Src\Type;
use Phpro\SoapClient\Type\ResultInterface;
use Phpro\SoapClient\Exception\SoapException;
use Phpro\SoapClient\Type\RequestInterface;

class MySoapClient
{
    /**
     * @var Caller
     */
    private $caller;

    public function __construct(\Phpro\SoapClient\Caller\Caller $caller)
    {
        $this->caller = $caller;
    }

    /**
     * @param RequestInterface|Type\Convert $parameters
     * @return ResultInterface|Type\ConvertResponse
     * @throws SoapException
     */
    public function convert(\Src\Type\Convert $parameters) : \Src\Type\ConvertResponse
    {
        return ($this->caller)('Convert', $parameters);
    }

    /**
     * @param RequestInterface|Type\GetAccount $parameters
     * @return ResultInterface|Type\GetAccountResponse
     * @throws SoapException
     */
    public function getAccount(\Src\Type\GetAccount $parameters) : \Src\Type\GetAccountResponse
    {
        return ($this->caller)('GetAccount', $parameters);
    }

    /**
     * @param RequestInterface|Type\AccountsList $parameters
     * @return ResultInterface|Type\AccountsListResponse
     * @throws SoapException
     */
    public function accountsList(\Src\Type\AccountsList $parameters) : \Src\Type\AccountsListResponse
    {
        return ($this->caller)('AccountsList', $parameters);
    }

    /**
     * @param RequestInterface|Type\GetSymbols $parameters
     * @return ResultInterface|Type\GetSymbolsResponse
     * @throws SoapException
     */
    public function getSymbols(\Src\Type\GetSymbols $parameters) : \Src\Type\GetSymbolsResponse
    {
        return ($this->caller)('GetSymbols', $parameters);
    }
}

