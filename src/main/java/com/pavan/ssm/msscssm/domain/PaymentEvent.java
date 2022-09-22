package com.pavan.ssm.msscssm.domain;

import org.springframework.messaging.Message;
import reactor.core.publisher.Flux;

public enum PaymentEvent {

    PRE_AUTHORIZE, PRE_AUTH_APPROVED, PRE_AUTH_DECLINED,AUTHORIZE,AUTH_APPROVED, AUTH_DECLINED
}
