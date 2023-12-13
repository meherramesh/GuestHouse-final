package com.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trial.model.EntityModel;
import com.trial.srvice.EntityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/entities")
public class EntityController {

    @Autowired
    private EntityService entityService;

    @GetMapping
    public List<EntityModel> getAllEntities() {
        return entityService.getAllEntities();
    }

    @GetMapping("/{id}")
    public Optional<EntityModel> getEntityById(@PathVariable Long id) {
        return entityService.getEntityById(id);
    }

    @PostMapping
    public EntityModel createEntity(@RequestBody EntityModel entity) {
        return entityService.createEntity(entity);
    }

    @PutMapping("/{id}")
    public EntityModel updateEntity(@PathVariable Long id, @RequestBody EntityModel updatedEntity) {
        return entityService.updateEntity(id, updatedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        entityService.deleteEntity(id);
    }
}
