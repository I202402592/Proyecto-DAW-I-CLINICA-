package com.cibertec.Proyecto.Clinica.infrastructure.persitence.mapper;

import com.cibertec.Proyecto.Clinica.domain.model.Especialidad;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.EspecialidadEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EspecialidadMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    Especialidad toDomain(EspecialidadEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    EspecialidadEntity toEntity(Especialidad model);
}
