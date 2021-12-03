package com.epam.taxvicespring.entity.modelassembler;

import com.epam.taxvicespring.controller.UserController;
import com.epam.taxvicespring.entity.User;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class UserModelAssembler implements RepresentationModelAssembler<User, EntityModel<User>> {

    @Override
    public EntityModel<User> toModel(User user) {
        return EntityModel.of(
                user,
                linkTo(methodOn(UserController.class).getOneUser(user.getId()))
                        .withSelfRel(),
                linkTo(methodOn(UserController.class).getAllUsers()).withRel("users"));
    }
}