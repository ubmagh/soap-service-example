<?php

namespace Src\Type;

class Symbols
{
    /**
     * @var \Src\Type\Entry
     */
    private $entry;

    /**
     * @return \Src\Type\Entry
     */
    public function getEntry()
    {
        return $this->entry;
    }

    /**
     * @param \Src\Type\Entry $entry
     * @return Symbols
     */
    public function withEntry($entry)
    {
        $new = clone $this;
        $new->entry = $entry;

        return $new;
    }
}

