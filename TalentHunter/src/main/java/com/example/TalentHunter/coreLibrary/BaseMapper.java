package com.example.TalentHunter.coreLibrary;

import javax.persistence.MappedSuperclass;
import java.util.List;


public interface  BaseMapper <DtoT, EntityT> {
  DtoT mapToDto (EntityT entity);

  EntityT mapToEntity (DtoT dto);

  List<DtoT> mapToDtoList (List<EntityT> entity);

  List<EntityT> mapToEntityList (List<DtoT> dto);
}
