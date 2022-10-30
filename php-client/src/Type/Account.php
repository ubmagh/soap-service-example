<?php

namespace Src\Type;

class Account
{
    /**
     * @var int
     */
    private $id;

    /**
     * @var float
     */
    private $balance;

    /**
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param int $id
     * @return Account
     */
    public function withId($id)
    {
        $new = clone $this;
        $new->id = $id;

        return $new;
    }

    /**
     * @return float
     */
    public function getBalance()
    {
        return $this->balance;
    }

    /**
     * @param float $balance
     * @return Account
     */
    public function withBalance($balance)
    {
        $new = clone $this;
        $new->balance = $balance;

        return $new;
    }
}

