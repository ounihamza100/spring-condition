package com.hamzaouni.springcondition.space;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hamza Ouni
 */
@RestController
@ConditionalOnProperty(value="spacestation.enabled", havingValue = "true")
@ConditionalOnClass(name="com.hamzaouni.springcondition.space.Satellite")
@ConditionalOnResource(resources = {"importantfile.txt"})
@Conditional(MyCondition.class)
public class SpaceStationController {

    @GetMapping("/pingaliens")
    public String pingAliens(){
        return "Hi alien. Come in for a cup of coffee...";
    }
}
