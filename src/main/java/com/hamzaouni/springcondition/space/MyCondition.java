package com.hamzaouni.springcondition.space;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Hamza Ouni
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean myenv = "enabled".equalsIgnoreCase(context.getEnvironment().getProperty("MYENV"));
        return myenv;
    }
}
