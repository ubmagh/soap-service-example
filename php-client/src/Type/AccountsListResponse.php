<?php

namespace Src\Type;

use Phpro\SoapClient\Type\ResultInterface;

class AccountsListResponse implements ResultInterface
{
    /**
     * @var \Src\Type\Account
     */
    private $return;

    /**
     * @return \Src\Type\Account
     */
    public function getReturn()
    {
        return $this->return;
    }

    /**
     * @param \Src\Type\Account $return
     * @return AccountsListResponse
     */
    public function withReturn($return)
    {
        $new = clone $this;
        $new->return = $return;

        return $new;
    }
}

