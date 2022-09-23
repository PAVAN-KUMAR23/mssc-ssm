package com.pavan.ssm.msscssm.Config.actions;

import com.pavan.ssm.msscssm.domain.PaymentEvent;
import com.pavan.ssm.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class preAuthApprovedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {

        System.out.println("Sending Notification of preAuth approved ");

    }
}
