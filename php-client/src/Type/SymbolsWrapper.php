<?php

namespace Src\Type;

class SymbolsWrapper
{
    /**
     * @var bool
     */
    private $success;

    /**
     * @var \Src\Type\Symbols
     */
    private $symbols;

    /**
     * @return bool
     */
    public function getSuccess()
    {
        return $this->success;
    }

    /**
     * @param bool $success
     * @return SymbolsWrapper
     */
    public function withSuccess($success)
    {
        $new = clone $this;
        $new->success = $success;

        return $new;
    }

    /**
     * @return \Src\Type\Symbols
     */
    public function getSymbols()
    {
        return $this->symbols;
    }

    /**
     * @param \Src\Type\Symbols $symbols
     * @return SymbolsWrapper
     */
    public function withSymbols($symbols)
    {
        $new = clone $this;
        $new->symbols = $symbols;

        return $new;
    }
}

