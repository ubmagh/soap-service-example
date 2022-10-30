<?php

namespace Src\Type;

use Phpro\SoapClient\Type\RequestInterface;

class GetAccount implements RequestInterface
{
    /**
     * @var int
     */
    private $accountId;

    /**
     * Constructor
     *
     * @var int $accountId
     */
    public function __construct($accountId)
    {
        $this->accountId = $accountId;
    }

    /**
     * @return int
     */
    public function getAccountId()
    {
        return $this->accountId;
    }

    /**
     * @param int $accountId
     * @return GetAccount
     */
    public function withAccountId($accountId)
    {
        $new = clone $this;
        $new->accountId = $accountId;

        return $new;
    }
}

