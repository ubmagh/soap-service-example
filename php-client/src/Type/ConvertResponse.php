<?php

namespace Src\Type;

use Phpro\SoapClient\Type\ResultInterface;

class ConvertResponse implements ResultInterface
{
    /**
     * @var float
     */
    private $return;

    /**
     * @return float
     */
    public function getReturn()
    {
        return $this->return;
    }

    /**
     * @param float $return
     * @return ConvertResponse
     */
    public function withReturn($return)
    {
        $new = clone $this;
        $new->return = $return;

        return $new;
    }
}

