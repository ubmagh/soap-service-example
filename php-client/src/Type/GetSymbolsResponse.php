<?php

namespace Src\Type;

use Phpro\SoapClient\Type\ResultInterface;

class GetSymbolsResponse implements ResultInterface
{
    /**
     * @var \Src\Type\SymbolsWrapper
     */
    private $return;

    /**
     * @return \Src\Type\SymbolsWrapper
     */
    public function getReturn()
    {
        return $this->return;
    }

    /**
     * @param \Src\Type\SymbolsWrapper $return
     * @return GetSymbolsResponse
     */
    public function withReturn($return)
    {
        $new = clone $this;
        $new->return = $return;

        return $new;
    }
}

