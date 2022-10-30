<?php

namespace Src\Type;

use Phpro\SoapClient\Type\RequestInterface;

class Convert implements RequestInterface
{
    /**
     * @var float
     */
    private $amount;

    /**
     * @var string
     */
    private $from;

    /**
     * @var string
     */
    private $to;

    /**
     * Constructor
     *
     * @var float $amount
     * @var string $from
     * @var string $to
     */
    public function __construct($amount, $from, $to)
    {
        $this->amount = $amount;
        $this->from = $from;
        $this->to = $to;
    }

    /**
     * @return float
     */
    public function getAmount()
    {
        return $this->amount;
    }

    /**
     * @param float $amount
     * @return Convert
     */
    public function withAmount($amount)
    {
        $new = clone $this;
        $new->amount = $amount;

        return $new;
    }

    /**
     * @return string
     */
    public function getFrom()
    {
        return $this->from;
    }

    /**
     * @param string $from
     * @return Convert
     */
    public function withFrom($from)
    {
        $new = clone $this;
        $new->from = $from;

        return $new;
    }

    /**
     * @return string
     */
    public function getTo()
    {
        return $this->to;
    }

    /**
     * @param string $to
     * @return Convert
     */
    public function withTo($to)
    {
        $new = clone $this;
        $new->to = $to;

        return $new;
    }
}

